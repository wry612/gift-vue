package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryOrderExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public DeliveryOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
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

        public Criteria andDeliveryOrderIdIsNull() {
            addCriterion("DELIVERY_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdIsNotNull() {
            addCriterion("DELIVERY_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdEqualTo(Long value) {
            addCriterion("DELIVERY_ORDER_ID =", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotEqualTo(Long value) {
            addCriterion("DELIVERY_ORDER_ID <>", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdGreaterThan(Long value) {
            addCriterion("DELIVERY_ORDER_ID >", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_ORDER_ID >=", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdLessThan(Long value) {
            addCriterion("DELIVERY_ORDER_ID <", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_ORDER_ID <=", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdIn(List<Long> values) {
            addCriterion("DELIVERY_ORDER_ID in", values, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotIn(List<Long> values) {
            addCriterion("DELIVERY_ORDER_ID not in", values, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_ORDER_ID between", value1, value2, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_ORDER_ID not between", value1, value2, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdIsNull() {
            addCriterion("COMMODITY_CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdIsNotNull() {
            addCriterion("COMMODITY_CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdEqualTo(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID =", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID <>", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdGreaterThan(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID >", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID >=", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdLessThan(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID <", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_CONTRACT_ID <=", value, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdIn(List<Long> values) {
            addCriterion("COMMODITY_CONTRACT_ID in", values, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_CONTRACT_ID not in", values, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_CONTRACT_ID between", value1, value2, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andCommodityContractIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_CONTRACT_ID not between", value1, value2, "commodityContractId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdIsNull() {
            addCriterion("USER_TRADE_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdIsNotNull() {
            addCriterion("USER_TRADE_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdEqualTo(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID =", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdNotEqualTo(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID <>", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdGreaterThan(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID >", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID >=", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdLessThan(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID <", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_TRADE_ACCOUNT_ID <=", value, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdIn(List<Long> values) {
            addCriterion("USER_TRADE_ACCOUNT_ID in", values, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdNotIn(List<Long> values) {
            addCriterion("USER_TRADE_ACCOUNT_ID not in", values, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdBetween(Long value1, Long value2) {
            addCriterion("USER_TRADE_ACCOUNT_ID between", value1, value2, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andUserTradeAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_TRADE_ACCOUNT_ID not between", value1, value2, "userTradeAccountId");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIsNull() {
            addCriterion("COMMODITY_UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIsNotNull() {
            addCriterion("COMMODITY_UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE =", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <>", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceGreaterThan(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE >", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE >=", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceLessThan(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <=", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIn(List<Long> values) {
            addCriterion("COMMODITY_UNIT_PRICE in", values, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotIn(List<Long> values) {
            addCriterion("COMMODITY_UNIT_PRICE not in", values, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_UNIT_PRICE between", value1, value2, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_UNIT_PRICE not between", value1, value2, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityIsNull() {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityIsNotNull() {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY =", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY <>", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY >", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY >=", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityLessThan(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY <", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY <=", value, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY in", values, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY not in", values, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY between", value1, value2, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_COMMODITY_UNIT_QUANTITY not between", value1, value2, "applyCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityIsNull() {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityIsNotNull() {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY =", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY <>", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY >", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY >=", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityLessThan(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY <", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY <=", value, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY in", values, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY not in", values, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY between", value1, value2, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyCommodityStandardUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_COMMODITY_STANDARD_UNIT_QUANTITY not between", value1, value2, "applyCommodityStandardUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityIsNull() {
            addCriterion("COUPON_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityIsNotNull() {
            addCriterion("COUPON_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY =", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY <>", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY >", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY >=", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityLessThan(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY <", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_UNIT_QUANTITY <=", value, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("COUPON_UNIT_QUANTITY in", values, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_UNIT_QUANTITY not in", values, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_UNIT_QUANTITY between", value1, value2, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCouponUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_UNIT_QUANTITY not between", value1, value2, "couponUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityIsNull() {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityIsNotNull() {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY =", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY <>", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY >", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY >=", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityLessThan(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY <", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY <=", value, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY in", values, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY not in", values, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY between", value1, value2, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAddOnCommodityUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_ON_COMMODITY_UNIT_QUANTITY not between", value1, value2, "addOnCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityIsNull() {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityIsNotNull() {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY =", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY <>", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY >", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY >=", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityLessThan(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY <", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY <=", value, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY in", values, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY not in", values, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY between", value1, value2, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andActConsumeCommUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACT_CONSUME_COMM_UNIT_QUANTITY not between", value1, value2, "actConsumeCommUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFeePercentIsNull() {
            addCriterion("FEE_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andFeePercentIsNotNull() {
            addCriterion("FEE_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andFeePercentEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT =", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT <>", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentGreaterThan(BigDecimal value) {
            addCriterion("FEE_PERCENT >", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT >=", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentLessThan(BigDecimal value) {
            addCriterion("FEE_PERCENT <", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT <=", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentIn(List<BigDecimal> values) {
            addCriterion("FEE_PERCENT in", values, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotIn(List<BigDecimal> values) {
            addCriterion("FEE_PERCENT not in", values, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERCENT between", value1, value2, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERCENT not between", value1, value2, "feePercent");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceIsNull() {
            addCriterion("ADD_ON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceIsNotNull() {
            addCriterion("ADD_ON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceEqualTo(Long value) {
            addCriterion("ADD_ON_PRICE =", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceNotEqualTo(Long value) {
            addCriterion("ADD_ON_PRICE <>", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceGreaterThan(Long value) {
            addCriterion("ADD_ON_PRICE >", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("ADD_ON_PRICE >=", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceLessThan(Long value) {
            addCriterion("ADD_ON_PRICE <", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceLessThanOrEqualTo(Long value) {
            addCriterion("ADD_ON_PRICE <=", value, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceIn(List<Long> values) {
            addCriterion("ADD_ON_PRICE in", values, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceNotIn(List<Long> values) {
            addCriterion("ADD_ON_PRICE not in", values, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceBetween(Long value1, Long value2) {
            addCriterion("ADD_ON_PRICE between", value1, value2, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andAddOnPriceNotBetween(Long value1, Long value2) {
            addCriterion("ADD_ON_PRICE not between", value1, value2, "addOnPrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNull() {
            addCriterion("FEE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNotNull() {
            addCriterion("FEE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFeePriceEqualTo(Long value) {
            addCriterion("FEE_PRICE =", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotEqualTo(Long value) {
            addCriterion("FEE_PRICE <>", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThan(Long value) {
            addCriterion("FEE_PRICE >", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("FEE_PRICE >=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThan(Long value) {
            addCriterion("FEE_PRICE <", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThanOrEqualTo(Long value) {
            addCriterion("FEE_PRICE <=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceIn(List<Long> values) {
            addCriterion("FEE_PRICE in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotIn(List<Long> values) {
            addCriterion("FEE_PRICE not in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceBetween(Long value1, Long value2) {
            addCriterion("FEE_PRICE between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotBetween(Long value1, Long value2) {
            addCriterion("FEE_PRICE not between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceIsNull() {
            addCriterion("POSTAGE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPostagePriceIsNotNull() {
            addCriterion("POSTAGE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPostagePriceEqualTo(Long value) {
            addCriterion("POSTAGE_PRICE =", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceNotEqualTo(Long value) {
            addCriterion("POSTAGE_PRICE <>", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceGreaterThan(Long value) {
            addCriterion("POSTAGE_PRICE >", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("POSTAGE_PRICE >=", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceLessThan(Long value) {
            addCriterion("POSTAGE_PRICE <", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceLessThanOrEqualTo(Long value) {
            addCriterion("POSTAGE_PRICE <=", value, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceIn(List<Long> values) {
            addCriterion("POSTAGE_PRICE in", values, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceNotIn(List<Long> values) {
            addCriterion("POSTAGE_PRICE not in", values, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceBetween(Long value1, Long value2) {
            addCriterion("POSTAGE_PRICE between", value1, value2, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andPostagePriceNotBetween(Long value1, Long value2) {
            addCriterion("POSTAGE_PRICE not between", value1, value2, "postagePrice");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNull() {
            addCriterion("COUPON_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNotNull() {
            addCriterion("COUPON_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoEqualTo(String value) {
            addCriterion("COUPON_INFO =", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotEqualTo(String value) {
            addCriterion("COUPON_INFO <>", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThan(String value) {
            addCriterion("COUPON_INFO >", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_INFO >=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThan(String value) {
            addCriterion("COUPON_INFO <", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThanOrEqualTo(String value) {
            addCriterion("COUPON_INFO <=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLike(String value) {
            addCriterion("COUPON_INFO like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotLike(String value) {
            addCriterion("COUPON_INFO not like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIn(List<String> values) {
            addCriterion("COUPON_INFO in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotIn(List<String> values) {
            addCriterion("COUPON_INFO not in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoBetween(String value1, String value2) {
            addCriterion("COUPON_INFO between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotBetween(String value1, String value2) {
            addCriterion("COUPON_INFO not between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("COUPON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("COUPON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Long value) {
            addCriterion("COUPON_PRICE =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Long value) {
            addCriterion("COUPON_PRICE <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Long value) {
            addCriterion("COUPON_PRICE >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Long value) {
            addCriterion("COUPON_PRICE <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Long> values) {
            addCriterion("COUPON_PRICE in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Long> values) {
            addCriterion("COUPON_PRICE not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNull() {
            addCriterion("ACTUAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNotNull() {
            addCriterion("ACTUAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andActualPriceEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE =", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE <>", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThan(Long value) {
            addCriterion("ACTUAL_PRICE >", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE >=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThan(Long value) {
            addCriterion("ACTUAL_PRICE <", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE <=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIn(List<Long> values) {
            addCriterion("ACTUAL_PRICE in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotIn(List<Long> values) {
            addCriterion("ACTUAL_PRICE not in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_PRICE between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_PRICE not between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIsNull() {
            addCriterion("INCOME_PAY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIsNotNull() {
            addCriterion("INCOME_PAY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO =", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO <>", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoGreaterThan(String value) {
            addCriterion("INCOME_PAY_INFO >", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO >=", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLessThan(String value) {
            addCriterion("INCOME_PAY_INFO <", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLessThanOrEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO <=", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLike(String value) {
            addCriterion("INCOME_PAY_INFO like", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotLike(String value) {
            addCriterion("INCOME_PAY_INFO not like", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIn(List<String> values) {
            addCriterion("INCOME_PAY_INFO in", values, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotIn(List<String> values) {
            addCriterion("INCOME_PAY_INFO not in", values, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoBetween(String value1, String value2) {
            addCriterion("INCOME_PAY_INFO between", value1, value2, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotBetween(String value1, String value2) {
            addCriterion("INCOME_PAY_INFO not between", value1, value2, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNull() {
            addCriterion("ADDRESSEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNotNull() {
            addCriterion("ADDRESSEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME =", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME <>", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThan(String value) {
            addCriterion("ADDRESSEE_NAME >", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME >=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThan(String value) {
            addCriterion("ADDRESSEE_NAME <", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME <=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLike(String value) {
            addCriterion("ADDRESSEE_NAME like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotLike(String value) {
            addCriterion("ADDRESSEE_NAME not like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIn(List<String> values) {
            addCriterion("ADDRESSEE_NAME in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotIn(List<String> values) {
            addCriterion("ADDRESSEE_NAME not in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_NAME between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_NAME not between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIsNull() {
            addCriterion("ADDRESSEE_MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIsNotNull() {
            addCriterion("ADDRESSEE_MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE =", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <>", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneGreaterThan(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE >", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE >=", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLessThan(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <=", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLike(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE like", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotLike(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not like", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIn(List<String> values) {
            addCriterion("ADDRESSEE_MOBILE_PHONE in", values, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotIn(List<String> values) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not in", values, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_MOBILE_PHONE between", value1, value2, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not between", value1, value2, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeIsNull() {
            addCriterion("STORAGEOUT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeIsNotNull() {
            addCriterion("STORAGEOUT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeEqualTo(String value) {
            addCriterion("STORAGEOUT_MODE =", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeNotEqualTo(String value) {
            addCriterion("STORAGEOUT_MODE <>", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeGreaterThan(String value) {
            addCriterion("STORAGEOUT_MODE >", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGEOUT_MODE >=", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeLessThan(String value) {
            addCriterion("STORAGEOUT_MODE <", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeLessThanOrEqualTo(String value) {
            addCriterion("STORAGEOUT_MODE <=", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeLike(String value) {
            addCriterion("STORAGEOUT_MODE like", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeNotLike(String value) {
            addCriterion("STORAGEOUT_MODE not like", value, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeIn(List<String> values) {
            addCriterion("STORAGEOUT_MODE in", values, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeNotIn(List<String> values) {
            addCriterion("STORAGEOUT_MODE not in", values, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeBetween(String value1, String value2) {
            addCriterion("STORAGEOUT_MODE between", value1, value2, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeNotBetween(String value1, String value2) {
            addCriterion("STORAGEOUT_MODE not between", value1, value2, "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNotNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME =", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <>", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNotNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME =", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <>", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNotNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME =", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <>", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNull() {
            addCriterion("ADDRESS_DETAIL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNotNull() {
            addCriterion("ADDRESS_DETAIL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO =", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <>", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO not like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO not in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO not between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNull() {
            addCriterion("ADDRESS_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNotNull() {
            addCriterion("ADDRESS_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE =", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <>", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE not like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE not in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE not between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andDateExpectIsNull() {
            addCriterion("DATE_EXPECT is null");
            return (Criteria) this;
        }

        public Criteria andDateExpectIsNotNull() {
            addCriterion("DATE_EXPECT is not null");
            return (Criteria) this;
        }

        public Criteria andDateExpectEqualTo(Date value) {
            addCriterion("DATE_EXPECT =", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotEqualTo(Date value) {
            addCriterion("DATE_EXPECT <>", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectGreaterThan(Date value) {
            addCriterion("DATE_EXPECT >", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_EXPECT >=", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectLessThan(Date value) {
            addCriterion("DATE_EXPECT <", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectLessThanOrEqualTo(Date value) {
            addCriterion("DATE_EXPECT <=", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectIn(List<Date> values) {
            addCriterion("DATE_EXPECT in", values, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotIn(List<Date> values) {
            addCriterion("DATE_EXPECT not in", values, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectBetween(Date value1, Date value2) {
            addCriterion("DATE_EXPECT between", value1, value2, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotBetween(Date value1, Date value2) {
            addCriterion("DATE_EXPECT not between", value1, value2, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIsNull() {
            addCriterion("COMMODITY_FLOW_RECORD_IDS is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIsNotNull() {
            addCriterion("COMMODITY_FLOW_RECORD_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS =", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <>", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsGreaterThan(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS >", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS >=", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLessThan(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <=", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLike(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS like", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotLike(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not like", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS in", values, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not in", values, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS between", value1, value2, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not between", value1, value2, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorIsNull() {
            addCriterion("LOGISTICS_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorIsNotNull() {
            addCriterion("LOGISTICS_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR =", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR <>", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorGreaterThan(String value) {
            addCriterion("LOGISTICS_OPERATOR >", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR >=", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLessThan(String value) {
            addCriterion("LOGISTICS_OPERATOR <", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR <=", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLike(String value) {
            addCriterion("LOGISTICS_OPERATOR like", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotLike(String value) {
            addCriterion("LOGISTICS_OPERATOR not like", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorIn(List<String> values) {
            addCriterion("LOGISTICS_OPERATOR in", values, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotIn(List<String> values) {
            addCriterion("LOGISTICS_OPERATOR not in", values, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorBetween(String value1, String value2) {
            addCriterion("LOGISTICS_OPERATOR between", value1, value2, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_OPERATOR not between", value1, value2, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIsNull() {
            addCriterion("LOGISTICS_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIsNotNull() {
            addCriterion("LOGISTICS_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID =", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID <>", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdGreaterThan(String value) {
            addCriterion("LOGISTICS_ORDER_ID >", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID >=", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLessThan(String value) {
            addCriterion("LOGISTICS_ORDER_ID <", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID <=", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLike(String value) {
            addCriterion("LOGISTICS_ORDER_ID like", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotLike(String value) {
            addCriterion("LOGISTICS_ORDER_ID not like", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIn(List<String> values) {
            addCriterion("LOGISTICS_ORDER_ID in", values, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotIn(List<String> values) {
            addCriterion("LOGISTICS_ORDER_ID not in", values, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdBetween(String value1, String value2) {
            addCriterion("LOGISTICS_ORDER_ID between", value1, value2, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_ORDER_ID not between", value1, value2, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNull() {
            addCriterion("EXPRESS_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNotNull() {
            addCriterion("EXPRESS_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID =", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID <>", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThan(Long value) {
            addCriterion("EXPRESS_INFO_ID >", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID >=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThan(Long value) {
            addCriterion("EXPRESS_INFO_ID <", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID <=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIn(List<Long> values) {
            addCriterion("EXPRESS_INFO_ID in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotIn(List<Long> values) {
            addCriterion("EXPRESS_INFO_ID not in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_INFO_ID between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_INFO_ID not between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNull() {
            addCriterion("APPLY_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNotNull() {
            addCriterion("APPLY_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME =", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <>", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME >", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME >=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME <", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME not in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME not between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("DELIVERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("DELIVERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("DELIVERY_TIME =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("DELIVERY_TIME >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("DELIVERY_TIME <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("DELIVERY_TIME in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("DELIVERY_TIME not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("SUCCESS_TIME =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("SUCCESS_TIME >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("SUCCESS_TIME <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("SUCCESS_TIME in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("SUCCESS_TIME not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME not between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("EXPIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("EXPIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("EXPIRE_TIME =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("EXPIRE_TIME >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("EXPIRE_TIME <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("EXPIRE_TIME in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("EXPIRE_TIME not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLikeInsensitive(String value) {
            addCriterion("upper(COUPON_INFO) like", value.toUpperCase(), "couponInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLikeInsensitive(String value) {
            addCriterion("upper(INCOME_PAY_INFO) like", value.toUpperCase(), "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESSEE_NAME) like", value.toUpperCase(), "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLikeInsensitive(String value) {
            addCriterion("upper(ADDRESSEE_MOBILE_PHONE) like", value.toUpperCase(), "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andStorageoutModeLikeInsensitive(String value) {
            addCriterion("upper(STORAGEOUT_MODE) like", value.toUpperCase(), "storageoutMode");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLikeInsensitive(String value) {
            addCriterion("upper(PROVICE_FIRST_STAGE_NAME) like", value.toUpperCase(), "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_CITY_SECOND_STAGE_NAME) like", value.toUpperCase(), "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_COUNTIES_THIRD_STAGE_NAME) like", value.toUpperCase(), "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_DETAIL_INFO) like", value.toUpperCase(), "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_POSTAL_CODE) like", value.toUpperCase(), "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_OPERATOR) like", value.toUpperCase(), "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_ORDER_ID) like", value.toUpperCase(), "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table delivery_order
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
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