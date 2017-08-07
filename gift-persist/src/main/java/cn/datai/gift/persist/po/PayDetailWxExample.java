package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class PayDetailWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public PayDetailWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
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
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_DETAIL_WX
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

        public Criteria andPayDetailWxIdIsNull() {
            addCriterion("PAY_DETAIL_WX_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdIsNotNull() {
            addCriterion("PAY_DETAIL_WX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdEqualTo(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID =", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdNotEqualTo(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID <>", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdGreaterThan(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID >", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID >=", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdLessThan(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID <", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_DETAIL_WX_ID <=", value, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdIn(List<Integer> values) {
            addCriterion("PAY_DETAIL_WX_ID in", values, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdNotIn(List<Integer> values) {
            addCriterion("PAY_DETAIL_WX_ID not in", values, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdBetween(Integer value1, Integer value2) {
            addCriterion("PAY_DETAIL_WX_ID between", value1, value2, "payDetailWxId");
            return (Criteria) this;
        }

        public Criteria andPayDetailWxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_DETAIL_WX_ID not between", value1, value2, "payDetailWxId");
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

        public Criteria andBodyIsNull() {
            addCriterion("BODY is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("BODY is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("BODY =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("BODY <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("BODY >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("BODY >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("BODY <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("BODY <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("BODY like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("BODY not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("BODY in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("BODY not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("BODY between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("BODY not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
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

        public Criteria andSpbillCreateIpIsNull() {
            addCriterion("SPBILL_CREATE_IP is null");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpIsNotNull() {
            addCriterion("SPBILL_CREATE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpEqualTo(String value) {
            addCriterion("SPBILL_CREATE_IP =", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpNotEqualTo(String value) {
            addCriterion("SPBILL_CREATE_IP <>", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpGreaterThan(String value) {
            addCriterion("SPBILL_CREATE_IP >", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpGreaterThanOrEqualTo(String value) {
            addCriterion("SPBILL_CREATE_IP >=", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpLessThan(String value) {
            addCriterion("SPBILL_CREATE_IP <", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpLessThanOrEqualTo(String value) {
            addCriterion("SPBILL_CREATE_IP <=", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpLike(String value) {
            addCriterion("SPBILL_CREATE_IP like", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpNotLike(String value) {
            addCriterion("SPBILL_CREATE_IP not like", value, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpIn(List<String> values) {
            addCriterion("SPBILL_CREATE_IP in", values, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpNotIn(List<String> values) {
            addCriterion("SPBILL_CREATE_IP not in", values, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpBetween(String value1, String value2) {
            addCriterion("SPBILL_CREATE_IP between", value1, value2, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpNotBetween(String value1, String value2) {
            addCriterion("SPBILL_CREATE_IP not between", value1, value2, "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("TIME_START is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("TIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(String value) {
            addCriterion("TIME_START =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(String value) {
            addCriterion("TIME_START <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(String value) {
            addCriterion("TIME_START >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_START >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(String value) {
            addCriterion("TIME_START <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(String value) {
            addCriterion("TIME_START <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLike(String value) {
            addCriterion("TIME_START like", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotLike(String value) {
            addCriterion("TIME_START not like", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<String> values) {
            addCriterion("TIME_START in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<String> values) {
            addCriterion("TIME_START not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(String value1, String value2) {
            addCriterion("TIME_START between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(String value1, String value2) {
            addCriterion("TIME_START not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNull() {
            addCriterion("TIME_EXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNotNull() {
            addCriterion("TIME_EXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireEqualTo(String value) {
            addCriterion("TIME_EXPIRE =", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotEqualTo(String value) {
            addCriterion("TIME_EXPIRE <>", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThan(String value) {
            addCriterion("TIME_EXPIRE >", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_EXPIRE >=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThan(String value) {
            addCriterion("TIME_EXPIRE <", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThanOrEqualTo(String value) {
            addCriterion("TIME_EXPIRE <=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLike(String value) {
            addCriterion("TIME_EXPIRE like", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotLike(String value) {
            addCriterion("TIME_EXPIRE not like", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIn(List<String> values) {
            addCriterion("TIME_EXPIRE in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotIn(List<String> values) {
            addCriterion("TIME_EXPIRE not in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireBetween(String value1, String value2) {
            addCriterion("TIME_EXPIRE between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotBetween(String value1, String value2) {
            addCriterion("TIME_EXPIRE not between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andGoodsTagIsNull() {
            addCriterion("GOODS_TAG is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTagIsNotNull() {
            addCriterion("GOODS_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTagEqualTo(String value) {
            addCriterion("GOODS_TAG =", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagNotEqualTo(String value) {
            addCriterion("GOODS_TAG <>", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagGreaterThan(String value) {
            addCriterion("GOODS_TAG >", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TAG >=", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagLessThan(String value) {
            addCriterion("GOODS_TAG <", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TAG <=", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagLike(String value) {
            addCriterion("GOODS_TAG like", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagNotLike(String value) {
            addCriterion("GOODS_TAG not like", value, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagIn(List<String> values) {
            addCriterion("GOODS_TAG in", values, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagNotIn(List<String> values) {
            addCriterion("GOODS_TAG not in", values, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagBetween(String value1, String value2) {
            addCriterion("GOODS_TAG between", value1, value2, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andGoodsTagNotBetween(String value1, String value2) {
            addCriterion("GOODS_TAG not between", value1, value2, "goodsTag");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("NOTIFY_URL =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("NOTIFY_URL <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("NOTIFY_URL >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("NOTIFY_URL <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("NOTIFY_URL like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("NOTIFY_URL not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("NOTIFY_URL in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("NOTIFY_URL not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL not between", value1, value2, "notifyUrl");
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andLimitPayIsNull() {
            addCriterion("LIMIT_PAY is null");
            return (Criteria) this;
        }

        public Criteria andLimitPayIsNotNull() {
            addCriterion("LIMIT_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPayEqualTo(String value) {
            addCriterion("LIMIT_PAY =", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayNotEqualTo(String value) {
            addCriterion("LIMIT_PAY <>", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayGreaterThan(String value) {
            addCriterion("LIMIT_PAY >", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_PAY >=", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayLessThan(String value) {
            addCriterion("LIMIT_PAY <", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_PAY <=", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayLike(String value) {
            addCriterion("LIMIT_PAY like", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayNotLike(String value) {
            addCriterion("LIMIT_PAY not like", value, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayIn(List<String> values) {
            addCriterion("LIMIT_PAY in", values, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayNotIn(List<String> values) {
            addCriterion("LIMIT_PAY not in", values, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayBetween(String value1, String value2) {
            addCriterion("LIMIT_PAY between", value1, value2, "limitPay");
            return (Criteria) this;
        }

        public Criteria andLimitPayNotBetween(String value1, String value2) {
            addCriterion("LIMIT_PAY not between", value1, value2, "limitPay");
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

        public Criteria andPrepayIdIsNull() {
            addCriterion("PREPAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIsNotNull() {
            addCriterion("PREPAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdEqualTo(String value) {
            addCriterion("PREPAY_ID =", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotEqualTo(String value) {
            addCriterion("PREPAY_ID <>", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThan(String value) {
            addCriterion("PREPAY_ID >", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("PREPAY_ID >=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThan(String value) {
            addCriterion("PREPAY_ID <", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThanOrEqualTo(String value) {
            addCriterion("PREPAY_ID <=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLike(String value) {
            addCriterion("PREPAY_ID like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotLike(String value) {
            addCriterion("PREPAY_ID not like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIn(List<String> values) {
            addCriterion("PREPAY_ID in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotIn(List<String> values) {
            addCriterion("PREPAY_ID not in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdBetween(String value1, String value2) {
            addCriterion("PREPAY_ID between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotBetween(String value1, String value2) {
            addCriterion("PREPAY_ID not between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNull() {
            addCriterion("CODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNotNull() {
            addCriterion("CODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlEqualTo(String value) {
            addCriterion("CODE_URL =", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotEqualTo(String value) {
            addCriterion("CODE_URL <>", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThan(String value) {
            addCriterion("CODE_URL >", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_URL >=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThan(String value) {
            addCriterion("CODE_URL <", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("CODE_URL <=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLike(String value) {
            addCriterion("CODE_URL like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotLike(String value) {
            addCriterion("CODE_URL not like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIn(List<String> values) {
            addCriterion("CODE_URL in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotIn(List<String> values) {
            addCriterion("CODE_URL not in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlBetween(String value1, String value2) {
            addCriterion("CODE_URL between", value1, value2, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotBetween(String value1, String value2) {
            addCriterion("CODE_URL not between", value1, value2, "codeUrl");
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

        public Criteria andBodyLikeInsensitive(String value) {
            addCriterion("upper(BODY) like", value.toUpperCase(), "body");
            return (Criteria) this;
        }

        public Criteria andDetailLikeInsensitive(String value) {
            addCriterion("upper(DETAIL) like", value.toUpperCase(), "detail");
            return (Criteria) this;
        }

        public Criteria andAttachLikeInsensitive(String value) {
            addCriterion("upper(ATTACH) like", value.toUpperCase(), "attach");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(FEE_TYPE) like", value.toUpperCase(), "feeType");
            return (Criteria) this;
        }

        public Criteria andSpbillCreateIpLikeInsensitive(String value) {
            addCriterion("upper(SPBILL_CREATE_IP) like", value.toUpperCase(), "spbillCreateIp");
            return (Criteria) this;
        }

        public Criteria andTimeStartLikeInsensitive(String value) {
            addCriterion("upper(TIME_START) like", value.toUpperCase(), "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLikeInsensitive(String value) {
            addCriterion("upper(TIME_EXPIRE) like", value.toUpperCase(), "timeExpire");
            return (Criteria) this;
        }

        public Criteria andGoodsTagLikeInsensitive(String value) {
            addCriterion("upper(GOODS_TAG) like", value.toUpperCase(), "goodsTag");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLikeInsensitive(String value) {
            addCriterion("upper(NOTIFY_URL) like", value.toUpperCase(), "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLikeInsensitive(String value) {
            addCriterion("upper(TRADE_TYPE) like", value.toUpperCase(), "tradeType");
            return (Criteria) this;
        }

        public Criteria andProductIdLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_ID) like", value.toUpperCase(), "productId");
            return (Criteria) this;
        }

        public Criteria andLimitPayLikeInsensitive(String value) {
            addCriterion("upper(LIMIT_PAY) like", value.toUpperCase(), "limitPay");
            return (Criteria) this;
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(OPENID) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLikeInsensitive(String value) {
            addCriterion("upper(PREPAY_ID) like", value.toUpperCase(), "prepayId");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLikeInsensitive(String value) {
            addCriterion("upper(CODE_URL) like", value.toUpperCase(), "codeUrl");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PAY_DETAIL_WX
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: PAY_DETAIL_WX
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