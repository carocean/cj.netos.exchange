package cj.netos.exchange;

import cj.netos.exchange.bo.SelectKey;
import cj.netos.exchange.model.WenyPurchRecord;

import java.util.List;

public interface IExchangeService {

    SelectKey selectKey();

    IExchangeJob getJob(SelectKey key);

}
