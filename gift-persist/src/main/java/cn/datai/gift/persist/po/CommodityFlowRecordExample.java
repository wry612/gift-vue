package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityFlowRecordExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public CommodityFlowRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
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
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_flow_record
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

        public Criteria andCommodityFlowRecordIdIsNull() {
            addCriterion("COMMODITY_FLOW_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdIsNotNull() {
            addCriterion("COMMODITY_FLOW_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdEqualTo(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID =", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID <>", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdGreaterThan(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID >", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID >=", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdLessThan(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID <", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_FLOW_RECORD_ID <=", value, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdIn(List<Long> values) {
            addCriterion("COMMODITY_FLOW_RECORD_ID in", values, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_FLOW_RECORD_ID not in", values, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_FLOW_RECORD_ID between", value1, value2, "commodityFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_FLOW_RECORD_ID not between", value1, value2, "commodityFlowRecordId");
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

        public Criteria andGiftAccountOpSeqIsNull() {
            addCriterion("GIFT_ACCOUNT_OP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqIsNotNull() {
            addCriterion("GIFT_ACCOUNT_OP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ =", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqNotEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ <>", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqGreaterThan(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ >", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ >=", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqLessThan(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ <", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqLessThanOrEqualTo(Long value) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ <=", value, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqIn(List<Long> values) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ in", values, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqNotIn(List<Long> values) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ not in", values, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqBetween(Long value1, Long value2) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ between", value1, value2, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andGiftAccountOpSeqNotBetween(Long value1, Long value2) {
            addCriterion("GIFT_ACCOUNT_OP_SEQ not between", value1, value2, "giftAccountOpSeq");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdIsNull() {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdIsNotNull() {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdEqualTo(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID =", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdNotEqualTo(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID <>", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdGreaterThan(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID >", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID >=", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdLessThan(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID <", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID <=", value, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdIn(List<Long> values) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID in", values, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdNotIn(List<Long> values) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID not in", values, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdBetween(Long value1, Long value2) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID between", value1, value2, "opponentGiftAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentGiftAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("OPPONENT_GIFT_ACCOUNT_ID not between", value1, value2, "opponentGiftAccountId");
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

        public Criteria andAllotOrTransferIsNull() {
            addCriterion("ALLOT_OR_TRANSFER is null");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferIsNotNull() {
            addCriterion("ALLOT_OR_TRANSFER is not null");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferEqualTo(String value) {
            addCriterion("ALLOT_OR_TRANSFER =", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferNotEqualTo(String value) {
            addCriterion("ALLOT_OR_TRANSFER <>", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferGreaterThan(String value) {
            addCriterion("ALLOT_OR_TRANSFER >", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOT_OR_TRANSFER >=", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferLessThan(String value) {
            addCriterion("ALLOT_OR_TRANSFER <", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferLessThanOrEqualTo(String value) {
            addCriterion("ALLOT_OR_TRANSFER <=", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferLike(String value) {
            addCriterion("ALLOT_OR_TRANSFER like", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferNotLike(String value) {
            addCriterion("ALLOT_OR_TRANSFER not like", value, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferIn(List<String> values) {
            addCriterion("ALLOT_OR_TRANSFER in", values, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferNotIn(List<String> values) {
            addCriterion("ALLOT_OR_TRANSFER not in", values, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferBetween(String value1, String value2) {
            addCriterion("ALLOT_OR_TRANSFER between", value1, value2, "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andAllotOrTransferNotBetween(String value1, String value2) {
            addCriterion("ALLOT_OR_TRANSFER not between", value1, value2, "allotOrTransfer");
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

        public Criteria andFreezeOrUnfreezeIsNull() {
            addCriterion("FREEZE_OR_UNFREEZE is null");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeIsNotNull() {
            addCriterion("FREEZE_OR_UNFREEZE is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeEqualTo(String value) {
            addCriterion("FREEZE_OR_UNFREEZE =", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeNotEqualTo(String value) {
            addCriterion("FREEZE_OR_UNFREEZE <>", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeGreaterThan(String value) {
            addCriterion("FREEZE_OR_UNFREEZE >", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeGreaterThanOrEqualTo(String value) {
            addCriterion("FREEZE_OR_UNFREEZE >=", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeLessThan(String value) {
            addCriterion("FREEZE_OR_UNFREEZE <", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeLessThanOrEqualTo(String value) {
            addCriterion("FREEZE_OR_UNFREEZE <=", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeLike(String value) {
            addCriterion("FREEZE_OR_UNFREEZE like", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeNotLike(String value) {
            addCriterion("FREEZE_OR_UNFREEZE not like", value, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeIn(List<String> values) {
            addCriterion("FREEZE_OR_UNFREEZE in", values, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeNotIn(List<String> values) {
            addCriterion("FREEZE_OR_UNFREEZE not in", values, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeBetween(String value1, String value2) {
            addCriterion("FREEZE_OR_UNFREEZE between", value1, value2, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeNotBetween(String value1, String value2) {
            addCriterion("FREEZE_OR_UNFREEZE not between", value1, value2, "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityIsNull() {
            addCriterion("BEFORE_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityIsNotNull() {
            addCriterion("BEFORE_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY =", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY <>", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY >", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY >=", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityLessThan(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY <", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORE_UNIT_QUANTITY <=", value, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("BEFORE_UNIT_QUANTITY in", values, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("BEFORE_UNIT_QUANTITY not in", values, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORE_UNIT_QUANTITY between", value1, value2, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORE_UNIT_QUANTITY not between", value1, value2, "beforeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityIsNull() {
            addCriterion("TRADE_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityIsNotNull() {
            addCriterion("TRADE_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY =", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY <>", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY >", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY >=", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityLessThan(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY <", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_QUANTITY <=", value, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("TRADE_UNIT_QUANTITY in", values, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_UNIT_QUANTITY not in", values, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_UNIT_QUANTITY between", value1, value2, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andTradeUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_UNIT_QUANTITY not between", value1, value2, "tradeUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityIsNull() {
            addCriterion("AFTER_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityIsNotNull() {
            addCriterion("AFTER_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY =", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY <>", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY >", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY >=", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityLessThan(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY <", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTER_UNIT_QUANTITY <=", value, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("AFTER_UNIT_QUANTITY in", values, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("AFTER_UNIT_QUANTITY not in", values, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTER_UNIT_QUANTITY between", value1, value2, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTER_UNIT_QUANTITY not between", value1, value2, "afterUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Long value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Long value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Long value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Long value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Long> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Long> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Long value1, Long value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("TRADE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("TRADE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Date value) {
            addCriterion("TRADE_TIME =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Date value) {
            addCriterion("TRADE_TIME <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Date value) {
            addCriterion("TRADE_TIME >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRADE_TIME >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Date value) {
            addCriterion("TRADE_TIME <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("TRADE_TIME <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Date> values) {
            addCriterion("TRADE_TIME in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Date> values) {
            addCriterion("TRADE_TIME not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Date value1, Date value2) {
            addCriterion("TRADE_TIME between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("TRADE_TIME not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIsNull() {
            addCriterion("EXTEND_INFO is null");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIsNotNull() {
            addCriterion("EXTEND_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andExtendInfoEqualTo(String value) {
            addCriterion("EXTEND_INFO =", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotEqualTo(String value) {
            addCriterion("EXTEND_INFO <>", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoGreaterThan(String value) {
            addCriterion("EXTEND_INFO >", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_INFO >=", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLessThan(String value) {
            addCriterion("EXTEND_INFO <", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_INFO <=", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLike(String value) {
            addCriterion("EXTEND_INFO like", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotLike(String value) {
            addCriterion("EXTEND_INFO not like", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIn(List<String> values) {
            addCriterion("EXTEND_INFO in", values, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotIn(List<String> values) {
            addCriterion("EXTEND_INFO not in", values, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoBetween(String value1, String value2) {
            addCriterion("EXTEND_INFO between", value1, value2, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotBetween(String value1, String value2) {
            addCriterion("EXTEND_INFO not between", value1, value2, "extendInfo");
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

        public Criteria andAllotOrTransferLikeInsensitive(String value) {
            addCriterion("upper(ALLOT_OR_TRANSFER) like", value.toUpperCase(), "allotOrTransfer");
            return (Criteria) this;
        }

        public Criteria andInOrOutLikeInsensitive(String value) {
            addCriterion("upper(IN_OR_OUT) like", value.toUpperCase(), "inOrOut");
            return (Criteria) this;
        }

        public Criteria andFreezeOrUnfreezeLikeInsensitive(String value) {
            addCriterion("upper(FREEZE_OR_UNFREEZE) like", value.toUpperCase(), "freezeOrUnfreeze");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_INFO) like", value.toUpperCase(), "extendInfo");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_flow_record
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_flow_record
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