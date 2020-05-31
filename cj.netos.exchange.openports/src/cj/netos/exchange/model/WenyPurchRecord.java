package cj.netos.exchange.model;

import java.math.BigDecimal;

/**
 * Table: weny_purch_record
 */
public class WenyPurchRecord {
    /**
     * Column: sn
     * Remark: YYYYMMDD+交易流水（每天从1开始）
     */
    private String sn;

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
     * Column: purch_amount
     * Remark: 申购金
     */
    private Long purchAmount;

    /**
     * Column: stock
     * Remark: 所得纹银
     */
    private BigDecimal stock;

    /**
     * Column: price
     * Remark: 申购价
     */
    private BigDecimal price;

    /**
     * Column: service_fee
     * Remark: 服务收费金额
     */
    private Long serviceFee;

    /**
     * Column: fee_ratio
     * Remark: 费率
     */
    private BigDecimal feeRatio;

    /**
     * Column: ttm
     * Remark: 市盈率。
     */
    private BigDecimal ttm;

    /**
     * Column: state
     * Remark: 0为创建；1为完成； 是否出错看status，status记录当前步骤的状态
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
     * Column: note
     */
    private String note;

    /**
     * Column: bankid
     * Remark: 纹银银行id
     */
    private String bankid;

    /**
     * Column: status
     * Remark: 返回码
     */
    private Integer status;

    /**
     * Column: message
     * Remark: 返回消息
     */
    private String message;

    /**
     * Column: principal_ratio
     * Remark: 本金率
     */
    private BigDecimal principalRatio;

    /**
     * Column: principal_amount
     * Remark: 本金
     */
    private Long principalAmount;

    /**
     * Column: bank_purch_sn
     * Remark: 纹银银行承兑订单号
     */
    private String bankPurchSn;

    /**
     * Column: free_ratio
     * Remark: 自由金率
     */
    private BigDecimal freeRatio;

    /**
     * Column: reserve_ratio
     * Remark: 准备金率
     */
    private BigDecimal reserveRatio;

    /**
     * Column: free_amount
     * Remark: 自由金
     */
    private Long freeAmount;

    /**
     * Column: reserve_amount
     * Remark: 准备金
     */
    private Long reserveAmount;

    /**
     * Column: exchange_state
     * Remark: 0 未承兑 1承兑中 2已承兑
     */
    private Integer exchangeState;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
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

    public Long getPurchAmount() {
        return purchAmount;
    }

    public void setPurchAmount(Long purchAmount) {
        this.purchAmount = purchAmount;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Long serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getFeeRatio() {
        return feeRatio;
    }

    public void setFeeRatio(BigDecimal feeRatio) {
        this.feeRatio = feeRatio;
    }

    public BigDecimal getTtm() {
        return ttm;
    }

    public void setTtm(BigDecimal ttm) {
        this.ttm = ttm;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public BigDecimal getPrincipalRatio() {
        return principalRatio;
    }

    public void setPrincipalRatio(BigDecimal principalRatio) {
        this.principalRatio = principalRatio;
    }

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getBankPurchSn() {
        return bankPurchSn;
    }

    public void setBankPurchSn(String bankPurchSn) {
        this.bankPurchSn = bankPurchSn == null ? null : bankPurchSn.trim();
    }

    public BigDecimal getFreeRatio() {
        return freeRatio;
    }

    public void setFreeRatio(BigDecimal freeRatio) {
        this.freeRatio = freeRatio;
    }

    public BigDecimal getReserveRatio() {
        return reserveRatio;
    }

    public void setReserveRatio(BigDecimal reserveRatio) {
        this.reserveRatio = reserveRatio;
    }

    public Long getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(Long freeAmount) {
        this.freeAmount = freeAmount;
    }

    public Long getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(Long reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public Integer getExchangeState() {
        return exchangeState;
    }

    public void setExchangeState(Integer exchangeState) {
        this.exchangeState = exchangeState;
    }
}