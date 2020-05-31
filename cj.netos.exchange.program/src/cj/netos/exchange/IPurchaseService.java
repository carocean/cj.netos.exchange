package cj.netos.exchange;

import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.model.WenyPurchRecord;

import java.util.List;

public interface IPurchaseService {
    List<WenyPurchRecord> page(SelectKey key, int limit, long offset);
}
