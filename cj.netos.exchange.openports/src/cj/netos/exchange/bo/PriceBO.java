package cj.netos.exchange.bo;

import java.math.BigDecimal;

public class PriceBO {
    String bankid;

    BigDecimal price;
    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
