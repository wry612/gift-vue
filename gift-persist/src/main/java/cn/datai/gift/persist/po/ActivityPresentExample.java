package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityPresentExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public ActivityPresentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
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
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: activity_present
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

        public Criteria andActivityPresentIdIsNull() {
            addCriterion("ACTIVITY_PRESENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdIsNotNull() {
            addCriterion("ACTIVITY_PRESENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdEqualTo(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID =", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdNotEqualTo(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID <>", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdGreaterThan(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID >", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID >=", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdLessThan(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID <", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdLessThanOrEqualTo(Long value) {
            addCriterion("ACTIVITY_PRESENT_ID <=", value, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdIn(List<Long> values) {
            addCriterion("ACTIVITY_PRESENT_ID in", values, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdNotIn(List<Long> values) {
            addCriterion("ACTIVITY_PRESENT_ID not in", values, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdBetween(Long value1, Long value2) {
            addCriterion("ACTIVITY_PRESENT_ID between", value1, value2, "activityPresentId");
            return (Criteria) this;
        }

        public Criteria andActivityPresentIdNotBetween(Long value1, Long value2) {
            addCriterion("ACTIVITY_PRESENT_ID not between", value1, value2, "activityPresentId");
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

        public Criteria andPresentUserIdIsNull() {
            addCriterion("PRESENT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdIsNotNull() {
            addCriterion("PRESENT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdEqualTo(Long value) {
            addCriterion("PRESENT_USER_ID =", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdNotEqualTo(Long value) {
            addCriterion("PRESENT_USER_ID <>", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdGreaterThan(Long value) {
            addCriterion("PRESENT_USER_ID >", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRESENT_USER_ID >=", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdLessThan(Long value) {
            addCriterion("PRESENT_USER_ID <", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdLessThanOrEqualTo(Long value) {
            addCriterion("PRESENT_USER_ID <=", value, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdIn(List<Long> values) {
            addCriterion("PRESENT_USER_ID in", values, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdNotIn(List<Long> values) {
            addCriterion("PRESENT_USER_ID not in", values, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdBetween(Long value1, Long value2) {
            addCriterion("PRESENT_USER_ID between", value1, value2, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentUserIdNotBetween(Long value1, Long value2) {
            addCriterion("PRESENT_USER_ID not between", value1, value2, "presentUserId");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIsNull() {
            addCriterion("PRESENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIsNotNull() {
            addCriterion("PRESENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPresentTypeEqualTo(String value) {
            addCriterion("PRESENT_TYPE =", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotEqualTo(String value) {
            addCriterion("PRESENT_TYPE <>", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeGreaterThan(String value) {
            addCriterion("PRESENT_TYPE >", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_TYPE >=", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLessThan(String value) {
            addCriterion("PRESENT_TYPE <", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_TYPE <=", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLike(String value) {
            addCriterion("PRESENT_TYPE like", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotLike(String value) {
            addCriterion("PRESENT_TYPE not like", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIn(List<String> values) {
            addCriterion("PRESENT_TYPE in", values, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotIn(List<String> values) {
            addCriterion("PRESENT_TYPE not in", values, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeBetween(String value1, String value2) {
            addCriterion("PRESENT_TYPE between", value1, value2, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotBetween(String value1, String value2) {
            addCriterion("PRESENT_TYPE not between", value1, value2, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentReasonIsNull() {
            addCriterion("PRESENT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andPresentReasonIsNotNull() {
            addCriterion("PRESENT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andPresentReasonEqualTo(String value) {
            addCriterion("PRESENT_REASON =", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonNotEqualTo(String value) {
            addCriterion("PRESENT_REASON <>", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonGreaterThan(String value) {
            addCriterion("PRESENT_REASON >", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_REASON >=", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonLessThan(String value) {
            addCriterion("PRESENT_REASON <", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_REASON <=", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonLike(String value) {
            addCriterion("PRESENT_REASON like", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonNotLike(String value) {
            addCriterion("PRESENT_REASON not like", value, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonIn(List<String> values) {
            addCriterion("PRESENT_REASON in", values, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonNotIn(List<String> values) {
            addCriterion("PRESENT_REASON not in", values, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonBetween(String value1, String value2) {
            addCriterion("PRESENT_REASON between", value1, value2, "presentReason");
            return (Criteria) this;
        }

        public Criteria andPresentReasonNotBetween(String value1, String value2) {
            addCriterion("PRESENT_REASON not between", value1, value2, "presentReason");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("COMMODITY_ID =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_ID <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("COMMODITY_ID >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ID >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("COMMODITY_ID <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ID <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("COMMODITY_ID in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_ID not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ID between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ID not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Long value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Long value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Long value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Long value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Long value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Long> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Long> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Long value1, Long value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Long value1, Long value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNull() {
            addCriterion("TICKET_ID is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("TICKET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Long value) {
            addCriterion("TICKET_ID =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Long value) {
            addCriterion("TICKET_ID <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Long value) {
            addCriterion("TICKET_ID >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TICKET_ID >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Long value) {
            addCriterion("TICKET_ID <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Long value) {
            addCriterion("TICKET_ID <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Long> values) {
            addCriterion("TICKET_ID in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Long> values) {
            addCriterion("TICKET_ID not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Long value1, Long value2) {
            addCriterion("TICKET_ID between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Long value1, Long value2) {
            addCriterion("TICKET_ID not between", value1, value2, "ticketId");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsIsNull() {
            addCriterion("COMMODITY_FLOW_IDS is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsIsNotNull() {
            addCriterion("COMMODITY_FLOW_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_IDS =", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsNotEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_IDS <>", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsGreaterThan(String value) {
            addCriterion("COMMODITY_FLOW_IDS >", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_IDS >=", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsLessThan(String value) {
            addCriterion("COMMODITY_FLOW_IDS <", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_IDS <=", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsLike(String value) {
            addCriterion("COMMODITY_FLOW_IDS like", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsNotLike(String value) {
            addCriterion("COMMODITY_FLOW_IDS not like", value, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_IDS in", values, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsNotIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_IDS not in", values, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_IDS between", value1, value2, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_IDS not between", value1, value2, "commodityFlowIds");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLikeInsensitive(String value) {
            addCriterion("upper(PRESENT_TYPE) like", value.toUpperCase(), "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentReasonLikeInsensitive(String value) {
            addCriterion("upper(PRESENT_REASON) like", value.toUpperCase(), "presentReason");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_IDS) like", value.toUpperCase(), "commodityFlowIds");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table activity_present
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: activity_present
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