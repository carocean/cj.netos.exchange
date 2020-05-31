package cj.netos.exchange.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WenyPurchRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public WenyPurchRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andPurchAmountIsNull() {
            addCriterion("purch_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchAmountIsNotNull() {
            addCriterion("purch_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchAmountEqualTo(Long value) {
            addCriterion("purch_amount =", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountNotEqualTo(Long value) {
            addCriterion("purch_amount <>", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountGreaterThan(Long value) {
            addCriterion("purch_amount >", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("purch_amount >=", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountLessThan(Long value) {
            addCriterion("purch_amount <", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountLessThanOrEqualTo(Long value) {
            addCriterion("purch_amount <=", value, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountIn(List<Long> values) {
            addCriterion("purch_amount in", values, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountNotIn(List<Long> values) {
            addCriterion("purch_amount not in", values, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountBetween(Long value1, Long value2) {
            addCriterion("purch_amount between", value1, value2, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andPurchAmountNotBetween(Long value1, Long value2) {
            addCriterion("purch_amount not between", value1, value2, "purchAmount");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(BigDecimal value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(BigDecimal value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(BigDecimal value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(BigDecimal value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<BigDecimal> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<BigDecimal> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(Long value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(Long value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(Long value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(Long value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(Long value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<Long> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<Long> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(Long value1, Long value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(Long value1, Long value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIsNull() {
            addCriterion("fee_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIsNotNull() {
            addCriterion("fee_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRatioEqualTo(BigDecimal value) {
            addCriterion("fee_ratio =", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotEqualTo(BigDecimal value) {
            addCriterion("fee_ratio <>", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioGreaterThan(BigDecimal value) {
            addCriterion("fee_ratio >", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_ratio >=", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioLessThan(BigDecimal value) {
            addCriterion("fee_ratio <", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_ratio <=", value, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioIn(List<BigDecimal> values) {
            addCriterion("fee_ratio in", values, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotIn(List<BigDecimal> values) {
            addCriterion("fee_ratio not in", values, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_ratio between", value1, value2, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andFeeRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_ratio not between", value1, value2, "feeRatio");
            return (Criteria) this;
        }

        public Criteria andTtmIsNull() {
            addCriterion("ttm is null");
            return (Criteria) this;
        }

        public Criteria andTtmIsNotNull() {
            addCriterion("ttm is not null");
            return (Criteria) this;
        }

        public Criteria andTtmEqualTo(BigDecimal value) {
            addCriterion("ttm =", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmNotEqualTo(BigDecimal value) {
            addCriterion("ttm <>", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmGreaterThan(BigDecimal value) {
            addCriterion("ttm >", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ttm >=", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmLessThan(BigDecimal value) {
            addCriterion("ttm <", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ttm <=", value, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmIn(List<BigDecimal> values) {
            addCriterion("ttm in", values, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmNotIn(List<BigDecimal> values) {
            addCriterion("ttm not in", values, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ttm between", value1, value2, "ttm");
            return (Criteria) this;
        }

        public Criteria andTtmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ttm not between", value1, value2, "ttm");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andLutimeIsNull() {
            addCriterion("lutime is null");
            return (Criteria) this;
        }

        public Criteria andLutimeIsNotNull() {
            addCriterion("lutime is not null");
            return (Criteria) this;
        }

        public Criteria andLutimeEqualTo(String value) {
            addCriterion("lutime =", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeNotEqualTo(String value) {
            addCriterion("lutime <>", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeGreaterThan(String value) {
            addCriterion("lutime >", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeGreaterThanOrEqualTo(String value) {
            addCriterion("lutime >=", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeLessThan(String value) {
            addCriterion("lutime <", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeLessThanOrEqualTo(String value) {
            addCriterion("lutime <=", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeLike(String value) {
            addCriterion("lutime like", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeNotLike(String value) {
            addCriterion("lutime not like", value, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeIn(List<String> values) {
            addCriterion("lutime in", values, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeNotIn(List<String> values) {
            addCriterion("lutime not in", values, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeBetween(String value1, String value2) {
            addCriterion("lutime between", value1, value2, "lutime");
            return (Criteria) this;
        }

        public Criteria andLutimeNotBetween(String value1, String value2) {
            addCriterion("lutime not between", value1, value2, "lutime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("bankid like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("bankid not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIsNull() {
            addCriterion("principal_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIsNotNull() {
            addCriterion("principal_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioEqualTo(BigDecimal value) {
            addCriterion("principal_ratio =", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotEqualTo(BigDecimal value) {
            addCriterion("principal_ratio <>", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioGreaterThan(BigDecimal value) {
            addCriterion("principal_ratio >", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_ratio >=", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioLessThan(BigDecimal value) {
            addCriterion("principal_ratio <", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("principal_ratio <=", value, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioIn(List<BigDecimal> values) {
            addCriterion("principal_ratio in", values, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotIn(List<BigDecimal> values) {
            addCriterion("principal_ratio not in", values, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_ratio between", value1, value2, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("principal_ratio not between", value1, value2, "principalRatio");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIsNull() {
            addCriterion("principal_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIsNotNull() {
            addCriterion("principal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountEqualTo(Long value) {
            addCriterion("principal_amount =", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotEqualTo(Long value) {
            addCriterion("principal_amount <>", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountGreaterThan(Long value) {
            addCriterion("principal_amount >", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("principal_amount >=", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountLessThan(Long value) {
            addCriterion("principal_amount <", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountLessThanOrEqualTo(Long value) {
            addCriterion("principal_amount <=", value, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountIn(List<Long> values) {
            addCriterion("principal_amount in", values, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotIn(List<Long> values) {
            addCriterion("principal_amount not in", values, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountBetween(Long value1, Long value2) {
            addCriterion("principal_amount between", value1, value2, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andPrincipalAmountNotBetween(Long value1, Long value2) {
            addCriterion("principal_amount not between", value1, value2, "principalAmount");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnIsNull() {
            addCriterion("bank_purch_sn is null");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnIsNotNull() {
            addCriterion("bank_purch_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnEqualTo(String value) {
            addCriterion("bank_purch_sn =", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnNotEqualTo(String value) {
            addCriterion("bank_purch_sn <>", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnGreaterThan(String value) {
            addCriterion("bank_purch_sn >", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnGreaterThanOrEqualTo(String value) {
            addCriterion("bank_purch_sn >=", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnLessThan(String value) {
            addCriterion("bank_purch_sn <", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnLessThanOrEqualTo(String value) {
            addCriterion("bank_purch_sn <=", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnLike(String value) {
            addCriterion("bank_purch_sn like", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnNotLike(String value) {
            addCriterion("bank_purch_sn not like", value, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnIn(List<String> values) {
            addCriterion("bank_purch_sn in", values, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnNotIn(List<String> values) {
            addCriterion("bank_purch_sn not in", values, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnBetween(String value1, String value2) {
            addCriterion("bank_purch_sn between", value1, value2, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andBankPurchSnNotBetween(String value1, String value2) {
            addCriterion("bank_purch_sn not between", value1, value2, "bankPurchSn");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNull() {
            addCriterion("free_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIsNotNull() {
            addCriterion("free_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRatioEqualTo(BigDecimal value) {
            addCriterion("free_ratio =", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotEqualTo(BigDecimal value) {
            addCriterion("free_ratio <>", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThan(BigDecimal value) {
            addCriterion("free_ratio >", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_ratio >=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThan(BigDecimal value) {
            addCriterion("free_ratio <", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_ratio <=", value, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioIn(List<BigDecimal> values) {
            addCriterion("free_ratio in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotIn(List<BigDecimal> values) {
            addCriterion("free_ratio not in", values, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_ratio between", value1, value2, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andFreeRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_ratio not between", value1, value2, "freeRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIsNull() {
            addCriterion("reserve_ratio is null");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIsNotNull() {
            addCriterion("reserve_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andReserveRatioEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio =", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio <>", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioGreaterThan(BigDecimal value) {
            addCriterion("reserve_ratio >", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio >=", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioLessThan(BigDecimal value) {
            addCriterion("reserve_ratio <", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reserve_ratio <=", value, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioIn(List<BigDecimal> values) {
            addCriterion("reserve_ratio in", values, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotIn(List<BigDecimal> values) {
            addCriterion("reserve_ratio not in", values, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserve_ratio between", value1, value2, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andReserveRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserve_ratio not between", value1, value2, "reserveRatio");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNull() {
            addCriterion("free_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNotNull() {
            addCriterion("free_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountEqualTo(Long value) {
            addCriterion("free_amount =", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotEqualTo(Long value) {
            addCriterion("free_amount <>", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThan(Long value) {
            addCriterion("free_amount >", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("free_amount >=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThan(Long value) {
            addCriterion("free_amount <", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThanOrEqualTo(Long value) {
            addCriterion("free_amount <=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIn(List<Long> values) {
            addCriterion("free_amount in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotIn(List<Long> values) {
            addCriterion("free_amount not in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountBetween(Long value1, Long value2) {
            addCriterion("free_amount between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotBetween(Long value1, Long value2) {
            addCriterion("free_amount not between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIsNull() {
            addCriterion("reserve_amount is null");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIsNotNull() {
            addCriterion("reserve_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReserveAmountEqualTo(Long value) {
            addCriterion("reserve_amount =", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotEqualTo(Long value) {
            addCriterion("reserve_amount <>", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountGreaterThan(Long value) {
            addCriterion("reserve_amount >", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve_amount >=", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountLessThan(Long value) {
            addCriterion("reserve_amount <", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountLessThanOrEqualTo(Long value) {
            addCriterion("reserve_amount <=", value, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountIn(List<Long> values) {
            addCriterion("reserve_amount in", values, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotIn(List<Long> values) {
            addCriterion("reserve_amount not in", values, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountBetween(Long value1, Long value2) {
            addCriterion("reserve_amount between", value1, value2, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andReserveAmountNotBetween(Long value1, Long value2) {
            addCriterion("reserve_amount not between", value1, value2, "reserveAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIsNull() {
            addCriterion("exchange_state is null");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIsNotNull() {
            addCriterion("exchange_state is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeStateEqualTo(Integer value) {
            addCriterion("exchange_state =", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotEqualTo(Integer value) {
            addCriterion("exchange_state <>", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateGreaterThan(Integer value) {
            addCriterion("exchange_state >", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_state >=", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateLessThan(Integer value) {
            addCriterion("exchange_state <", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_state <=", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIn(List<Integer> values) {
            addCriterion("exchange_state in", values, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotIn(List<Integer> values) {
            addCriterion("exchange_state not in", values, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateBetween(Integer value1, Integer value2) {
            addCriterion("exchange_state between", value1, value2, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_state not between", value1, value2, "exchangeState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}