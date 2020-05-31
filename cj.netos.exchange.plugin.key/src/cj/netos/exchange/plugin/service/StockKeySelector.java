package cj.netos.exchange.plugin.service;

import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.model.WenyAccount;
import cj.netos.exchange.plugin.mapper.WenyAccountMapper;
import cj.netos.exchange.service.IStockKeySelector;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjBridge(aspects = "@transaction")
@CjService(name = "stockKeySelector")
public class StockKeySelector implements IStockKeySelector {

    @CjServiceRef(refByName = "mybatis.cj.netos.exchange.plugin.mapper.WenyAccountMapper")
    WenyAccountMapper wenyAccountMapper;
    long skip = 0;

    @CjTransaction
    @Override
    public SelectKey select() {
        WenyAccount account = wenyAccountMapper.skip(skip);
        if (account == null && skip != 0) {
            skip = 0;
            return select();
        }
        if (account == null) {
            return null;
        }
        skip++;
        SelectKey key = new SelectKey();
        key.setBankid(account.getBankid());
        key.setPerson(account.getPerson());
        key.setKey(String.format("%s/%s", account.getBankid(), account.getPerson()));
        return key;
    }
}
