package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommodityAllotApplyExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public CommodityAllotApplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
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
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_allot_apply
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

        public Criteria andCommodityAllotApplyIsNull() {
            addCriterion("COMMODITY_ALLOT_APPLY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyIsNotNull() {
            addCriterion("COMMODITY_ALLOT_APPLY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyEqualTo(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY =", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyNotEqualTo(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY <>", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyGreaterThan(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY >", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY >=", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyLessThan(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY <", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ALLOT_APPLY <=", value, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyIn(List<Long> values) {
            addCriterion("COMMODITY_ALLOT_APPLY in", values, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyNotIn(List<Long> values) {
            addCriterion("COMMODITY_ALLOT_APPLY not in", values, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ALLOT_APPLY between", value1, value2, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andCommodityAllotApplyNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ALLOT_APPLY not between", value1, value2, "commodityAllotApply");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdIsNull() {
            addCriterion("GIFT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdIsNotNull() {
            addCriterion("GIFT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_ID =", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdNotEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_ID <>", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdGreaterThan(Long value) {
            addCriterion("GIFT_ACCOUNT_ID >", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_ID >=", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdLessThan(Long value) {
            addCriterion("GIFT_ACCOUNT_ID <", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_ID <=", value, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdIn(List<Long> values) {
            addCriterion("GIFT_ACCOUNT_ID in", values, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdNotIn(List<Long> values) {
            addCriterion("GIFT_ACCOUNT_ID not in", values, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdBetween(Long value1, Long value2) {
            addCriterion("GIFT_ACCOUNT_ID between", value1, value2, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andGiftAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("GIFT_ACCOUNT_ID not between", value1, value2, "giftAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("ACCOUNT_TYPE like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("ACCOUNT_TYPE not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andInOrOutIsNull() {
            addCriterion("IN_OR_OUT is null");
            return (Criteria) this;
        }

        public Criteria andInOrOutIsNotNull() {
            addCriterion("IN_OR_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andInOrOutEqualTo(String value) {
            addCriterion("IN_OR_OUT =", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutNotEqualTo(String value) {
            addCriterion("IN_OR_OUT <>", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutGreaterThan(String value) {
            addCriterion("IN_OR_OUT >", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutGreaterThanOrEqualTo(String value) {
            addCriterion("IN_OR_OUT >=", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutLessThan(String value) {
            addCriterion("IN_OR_OUT <", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutLessThanOrEqualTo(String value) {
            addCriterion("IN_OR_OUT <=", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutLike(String value) {
            addCriterion("IN_OR_OUT like", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutNotLike(String value) {
            addCriterion("IN_OR_OUT not like", value, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutIn(List<String> values) {
            addCriterion("IN_OR_OUT in", values, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutNotIn(List<String> values) {
            addCriterion("IN_OR_OUT not in", values, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutBetween(String value1, String value2) {
            addCriterion("IN_OR_OUT between", value1, value2, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andInOrOutNotBetween(String value1, String value2) {
            addCriterion("IN_OR_OUT not between", value1, value2, "inOrOut");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIsNull() {
            addCriterion("COMMODITY_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIsNotNull() {
            addCriterion("COMMODITY_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY =", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <>", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY >", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY >=", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityLessThan(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <=", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_UNIT_QUANTITY in", values, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_UNIT_QUANTITY not in", values, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_UNIT_QUANTITY between", value1, value2, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_UNIT_QUANTITY not between", value1, value2, "commodityUnitQuantity");
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

        public Criteria andAccountTypeLikeInsensitive(String value) {
            addCriterion("upper(ACCOUNT_TYPE) like", value.toUpperCase(), "accountType");
            return (Criteria) this;
        }

        public Criteria andInOrOutLikeInsensitive(String value) {
            addCriterion("upper(IN_OR_OUT) like", value.toUpperCase(), "inOrOut");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_allot_apply
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_allot_apply
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