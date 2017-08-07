package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvertObjFlowRecordExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public ConvertObjFlowRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
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
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj_flow_record
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

        public Criteria andConvertObjFlowRecordIdIsNull() {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdIsNotNull() {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID =", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdNotEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID <>", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdGreaterThan(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID >", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID >=", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdLessThan(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID <", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID <=", value, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID in", values, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdNotIn(List<Long> values) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID not in", values, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID between", value1, value2, "convertObjFlowRecordId");
            return (Criteria) this;
        }

        public Criteria andConvertObjFlowRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("CONVERT_OBJ_FLOW_RECORD_ID not between", value1, value2, "convertObjFlowRecordId");
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

        public Criteria andOpSeqIsNull() {
            addCriterion("OP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOpSeqIsNotNull() {
            addCriterion("OP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOpSeqEqualTo(Long value) {
            addCriterion("OP_SEQ =", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotEqualTo(Long value) {
            addCriterion("OP_SEQ <>", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqGreaterThan(Long value) {
            addCriterion("OP_SEQ >", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("OP_SEQ >=", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqLessThan(Long value) {
            addCriterion("OP_SEQ <", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqLessThanOrEqualTo(Long value) {
            addCriterion("OP_SEQ <=", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqIn(List<Long> values) {
            addCriterion("OP_SEQ in", values, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotIn(List<Long> values) {
            addCriterion("OP_SEQ not in", values, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqBetween(Long value1, Long value2) {
            addCriterion("OP_SEQ between", value1, value2, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotBetween(Long value1, Long value2) {
            addCriterion("OP_SEQ not between", value1, value2, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpDirectionIsNull() {
            addCriterion("OP_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andOpDirectionIsNotNull() {
            addCriterion("OP_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andOpDirectionEqualTo(String value) {
            addCriterion("OP_DIRECTION =", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionNotEqualTo(String value) {
            addCriterion("OP_DIRECTION <>", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionGreaterThan(String value) {
            addCriterion("OP_DIRECTION >", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("OP_DIRECTION >=", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionLessThan(String value) {
            addCriterion("OP_DIRECTION <", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionLessThanOrEqualTo(String value) {
            addCriterion("OP_DIRECTION <=", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionLike(String value) {
            addCriterion("OP_DIRECTION like", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionNotLike(String value) {
            addCriterion("OP_DIRECTION not like", value, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionIn(List<String> values) {
            addCriterion("OP_DIRECTION in", values, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionNotIn(List<String> values) {
            addCriterion("OP_DIRECTION not in", values, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionBetween(String value1, String value2) {
            addCriterion("OP_DIRECTION between", value1, value2, "opDirection");
            return (Criteria) this;
        }

        public Criteria andOpDirectionNotBetween(String value1, String value2) {
            addCriterion("OP_DIRECTION not between", value1, value2, "opDirection");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityIsNull() {
            addCriterion("BEFORE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityIsNotNull() {
            addCriterion("BEFORE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityEqualTo(Integer value) {
            addCriterion("BEFORE_QUANTITY =", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityNotEqualTo(Integer value) {
            addCriterion("BEFORE_QUANTITY <>", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityGreaterThan(Integer value) {
            addCriterion("BEFORE_QUANTITY >", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("BEFORE_QUANTITY >=", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityLessThan(Integer value) {
            addCriterion("BEFORE_QUANTITY <", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("BEFORE_QUANTITY <=", value, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityIn(List<Integer> values) {
            addCriterion("BEFORE_QUANTITY in", values, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityNotIn(List<Integer> values) {
            addCriterion("BEFORE_QUANTITY not in", values, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityBetween(Integer value1, Integer value2) {
            addCriterion("BEFORE_QUANTITY between", value1, value2, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andBeforeQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("BEFORE_QUANTITY not between", value1, value2, "beforeQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityIsNull() {
            addCriterion("OP_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andOpQuantityIsNotNull() {
            addCriterion("OP_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOpQuantityEqualTo(Integer value) {
            addCriterion("OP_QUANTITY =", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityNotEqualTo(Integer value) {
            addCriterion("OP_QUANTITY <>", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityGreaterThan(Integer value) {
            addCriterion("OP_QUANTITY >", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("OP_QUANTITY >=", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityLessThan(Integer value) {
            addCriterion("OP_QUANTITY <", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("OP_QUANTITY <=", value, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityIn(List<Integer> values) {
            addCriterion("OP_QUANTITY in", values, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityNotIn(List<Integer> values) {
            addCriterion("OP_QUANTITY not in", values, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityBetween(Integer value1, Integer value2) {
            addCriterion("OP_QUANTITY between", value1, value2, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andOpQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("OP_QUANTITY not between", value1, value2, "opQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityIsNull() {
            addCriterion("AFTER_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityIsNotNull() {
            addCriterion("AFTER_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityEqualTo(Integer value) {
            addCriterion("AFTER_QUANTITY =", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityNotEqualTo(Integer value) {
            addCriterion("AFTER_QUANTITY <>", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityGreaterThan(Integer value) {
            addCriterion("AFTER_QUANTITY >", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("AFTER_QUANTITY >=", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityLessThan(Integer value) {
            addCriterion("AFTER_QUANTITY <", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("AFTER_QUANTITY <=", value, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityIn(List<Integer> values) {
            addCriterion("AFTER_QUANTITY in", values, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityNotIn(List<Integer> values) {
            addCriterion("AFTER_QUANTITY not in", values, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityBetween(Integer value1, Integer value2) {
            addCriterion("AFTER_QUANTITY between", value1, value2, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andAfterQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("AFTER_QUANTITY not between", value1, value2, "afterQuantity");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("OP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("OP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterion("OP_TIME =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterion("OP_TIME <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterion("OP_TIME >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OP_TIME >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterion("OP_TIME <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("OP_TIME <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterion("OP_TIME in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterion("OP_TIME not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterion("OP_TIME between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("OP_TIME not between", value1, value2, "opTime");
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

        public Criteria andOpDirectionLikeInsensitive(String value) {
            addCriterion("upper(OP_DIRECTION) like", value.toUpperCase(), "opDirection");
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
     * This class corresponds to the database table convert_obj_flow_record
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj_flow_record
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