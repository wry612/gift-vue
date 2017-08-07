package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class PayOrderWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public PayOrderWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
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
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: pay_order_wx
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

        public Criteria andPayInfoIdIsNull() {
            addCriterion("PAY_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIsNotNull() {
            addCriterion("PAY_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdEqualTo(Long value) {
            addCriterion("PAY_INFO_ID =", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotEqualTo(Long value) {
            addCriterion("PAY_INFO_ID <>", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThan(Long value) {
            addCriterion("PAY_INFO_ID >", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_INFO_ID >=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThan(Long value) {
            addCriterion("PAY_INFO_ID <", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("PAY_INFO_ID <=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIn(List<Long> values) {
            addCriterion("PAY_INFO_ID in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotIn(List<Long> values) {
            addCriterion("PAY_INFO_ID not in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdBetween(Long value1, Long value2) {
            addCriterion("PAY_INFO_ID between", value1, value2, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("PAY_INFO_ID not between", value1, value2, "payInfoId");
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

        public Criteria andPrepayResultCodeIsNull() {
            addCriterion("PREPAY_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeIsNotNull() {
            addCriterion("PREPAY_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeEqualTo(String value) {
            addCriterion("PREPAY_RESULT_CODE =", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeNotEqualTo(String value) {
            addCriterion("PREPAY_RESULT_CODE <>", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeGreaterThan(String value) {
            addCriterion("PREPAY_RESULT_CODE >", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PREPAY_RESULT_CODE >=", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeLessThan(String value) {
            addCriterion("PREPAY_RESULT_CODE <", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeLessThanOrEqualTo(String value) {
            addCriterion("PREPAY_RESULT_CODE <=", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeLike(String value) {
            addCriterion("PREPAY_RESULT_CODE like", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeNotLike(String value) {
            addCriterion("PREPAY_RESULT_CODE not like", value, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeIn(List<String> values) {
            addCriterion("PREPAY_RESULT_CODE in", values, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeNotIn(List<String> values) {
            addCriterion("PREPAY_RESULT_CODE not in", values, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeBetween(String value1, String value2) {
            addCriterion("PREPAY_RESULT_CODE between", value1, value2, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPrepayResultCodeNotBetween(String value1, String value2) {
            addCriterion("PREPAY_RESULT_CODE not between", value1, value2, "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIsNull() {
            addCriterion("PAY_TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIsNotNull() {
            addCriterion("PAY_TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdEqualTo(String value) {
            addCriterion("PAY_TRANSACTION_ID =", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotEqualTo(String value) {
            addCriterion("PAY_TRANSACTION_ID <>", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdGreaterThan(String value) {
            addCriterion("PAY_TRANSACTION_ID >", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TRANSACTION_ID >=", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLessThan(String value) {
            addCriterion("PAY_TRANSACTION_ID <", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_TRANSACTION_ID <=", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLike(String value) {
            addCriterion("PAY_TRANSACTION_ID like", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotLike(String value) {
            addCriterion("PAY_TRANSACTION_ID not like", value, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdIn(List<String> values) {
            addCriterion("PAY_TRANSACTION_ID in", values, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotIn(List<String> values) {
            addCriterion("PAY_TRANSACTION_ID not in", values, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdBetween(String value1, String value2) {
            addCriterion("PAY_TRANSACTION_ID between", value1, value2, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdNotBetween(String value1, String value2) {
            addCriterion("PAY_TRANSACTION_ID not between", value1, value2, "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeIsNull() {
            addCriterion("PAY_RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeIsNotNull() {
            addCriterion("PAY_RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeEqualTo(String value) {
            addCriterion("PAY_RESULT_CODE =", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeNotEqualTo(String value) {
            addCriterion("PAY_RESULT_CODE <>", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeGreaterThan(String value) {
            addCriterion("PAY_RESULT_CODE >", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT_CODE >=", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeLessThan(String value) {
            addCriterion("PAY_RESULT_CODE <", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_RESULT_CODE <=", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeLike(String value) {
            addCriterion("PAY_RESULT_CODE like", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeNotLike(String value) {
            addCriterion("PAY_RESULT_CODE not like", value, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeIn(List<String> values) {
            addCriterion("PAY_RESULT_CODE in", values, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeNotIn(List<String> values) {
            addCriterion("PAY_RESULT_CODE not in", values, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeBetween(String value1, String value2) {
            addCriterion("PAY_RESULT_CODE between", value1, value2, "payResultCode");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_RESULT_CODE not between", value1, value2, "payResultCode");
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

        public Criteria andCouponDetailListIsNull() {
            addCriterion("COUPON_DETAIL_LIST is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListIsNotNull() {
            addCriterion("COUPON_DETAIL_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListEqualTo(String value) {
            addCriterion("COUPON_DETAIL_LIST =", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListNotEqualTo(String value) {
            addCriterion("COUPON_DETAIL_LIST <>", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListGreaterThan(String value) {
            addCriterion("COUPON_DETAIL_LIST >", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_DETAIL_LIST >=", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListLessThan(String value) {
            addCriterion("COUPON_DETAIL_LIST <", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListLessThanOrEqualTo(String value) {
            addCriterion("COUPON_DETAIL_LIST <=", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListLike(String value) {
            addCriterion("COUPON_DETAIL_LIST like", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListNotLike(String value) {
            addCriterion("COUPON_DETAIL_LIST not like", value, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListIn(List<String> values) {
            addCriterion("COUPON_DETAIL_LIST in", values, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListNotIn(List<String> values) {
            addCriterion("COUPON_DETAIL_LIST not in", values, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListBetween(String value1, String value2) {
            addCriterion("COUPON_DETAIL_LIST between", value1, value2, "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListNotBetween(String value1, String value2) {
            addCriterion("COUPON_DETAIL_LIST not between", value1, value2, "couponDetailList");
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

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andPayOrderWxIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_ORDER_WX_ID) like", value.toUpperCase(), "payOrderWxId");
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

        public Criteria andPrepayResultCodeLikeInsensitive(String value) {
            addCriterion("upper(PREPAY_RESULT_CODE) like", value.toUpperCase(), "prepayResultCode");
            return (Criteria) this;
        }

        public Criteria andPayTransactionIdLikeInsensitive(String value) {
            addCriterion("upper(PAY_TRANSACTION_ID) like", value.toUpperCase(), "payTransactionId");
            return (Criteria) this;
        }

        public Criteria andPayResultCodeLikeInsensitive(String value) {
            addCriterion("upper(PAY_RESULT_CODE) like", value.toUpperCase(), "payResultCode");
            return (Criteria) this;
        }

        public Criteria andBankTypeLikeInsensitive(String value) {
            addCriterion("upper(BANK_TYPE) like", value.toUpperCase(), "bankType");
            return (Criteria) this;
        }

        public Criteria andCashFeeTypeLikeInsensitive(String value) {
            addCriterion("upper(CASH_FEE_TYPE) like", value.toUpperCase(), "cashFeeType");
            return (Criteria) this;
        }

        public Criteria andCouponDetailListLikeInsensitive(String value) {
            addCriterion("upper(COUPON_DETAIL_LIST) like", value.toUpperCase(), "couponDetailList");
            return (Criteria) this;
        }

        public Criteria andTimeEndLikeInsensitive(String value) {
            addCriterion("upper(TIME_END) like", value.toUpperCase(), "timeEnd");
            return (Criteria) this;
        }

        public Criteria andIsValidLikeInsensitive(String value) {
            addCriterion("upper(IS_VALID) like", value.toUpperCase(), "isValid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pay_order_wx
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: pay_order_wx
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