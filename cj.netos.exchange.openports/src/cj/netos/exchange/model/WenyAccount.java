package cj.netos.exchange.model;

import java.math.BigDecimal;

/**
 * Table: weny_account
 */
public class WenyAccount {
    /**
     * Column: id
     * Remark: 标识
     */
    private String id;

    /**
     * Column: person
     * Remark: 公众号
     */
    private String person;

    /**
     * Column: person_name
     * Remark: 公众名
     */
    private String personName;

    /**
     * Column: currency
     * Remark: 币种
     */
    private String currency;

    /**
     * Column: stock
     * Remark: 余额	即可用的零钱，单位为分
     */
    private BigDecimal stock;

    /**
     * Column: state
     * Remark: 0-生效 1- 冻结 2- 注销
     */
    private Integer state;

    /**
     * Column: ctime
     * Remark: 创建时间
     */
    private String ctime;

    /**
     * Column: lutime
     * Remark: 最新修改时间
     */
    private String lutime;

    /**
     * Column: bankid
     */
    private String bankid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getLutime() {
        return lutime;
    }

    public void setLutime(String lutime) {
        this.lutime = lutime == null ? null : lutime.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }
}