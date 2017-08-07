package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBizBriefExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public UserBizBriefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
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
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_biz_brief
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

        public Criteria andUserlBizBriefIdIsNull() {
            addCriterion("USERL_BIZ_BRIEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdIsNotNull() {
            addCriterion("USERL_BIZ_BRIEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdEqualTo(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID =", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdNotEqualTo(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID <>", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdGreaterThan(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID >", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID >=", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdLessThan(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID <", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdLessThanOrEqualTo(Long value) {
            addCriterion("USERL_BIZ_BRIEF_ID <=", value, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdIn(List<Long> values) {
            addCriterion("USERL_BIZ_BRIEF_ID in", values, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdNotIn(List<Long> values) {
            addCriterion("USERL_BIZ_BRIEF_ID not in", values, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdBetween(Long value1, Long value2) {
            addCriterion("USERL_BIZ_BRIEF_ID between", value1, value2, "userlBizBriefId");
            return (Criteria) this;
        }

        public Criteria andUserlBizBriefIdNotBetween(Long value1, Long value2) {
            addCriterion("USERL_BIZ_BRIEF_ID not between", value1, value2, "userlBizBriefId");
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

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("COMMODITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("COMMODITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(Long value) {
            addCriterion("COMMODITY_TYPE_ID >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(Long value) {
            addCriterion("COMMODITY_TYPE_ID <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<Long> values) {
            addCriterion("COMMODITY_TYPE_ID in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_TYPE_ID not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TYPE_ID between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TYPE_ID not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("COMMODITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("COMMODITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("COMMODITY_NAME =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("COMMODITY_NAME <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("COMMODITY_NAME >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("COMMODITY_NAME <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("COMMODITY_NAME like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("COMMODITY_NAME not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("COMMODITY_NAME in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("COMMODITY_NAME not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityIsNull() {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityIsNotNull() {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY =", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY <>", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY >", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY >=", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityLessThan(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY <", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY <=", value, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY in", values, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY not in", values, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY between", value1, value2, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andOpCommodityUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OP_COMMODITY_UNIT_QUANTITY not between", value1, value2, "opCommodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNull() {
            addCriterion("BIZ_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNotNull() {
            addCriterion("BIZ_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBizStatusEqualTo(String value) {
            addCriterion("BIZ_STATUS =", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotEqualTo(String value) {
            addCriterion("BIZ_STATUS <>", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThan(String value) {
            addCriterion("BIZ_STATUS >", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_STATUS >=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThan(String value) {
            addCriterion("BIZ_STATUS <", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThanOrEqualTo(String value) {
            addCriterion("BIZ_STATUS <=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLike(String value) {
            addCriterion("BIZ_STATUS like", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotLike(String value) {
            addCriterion("BIZ_STATUS not like", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusIn(List<String> values) {
            addCriterion("BIZ_STATUS in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotIn(List<String> values) {
            addCriterion("BIZ_STATUS not in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusBetween(String value1, String value2) {
            addCriterion("BIZ_STATUS between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotBetween(String value1, String value2) {
            addCriterion("BIZ_STATUS not between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andAttachIsNull() {
            addCriterion("ATTACH is null");
            return (Criteria) this;
        }

        public Criteria andAttachIsNotNull() {
            addCriterion("ATTACH is not null");
            return (Criteria) this;
        }

        public Criteria andAttachEqualTo(String value) {
            addCriterion("ATTACH =", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("ATTACH <>", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThan(String value) {
            addCriterion("ATTACH >", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH >=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThan(String value) {
            addCriterion("ATTACH <", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("ATTACH <=", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachLike(String value) {
            addCriterion("ATTACH like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotLike(String value) {
            addCriterion("ATTACH not like", value, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachIn(List<String> values) {
            addCriterion("ATTACH in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("ATTACH not in", values, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("ATTACH between", value1, value2, "attach");
            return (Criteria) this;
        }

        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("ATTACH not between", value1, value2, "attach");
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

        public Criteria andCommodityNameLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_NAME) like", value.toUpperCase(), "commodityName");
            return (Criteria) this;
        }

        public Criteria andBizStatusLikeInsensitive(String value) {
            addCriterion("upper(BIZ_STATUS) like", value.toUpperCase(), "bizStatus");
            return (Criteria) this;
        }

        public Criteria andAttachLikeInsensitive(String value) {
            addCriterion("upper(ATTACH) like", value.toUpperCase(), "attach");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_biz_brief
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_biz_brief
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