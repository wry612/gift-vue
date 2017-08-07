package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class RefundResultWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public RefundResultWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
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
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: REFUND_RESULT_WX
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

        public Criteria andRefundResultWxIsNull() {
            addCriterion("REFUND_RESULT_WX is null");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxIsNotNull() {
            addCriterion("REFUND_RESULT_WX is not null");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxEqualTo(String value) {
            addCriterion("REFUND_RESULT_WX =", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxNotEqualTo(String value) {
            addCriterion("REFUND_RESULT_WX <>", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxGreaterThan(String value) {
            addCriterion("REFUND_RESULT_WX >", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_RESULT_WX >=", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxLessThan(String value) {
            addCriterion("REFUND_RESULT_WX <", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxLessThanOrEqualTo(String value) {
            addCriterion("REFUND_RESULT_WX <=", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxLike(String value) {
            addCriterion("REFUND_RESULT_WX like", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxNotLike(String value) {
            addCriterion("REFUND_RESULT_WX not like", value, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxIn(List<String> values) {
            addCriterion("REFUND_RESULT_WX in", values, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxNotIn(List<String> values) {
            addCriterion("REFUND_RESULT_WX not in", values, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxBetween(String value1, String value2) {
            addCriterion("REFUND_RESULT_WX between", value1, value2, "refundResultWx");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxNotBetween(String value1, String value2) {
            addCriterion("REFUND_RESULT_WX not between", value1, value2, "refundResultWx");
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

        public Criteria andPayOrderWxIdEqualTo(String value) {
            addCriterion("PAY_ORDER_WX_ID =", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotEqualTo(String value) {
            addCriterion("PAY_ORDER_WX_ID <>", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdGreaterThan(String value) {
            addCriterion("PAY_ORDER_WX_ID >", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_WX_ID >=", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLessThan(String value) {
            addCriterion("PAY_ORDER_WX_ID <", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_ORDER_WX_ID <=", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLike(String value) {
            addCriterion("PAY_ORDER_WX_ID like", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotLike(String value) {
            addCriterion("PAY_ORDER_WX_ID not like", value, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdIn(List<String> values) {
            addCriterion("PAY_ORDER_WX_ID in", values, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotIn(List<String> values) {
            addCriterion("PAY_ORDER_WX_ID not in", values, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_WX_ID between", value1, value2, "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdNotBetween(String value1, String value2) {
            addCriterion("PAY_ORDER_WX_ID not between", value1, value2, "payOrderWxId");
            return (Criteria) this;
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

        public Criteria andRefundChannelIsNull() {
            addCriterion("REFUND_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andRefundChannelIsNotNull() {
            addCriterion("REFUND_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andRefundChannelEqualTo(String value) {
            addCriterion("REFUND_CHANNEL =", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotEqualTo(String value) {
            addCriterion("REFUND_CHANNEL <>", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelGreaterThan(String value) {
            addCriterion("REFUND_CHANNEL >", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_CHANNEL >=", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLessThan(String value) {
            addCriterion("REFUND_CHANNEL <", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLessThanOrEqualTo(String value) {
            addCriterion("REFUND_CHANNEL <=", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLike(String value) {
            addCriterion("REFUND_CHANNEL like", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotLike(String value) {
            addCriterion("REFUND_CHANNEL not like", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelIn(List<String> values) {
            addCriterion("REFUND_CHANNEL in", values, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotIn(List<String> values) {
            addCriterion("REFUND_CHANNEL not in", values, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelBetween(String value1, String value2) {
            addCriterion("REFUND_CHANNEL between", value1, value2, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotBetween(String value1, String value2) {
            addCriterion("REFUND_CHANNEL not between", value1, value2, "refundChannel");
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

        public Criteria andSettlementRefundFeeIsNull() {
            addCriterion("SETTLEMENT_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeIsNotNull() {
            addCriterion("SETTLEMENT_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeEqualTo(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE =", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotEqualTo(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE <>", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeGreaterThan(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE >", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE >=", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeLessThan(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE <", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeLessThanOrEqualTo(Integer value) {
            addCriterion("SETTLEMENT_REFUND_FEE <=", value, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeIn(List<Integer> values) {
            addCriterion("SETTLEMENT_REFUND_FEE in", values, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotIn(List<Integer> values) {
            addCriterion("SETTLEMENT_REFUND_FEE not in", values, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_REFUND_FEE between", value1, value2, "settlementRefundFee");
            return (Criteria) this;
        }

        public Criteria andSettlementRefundFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("SETTLEMENT_REFUND_FEE not between", value1, value2, "settlementRefundFee");
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

        public Criteria andCashRefundFeeIsNull() {
            addCriterion("CASH_REFUND_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeIsNotNull() {
            addCriterion("CASH_REFUND_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeEqualTo(Integer value) {
            addCriterion("CASH_REFUND_FEE =", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotEqualTo(Integer value) {
            addCriterion("CASH_REFUND_FEE <>", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeGreaterThan(Integer value) {
            addCriterion("CASH_REFUND_FEE >", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASH_REFUND_FEE >=", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeLessThan(Integer value) {
            addCriterion("CASH_REFUND_FEE <", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeLessThanOrEqualTo(Integer value) {
            addCriterion("CASH_REFUND_FEE <=", value, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeIn(List<Integer> values) {
            addCriterion("CASH_REFUND_FEE in", values, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotIn(List<Integer> values) {
            addCriterion("CASH_REFUND_FEE not in", values, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeBetween(Integer value1, Integer value2) {
            addCriterion("CASH_REFUND_FEE between", value1, value2, "cashRefundFee");
            return (Criteria) this;
        }

        public Criteria andCashRefundFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("CASH_REFUND_FEE not between", value1, value2, "cashRefundFee");
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

        public Criteria andCouponRefundFeeTotalIsNull() {
            addCriterion("COUPON_REFUND_FEE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalIsNotNull() {
            addCriterion("COUPON_REFUND_FEE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL =", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalNotEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL <>", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalGreaterThan(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL >", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL >=", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalLessThan(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL <", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_FEE_TOTAL <=", value, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_FEE_TOTAL in", values, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalNotIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_FEE_TOTAL not in", values, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_FEE_TOTAL between", value1, value2, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_FEE_TOTAL not between", value1, value2, "couponRefundFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleIsNull() {
            addCriterion("COUPON_REFUND_FEE_SINGLE is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleIsNotNull() {
            addCriterion("COUPON_REFUND_FEE_SINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleEqualTo(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE =", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleNotEqualTo(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE <>", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleGreaterThan(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE >", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE >=", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleLessThan(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE <", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleLessThanOrEqualTo(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE <=", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleLike(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE like", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleNotLike(String value) {
            addCriterion("COUPON_REFUND_FEE_SINGLE not like", value, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleIn(List<String> values) {
            addCriterion("COUPON_REFUND_FEE_SINGLE in", values, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleNotIn(List<String> values) {
            addCriterion("COUPON_REFUND_FEE_SINGLE not in", values, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleBetween(String value1, String value2) {
            addCriterion("COUPON_REFUND_FEE_SINGLE between", value1, value2, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundFeeSingleNotBetween(String value1, String value2) {
            addCriterion("COUPON_REFUND_FEE_SINGLE not between", value1, value2, "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIsNull() {
            addCriterion("COUPON_REFUND_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIsNotNull() {
            addCriterion("COUPON_REFUND_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT =", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <>", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountGreaterThan(Integer value) {
            addCriterion("COUPON_REFUND_COUNT >", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT >=", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountLessThan(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUPON_REFUND_COUNT <=", value, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_COUNT in", values, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotIn(List<Integer> values) {
            addCriterion("COUPON_REFUND_COUNT not in", values, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_COUNT between", value1, value2, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUPON_REFUND_COUNT not between", value1, value2, "couponRefundCount");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdIsNull() {
            addCriterion("COUPON_REFUND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdIsNotNull() {
            addCriterion("COUPON_REFUND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdEqualTo(String value) {
            addCriterion("COUPON_REFUND_ID =", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdNotEqualTo(String value) {
            addCriterion("COUPON_REFUND_ID <>", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdGreaterThan(String value) {
            addCriterion("COUPON_REFUND_ID >", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_REFUND_ID >=", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdLessThan(String value) {
            addCriterion("COUPON_REFUND_ID <", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdLessThanOrEqualTo(String value) {
            addCriterion("COUPON_REFUND_ID <=", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdLike(String value) {
            addCriterion("COUPON_REFUND_ID like", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdNotLike(String value) {
            addCriterion("COUPON_REFUND_ID not like", value, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdIn(List<String> values) {
            addCriterion("COUPON_REFUND_ID in", values, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdNotIn(List<String> values) {
            addCriterion("COUPON_REFUND_ID not in", values, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdBetween(String value1, String value2) {
            addCriterion("COUPON_REFUND_ID between", value1, value2, "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdNotBetween(String value1, String value2) {
            addCriterion("COUPON_REFUND_ID not between", value1, value2, "couponRefundId");
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

        public Criteria andRefundRecvAccoutIsNull() {
            addCriterion("REFUND_RECV_ACCOUT is null");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutIsNotNull() {
            addCriterion("REFUND_RECV_ACCOUT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT =", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT <>", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutGreaterThan(String value) {
            addCriterion("REFUND_RECV_ACCOUT >", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT >=", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLessThan(String value) {
            addCriterion("REFUND_RECV_ACCOUT <", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLessThanOrEqualTo(String value) {
            addCriterion("REFUND_RECV_ACCOUT <=", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLike(String value) {
            addCriterion("REFUND_RECV_ACCOUT like", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotLike(String value) {
            addCriterion("REFUND_RECV_ACCOUT not like", value, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutIn(List<String> values) {
            addCriterion("REFUND_RECV_ACCOUT in", values, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotIn(List<String> values) {
            addCriterion("REFUND_RECV_ACCOUT not in", values, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutBetween(String value1, String value2) {
            addCriterion("REFUND_RECV_ACCOUT between", value1, value2, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutNotBetween(String value1, String value2) {
            addCriterion("REFUND_RECV_ACCOUT not between", value1, value2, "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutIsNull() {
            addCriterion("REFUND_ACCOUT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutIsNotNull() {
            addCriterion("REFUND_ACCOUT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutEqualTo(String value) {
            addCriterion("REFUND_ACCOUT =", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutNotEqualTo(String value) {
            addCriterion("REFUND_ACCOUT <>", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutGreaterThan(String value) {
            addCriterion("REFUND_ACCOUT >", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_ACCOUT >=", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutLessThan(String value) {
            addCriterion("REFUND_ACCOUT <", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutLessThanOrEqualTo(String value) {
            addCriterion("REFUND_ACCOUT <=", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutLike(String value) {
            addCriterion("REFUND_ACCOUT like", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutNotLike(String value) {
            addCriterion("REFUND_ACCOUT not like", value, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutIn(List<String> values) {
            addCriterion("REFUND_ACCOUT in", values, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutNotIn(List<String> values) {
            addCriterion("REFUND_ACCOUT not in", values, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutBetween(String value1, String value2) {
            addCriterion("REFUND_ACCOUT between", value1, value2, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutNotBetween(String value1, String value2) {
            addCriterion("REFUND_ACCOUT not between", value1, value2, "refundAccout");
            return (Criteria) this;
        }

        public Criteria andRefundResultWxLikeInsensitive(String value) {
            addCriterion("upper(REFUND_RESULT_WX) like", value.toUpperCase(), "refundResultWx");
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

        public Criteria andTransactionIdLikeInsensitive(String value) {
            addCriterion("upper(TRANSACTION_ID) like", value.toUpperCase(), "transactionId");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_ORDER_WX_ID) like", value.toUpperCase(), "payOrderWxId");
            return (Criteria) this;
        }

        public Criteria andPayRefundOrderWxIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_REFUND_ORDER_WX_ID) like", value.toUpperCase(), "payRefundOrderWxId");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLikeInsensitive(String value) {
            addCriterion("upper(REFUND_CHANNEL) like", value.toUpperCase(), "refundChannel");
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

        public Criteria andCouponRefundFeeSingleLikeInsensitive(String value) {
            addCriterion("upper(COUPON_REFUND_FEE_SINGLE) like", value.toUpperCase(), "couponRefundFeeSingle");
            return (Criteria) this;
        }

        public Criteria andCouponRefundIdLikeInsensitive(String value) {
            addCriterion("upper(COUPON_REFUND_ID) like", value.toUpperCase(), "couponRefundId");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLikeInsensitive(String value) {
            addCriterion("upper(REFUND_STATUS) like", value.toUpperCase(), "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLikeInsensitive(String value) {
            addCriterion("upper(REFUND_ACCOUNT) like", value.toUpperCase(), "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundRecvAccoutLikeInsensitive(String value) {
            addCriterion("upper(REFUND_RECV_ACCOUT) like", value.toUpperCase(), "refundRecvAccout");
            return (Criteria) this;
        }

        public Criteria andRefundAccoutLikeInsensitive(String value) {
            addCriterion("upper(REFUND_ACCOUT) like", value.toUpperCase(), "refundAccout");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table REFUND_RESULT_WX
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: REFUND_RESULT_WX
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