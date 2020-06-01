package cj.netos.exchange.service;

import cj.netos.exchange.IPriceBoard;
import cj.netos.exchange.bo.PriceBO;
import cj.studio.ecm.CJSystem;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceSite;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.util.Encript;
import cj.ultimate.gson2.com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@CjService(name = "priceBoard")
public class PriceBoard implements IPriceBoard {
    @CjServiceSite
    IServiceSite site;
    Map<String, AtomicReference<BigDecimal>> priceMap;
    ReentrantLock lock;
    Condition condition;

    public PriceBoard() {
        priceMap = new ConcurrentHashMap<>();
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    @Override
    public synchronized BigDecimal getPrice(String bankid) {
        if (priceMap.containsKey(bankid)) {
            return priceMap.get(bankid).get();
        }
        //如果没有相应报价，则向纹银银行直接获取
        try {
            PriceBO bo = call_get_price(bankid);
            priceMap.put(bankid, new AtomicReference<>(bo.getPrice()));
            return bo.getPrice();
        } catch (CircuitException e) {
            e.printStackTrace();
        }
        return new BigDecimal(0.0);
    }

    private PriceBO call_get_price(String bankid) throws CircuitException {
        OkHttpClient client = (OkHttpClient) site.getService("@.http");

        String appid = site.getProperty("appid");
        String appKey = site.getProperty("appKey");
        String appSecret = site.getProperty("appSecret");
        String portsUrl = site.getProperty("rhub.ports.bank.oc.balance");
        String nonce = Encript.md5(String.format("%s%s", UUID.randomUUID().toString(), System.currentTimeMillis()));
        String sign = Encript.md5(String.format("%s%s%s", appKey, nonce, appSecret));

        final Request request = new Request.Builder()
                .url(String.format("%s?wenyBankID=%s", portsUrl, bankid))
                .addHeader("Rest-Command", "getPriceBucket")
                .addHeader("app-id", appid)
                .addHeader("app-key", appKey)
                .addHeader("app-nonce", nonce)
                .addHeader("app-sign", sign)
                .get()
                .build();
        final Call call = client.newCall(request);
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new CircuitException("1002", e);
        }
        if (response.code() >= 400) {
            throw new CircuitException("1002", String.format("远程访问失败:%s", response.message()));
        }
        String json = null;
        try {
            json = response.body().string();
        } catch (IOException e) {
            throw new CircuitException("1002", e);
        }
        Map<String, Object> map = new Gson().fromJson(json, HashMap.class);
        if (Double.parseDouble(map.get("status") + "") >= 400) {
            throw new CircuitException(map.get("status") + "", map.get("message") + "");
        }
        json = (String) map.get("dataText");
        PriceBO bo = new Gson().fromJson(json, PriceBO.class);
        return bo;
    }

    @Override
    public void update(PriceBO priceBO) {
        try {
            lock.lock();
            condition.signalAll();
        } finally {
            lock.unlock();
        }
        if (priceMap.containsKey(priceBO.getBankid())) {
            priceMap.get(priceBO.getBankid()).set(priceBO.getPrice());
            return;
        }
        priceMap.put(priceBO.getBankid(), new AtomicReference<>(priceBO.getPrice()));
    }

    @Override
    public void awaitNotify(long await_timeout) {
        try {
            lock.lock();
            if (await_timeout > 0) {
                condition.await(await_timeout, TimeUnit.MILLISECONDS);
            } else {
                condition.await();
            }
        } catch (InterruptedException e) {
            CJSystem.logging().error(getClass(), e);
        } finally {
            lock.unlock();
        }
    }
}
