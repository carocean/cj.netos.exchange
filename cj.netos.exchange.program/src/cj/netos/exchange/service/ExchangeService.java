package cj.netos.exchange.service;

import cj.netos.exchange.IExchangeJob;
import cj.netos.exchange.IExchangeService;
import cj.netos.exchange.IPurchaseService;
import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.mapper.WenyPurchRecordMapper;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.annotation.CjServiceSite;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.HashMap;
import java.util.Map;

@CjBridge(aspects = "@transaction")
@CjService(name = "exchangeService")
public class ExchangeService implements IExchangeService {
    Map<String, IExchangeJob> jobMap;

    @CjServiceRef(refByName = "key.stockKeySelector")
    IStockKeySelector stockKeySelector;
    @CjServiceRef
    IPurchaseService purchaseService;
    @CjServiceSite
    IServiceSite site;
    public ExchangeService() {
        jobMap = new HashMap<>();
    }

    @CjTransaction
    @Override
    public synchronized SelectKey selectKey() {
        //获取纹银账号并缓冲，每过15分钟刷新一下缓冲
        //而后按顺序选出一个key
        return stockKeySelector.select();
    }

    @CjTransaction
    @Override
    public synchronized IExchangeJob getJob(SelectKey key) {
        if (jobMap.containsKey(key.getKey())) {
            return jobMap.get(key.getKey());
        }
        IExchangeJob job = new DefaultExchangeJob(purchaseService,site);
        jobMap.put(key.getKey(), job);
        return job;
    }
}
