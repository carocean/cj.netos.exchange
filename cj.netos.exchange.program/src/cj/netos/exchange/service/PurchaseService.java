package cj.netos.exchange.service;

import cj.netos.exchange.IPurchaseService;
import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.mapper.WenyPurchRecordMapper;
import cj.netos.exchange.model.WenyPurchRecord;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "purchaseService")
public class PurchaseService implements IPurchaseService {
    @CjServiceRef(refByName = "mybatis.cj.netos.exchange.mapper.WenyPurchRecordMapper")
    WenyPurchRecordMapper wenyPurchRecordMapper;

    @CjTransaction
    @Override
    public List<WenyPurchRecord> page(SelectKey key, int limit, long offset) {
        return wenyPurchRecordMapper.page(key.getBankid(), key.getPerson(), limit, offset);
    }
}
