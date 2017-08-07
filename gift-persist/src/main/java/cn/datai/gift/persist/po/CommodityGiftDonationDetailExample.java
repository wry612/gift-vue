package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityGiftDonationDetailExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public CommodityGiftDonationDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
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
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_gift_donation_detail
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

        public Criteria andCommodityGiftDonationDetailIdIsNull() {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdIsNotNull() {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID =", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID <>", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdGreaterThan(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID >", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID >=", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdLessThan(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID <", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID <=", value, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID in", values, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID not in", values, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID between", value1, value2, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftDonationDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_DONATION_DETAIL_ID not between", value1, value2, "commodityGiftDonationDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdIsNull() {
            addCriterion("COMMODITY_GIFT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdIsNotNull() {
            addCriterion("COMMODITY_GIFT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_ID =", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_ID <>", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdGreaterThan(Long value) {
            addCriterion("COMMODITY_GIFT_ID >", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_ID >=", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdLessThan(Long value) {
            addCriterion("COMMODITY_GIFT_ID <", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_ID <=", value, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_ID in", values, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_ID not in", values, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_ID between", value1, value2, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_ID not between", value1, value2, "commodityGiftId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdIsNull() {
            addCriterion("DONEE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdIsNotNull() {
            addCriterion("DONEE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdEqualTo(Long value) {
            addCriterion("DONEE_USER_ID =", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdNotEqualTo(Long value) {
            addCriterion("DONEE_USER_ID <>", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdGreaterThan(Long value) {
            addCriterion("DONEE_USER_ID >", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DONEE_USER_ID >=", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdLessThan(Long value) {
            addCriterion("DONEE_USER_ID <", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdLessThanOrEqualTo(Long value) {
            addCriterion("DONEE_USER_ID <=", value, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdIn(List<Long> values) {
            addCriterion("DONEE_USER_ID in", values, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdNotIn(List<Long> values) {
            addCriterion("DONEE_USER_ID not in", values, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdBetween(Long value1, Long value2) {
            addCriterion("DONEE_USER_ID between", value1, value2, "doneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdNotBetween(Long value1, Long value2) {
            addCriterion("DONEE_USER_ID not between", value1, value2, "doneeUserId");
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

        public Criteria andAdoptTimeIsNull() {
            addCriterion("ADOPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeIsNotNull() {
            addCriterion("ADOPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeEqualTo(Date value) {
            addCriterion("ADOPT_TIME =", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotEqualTo(Date value) {
            addCriterion("ADOPT_TIME <>", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeGreaterThan(Date value) {
            addCriterion("ADOPT_TIME >", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADOPT_TIME >=", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeLessThan(Date value) {
            addCriterion("ADOPT_TIME <", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADOPT_TIME <=", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeIn(List<Date> values) {
            addCriterion("ADOPT_TIME in", values, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotIn(List<Date> values) {
            addCriterion("ADOPT_TIME not in", values, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeBetween(Date value1, Date value2) {
            addCriterion("ADOPT_TIME between", value1, value2, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADOPT_TIME not between", value1, value2, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_gift_donation_detail
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_gift_donation_detail
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