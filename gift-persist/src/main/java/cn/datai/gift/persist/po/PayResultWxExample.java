package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class PayResultWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public PayResultWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
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
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_RESULT_WX
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

        public Criteria andPayOrderWxIdIsNull() {
            addCriterion("PAY_ORDER_WX_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdIsNotNull() {
            addCriterion("PAY_ORDER_WX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdEqualTo(Integer value) {
            addCriterion("PAY_ORDER_WX_ID =", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotEqualTo(Integer value) {
            addCriterion("PAY_ORDER_WX_ID <>", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdGreaterThan(Integer value) {
            addCriterion("PAY_ORDER_WX_ID >", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_ORDER_WX_ID >=", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLessThan(Integer value) {
            addCriterion("PAY_ORDER_WX_ID <", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_ORDER_WX_ID <=", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdIn(List<Integer> values) {
            addCriterion("PAY_ORDER_WX_ID in", values, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotIn(List<Integer> values) {
            addCriterion("PAY_ORDER_WX_ID not in", values, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdBetween(Integer value1, Integer value2) {
            addCriterion("PAY_ORDER_WX_ID between", value1, value2, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_ORDER_WX_ID not between", value1, value2, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("MCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("MCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(String value) {
            addCriterion("MCH_ID =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(String value) {
            addCriterion("MCH_ID <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(String value) {
            addCriterion("MCH_ID >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCH_ID >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(String value) {
            addCriterion("MCH_ID <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(String value) {
            addCriterion("MCH_ID <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLike(String value) {
            addCriterion("MCH_ID like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotLike(String value) {
            addCriterion("MCH_ID not like", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<String> values) {
            addCriterion("MCH_ID in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<String> values) {
            addCriterion("MCH_ID not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(String value1, String value2) {
            addCriterion("MCH_ID between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(String value1, String value2) {
            addCriterion("MCH_ID not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIsNull() {
            addCriterion("DEVICE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIsNotNull() {
            addCriterion("DEVICE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoEqualTo(String value) {
            addCriterion("DEVICE_INFO =", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotEqualTo(String value) {
            addCriterion("DEVICE_INFO <>", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoGreaterThan(String value) {
            addCriterion("DEVICE_INFO >", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_INFO >=", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLessThan(String value) {
            addCriterion("DEVICE_INFO <", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_INFO <=", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLike(String value) {
            addCriterion("DEVICE_INFO like", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotLike(String value) {
            addCriterion("DEVICE_INFO not like", value, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoIn(List<String> values) {
            addCriterion("DEVICE_INFO in", values, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotIn(List<String> values) {
            addCriterion("DEVICE_INFO not in", values, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoBetween(String value1, String value2) {
            addCriterion("DEVICE_INFO between", value1, value2, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoNotBetween(String value1, String value2) {
            addCriterion("DEVICE_INFO not between", value1, value2, "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andNonceStrIsNull() {
            addCriterion("NONCE_STR is null");
            return (Criteria) this;
        }

        public Criteria andNonceStrIsNotNull() {
            addCriterion("NONCE_STR is not null");
            return (Criteria) this;
        }

        public Criteria andNonceStrEqualTo(String value) {
            addCriterion("NONCE_STR =", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotEqualTo(String value) {
            addCriterion("NONCE_STR <>", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrGreaterThan(String value) {
            addCriterion("NONCE_STR >", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrGreaterThanOrEqualTo(String value) {
            addCriterion("NONCE_STR >=", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLessThan(String value) {
            addCriterion("NONCE_STR <", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLessThanOrEqualTo(String value) {
            addCriterion("NONCE_STR <=", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrLike(String value) {
            addCriterion("NONCE_STR like", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotLike(String value) {
            addCriterion("NONCE_STR not like", value, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrIn(List<String> values) {
            addCriterion("NONCE_STR in", values, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotIn(List<String> values) {
            addCriterion("NONCE_STR not in", values, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrBetween(String value1, String value2) {
            addCriterion("NONCE_STR between", value1, value2, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andNonceStrNotBetween(String value1, String value2) {
            addCriterion("NONCE_STR not between", value1, value2, "nonceStr");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("SIGN =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("SIGN <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("SIGN >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("SIGN <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("SIGN <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("SIGN like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("SIGN not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("SIGN in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("SIGN not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("SIGN between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("SIGN not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(String value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(String value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(String value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(String value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLike(String value) {
            addCriterion("SIGN_TYPE like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotLike(String value) {
            addCriterion("SIGN_TYPE not like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<String> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<String> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNull() {
            addCriterion("RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNotNull() {
            addCriterion("RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultCodeEqualTo(String value) {
            addCriterion("RESULT_CODE =", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotEqualTo(String value) {
            addCriterion("RESULT_CODE <>", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThan(String value) {
            addCriterion("RESULT_CODE >", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE >=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThan(String value) {
            addCriterion("RESULT_CODE <", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE <=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLike(String value) {
            addCriterion("RESULT_CODE like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotLike(String value) {
            addCriterion("RESULT_CODE not like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeIn(List<String> values) {
            addCriterion("RESULT_CODE in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotIn(List<String> values) {
            addCriterion("RESULT_CODE not in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeBetween(String value1, String value2) {
            addCriterion("RESULT_CODE between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotBetween(String value1, String value2) {
            addCriterion("RESULT_CODE not between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNull() {
            addCriterion("ERR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeIsNotNull() {
            addCriterion("ERR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeEqualTo(String value) {
            addCriterion("ERR_CODE =", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotEqualTo(String value) {
            addCriterion("ERR_CODE <>", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThan(String value) {
            addCriterion("ERR_CODE >", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_CODE >=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThan(String value) {
            addCriterion("ERR_CODE <", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLessThanOrEqualTo(String value) {
            addCriterion("ERR_CODE <=", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLike(String value) {
            addCriterion("ERR_CODE like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotLike(String value) {
            addCriterion("ERR_CODE not like", value, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeIn(List<String> values) {
            addCriterion("ERR_CODE in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotIn(List<String> values) {
            addCriterion("ERR_CODE not in", values, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeBetween(String value1, String value2) {
            addCriterion("ERR_CODE between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeNotBetween(String value1, String value2) {
            addCriterion("ERR_CODE not between", value1, value2, "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIsNull() {
            addCriterion("ERR_CODE_DES is null");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIsNotNull() {
            addCriterion("ERR_CODE_DES is not null");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesEqualTo(String value) {
            addCriterion("ERR_CODE_DES =", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotEqualTo(String value) {
            addCriterion("ERR_CODE_DES <>", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesGreaterThan(String value) {
            addCriterion("ERR_CODE_DES >", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_CODE_DES >=", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLessThan(String value) {
            addCriterion("ERR_CODE_DES <", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLessThanOrEqualTo(String value) {
            addCriterion("ERR_CODE_DES <=", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLike(String value) {
            addCriterion("ERR_CODE_DES like", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotLike(String value) {
            addCriterion("ERR_CODE_DES not like", value, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesIn(List<String> values) {
            addCriterion("ERR_CODE_DES in", values, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotIn(List<String> values) {
            addCriterion("ERR_CODE_DES not in", values, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesBetween(String value1, String value2) {
            addCriterion("ERR_CODE_DES between", value1, value2, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesNotBetween(String value1, String value2) {
            addCriterion("ERR_CODE_DES not between", value1, value2, "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeIsNull() {
            addCriterion("IS_SUBSCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeIsNotNull() {
            addCriterion("IS_SUBSCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeEqualTo(String value) {
            addCriterion("IS_SUBSCRIBE =", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotEqualTo(String value) {
            addCriterion("IS_SUBSCRIBE <>", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeGreaterThan(String value) {
            addCriterion("IS_SUBSCRIBE >", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SUBSCRIBE >=", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLessThan(String value) {
            addCriterion("IS_SUBSCRIBE <", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLessThanOrEqualTo(String value) {
            addCriterion("IS_SUBSCRIBE <=", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLike(String value) {
            addCriterion("IS_SUBSCRIBE like", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotLike(String value) {
            addCriterion("IS_SUBSCRIBE not like", value, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeIn(List<String> values) {
            addCriterion("IS_SUBSCRIBE in", values, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotIn(List<String> values) {
            addCriterion("IS_SUBSCRIBE not in", values, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeBetween(String value1, String value2) {
            addCriterion("IS_SUBSCRIBE between", value1, value2, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeNotBetween(String value1, String value2) {
            addCriterion("IS_SUBSCRIBE not between", value1, value2, "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("BANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("BANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("BANK_TYPE =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("BANK_TYPE <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("BANK_TYPE >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("BANK_TYPE <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_TYPE <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("BANK_TYPE like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("BANK_TYPE not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("BANK_TYPE in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("BANK_TYPE not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("BANK_TYPE between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("BANK_TYPE not between", value1, value2, "bankType");
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

        public Criteria andSettlementTotalFeeIsNull() {
            addCriterion("SETTLEMENT_TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeIsNotNull() {
            addCriterion("SETTLEMENT_TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeEqualTo(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE =", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotEqualTo(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <>", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeGreaterThan(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE >", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE >=", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeLessThan(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeLessThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_TOTAL_FEE <=", value, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeIn(List<Integer> values) {
            addCriterion("SETTLEMENT_TOTAL_FEE in", values, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotIn(List<Integer> values) {
            addCriterion("SETTLEMENT_TOTAL_FEE not in", values, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_TOTAL_FEE between", value1, value2, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andSettlementTotalFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_TOTAL_FEE not between", value1, value2, "settlementTotalFee");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("FEE_TYPE =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("FEE_TYPE <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("FEE_TYPE >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("FEE_TYPE <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("FEE_TYPE like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("FEE_TYPE not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("FEE_TYPE in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("FEE_TYPE not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("FEE_TYPE between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("FEE_TYPE not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNull() {
            addCriterion("CASH_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCashFeeIsNotNull() {
            addCriterion("CASH_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashFeeEqualTo(Integer value) {
            addCriterion("CASH_FEE =", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotEqualTo(Integer value) {
            addCriterion("CASH_FEE <>", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThan(Integer value) {
            addCriterion("CASH_FEE >", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASH_FEE >=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThan(Integer value) {
            addCriterion("CASH_FEE <", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeLessThanOrEqualTo(Integer value) {
            addCriterion("CASH_FEE <=", value, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeIn(List<Integer> values) {
            addCriterion("CASH_FEE in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotIn(List<Integer> values) {
            addCriterion("CASH_FEE not in", values, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeBetween(Integer value1, Integer value2) {
            addCriterion("CASH_FEE between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("CASH_FEE not between", value1, value2, "cashFee");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIsNull() {
            addCriterion("CASH_FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIsNotNull() {
            addCriterion("CASH_FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE =", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE <>", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeGreaterThan(String value) {
            addCriterion("CASH_FEE_TYPE >", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE >=", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLessThan(String value) {
            addCriterion("CASH_FEE_TYPE <", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("CASH_FEE_TYPE <=", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLike(String value) {
            addCriterion("CASH_FEE_TYPE like", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotLike(String value) {
            addCriterion("CASH_FEE_TYPE not like", value, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeIn(List<String> values) {
            addCriterion("CASH_FEE_TYPE in", values, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotIn(List<String> values) {
            addCriterion("CASH_FEE_TYPE not in", values, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeBetween(String value1, String value2) {
            addCriterion("CASH_FEE_TYPE between", value1, value2, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeNotBetween(String value1, String value2) {
            addCriterion("CASH_FEE_TYPE not between", value1, value2, "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNull() {
            addCriterion("COUPON_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNotNull() {
            addCriterion("COUPON_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeEqualTo(Integer value) {
            addCriterion("COUPON_FEE =", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotEqualTo(Integer value) {
            addCriterion("COUPON_FEE <>", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThan(Integer value) {
            addCriterion("COUPON_FEE >", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_FEE >=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThan(Integer value) {
            addCriterion("COUPON_FEE <", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_FEE <=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIn(List<Integer> values) {
            addCriterion("COUPON_FEE in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotIn(List<Integer> values) {
            addCriterion("COUPON_FEE not in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_FEE between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_FEE not between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNull() {
            addCriterion("COUPON_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCouponCountIsNotNull() {
            addCriterion("COUPON_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCountEqualTo(Integer value) {
            addCriterion("COUPON_COUNT =", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotEqualTo(Integer value) {
            addCriterion("COUPON_COUNT <>", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThan(Integer value) {
            addCriterion("COUPON_COUNT >", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_COUNT >=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThan(Integer value) {
            addCriterion("COUPON_COUNT <", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_COUNT <=", value, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountIn(List<Integer> values) {
            addCriterion("COUPON_COUNT in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotIn(List<Integer> values) {
            addCriterion("COUPON_COUNT not in", values, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_COUNT between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_COUNT not between", value1, value2, "couponCount");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("COUPON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("COUPON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(String value) {
            addCriterion("COUPON_TYPE =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(String value) {
            addCriterion("COUPON_TYPE <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(String value) {
            addCriterion("COUPON_TYPE >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_TYPE >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(String value) {
            addCriterion("COUPON_TYPE <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(String value) {
            addCriterion("COUPON_TYPE <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLike(String value) {
            addCriterion("COUPON_TYPE like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotLike(String value) {
            addCriterion("COUPON_TYPE not like", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<String> values) {
            addCriterion("COUPON_TYPE in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<String> values) {
            addCriterion("COUPON_TYPE not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(String value1, String value2) {
            addCriterion("COUPON_TYPE between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(String value1, String value2) {
            addCriterion("COUPON_TYPE not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("COUPON_ID =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("COUPON_ID <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("COUPON_ID >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_ID >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("COUPON_ID <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("COUPON_ID <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("COUPON_ID like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("COUPON_ID not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("COUPON_ID in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("COUPON_ID not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("COUPON_ID between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("COUPON_ID not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleIsNull() {
            addCriterion("COUPON_FEE_SINGLE is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleIsNotNull() {
            addCriterion("COUPON_FEE_SINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleEqualTo(Integer value) {
            addCriterion("COUPON_FEE_SINGLE =", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleNotEqualTo(Integer value) {
            addCriterion("COUPON_FEE_SINGLE <>", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleGreaterThan(Integer value) {
            addCriterion("COUPON_FEE_SINGLE >", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_FEE_SINGLE >=", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleLessThan(Integer value) {
            addCriterion("COUPON_FEE_SINGLE <", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_FEE_SINGLE <=", value, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleIn(List<Integer> values) {
            addCriterion("COUPON_FEE_SINGLE in", values, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleNotIn(List<Integer> values) {
            addCriterion("COUPON_FEE_SINGLE not in", values, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_FEE_SINGLE between", value1, value2, "couponFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponFeeSingleNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_FEE_SINGLE not between", value1, value2, "couponFeeSingle");
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

        public Criteria andTimeEndIsNull() {
            addCriterion("TIME_END is null");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNotNull() {
            addCriterion("TIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEndEqualTo(String value) {
            addCriterion("TIME_END =", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotEqualTo(String value) {
            addCriterion("TIME_END <>", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThan(String value) {
            addCriterion("TIME_END >", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_END >=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThan(String value) {
            addCriterion("TIME_END <", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThanOrEqualTo(String value) {
            addCriterion("TIME_END <=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLike(String value) {
            addCriterion("TIME_END like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotLike(String value) {
            addCriterion("TIME_END not like", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndIn(List<String> values) {
            addCriterion("TIME_END in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotIn(List<String> values) {
            addCriterion("TIME_END not in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndBetween(String value1, String value2) {
            addCriterion("TIME_END between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotBetween(String value1, String value2) {
            addCriterion("TIME_END not between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLikeInsensitive(String value) {
            addCriterion("upper(TRANSACTION_ID) like", value.toUpperCase(), "transactionId");
            return (Criteria) this;
        }

        public Criteria andAppidLikeInsensitive(String value) {
            addCriterion("upper(APPID) like", value.toUpperCase(), "appid");
            return (Criteria) this;
        }

        public Criteria andMchIdLikeInsensitive(String value) {
            addCriterion("upper(MCH_ID) like", value.toUpperCase(), "mchId");
            return (Criteria) this;
        }

        public Criteria andDeviceInfoLikeInsensitive(String value) {
            addCriterion("upper(DEVICE_INFO) like", value.toUpperCase(), "deviceInfo");
            return (Criteria) this;
        }

        public Criteria andNonceStrLikeInsensitive(String value) {
            addCriterion("upper(NONCE_STR) like", value.toUpperCase(), "nonceStr");
            return (Criteria) this;
        }

        public Criteria andSignLikeInsensitive(String value) {
            addCriterion("upper(SIGN) like", value.toUpperCase(), "sign");
            return (Criteria) this;
        }

        public Criteria andSignTypeLikeInsensitive(String value) {
            addCriterion("upper(SIGN_TYPE) like", value.toUpperCase(), "signType");
            return (Criteria) this;
        }

        public Criteria andResultCodeLikeInsensitive(String value) {
            addCriterion("upper(RESULT_CODE) like", value.toUpperCase(), "resultCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeLikeInsensitive(String value) {
            addCriterion("upper(ERR_CODE) like", value.toUpperCase(), "errCode");
            return (Criteria) this;
        }

        public Criteria andErrCodeDesLikeInsensitive(String value) {
            addCriterion("upper(ERR_CODE_DES) like", value.toUpperCase(), "errCodeDes");
            return (Criteria) this;
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(OPENID) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeLikeInsensitive(String value) {
            addCriterion("upper(IS_SUBSCRIBE) like", value.toUpperCase(), "isSubscribe");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLikeInsensitive(String value) {
            addCriterion("upper(TRADE_TYPE) like", value.toUpperCase(), "tradeType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLikeInsensitive(String value) {
            addCriterion("upper(BANK_TYPE) like", value.toUpperCase(), "bankType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(FEE_TYPE) like", value.toUpperCase(), "feeType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(CASH_FEE_TYPE) like", value.toUpperCase(), "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLikeInsensitive(String value) {
            addCriterion("upper(COUPON_TYPE) like", value.toUpperCase(), "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponIdLikeInsensitive(String value) {
            addCriterion("upper(COUPON_ID) like", value.toUpperCase(), "couponId");
            return (Criteria) this;
        }

        public Criteria andAttachLikeInsensitive(String value) {
            addCriterion("upper(ATTACH) like", value.toUpperCase(), "attach");
            return (Criteria) this;
        }

        public Criteria andTimeEndLikeInsensitive(String value) {
            addCriterion("upper(TIME_END) like", value.toUpperCase(), "timeEnd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PAY_RESULT_WX
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_RESULT_WX
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