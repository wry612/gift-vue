package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityGiftInfoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public CommodityGiftInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
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
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_gift_info
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

        public Criteria andCommodityGiftInfoIdIsNull() {
            addCriterion("COMMODITY_GIFT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdIsNotNull() {
            addCriterion("COMMODITY_GIFT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID =", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID <>", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdGreaterThan(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID >", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID >=", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdLessThan(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID <", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_GIFT_INFO_ID <=", value, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_INFO_ID in", values, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_GIFT_INFO_ID not in", values, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_INFO_ID between", value1, value2, "commodityGiftInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityGiftInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_GIFT_INFO_ID not between", value1, value2, "commodityGiftInfoId");
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

        public Criteria andDonatorGiftAccountIdIsNull() {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdIsNotNull() {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdEqualTo(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID =", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdNotEqualTo(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID <>", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdGreaterThan(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID >", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID >=", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdLessThan(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID <", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID <=", value, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdIn(List<Long> values) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID in", values, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdNotIn(List<Long> values) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID not in", values, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdBetween(Long value1, Long value2) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID between", value1, value2, "donatorGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andDonatorGiftAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("DONATOR_GIFT_ACCOUNT_ID not between", value1, value2, "donatorGiftAccountId");
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

        public Criteria andGreetingIsNull() {
            addCriterion("GREETING is null");
            return (Criteria) this;
        }

        public Criteria andGreetingIsNotNull() {
            addCriterion("GREETING is not null");
            return (Criteria) this;
        }

        public Criteria andGreetingEqualTo(String value) {
            addCriterion("GREETING =", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingNotEqualTo(String value) {
            addCriterion("GREETING <>", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingGreaterThan(String value) {
            addCriterion("GREETING >", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingGreaterThanOrEqualTo(String value) {
            addCriterion("GREETING >=", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingLessThan(String value) {
            addCriterion("GREETING <", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingLessThanOrEqualTo(String value) {
            addCriterion("GREETING <=", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingLike(String value) {
            addCriterion("GREETING like", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingNotLike(String value) {
            addCriterion("GREETING not like", value, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingIn(List<String> values) {
            addCriterion("GREETING in", values, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingNotIn(List<String> values) {
            addCriterion("GREETING not in", values, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingBetween(String value1, String value2) {
            addCriterion("GREETING between", value1, value2, "greeting");
            return (Criteria) this;
        }

        public Criteria andGreetingNotBetween(String value1, String value2) {
            addCriterion("GREETING not between", value1, value2, "greeting");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdIsNull() {
            addCriterion("SPECIFIED_DONEE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdIsNotNull() {
            addCriterion("SPECIFIED_DONEE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdEqualTo(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID =", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdNotEqualTo(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID <>", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdGreaterThan(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID >", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID >=", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdLessThan(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID <", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SPECIFIED_DONEE_USER_ID <=", value, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdIn(List<Long> values) {
            addCriterion("SPECIFIED_DONEE_USER_ID in", values, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdNotIn(List<Long> values) {
            addCriterion("SPECIFIED_DONEE_USER_ID not in", values, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdBetween(Long value1, Long value2) {
            addCriterion("SPECIFIED_DONEE_USER_ID between", value1, value2, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andSpecifiedDoneeUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SPECIFIED_DONEE_USER_ID not between", value1, value2, "specifiedDoneeUserId");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaIsNull() {
            addCriterion("DONEE_QUOTA is null");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaIsNotNull() {
            addCriterion("DONEE_QUOTA is not null");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaEqualTo(Integer value) {
            addCriterion("DONEE_QUOTA =", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaNotEqualTo(Integer value) {
            addCriterion("DONEE_QUOTA <>", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaGreaterThan(Integer value) {
            addCriterion("DONEE_QUOTA >", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("DONEE_QUOTA >=", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaLessThan(Integer value) {
            addCriterion("DONEE_QUOTA <", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("DONEE_QUOTA <=", value, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaIn(List<Integer> values) {
            addCriterion("DONEE_QUOTA in", values, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaNotIn(List<Integer> values) {
            addCriterion("DONEE_QUOTA not in", values, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaBetween(Integer value1, Integer value2) {
            addCriterion("DONEE_QUOTA between", value1, value2, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("DONEE_QUOTA not between", value1, value2, "doneeQuota");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusIsNull() {
            addCriterion("DONEE_SURPLUS is null");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusIsNotNull() {
            addCriterion("DONEE_SURPLUS is not null");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusEqualTo(Integer value) {
            addCriterion("DONEE_SURPLUS =", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusNotEqualTo(Integer value) {
            addCriterion("DONEE_SURPLUS <>", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusGreaterThan(Integer value) {
            addCriterion("DONEE_SURPLUS >", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DONEE_SURPLUS >=", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusLessThan(Integer value) {
            addCriterion("DONEE_SURPLUS <", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusLessThanOrEqualTo(Integer value) {
            addCriterion("DONEE_SURPLUS <=", value, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusIn(List<Integer> values) {
            addCriterion("DONEE_SURPLUS in", values, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusNotIn(List<Integer> values) {
            addCriterion("DONEE_SURPLUS not in", values, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusBetween(Integer value1, Integer value2) {
            addCriterion("DONEE_SURPLUS between", value1, value2, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andDoneeSurplusNotBetween(Integer value1, Integer value2) {
            addCriterion("DONEE_SURPLUS not between", value1, value2, "doneeSurplus");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityIsNull() {
            addCriterion("COMMODITY_TOTAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityIsNotNull() {
            addCriterion("COMMODITY_TOTAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY =", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY <>", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY >", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY >=", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityLessThan(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY <", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_TOTAL_QUANTITY <=", value, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_TOTAL_QUANTITY in", values, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_TOTAL_QUANTITY not in", values, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_TOTAL_QUANTITY between", value1, value2, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_TOTAL_QUANTITY not between", value1, value2, "commodityTotalQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityIsNull() {
            addCriterion("COMMODITY_SURPLUS_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityIsNotNull() {
            addCriterion("COMMODITY_SURPLUS_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY =", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY <>", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY >", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY >=", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityLessThan(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY <", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY <=", value, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY in", values, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY not in", values, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY between", value1, value2, "commoditySurplusQuantity");
            return (Criteria) this;
        }

        public Criteria andCommoditySurplusQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_SURPLUS_QUANTITY not between", value1, value2, "commoditySurplusQuantity");
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

        public Criteria andExpiredTimeIsNull() {
            addCriterion("EXPIRED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("EXPIRED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeEqualTo(Date value) {
            addCriterion("EXPIRED_TIME =", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotEqualTo(Date value) {
            addCriterion("EXPIRED_TIME <>", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThan(Date value) {
            addCriterion("EXPIRED_TIME >", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRED_TIME >=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThan(Date value) {
            addCriterion("EXPIRED_TIME <", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRED_TIME <=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIn(List<Date> values) {
            addCriterion("EXPIRED_TIME in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotIn(List<Date> values) {
            addCriterion("EXPIRED_TIME not in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeBetween(Date value1, Date value2) {
            addCriterion("EXPIRED_TIME between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRED_TIME not between", value1, value2, "expiredTime");
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

        public Criteria andRefundedIsNull() {
            addCriterion("REFUNDED is null");
            return (Criteria) this;
        }

        public Criteria andRefundedIsNotNull() {
            addCriterion("REFUNDED is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedEqualTo(String value) {
            addCriterion("REFUNDED =", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedNotEqualTo(String value) {
            addCriterion("REFUNDED <>", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedGreaterThan(String value) {
            addCriterion("REFUNDED >", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedGreaterThanOrEqualTo(String value) {
            addCriterion("REFUNDED >=", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedLessThan(String value) {
            addCriterion("REFUNDED <", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedLessThanOrEqualTo(String value) {
            addCriterion("REFUNDED <=", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedLike(String value) {
            addCriterion("REFUNDED like", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedNotLike(String value) {
            addCriterion("REFUNDED not like", value, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedIn(List<String> values) {
            addCriterion("REFUNDED in", values, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedNotIn(List<String> values) {
            addCriterion("REFUNDED not in", values, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedBetween(String value1, String value2) {
            addCriterion("REFUNDED between", value1, value2, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundedNotBetween(String value1, String value2) {
            addCriterion("REFUNDED not between", value1, value2, "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdIsNull() {
            addCriterion("REFUND_FLOW_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdIsNotNull() {
            addCriterion("REFUND_FLOW_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdEqualTo(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID =", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdNotEqualTo(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID <>", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdGreaterThan(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID >", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID >=", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdLessThan(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID <", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdLessThanOrEqualTo(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID <=", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdLike(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID like", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdNotLike(String value) {
            addCriterion("REFUND_FLOW_RECORD_ID not like", value, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdIn(List<String> values) {
            addCriterion("REFUND_FLOW_RECORD_ID in", values, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdNotIn(List<String> values) {
            addCriterion("REFUND_FLOW_RECORD_ID not in", values, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdBetween(String value1, String value2) {
            addCriterion("REFUND_FLOW_RECORD_ID between", value1, value2, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdNotBetween(String value1, String value2) {
            addCriterion("REFUND_FLOW_RECORD_ID not between", value1, value2, "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsIsNull() {
            addCriterion("DONEE_USER_IDS is null");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsIsNotNull() {
            addCriterion("DONEE_USER_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsEqualTo(String value) {
            addCriterion("DONEE_USER_IDS =", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsNotEqualTo(String value) {
            addCriterion("DONEE_USER_IDS <>", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsGreaterThan(String value) {
            addCriterion("DONEE_USER_IDS >", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsGreaterThanOrEqualTo(String value) {
            addCriterion("DONEE_USER_IDS >=", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsLessThan(String value) {
            addCriterion("DONEE_USER_IDS <", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsLessThanOrEqualTo(String value) {
            addCriterion("DONEE_USER_IDS <=", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsLike(String value) {
            addCriterion("DONEE_USER_IDS like", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsNotLike(String value) {
            addCriterion("DONEE_USER_IDS not like", value, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsIn(List<String> values) {
            addCriterion("DONEE_USER_IDS in", values, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsNotIn(List<String> values) {
            addCriterion("DONEE_USER_IDS not in", values, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsBetween(String value1, String value2) {
            addCriterion("DONEE_USER_IDS between", value1, value2, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsNotBetween(String value1, String value2) {
            addCriterion("DONEE_USER_IDS not between", value1, value2, "doneeUserIds");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andGreetingLikeInsensitive(String value) {
            addCriterion("upper(GREETING) like", value.toUpperCase(), "greeting");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(TYPE) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andRefundedLikeInsensitive(String value) {
            addCriterion("upper(REFUNDED) like", value.toUpperCase(), "refunded");
            return (Criteria) this;
        }

        public Criteria andRefundFlowRecordIdLikeInsensitive(String value) {
            addCriterion("upper(REFUND_FLOW_RECORD_ID) like", value.toUpperCase(), "refundFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andDoneeUserIdsLikeInsensitive(String value) {
            addCriterion("upper(DONEE_USER_IDS) like", value.toUpperCase(), "doneeUserIds");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_gift_info
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_gift_info
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