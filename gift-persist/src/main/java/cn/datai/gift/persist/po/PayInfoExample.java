package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayInfoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public PayInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
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
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: pay_info
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

        public Criteria andPayInfoIdIsNull() {
            addCriterion("PAY_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIsNotNull() {
            addCriterion("PAY_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdEqualTo(Long value) {
            addCriterion("PAY_INFO_ID =", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotEqualTo(Long value) {
            addCriterion("PAY_INFO_ID <>", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThan(Long value) {
            addCriterion("PAY_INFO_ID >", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_INFO_ID >=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThan(Long value) {
            addCriterion("PAY_INFO_ID <", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("PAY_INFO_ID <=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIn(List<Long> values) {
            addCriterion("PAY_INFO_ID in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotIn(List<Long> values) {
            addCriterion("PAY_INFO_ID not in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdBetween(Long value1, Long value2) {
            addCriterion("PAY_INFO_ID between", value1, value2, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("PAY_INFO_ID not between", value1, value2, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNull() {
            addCriterion("USER_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("USER_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(Long value) {
            addCriterion("USER_INFO_ID =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(Long value) {
            addCriterion("USER_INFO_ID <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(Long value) {
            addCriterion("USER_INFO_ID >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_INFO_ID >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(Long value) {
            addCriterion("USER_INFO_ID <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_INFO_ID <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<Long> values) {
            addCriterion("USER_INFO_ID in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<Long> values) {
            addCriterion("USER_INFO_ID not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(Long value1, Long value2) {
            addCriterion("USER_INFO_ID between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_INFO_ID not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdIsNull() {
            addCriterion("OPERATOR_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdIsNotNull() {
            addCriterion("OPERATOR_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID =", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID <>", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdGreaterThan(Long value) {
            addCriterion("OPERATOR_INFO_ID >", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID >=", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdLessThan(Long value) {
            addCriterion("OPERATOR_INFO_ID <", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID <=", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdIn(List<Long> values) {
            addCriterion("OPERATOR_INFO_ID in", values, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_INFO_ID not in", values, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_INFO_ID between", value1, value2, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_INFO_ID not between", value1, value2, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Long value) {
            addCriterion("PAY_AMOUNT =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Long value) {
            addCriterion("PAY_AMOUNT <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Long value) {
            addCriterion("PAY_AMOUNT >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_AMOUNT >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Long value) {
            addCriterion("PAY_AMOUNT <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("PAY_AMOUNT <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Long> values) {
            addCriterion("PAY_AMOUNT in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Long> values) {
            addCriterion("PAY_AMOUNT not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Long value1, Long value2) {
            addCriterion("PAY_AMOUNT between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("PAY_AMOUNT not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdIsNull() {
            addCriterion("PAY_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdIsNotNull() {
            addCriterion("PAY_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdEqualTo(String value) {
            addCriterion("PAY_DETAIL_ID =", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdNotEqualTo(String value) {
            addCriterion("PAY_DETAIL_ID <>", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdGreaterThan(String value) {
            addCriterion("PAY_DETAIL_ID >", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_DETAIL_ID >=", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdLessThan(String value) {
            addCriterion("PAY_DETAIL_ID <", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_DETAIL_ID <=", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdLike(String value) {
            addCriterion("PAY_DETAIL_ID like", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdNotLike(String value) {
            addCriterion("PAY_DETAIL_ID not like", value, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdIn(List<String> values) {
            addCriterion("PAY_DETAIL_ID in", values, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdNotIn(List<String> values) {
            addCriterion("PAY_DETAIL_ID not in", values, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdBetween(String value1, String value2) {
            addCriterion("PAY_DETAIL_ID between", value1, value2, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdNotBetween(String value1, String value2) {
            addCriterion("PAY_DETAIL_ID not between", value1, value2, "payDetailId");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("BIZ_TYPE like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("BIZ_TYPE not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("BIZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("BIZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(String value) {
            addCriterion("BIZ_ID =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(String value) {
            addCriterion("BIZ_ID <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(String value) {
            addCriterion("BIZ_ID >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_ID >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(String value) {
            addCriterion("BIZ_ID <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(String value) {
            addCriterion("BIZ_ID <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLike(String value) {
            addCriterion("BIZ_ID like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotLike(String value) {
            addCriterion("BIZ_ID not like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<String> values) {
            addCriterion("BIZ_ID in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<String> values) {
            addCriterion("BIZ_ID not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(String value1, String value2) {
            addCriterion("BIZ_ID between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(String value1, String value2) {
            addCriterion("BIZ_ID not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizProcessedIsNull() {
            addCriterion("BIZ_PROCESSED is null");
            return (Criteria) this;
        }

        public Criteria andBizProcessedIsNotNull() {
            addCriterion("BIZ_PROCESSED is not null");
            return (Criteria) this;
        }

        public Criteria andBizProcessedEqualTo(String value) {
            addCriterion("BIZ_PROCESSED =", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedNotEqualTo(String value) {
            addCriterion("BIZ_PROCESSED <>", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedGreaterThan(String value) {
            addCriterion("BIZ_PROCESSED >", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_PROCESSED >=", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedLessThan(String value) {
            addCriterion("BIZ_PROCESSED <", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedLessThanOrEqualTo(String value) {
            addCriterion("BIZ_PROCESSED <=", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedLike(String value) {
            addCriterion("BIZ_PROCESSED like", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedNotLike(String value) {
            addCriterion("BIZ_PROCESSED not like", value, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedIn(List<String> values) {
            addCriterion("BIZ_PROCESSED in", values, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedNotIn(List<String> values) {
            addCriterion("BIZ_PROCESSED not in", values, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedBetween(String value1, String value2) {
            addCriterion("BIZ_PROCESSED between", value1, value2, "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andBizProcessedNotBetween(String value1, String value2) {
            addCriterion("BIZ_PROCESSED not between", value1, value2, "bizProcessed");
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

        public Criteria andStatusHistoryIsNull() {
            addCriterion("STATUS_HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryIsNotNull() {
            addCriterion("STATUS_HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryEqualTo(String value) {
            addCriterion("STATUS_HISTORY =", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryNotEqualTo(String value) {
            addCriterion("STATUS_HISTORY <>", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryGreaterThan(String value) {
            addCriterion("STATUS_HISTORY >", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_HISTORY >=", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryLessThan(String value) {
            addCriterion("STATUS_HISTORY <", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryLessThanOrEqualTo(String value) {
            addCriterion("STATUS_HISTORY <=", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryLike(String value) {
            addCriterion("STATUS_HISTORY like", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryNotLike(String value) {
            addCriterion("STATUS_HISTORY not like", value, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryIn(List<String> values) {
            addCriterion("STATUS_HISTORY in", values, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryNotIn(List<String> values) {
            addCriterion("STATUS_HISTORY not in", values, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryBetween(String value1, String value2) {
            addCriterion("STATUS_HISTORY between", value1, value2, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryNotBetween(String value1, String value2) {
            addCriterion("STATUS_HISTORY not between", value1, value2, "statusHistory");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("TIME_START is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("TIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(Date value) {
            addCriterion("TIME_START =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(Date value) {
            addCriterion("TIME_START <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(Date value) {
            addCriterion("TIME_START >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_START >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(Date value) {
            addCriterion("TIME_START <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("TIME_START <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<Date> values) {
            addCriterion("TIME_START in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<Date> values) {
            addCriterion("TIME_START not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(Date value1, Date value2) {
            addCriterion("TIME_START between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("TIME_START not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNull() {
            addCriterion("TIME_EXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNotNull() {
            addCriterion("TIME_EXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireEqualTo(Date value) {
            addCriterion("TIME_EXPIRE =", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotEqualTo(Date value) {
            addCriterion("TIME_EXPIRE <>", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThan(Date value) {
            addCriterion("TIME_EXPIRE >", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_EXPIRE >=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThan(Date value) {
            addCriterion("TIME_EXPIRE <", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThanOrEqualTo(Date value) {
            addCriterion("TIME_EXPIRE <=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIn(List<Date> values) {
            addCriterion("TIME_EXPIRE in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotIn(List<Date> values) {
            addCriterion("TIME_EXPIRE not in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireBetween(Date value1, Date value2) {
            addCriterion("TIME_EXPIRE between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotBetween(Date value1, Date value2) {
            addCriterion("TIME_EXPIRE not between", value1, value2, "timeExpire");
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

        public Criteria andRefundedPriceIsNull() {
            addCriterion("REFUNDED_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceIsNotNull() {
            addCriterion("REFUNDED_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceEqualTo(Long value) {
            addCriterion("REFUNDED_PRICE =", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceNotEqualTo(Long value) {
            addCriterion("REFUNDED_PRICE <>", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceGreaterThan(Long value) {
            addCriterion("REFUNDED_PRICE >", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUNDED_PRICE >=", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceLessThan(Long value) {
            addCriterion("REFUNDED_PRICE <", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceLessThanOrEqualTo(Long value) {
            addCriterion("REFUNDED_PRICE <=", value, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceIn(List<Long> values) {
            addCriterion("REFUNDED_PRICE in", values, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceNotIn(List<Long> values) {
            addCriterion("REFUNDED_PRICE not in", values, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceBetween(Long value1, Long value2) {
            addCriterion("REFUNDED_PRICE between", value1, value2, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andRefundedPriceNotBetween(Long value1, Long value2) {
            addCriterion("REFUNDED_PRICE not between", value1, value2, "refundedPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNull() {
            addCriterion("PAY_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIsNotNull() {
            addCriterion("PAY_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME =", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME <>", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThan(Date value) {
            addCriterion("PAY_SUCCESS_TIME >", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME >=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThan(Date value) {
            addCriterion("PAY_SUCCESS_TIME <", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_SUCCESS_TIME <=", value, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeIn(List<Date> values) {
            addCriterion("PAY_SUCCESS_TIME in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotIn(List<Date> values) {
            addCriterion("PAY_SUCCESS_TIME not in", values, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_SUCCESS_TIME between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andPaySuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_SUCCESS_TIME not between", value1, value2, "paySuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNull() {
            addCriterion("REFUND_APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNotNull() {
            addCriterion("REFUND_APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME =", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME <>", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThan(Date value) {
            addCriterion("REFUND_APPLY_TIME >", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME >=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThan(Date value) {
            addCriterion("REFUND_APPLY_TIME <", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME <=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIn(List<Date> values) {
            addCriterion("REFUND_APPLY_TIME in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotIn(List<Date> values) {
            addCriterion("REFUND_APPLY_TIME not in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_APPLY_TIME between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_APPLY_TIME not between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNull() {
            addCriterion("REFUND_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNotNull() {
            addCriterion("REFUND_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeEqualTo(Date value) {
            addCriterion("REFUND_SUCCESS_TIME =", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotEqualTo(Date value) {
            addCriterion("REFUND_SUCCESS_TIME <>", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThan(Date value) {
            addCriterion("REFUND_SUCCESS_TIME >", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_SUCCESS_TIME >=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThan(Date value) {
            addCriterion("REFUND_SUCCESS_TIME <", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_SUCCESS_TIME <=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIn(List<Date> values) {
            addCriterion("REFUND_SUCCESS_TIME in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotIn(List<Date> values) {
            addCriterion("REFUND_SUCCESS_TIME not in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_SUCCESS_TIME between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_SUCCESS_TIME not between", value1, value2, "refundSuccessTime");
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

        public Criteria andChannelLikeInsensitive(String value) {
            addCriterion("upper(CHANNEL) like", value.toUpperCase(), "channel");
            return (Criteria) this;
        }

        public Criteria andPayDetailIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_DETAIL_ID) like", value.toUpperCase(), "payDetailId");
            return (Criteria) this;
        }

        public Criteria andBizTypeLikeInsensitive(String value) {
            addCriterion("upper(BIZ_TYPE) like", value.toUpperCase(), "bizType");
            return (Criteria) this;
        }

        public Criteria andBizIdLikeInsensitive(String value) {
            addCriterion("upper(BIZ_ID) like", value.toUpperCase(), "bizId");
            return (Criteria) this;
        }

        public Criteria andBizProcessedLikeInsensitive(String value) {
            addCriterion("upper(BIZ_PROCESSED) like", value.toUpperCase(), "bizProcessed");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andStatusHistoryLikeInsensitive(String value) {
            addCriterion("upper(STATUS_HISTORY) like", value.toUpperCase(), "statusHistory");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLikeInsensitive(String value) {
            addCriterion("upper(REFUND_STATUS) like", value.toUpperCase(), "refundStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay_info
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: pay_info
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