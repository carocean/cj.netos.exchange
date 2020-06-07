package cj.netos.exchange.service;

import cj.netos.exchange.IExchangeJob;
import cj.netos.exchange.IPriceBoard;
import cj.netos.exchange.IPurchaseService;
import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.model.WenyPurchRecord;
import cj.studio.ecm.CJSystem;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.util.Encript;
import cj.ultimate.gson2.com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DefaultExchangeJob implements IExchangeJob {
    IPurchaseService purchaseService;
    int limit = 10;
    long offset = 0;
    IServiceSite site;

    public DefaultExchangeJob(IPurchaseService purchaseService, IServiceSite site) {
        this.purchaseService = purchaseService;
        this.site = site;
        limit = Integer.valueOf(site.getProperty("key_limit"));
    }

    @Override
    public void exchange(SelectKey key, IPriceBoard priceBoard) {
        while (true) {
            List<WenyPurchRecord> records = purchaseService.page(key, limit, offset);
            if (records.isEmpty()) {
                offset = 0;
                break;
            }
            int i = 0;
            for (WenyPurchRecord record : records) {
                if (!_exchange(record, priceBoard, offset + i)) {
                    offset=0;
                    return;
                }
                i++;
            }
            offset += records.size();
        }
    }

    private boolean _exchange(WenyPurchRecord record, IPriceBoard priceBoard, long _offset) {
        BigDecimal payableAmount = record.getStock().multiply(priceBoard.getPrice(record.getBankid()));
        long purchAmount = record.getPurchAmount();
        long profit = payableAmount.longValue() - purchAmount;
        long almost = profit - record.getTtm().subtract(new BigDecimal(1.0)).multiply(new BigDecimal(record.getPurchAmount())).longValue();
        CJSystem.logging().info(getClass(), String.format("%s %s %s %s %s-%s=%s %s %s %s %s",
                record.getBankid(),
                record.getSn(),
                record.getPrice(),
                priceBoard.getPrice(record.getBankid()),
                payableAmount,
                purchAmount,
                profit,
                almost,
                profit > 0 ? "+" : "*",
                almost >= 0 ? "+" : "*",
                _offset
        ));
        //如果almost>=0则清兑
        if (almost >= 0) {
            try {
                Map<String, Object> map = call_exchange(record.getSn());
                CJSystem.logging().info(getClass(), String.format("清兑：%s %s %s %s %s", map.get("sn"), map.get("bankid"), map.get("purchaseAmount"), map.get("stock"), profit));
            } catch (CircuitException e) {
                CJSystem.logging().error(getClass(), e.getMessage());
            }
        }
        return almost>=0;
    }

    private Map<String, Object> call_exchange(String sn) throws CircuitException {
        OkHttpClient client = (OkHttpClient) site.getService("@.http");

        String appid = site.getProperty("appid");
        String appKey = site.getProperty("appKey");
        String appSecret = site.getProperty("appSecret");
        String portsUrl = site.getProperty("rhub.ports.wallet.gateway.receipt");
        String nonce = Encript.md5(String.format("%s%s", UUID.randomUUID().toString(), System.currentTimeMillis()));
        String sign = Encript.md5(String.format("%s%s%s", appKey, nonce, appSecret));

        final Request request = new Request.Builder()
                .url(String.format("%s?purchase_sn=%s", portsUrl, sn))
                .addHeader("Rest-Command", "exchangeWenyOfPerson")
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
        map = new Gson().fromJson(json, HashMap.class);
        return map;
    }
}
