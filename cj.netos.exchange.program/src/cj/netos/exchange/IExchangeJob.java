package cj.netos.exchange;

import cj.netos.exchange.bo.SelectKey;

public interface IExchangeJob {
    void exchange(SelectKey key, IPriceBoard priceBoard);

}
