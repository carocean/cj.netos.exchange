package cj.netos.exchange;

import cj.netos.exchange.bo.PriceBO;

import java.math.BigDecimal;

public interface IPriceBoard {
    BigDecimal getPrice(String bankid);

    void update(PriceBO priceBO);

}
