package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class PayRefundOrderWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public PayRefundOrderWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
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
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_REFUND_ORDER_WX
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

        public Criteria andPayRefundOrderWxIdIsNull() {
            addCriterion("PAY_REFUND_ORDER_WX_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdIsNotNull() {
            addCriterion("PAY_REFUND_ORDER_WX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdEqualTo(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID =", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdNotEqualTo(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID <>", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdGreaterThan(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID >", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID >=", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdLessThan(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID <", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID <=", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdLike(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID like", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdNotLike(String value) {
            addCriterion("PAY_REFUND_ORDER_WX_ID not like", value, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdIn(List<String> values) {
            addCriterion("PAY_REFUND_ORDER_WX_ID in", values, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdNotIn(List<String> values) {
            addCriterion("PAY_REFUND_ORDER_WX_ID not in", values, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_ORDER_WX_ID between", value1, value2, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdNotBetween(String value1, String value2) {
            addCriterion("PAY_REFUND_ORDER_WX_ID not between", value1, value2, "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("TRANSACTION_ID =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("TRANSACTION_ID <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("TRANSACTION_ID >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("TRANSACTION_ID <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_ID <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("TRANSACTION_ID like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("TRANSACTION_ID not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("TRANSACTION_ID in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("TRANSACTION_ID not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Integer value) {
            addCriterion("TOTAL_FEE =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Integer value) {
            addCriterion("TOTAL_FEE <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Integer value) {
            addCriterion("TOTAL_FEE >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_FEE >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Integer value) {
            addCriterion("TOTAL_FEE <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_FEE <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Integer> values) {
            addCriterion("TOTAL_FEE in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Integer> values) {
            addCriterion("TOTAL_FEE not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_FEE between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_FEE not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(Integer value) {
            addCriterion("REFUND_FEE =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(Integer value) {
            addCriterion("REFUND_FEE <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(Integer value) {
            addCriterion("REFUND_FEE >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFUND_FEE >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(Integer value) {
            addCriterion("REFUND_FEE <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(Integer value) {
            addCriterion("REFUND_FEE <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<Integer> values) {
            addCriterion("REFUND_FEE in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<Integer> values) {
            addCriterion("REFUND_FEE not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_FEE between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("REFUND_FEE not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIsNull() {
            addCriterion("REFUND_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIsNotNull() {
            addCriterion("REFUND_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE =", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE <>", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeGreaterThan(String value) {
            addCriterion("REFUND_FEE_TYPE >", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE >=", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLessThan(String value) {
            addCriterion("REFUND_FEE_TYPE <", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("REFUND_FEE_TYPE <=", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLike(String value) {
            addCriterion("REFUND_FEE_TYPE like", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotLike(String value) {
            addCriterion("REFUND_FEE_TYPE not like", value, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeIn(List<String> values) {
            addCriterion("REFUND_FEE_TYPE in", values, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotIn(List<String> values) {
            addCriterion("REFUND_FEE_TYPE not in", values, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeBetween(String value1, String value2) {
            addCriterion("REFUND_FEE_TYPE between", value1, value2, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeNotBetween(String value1, String value2) {
            addCriterion("REFUND_FEE_TYPE not between", value1, value2, "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNull() {
            addCriterion("OP_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIsNotNull() {
            addCriterion("OP_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserIdEqualTo(String value) {
            addCriterion("OP_USER_ID =", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotEqualTo(String value) {
            addCriterion("OP_USER_ID <>", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThan(String value) {
            addCriterion("OP_USER_ID >", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("OP_USER_ID >=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThan(String value) {
            addCriterion("OP_USER_ID <", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLessThanOrEqualTo(String value) {
            addCriterion("OP_USER_ID <=", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLike(String value) {
            addCriterion("OP_USER_ID like", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotLike(String value) {
            addCriterion("OP_USER_ID not like", value, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdIn(List<String> values) {
            addCriterion("OP_USER_ID in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotIn(List<String> values) {
            addCriterion("OP_USER_ID not in", values, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdBetween(String value1, String value2) {
            addCriterion("OP_USER_ID between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andOpUserIdNotBetween(String value1, String value2) {
            addCriterion("OP_USER_ID not between", value1, value2, "opUserId");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNull() {
            addCriterion("REFUND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNotNull() {
            addCriterion("REFUND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountEqualTo(String value) {
            addCriterion("REFUND_ACCOUNT =", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotEqualTo(String value) {
            addCriterion("REFUND_ACCOUNT <>", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThan(String value) {
            addCriterion("REFUND_ACCOUNT >", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_ACCOUNT >=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThan(String value) {
            addCriterion("REFUND_ACCOUNT <", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThanOrEqualTo(String value) {
            addCriterion("REFUND_ACCOUNT <=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLike(String value) {
            addCriterion("REFUND_ACCOUNT like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotLike(String value) {
            addCriterion("REFUND_ACCOUNT not like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIn(List<String> values) {
            addCriterion("REFUND_ACCOUNT in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotIn(List<String> values) {
            addCriterion("REFUND_ACCOUNT not in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountBetween(String value1, String value2) {
            addCriterion("REFUND_ACCOUNT between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotBetween(String value1, String value2) {
            addCriterion("REFUND_ACCOUNT not between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("RETURN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("RETURN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("RETURN_CODE =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("RETURN_CODE <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("RETURN_CODE >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("RETURN_CODE <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("RETURN_CODE like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("RETURN_CODE not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("RETURN_CODE in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("RETURN_CODE not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("RETURN_CODE between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("RETURN_CODE not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNull() {
            addCriterion("RETURN_MSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNotNull() {
            addCriterion("RETURN_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgEqualTo(String value) {
            addCriterion("RETURN_MSG =", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotEqualTo(String value) {
            addCriterion("RETURN_MSG <>", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThan(String value) {
            addCriterion("RETURN_MSG >", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG >=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThan(String value) {
            addCriterion("RETURN_MSG <", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG <=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLike(String value) {
            addCriterion("RETURN_MSG like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotLike(String value) {
            addCriterion("RETURN_MSG not like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIn(List<String> values) {
            addCriterion("RETURN_MSG in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotIn(List<String> values) {
            addCriterion("RETURN_MSG not in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgBetween(String value1, String value2) {
            addCriterion("RETURN_MSG between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotBetween(String value1, String value2) {
            addCriterion("RETURN_MSG not between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_REFUND_ORDER_WX_ID) like", value.toUpperCase(), "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLikeInsensitive(String value) {
            addCriterion("upper(TRANSACTION_ID) like", value.toUpperCase(), "transactionId");
            return (Criteria) this;
        }

        public Criteria andRefundFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(REFUND_FEE_TYPE) like", value.toUpperCase(), "refundFeeType");
            return (Criteria) this;
        }

        public Criteria andOpUserIdLikeInsensitive(String value) {
            addCriterion("upper(OP_USER_ID) like", value.toUpperCase(), "opUserId");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLikeInsensitive(String value) {
            addCriterion("upper(REFUND_ACCOUNT) like", value.toUpperCase(), "refundAccount");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLikeInsensitive(String value) {
            addCriterion("upper(RETURN_CODE) like", value.toUpperCase(), "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLikeInsensitive(String value) {
            addCriterion("upper(RETURN_MSG) like", value.toUpperCase(), "returnMsg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PAY_REFUND_ORDER_WX
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_REFUND_ORDER_WX
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