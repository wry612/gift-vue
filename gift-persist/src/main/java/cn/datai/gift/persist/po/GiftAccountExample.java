package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftAccountExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public GiftAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
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
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: gift_account
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

        public Criteria andLastOpSeqIsNull() {
            addCriterion("LAST_OP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqIsNotNull() {
            addCriterion("LAST_OP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqEqualTo(Long value) {
            addCriterion("LAST_OP_SEQ =", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqNotEqualTo(Long value) {
            addCriterion("LAST_OP_SEQ <>", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqGreaterThan(Long value) {
            addCriterion("LAST_OP_SEQ >", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_OP_SEQ >=", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqLessThan(Long value) {
            addCriterion("LAST_OP_SEQ <", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqLessThanOrEqualTo(Long value) {
            addCriterion("LAST_OP_SEQ <=", value, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqIn(List<Long> values) {
            addCriterion("LAST_OP_SEQ in", values, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqNotIn(List<Long> values) {
            addCriterion("LAST_OP_SEQ not in", values, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqBetween(Long value1, Long value2) {
            addCriterion("LAST_OP_SEQ between", value1, value2, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andLastOpSeqNotBetween(Long value1, Long value2) {
            addCriterion("LAST_OP_SEQ not between", value1, value2, "lastOpSeq");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityIsNull() {
            addCriterion("AVAILABLE_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityIsNotNull() {
            addCriterion("AVAILABLE_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY =", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY <>", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY >", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY >=", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY <", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_UNIT_QUANTITY <=", value, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_UNIT_QUANTITY in", values, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_UNIT_QUANTITY not in", values, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_UNIT_QUANTITY between", value1, value2, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_UNIT_QUANTITY not between", value1, value2, "availableUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityIsNull() {
            addCriterion("FROZEN_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityIsNotNull() {
            addCriterion("FROZEN_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY =", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY <>", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY >", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY >=", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityLessThan(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY <", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FROZEN_UNIT_QUANTITY <=", value, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("FROZEN_UNIT_QUANTITY in", values, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("FROZEN_UNIT_QUANTITY not in", values, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROZEN_UNIT_QUANTITY between", value1, value2, "frozenUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andFrozenUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROZEN_UNIT_QUANTITY not between", value1, value2, "frozenUnitQuantity");
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

        public Criteria andTotalCostPriceIsNull() {
            addCriterion("TOTAL_COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceIsNotNull() {
            addCriterion("TOTAL_COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceEqualTo(Long value) {
            addCriterion("TOTAL_COST_PRICE =", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceNotEqualTo(Long value) {
            addCriterion("TOTAL_COST_PRICE <>", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceGreaterThan(Long value) {
            addCriterion("TOTAL_COST_PRICE >", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COST_PRICE >=", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceLessThan(Long value) {
            addCriterion("TOTAL_COST_PRICE <", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COST_PRICE <=", value, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceIn(List<Long> values) {
            addCriterion("TOTAL_COST_PRICE in", values, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceNotIn(List<Long> values) {
            addCriterion("TOTAL_COST_PRICE not in", values, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COST_PRICE between", value1, value2, "totalCostPrice");
            return (Criteria) this;
        }

        public Criteria andTotalCostPriceNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COST_PRICE not between", value1, value2, "totalCostPrice");
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

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(TYPE) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table gift_account
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: gift_account
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