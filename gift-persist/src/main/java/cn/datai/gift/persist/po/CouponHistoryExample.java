package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponHistoryExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public CouponHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
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
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon_history
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

        public Criteria andCouponHistoryIdIsNull() {
            addCriterion("COUPON_HISTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdIsNotNull() {
            addCriterion("COUPON_HISTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdEqualTo(Long value) {
            addCriterion("COUPON_HISTORY_ID =", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdNotEqualTo(Long value) {
            addCriterion("COUPON_HISTORY_ID <>", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdGreaterThan(Long value) {
            addCriterion("COUPON_HISTORY_ID >", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_HISTORY_ID >=", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdLessThan(Long value) {
            addCriterion("COUPON_HISTORY_ID <", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_HISTORY_ID <=", value, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdIn(List<Long> values) {
            addCriterion("COUPON_HISTORY_ID in", values, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdNotIn(List<Long> values) {
            addCriterion("COUPON_HISTORY_ID not in", values, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdBetween(Long value1, Long value2) {
            addCriterion("COUPON_HISTORY_ID between", value1, value2, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponHistoryIdNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_HISTORY_ID not between", value1, value2, "couponHistoryId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdIsNull() {
            addCriterion("COUPON_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdIsNotNull() {
            addCriterion("COUPON_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID =", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID <>", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdGreaterThan(Long value) {
            addCriterion("COUPON_DETAIL_ID >", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID >=", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdLessThan(Long value) {
            addCriterion("COUPON_DETAIL_ID <", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID <=", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdIn(List<Long> values) {
            addCriterion("COUPON_DETAIL_ID in", values, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotIn(List<Long> values) {
            addCriterion("COUPON_DETAIL_ID not in", values, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdBetween(Long value1, Long value2) {
            addCriterion("COUPON_DETAIL_ID between", value1, value2, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_DETAIL_ID not between", value1, value2, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andResultDetailIsNull() {
            addCriterion("RESULT_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andResultDetailIsNotNull() {
            addCriterion("RESULT_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andResultDetailEqualTo(String value) {
            addCriterion("RESULT_DETAIL =", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailNotEqualTo(String value) {
            addCriterion("RESULT_DETAIL <>", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailGreaterThan(String value) {
            addCriterion("RESULT_DETAIL >", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_DETAIL >=", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailLessThan(String value) {
            addCriterion("RESULT_DETAIL <", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailLessThanOrEqualTo(String value) {
            addCriterion("RESULT_DETAIL <=", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailLike(String value) {
            addCriterion("RESULT_DETAIL like", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailNotLike(String value) {
            addCriterion("RESULT_DETAIL not like", value, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailIn(List<String> values) {
            addCriterion("RESULT_DETAIL in", values, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailNotIn(List<String> values) {
            addCriterion("RESULT_DETAIL not in", values, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailBetween(String value1, String value2) {
            addCriterion("RESULT_DETAIL between", value1, value2, "resultDetail");
            return (Criteria) this;
        }

        public Criteria andResultDetailNotBetween(String value1, String value2) {
            addCriterion("RESULT_DETAIL not between", value1, value2, "resultDetail");
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

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseIsNull() {
            addCriterion("GIVE_OR_USE is null");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseIsNotNull() {
            addCriterion("GIVE_OR_USE is not null");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseEqualTo(String value) {
            addCriterion("GIVE_OR_USE =", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseNotEqualTo(String value) {
            addCriterion("GIVE_OR_USE <>", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseGreaterThan(String value) {
            addCriterion("GIVE_OR_USE >", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseGreaterThanOrEqualTo(String value) {
            addCriterion("GIVE_OR_USE >=", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseLessThan(String value) {
            addCriterion("GIVE_OR_USE <", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseLessThanOrEqualTo(String value) {
            addCriterion("GIVE_OR_USE <=", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseLike(String value) {
            addCriterion("GIVE_OR_USE like", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseNotLike(String value) {
            addCriterion("GIVE_OR_USE not like", value, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseIn(List<String> values) {
            addCriterion("GIVE_OR_USE in", values, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseNotIn(List<String> values) {
            addCriterion("GIVE_OR_USE not in", values, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseBetween(String value1, String value2) {
            addCriterion("GIVE_OR_USE between", value1, value2, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseNotBetween(String value1, String value2) {
            addCriterion("GIVE_OR_USE not between", value1, value2, "giveOrUse");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATE_TIME not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andResultDetailLikeInsensitive(String value) {
            addCriterion("upper(RESULT_DETAIL) like", value.toUpperCase(), "resultDetail");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLikeInsensitive(String value) {
            addCriterion("upper(ACCOUNT_TYPE) like", value.toUpperCase(), "accountType");
            return (Criteria) this;
        }

        public Criteria andGiveOrUseLikeInsensitive(String value) {
            addCriterion("upper(GIVE_OR_USE) like", value.toUpperCase(), "giveOrUse");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_history
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon_history
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