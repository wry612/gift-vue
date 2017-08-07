package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundOrderWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public RefundOrderWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
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
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: refund_order_wx
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

        public Criteria andOutRefundNoIsNull() {
            addCriterion("OUT_REFUND_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNotNull() {
            addCriterion("OUT_REFUND_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoEqualTo(String value) {
            addCriterion("OUT_REFUND_NO =", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotEqualTo(String value) {
            addCriterion("OUT_REFUND_NO <>", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThan(String value) {
            addCriterion("OUT_REFUND_NO >", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_REFUND_NO >=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThan(String value) {
            addCriterion("OUT_REFUND_NO <", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_REFUND_NO <=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLike(String value) {
            addCriterion("OUT_REFUND_NO like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotLike(String value) {
            addCriterion("OUT_REFUND_NO not like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIn(List<String> values) {
            addCriterion("OUT_REFUND_NO in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotIn(List<String> values) {
            addCriterion("OUT_REFUND_NO not in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoBetween(String value1, String value2) {
            addCriterion("OUT_REFUND_NO between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotBetween(String value1, String value2) {
            addCriterion("OUT_REFUND_NO not between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNull() {
            addCriterion("REFUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("REFUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(String value) {
            addCriterion("REFUND_ID =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(String value) {
            addCriterion("REFUND_ID <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(String value) {
            addCriterion("REFUND_ID >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_ID >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(String value) {
            addCriterion("REFUND_ID <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(String value) {
            addCriterion("REFUND_ID <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLike(String value) {
            addCriterion("REFUND_ID like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotLike(String value) {
            addCriterion("REFUND_ID not like", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<String> values) {
            addCriterion("REFUND_ID in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<String> values) {
            addCriterion("REFUND_ID not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(String value1, String value2) {
            addCriterion("REFUND_ID between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(String value1, String value2) {
            addCriterion("REFUND_ID not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("TRANSACTION_ID =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("TRANSACTION_ID <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("TRANSACTION_ID >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("TRANSACTION_ID <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("TRANSACTION_ID like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("TRANSACTION_ID not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("TRANSACTION_ID in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("TRANSACTION_ID not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("OUT_TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("OUT_TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("OUT_TRADE_NO =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("OUT_TRADE_NO <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("OUT_TRADE_NO >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_TRADE_NO >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("OUT_TRADE_NO <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_TRADE_NO <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("OUT_TRADE_NO like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("OUT_TRADE_NO not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("OUT_TRADE_NO in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("OUT_TRADE_NO not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("OUT_TRADE_NO between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("OUT_TRADE_NO not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Long value) {
            addCriterion("TOTAL_FEE =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Long value) {
            addCriterion("TOTAL_FEE <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Long value) {
            addCriterion("TOTAL_FEE >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_FEE >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Long value) {
            addCriterion("TOTAL_FEE <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_FEE <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Long> values) {
            addCriterion("TOTAL_FEE in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Long> values) {
            addCriterion("TOTAL_FEE not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Long value1, Long value2) {
            addCriterion("TOTAL_FEE between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_FEE not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(Long value) {
            addCriterion("REFUND_FEE =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(Long value) {
            addCriterion("REFUND_FEE <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(Long value) {
            addCriterion("REFUND_FEE >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUND_FEE >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(Long value) {
            addCriterion("REFUND_FEE <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(Long value) {
            addCriterion("REFUND_FEE <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<Long> values) {
            addCriterion("REFUND_FEE in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<Long> values) {
            addCriterion("REFUND_FEE not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(Long value1, Long value2) {
            addCriterion("REFUND_FEE between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(Long value1, Long value2) {
            addCriterion("REFUND_FEE not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIsNull() {
            addCriterion("REFUND_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIsNotNull() {
            addCriterion("REFUND_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE =", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE <>", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeGreaterThan(String value) {
            addCriterion("REFUND_FEE_TYPE >", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE >=", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLessThan(String value) {
            addCriterion("REFUND_FEE_TYPE <", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE <=", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLike(String value) {
            addCriterion("REFUND_FEE_TYPE like", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotLike(String value) {
            addCriterion("REFUND_FEE_TYPE not like", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIn(List<String> values) {
            addCriterion("REFUND_FEE_TYPE in", values, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotIn(List<String> values) {
            addCriterion("REFUND_FEE_TYPE not in", values, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeBetween(String value1, String value2) {
            addCriterion("REFUND_FEE_TYPE between", value1, value2, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotBetween(String value1, String value2) {
            addCriterion("REFUND_FEE_TYPE not between", value1, value2, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeIsNull() {
            addCriterion("SETTLEMENT_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeIsNotNull() {
            addCriterion("SETTLEMENT_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeEqualTo(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE =", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotEqualTo(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE <>", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeGreaterThan(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE >", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE >=", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeLessThan(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE <", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeLessThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_REFUND_FEE <=", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeIn(List<Long> values) {
            addCriterion("SETTLEMENT_REFUND_FEE in", values, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotIn(List<Long> values) {
            addCriterion("SETTLEMENT_REFUND_FEE not in", values, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_REFUND_FEE between", value1, value2, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_REFUND_FEE not between", value1, value2, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeIsNull() {
            addCriterion("SETTLEMENT_TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeIsNotNull() {
            addCriterion("SETTLEMENT_TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeEqualTo(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE =", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotEqualTo(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <>", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeGreaterThan(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE >", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE >=", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeLessThan(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <=", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeIn(List<Long> values) {
            addCriterion("SETTLEMENT_TOTAL_FEE in", values, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotIn(List<Long> values) {
            addCriterion("SETTLEMENT_TOTAL_FEE not in", values, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_TOTAL_FEE between", value1, value2, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_TOTAL_FEE not between", value1, value2, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNull() {
            addCriterion("CASH_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNotNull() {
            addCriterion("CASH_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashFeeEqualTo(Long value) {
            addCriterion("CASH_FEE =", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotEqualTo(Long value) {
            addCriterion("CASH_FEE <>", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThan(Long value) {
            addCriterion("CASH_FEE >", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("CASH_FEE >=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThan(Long value) {
            addCriterion("CASH_FEE <", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThanOrEqualTo(Long value) {
            addCriterion("CASH_FEE <=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeIn(List<Long> values) {
            addCriterion("CASH_FEE in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotIn(List<Long> values) {
            addCriterion("CASH_FEE not in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeBetween(Long value1, Long value2) {
            addCriterion("CASH_FEE between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotBetween(Long value1, Long value2) {
            addCriterion("CASH_FEE not between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIsNull() {
            addCriterion("CASH_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIsNotNull() {
            addCriterion("CASH_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE =", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE <>", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeGreaterThan(String value) {
            addCriterion("CASH_FEE_TYPE >", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE >=", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLessThan(String value) {
            addCriterion("CASH_FEE_TYPE <", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE <=", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLike(String value) {
            addCriterion("CASH_FEE_TYPE like", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotLike(String value) {
            addCriterion("CASH_FEE_TYPE not like", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIn(List<String> values) {
            addCriterion("CASH_FEE_TYPE in", values, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotIn(List<String> values) {
            addCriterion("CASH_FEE_TYPE not in", values, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeBetween(String value1, String value2) {
            addCriterion("CASH_FEE_TYPE between", value1, value2, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotBetween(String value1, String value2) {
            addCriterion("CASH_FEE_TYPE not between", value1, value2, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeIsNull() {
            addCriterion("CASH_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeIsNotNull() {
            addCriterion("CASH_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeEqualTo(Long value) {
            addCriterion("CASH_REFUND_FEE =", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotEqualTo(Long value) {
            addCriterion("CASH_REFUND_FEE <>", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeGreaterThan(Long value) {
            addCriterion("CASH_REFUND_FEE >", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("CASH_REFUND_FEE >=", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeLessThan(Long value) {
            addCriterion("CASH_REFUND_FEE <", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeLessThanOrEqualTo(Long value) {
            addCriterion("CASH_REFUND_FEE <=", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeIn(List<Long> values) {
            addCriterion("CASH_REFUND_FEE in", values, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotIn(List<Long> values) {
            addCriterion("CASH_REFUND_FEE not in", values, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeBetween(Long value1, Long value2) {
            addCriterion("CASH_REFUND_FEE between", value1, value2, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotBetween(Long value1, Long value2) {
            addCriterion("CASH_REFUND_FEE not between", value1, value2, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeIsNull() {
            addCriterion("COUPON_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeIsNotNull() {
            addCriterion("COUPON_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeEqualTo(Long value) {
            addCriterion("COUPON_REFUND_FEE =", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeNotEqualTo(Long value) {
            addCriterion("COUPON_REFUND_FEE <>", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeGreaterThan(Long value) {
            addCriterion("COUPON_REFUND_FEE >", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_REFUND_FEE >=", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeLessThan(Long value) {
            addCriterion("COUPON_REFUND_FEE <", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_REFUND_FEE <=", value, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeIn(List<Long> values) {
            addCriterion("COUPON_REFUND_FEE in", values, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeNotIn(List<Long> values) {
            addCriterion("COUPON_REFUND_FEE not in", values, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeBetween(Long value1, Long value2) {
            addCriterion("COUPON_REFUND_FEE between", value1, value2, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_REFUND_FEE not between", value1, value2, "couponRefundFee");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIsNull() {
            addCriterion("COUPON_REFUND_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIsNotNull() {
            addCriterion("COUPON_REFUND_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT =", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <>", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountGreaterThan(Integer value) {
            addCriterion("COUPON_REFUND_COUNT >", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT >=", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountLessThan(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <=", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_COUNT in", values, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_COUNT not in", values, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_COUNT between", value1, value2, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_COUNT not between", value1, value2, "couponRefundCount");
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

        public Criteria andResultCodeIsNull() {
            addCriterion("RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNotNull() {
            addCriterion("RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultCodeEqualTo(String value) {
            addCriterion("RESULT_CODE =", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotEqualTo(String value) {
            addCriterion("RESULT_CODE <>", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThan(String value) {
            addCriterion("RESULT_CODE >", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE >=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThan(String value) {
            addCriterion("RESULT_CODE <", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE <=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLike(String value) {
            addCriterion("RESULT_CODE like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotLike(String value) {
            addCriterion("RESULT_CODE not like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeIn(List<String> values) {
            addCriterion("RESULT_CODE in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotIn(List<String> values) {
            addCriterion("RESULT_CODE not in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeBetween(String value1, String value2) {
            addCriterion("RESULT_CODE between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotBetween(String value1, String value2) {
            addCriterion("RESULT_CODE not between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("REFUND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("REFUND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("REFUND_STATUS =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("REFUND_STATUS <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("REFUND_STATUS >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_STATUS >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("REFUND_STATUS <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("REFUND_STATUS <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("REFUND_STATUS like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("REFUND_STATUS not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("REFUND_STATUS in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("REFUND_STATUS not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("REFUND_STATUS between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("REFUND_STATUS not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNull() {
            addCriterion("QUERY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNotNull() {
            addCriterion("QUERY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andQueryCountEqualTo(Integer value) {
            addCriterion("QUERY_COUNT =", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotEqualTo(Integer value) {
            addCriterion("QUERY_COUNT <>", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThan(Integer value) {
            addCriterion("QUERY_COUNT >", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUERY_COUNT >=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThan(Integer value) {
            addCriterion("QUERY_COUNT <", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("QUERY_COUNT <=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIn(List<Integer> values) {
            addCriterion("QUERY_COUNT in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotIn(List<Integer> values) {
            addCriterion("QUERY_COUNT not in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("QUERY_COUNT between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("QUERY_COUNT not between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNull() {
            addCriterion("QUERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("QUERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(Date value) {
            addCriterion("QUERY_TIME =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(Date value) {
            addCriterion("QUERY_TIME <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(Date value) {
            addCriterion("QUERY_TIME >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUERY_TIME >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(Date value) {
            addCriterion("QUERY_TIME <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUERY_TIME <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<Date> values) {
            addCriterion("QUERY_TIME in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<Date> values) {
            addCriterion("QUERY_TIME not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(Date value1, Date value2) {
            addCriterion("QUERY_TIME between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUERY_TIME not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_REFUND_NO) like", value.toUpperCase(), "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andRefundIdLikeInsensitive(String value) {
            addCriterion("upper(REFUND_ID) like", value.toUpperCase(), "refundId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLikeInsensitive(String value) {
            addCriterion("upper(TRANSACTION_ID) like", value.toUpperCase(), "transactionId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLikeInsensitive(String value) {
            addCriterion("upper(OUT_TRADE_NO) like", value.toUpperCase(), "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andAppidLikeInsensitive(String value) {
            addCriterion("upper(APPID) like", value.toUpperCase(), "appid");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(REFUND_FEE_TYPE) like", value.toUpperCase(), "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(CASH_FEE_TYPE) like", value.toUpperCase(), "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLikeInsensitive(String value) {
            addCriterion("upper(COUPON_INFO) like", value.toUpperCase(), "couponInfo");
            return (Criteria) this;
        }

        public Criteria andResultCodeLikeInsensitive(String value) {
            addCriterion("upper(RESULT_CODE) like", value.toUpperCase(), "resultCode");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLikeInsensitive(String value) {
            addCriterion("upper(REFUND_STATUS) like", value.toUpperCase(), "refundStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table refund_order_wx
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: refund_order_wx
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