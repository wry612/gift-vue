package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvertObjOrderExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public ConvertObjOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
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
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj_order
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

        public Criteria andConvertObjOrderIdIsNull() {
            addCriterion("CONVERT_OBJ_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdIsNotNull() {
            addCriterion("CONVERT_OBJ_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID =", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdNotEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID <>", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdGreaterThan(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID >", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID >=", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdLessThan(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID <", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ORDER_ID <=", value, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_ORDER_ID in", values, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdNotIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_ORDER_ID not in", values, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_ORDER_ID between", value1, value2, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andConvertObjOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_ORDER_ID not between", value1, value2, "convertObjOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdIsNull() {
            addCriterion("ORDER_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdIsNotNull() {
            addCriterion("ORDER_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID =", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID <>", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdGreaterThan(String value) {
            addCriterion("ORDER_GROUP_ID >", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID >=", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLessThan(String value) {
            addCriterion("ORDER_GROUP_ID <", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID <=", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLike(String value) {
            addCriterion("ORDER_GROUP_ID like", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotLike(String value) {
            addCriterion("ORDER_GROUP_ID not like", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdIn(List<String> values) {
            addCriterion("ORDER_GROUP_ID in", values, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotIn(List<String> values) {
            addCriterion("ORDER_GROUP_ID not in", values, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdBetween(String value1, String value2) {
            addCriterion("ORDER_GROUP_ID between", value1, value2, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_GROUP_ID not between", value1, value2, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andSignSeqIsNull() {
            addCriterion("SIGN_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSignSeqIsNotNull() {
            addCriterion("SIGN_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSignSeqEqualTo(Integer value) {
            addCriterion("SIGN_SEQ =", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqNotEqualTo(Integer value) {
            addCriterion("SIGN_SEQ <>", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqGreaterThan(Integer value) {
            addCriterion("SIGN_SEQ >", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_SEQ >=", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqLessThan(Integer value) {
            addCriterion("SIGN_SEQ <", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_SEQ <=", value, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqIn(List<Integer> values) {
            addCriterion("SIGN_SEQ in", values, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqNotIn(List<Integer> values) {
            addCriterion("SIGN_SEQ not in", values, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_SEQ between", value1, value2, "signSeq");
            return (Criteria) this;
        }

        public Criteria andSignSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_SEQ not between", value1, value2, "signSeq");
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

        public Criteria andConvertObjIdIsNull() {
            addCriterion("CONVERT_OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdIsNotNull() {
            addCriterion("CONVERT_OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ID =", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdNotEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ID <>", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdGreaterThan(Long value) {
            addCriterion("CONVERT_OBJ_ID >", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ID >=", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdLessThan(Long value) {
            addCriterion("CONVERT_OBJ_ID <", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdLessThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_ID <=", value, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_ID in", values, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdNotIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_ID not in", values, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_ID between", value1, value2, "convertObjId");
            return (Criteria) this;
        }

        public Criteria andConvertObjIdNotBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_ID not between", value1, value2, "convertObjId");
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

        public Criteria andConvertObjQuantityIsNull() {
            addCriterion("CONVERT_OBJ_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityIsNotNull() {
            addCriterion("CONVERT_OBJ_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityEqualTo(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY =", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityNotEqualTo(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY <>", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityGreaterThan(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY >", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY >=", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityLessThan(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY <", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("CONVERT_OBJ_QUANTITY <=", value, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityIn(List<Integer> values) {
            addCriterion("CONVERT_OBJ_QUANTITY in", values, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityNotIn(List<Integer> values) {
            addCriterion("CONVERT_OBJ_QUANTITY not in", values, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityBetween(Integer value1, Integer value2) {
            addCriterion("CONVERT_OBJ_QUANTITY between", value1, value2, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConvertObjQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("CONVERT_OBJ_QUANTITY not between", value1, value2, "convertObjQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityIsNull() {
            addCriterion("CONSUME_COMMODITY_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityIsNotNull() {
            addCriterion("CONSUME_COMMODITY_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityEqualTo(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY =", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityNotEqualTo(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY <>", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityGreaterThan(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY >", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY >=", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityLessThan(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY <", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUME_COMMODITY_QUANTITY <=", value, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityIn(List<Integer> values) {
            addCriterion("CONSUME_COMMODITY_QUANTITY in", values, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityNotIn(List<Integer> values) {
            addCriterion("CONSUME_COMMODITY_QUANTITY not in", values, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_COMMODITY_QUANTITY between", value1, value2, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andConsumeCommodityQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUME_COMMODITY_QUANTITY not between", value1, value2, "consumeCommodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceIsNull() {
            addCriterion("COMMODITY_TOTAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceIsNotNull() {
            addCriterion("COMMODITY_TOTAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceEqualTo(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE =", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceNotEqualTo(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE <>", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceGreaterThan(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE >", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE >=", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceLessThan(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE <", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TOTAL_PRICE <=", value, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceIn(List<Long> values) {
            addCriterion("COMMODITY_TOTAL_PRICE in", values, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceNotIn(List<Long> values) {
            addCriterion("COMMODITY_TOTAL_PRICE not in", values, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TOTAL_PRICE between", value1, value2, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TOTAL_PRICE not between", value1, value2, "commodityTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNull() {
            addCriterion("APPLY_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNotNull() {
            addCriterion("APPLY_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME =", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <>", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME >", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME >=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME <", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME not in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME not between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("DELIVERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("DELIVERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("DELIVERY_TIME =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("DELIVERY_TIME >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("DELIVERY_TIME <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("DELIVERY_TIME in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("DELIVERY_TIME not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("RULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("RULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("RULE_TYPE =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("RULE_TYPE <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("RULE_TYPE >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_TYPE >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("RULE_TYPE <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("RULE_TYPE <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("RULE_TYPE like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("RULE_TYPE not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("RULE_TYPE in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("RULE_TYPE not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("RULE_TYPE between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("RULE_TYPE not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNull() {
            addCriterion("ADDRESSEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNotNull() {
            addCriterion("ADDRESSEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME =", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME <>", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThan(String value) {
            addCriterion("ADDRESSEE_NAME >", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME >=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThan(String value) {
            addCriterion("ADDRESSEE_NAME <", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_NAME <=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLike(String value) {
            addCriterion("ADDRESSEE_NAME like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotLike(String value) {
            addCriterion("ADDRESSEE_NAME not like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIn(List<String> values) {
            addCriterion("ADDRESSEE_NAME in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotIn(List<String> values) {
            addCriterion("ADDRESSEE_NAME not in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_NAME between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_NAME not between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIsNull() {
            addCriterion("ADDRESSEE_MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIsNotNull() {
            addCriterion("ADDRESSEE_MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE =", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <>", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneGreaterThan(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE >", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE >=", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLessThan(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE <=", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLike(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE like", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotLike(String value) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not like", value, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneIn(List<String> values) {
            addCriterion("ADDRESSEE_MOBILE_PHONE in", values, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotIn(List<String> values) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not in", values, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_MOBILE_PHONE between", value1, value2, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("ADDRESSEE_MOBILE_PHONE not between", value1, value2, "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNotNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME =", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <>", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNotNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME =", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <>", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNotNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME =", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <>", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNull() {
            addCriterion("ADDRESS_DETAIL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNotNull() {
            addCriterion("ADDRESS_DETAIL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO =", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <>", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO not like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO not in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO not between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNull() {
            addCriterion("ADDRESS_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNotNull() {
            addCriterion("ADDRESS_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE =", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <>", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE not like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE not in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE not between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andDateExpectIsNull() {
            addCriterion("DATE_EXPECT is null");
            return (Criteria) this;
        }

        public Criteria andDateExpectIsNotNull() {
            addCriterion("DATE_EXPECT is not null");
            return (Criteria) this;
        }

        public Criteria andDateExpectEqualTo(Date value) {
            addCriterion("DATE_EXPECT =", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotEqualTo(Date value) {
            addCriterion("DATE_EXPECT <>", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectGreaterThan(Date value) {
            addCriterion("DATE_EXPECT >", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_EXPECT >=", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectLessThan(Date value) {
            addCriterion("DATE_EXPECT <", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectLessThanOrEqualTo(Date value) {
            addCriterion("DATE_EXPECT <=", value, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectIn(List<Date> values) {
            addCriterion("DATE_EXPECT in", values, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotIn(List<Date> values) {
            addCriterion("DATE_EXPECT not in", values, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectBetween(Date value1, Date value2) {
            addCriterion("DATE_EXPECT between", value1, value2, "dateExpect");
            return (Criteria) this;
        }

        public Criteria andDateExpectNotBetween(Date value1, Date value2) {
            addCriterion("DATE_EXPECT not between", value1, value2, "dateExpect");
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

        public Criteria andLogisticsOperatorIsNull() {
            addCriterion("LOGISTICS_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorIsNotNull() {
            addCriterion("LOGISTICS_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR =", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR <>", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorGreaterThan(String value) {
            addCriterion("LOGISTICS_OPERATOR >", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR >=", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLessThan(String value) {
            addCriterion("LOGISTICS_OPERATOR <", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_OPERATOR <=", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLike(String value) {
            addCriterion("LOGISTICS_OPERATOR like", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotLike(String value) {
            addCriterion("LOGISTICS_OPERATOR not like", value, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorIn(List<String> values) {
            addCriterion("LOGISTICS_OPERATOR in", values, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotIn(List<String> values) {
            addCriterion("LOGISTICS_OPERATOR not in", values, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorBetween(String value1, String value2) {
            addCriterion("LOGISTICS_OPERATOR between", value1, value2, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_OPERATOR not between", value1, value2, "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIsNull() {
            addCriterion("LOGISTICS_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIsNotNull() {
            addCriterion("LOGISTICS_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID =", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID <>", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdGreaterThan(String value) {
            addCriterion("LOGISTICS_ORDER_ID >", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID >=", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLessThan(String value) {
            addCriterion("LOGISTICS_ORDER_ID <", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_ORDER_ID <=", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLike(String value) {
            addCriterion("LOGISTICS_ORDER_ID like", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotLike(String value) {
            addCriterion("LOGISTICS_ORDER_ID not like", value, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdIn(List<String> values) {
            addCriterion("LOGISTICS_ORDER_ID in", values, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotIn(List<String> values) {
            addCriterion("LOGISTICS_ORDER_ID not in", values, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdBetween(String value1, String value2) {
            addCriterion("LOGISTICS_ORDER_ID between", value1, value2, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_ORDER_ID not between", value1, value2, "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNull() {
            addCriterion("EXPRESS_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNotNull() {
            addCriterion("EXPRESS_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID =", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID <>", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThan(Long value) {
            addCriterion("EXPRESS_INFO_ID >", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID >=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThan(Long value) {
            addCriterion("EXPRESS_INFO_ID <", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_INFO_ID <=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIn(List<Long> values) {
            addCriterion("EXPRESS_INFO_ID in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotIn(List<Long> values) {
            addCriterion("EXPRESS_INFO_ID not in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_INFO_ID between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_INFO_ID not between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andWinIsNull() {
            addCriterion("WIN is null");
            return (Criteria) this;
        }

        public Criteria andWinIsNotNull() {
            addCriterion("WIN is not null");
            return (Criteria) this;
        }

        public Criteria andWinEqualTo(String value) {
            addCriterion("WIN =", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotEqualTo(String value) {
            addCriterion("WIN <>", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThan(String value) {
            addCriterion("WIN >", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinGreaterThanOrEqualTo(String value) {
            addCriterion("WIN >=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThan(String value) {
            addCriterion("WIN <", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLessThanOrEqualTo(String value) {
            addCriterion("WIN <=", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinLike(String value) {
            addCriterion("WIN like", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotLike(String value) {
            addCriterion("WIN not like", value, "win");
            return (Criteria) this;
        }

        public Criteria andWinIn(List<String> values) {
            addCriterion("WIN in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotIn(List<String> values) {
            addCriterion("WIN not in", values, "win");
            return (Criteria) this;
        }

        public Criteria andWinBetween(String value1, String value2) {
            addCriterion("WIN between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andWinNotBetween(String value1, String value2) {
            addCriterion("WIN not between", value1, value2, "win");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNull() {
            addCriterion("WIN_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNotNull() {
            addCriterion("WIN_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andWinLevelEqualTo(String value) {
            addCriterion("WIN_LEVEL =", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotEqualTo(String value) {
            addCriterion("WIN_LEVEL <>", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThan(String value) {
            addCriterion("WIN_LEVEL >", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThanOrEqualTo(String value) {
            addCriterion("WIN_LEVEL >=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThan(String value) {
            addCriterion("WIN_LEVEL <", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThanOrEqualTo(String value) {
            addCriterion("WIN_LEVEL <=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLike(String value) {
            addCriterion("WIN_LEVEL like", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotLike(String value) {
            addCriterion("WIN_LEVEL not like", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelIn(List<String> values) {
            addCriterion("WIN_LEVEL in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotIn(List<String> values) {
            addCriterion("WIN_LEVEL not in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelBetween(String value1, String value2) {
            addCriterion("WIN_LEVEL between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotBetween(String value1, String value2) {
            addCriterion("WIN_LEVEL not between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsIsNull() {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS is null");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsIsNotNull() {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsEqualTo(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS =", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsNotEqualTo(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS <>", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsGreaterThan(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS >", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS >=", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsLessThan(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS <", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsLessThanOrEqualTo(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS <=", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsLike(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS like", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsNotLike(String value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS not like", value, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsIn(List<String> values) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS in", values, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsNotIn(List<String> values) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS not in", values, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsBetween(String value1, String value2) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS between", value1, value2, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsNotBetween(String value1, String value2) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_IDS not between", value1, value2, "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoIsNull() {
            addCriterion("SELLER_DELIVERY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoIsNotNull() {
            addCriterion("SELLER_DELIVERY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoEqualTo(String value) {
            addCriterion("SELLER_DELIVERY_INFO =", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoNotEqualTo(String value) {
            addCriterion("SELLER_DELIVERY_INFO <>", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoGreaterThan(String value) {
            addCriterion("SELLER_DELIVERY_INFO >", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_DELIVERY_INFO >=", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoLessThan(String value) {
            addCriterion("SELLER_DELIVERY_INFO <", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoLessThanOrEqualTo(String value) {
            addCriterion("SELLER_DELIVERY_INFO <=", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoLike(String value) {
            addCriterion("SELLER_DELIVERY_INFO like", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoNotLike(String value) {
            addCriterion("SELLER_DELIVERY_INFO not like", value, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoIn(List<String> values) {
            addCriterion("SELLER_DELIVERY_INFO in", values, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoNotIn(List<String> values) {
            addCriterion("SELLER_DELIVERY_INFO not in", values, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoBetween(String value1, String value2) {
            addCriterion("SELLER_DELIVERY_INFO between", value1, value2, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoNotBetween(String value1, String value2) {
            addCriterion("SELLER_DELIVERY_INFO not between", value1, value2, "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIsNull() {
            addCriterion("MULTI_OBJ_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIsNotNull() {
            addCriterion("MULTI_OBJ_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailEqualTo(String value) {
            addCriterion("MULTI_OBJ_DETAIL =", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotEqualTo(String value) {
            addCriterion("MULTI_OBJ_DETAIL <>", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailGreaterThan(String value) {
            addCriterion("MULTI_OBJ_DETAIL >", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailGreaterThanOrEqualTo(String value) {
            addCriterion("MULTI_OBJ_DETAIL >=", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLessThan(String value) {
            addCriterion("MULTI_OBJ_DETAIL <", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLessThanOrEqualTo(String value) {
            addCriterion("MULTI_OBJ_DETAIL <=", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLike(String value) {
            addCriterion("MULTI_OBJ_DETAIL like", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotLike(String value) {
            addCriterion("MULTI_OBJ_DETAIL not like", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIn(List<String> values) {
            addCriterion("MULTI_OBJ_DETAIL in", values, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotIn(List<String> values) {
            addCriterion("MULTI_OBJ_DETAIL not in", values, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailBetween(String value1, String value2) {
            addCriterion("MULTI_OBJ_DETAIL between", value1, value2, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotBetween(String value1, String value2) {
            addCriterion("MULTI_OBJ_DETAIL not between", value1, value2, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_GROUP_ID) like", value.toUpperCase(), "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLikeInsensitive(String value) {
            addCriterion("upper(RULE_TYPE) like", value.toUpperCase(), "ruleType");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESSEE_NAME) like", value.toUpperCase(), "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeMobilePhoneLikeInsensitive(String value) {
            addCriterion("upper(ADDRESSEE_MOBILE_PHONE) like", value.toUpperCase(), "addresseeMobilePhone");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLikeInsensitive(String value) {
            addCriterion("upper(PROVICE_FIRST_STAGE_NAME) like", value.toUpperCase(), "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_CITY_SECOND_STAGE_NAME) like", value.toUpperCase(), "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_COUNTIES_THIRD_STAGE_NAME) like", value.toUpperCase(), "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_DETAIL_INFO) like", value.toUpperCase(), "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_POSTAL_CODE) like", value.toUpperCase(), "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andLogisticsOperatorLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_OPERATOR) like", value.toUpperCase(), "logisticsOperator");
            return (Criteria) this;
        }

        public Criteria andLogisticsOrderIdLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_ORDER_ID) like", value.toUpperCase(), "logisticsOrderId");
            return (Criteria) this;
        }

        public Criteria andWinLikeInsensitive(String value) {
            addCriterion("upper(WIN) like", value.toUpperCase(), "win");
            return (Criteria) this;
        }

        public Criteria andWinLevelLikeInsensitive(String value) {
            addCriterion("upper(WIN_LEVEL) like", value.toUpperCase(), "winLevel");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(CONVERT_OBJ_FLOW_RECORD_IDS) like", value.toUpperCase(), "convertObjFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andSellerDeliveryInfoLikeInsensitive(String value) {
            addCriterion("upper(SELLER_DELIVERY_INFO) like", value.toUpperCase(), "sellerDeliveryInfo");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLikeInsensitive(String value) {
            addCriterion("upper(MULTI_OBJ_DETAIL) like", value.toUpperCase(), "multiObjDetail");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table convert_obj_order
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj_order
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