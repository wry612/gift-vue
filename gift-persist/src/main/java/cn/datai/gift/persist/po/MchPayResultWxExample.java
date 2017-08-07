package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class MchPayResultWxExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public MchPayResultWxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
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
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: mch_pay_result_wx
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

        public Criteria andPartnerTradeNoIsNull() {
            addCriterion("PARTNER_TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoIsNotNull() {
            addCriterion("PARTNER_TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoEqualTo(String value) {
            addCriterion("PARTNER_TRADE_NO =", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoNotEqualTo(String value) {
            addCriterion("PARTNER_TRADE_NO <>", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoGreaterThan(String value) {
            addCriterion("PARTNER_TRADE_NO >", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNER_TRADE_NO >=", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoLessThan(String value) {
            addCriterion("PARTNER_TRADE_NO <", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoLessThanOrEqualTo(String value) {
            addCriterion("PARTNER_TRADE_NO <=", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoLike(String value) {
            addCriterion("PARTNER_TRADE_NO like", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoNotLike(String value) {
            addCriterion("PARTNER_TRADE_NO not like", value, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoIn(List<String> values) {
            addCriterion("PARTNER_TRADE_NO in", values, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoNotIn(List<String> values) {
            addCriterion("PARTNER_TRADE_NO not in", values, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoBetween(String value1, String value2) {
            addCriterion("PARTNER_TRADE_NO between", value1, value2, "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPartnerTradeNoNotBetween(String value1, String value2) {
            addCriterion("PARTNER_TRADE_NO not between", value1, value2, "partnerTradeNo");
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

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("DETAIL_ID like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("DETAIL_ID not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
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

        public Criteria andTransferStatusIsNull() {
            addCriterion("TRANSFER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIsNotNull() {
            addCriterion("TRANSFER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStatusEqualTo(String value) {
            addCriterion("TRANSFER_STATUS =", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotEqualTo(String value) {
            addCriterion("TRANSFER_STATUS <>", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThan(String value) {
            addCriterion("TRANSFER_STATUS >", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_STATUS >=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThan(String value) {
            addCriterion("TRANSFER_STATUS <", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_STATUS <=", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusLike(String value) {
            addCriterion("TRANSFER_STATUS like", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotLike(String value) {
            addCriterion("TRANSFER_STATUS not like", value, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusIn(List<String> values) {
            addCriterion("TRANSFER_STATUS in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotIn(List<String> values) {
            addCriterion("TRANSFER_STATUS not in", values, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusBetween(String value1, String value2) {
            addCriterion("TRANSFER_STATUS between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andTransferStatusNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_STATUS not between", value1, value2, "transferStatus");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
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

        public Criteria andTransferNameIsNull() {
            addCriterion("TRANSFER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNotNull() {
            addCriterion("TRANSFER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNameEqualTo(String value) {
            addCriterion("TRANSFER_NAME =", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotEqualTo(String value) {
            addCriterion("TRANSFER_NAME <>", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThan(String value) {
            addCriterion("TRANSFER_NAME >", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NAME >=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThan(String value) {
            addCriterion("TRANSFER_NAME <", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NAME <=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLike(String value) {
            addCriterion("TRANSFER_NAME like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotLike(String value) {
            addCriterion("TRANSFER_NAME not like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameIn(List<String> values) {
            addCriterion("TRANSFER_NAME in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotIn(List<String> values) {
            addCriterion("TRANSFER_NAME not in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameBetween(String value1, String value2) {
            addCriterion("TRANSFER_NAME between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_NAME not between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("PAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("PAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(Integer value) {
            addCriterion("PAYMENT_AMOUNT =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(Integer value) {
            addCriterion("PAYMENT_AMOUNT <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(Integer value) {
            addCriterion("PAYMENT_AMOUNT >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_AMOUNT >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(Integer value) {
            addCriterion("PAYMENT_AMOUNT <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_AMOUNT <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<Integer> values) {
            addCriterion("PAYMENT_AMOUNT in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<Integer> values) {
            addCriterion("PAYMENT_AMOUNT not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_AMOUNT between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_AMOUNT not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNull() {
            addCriterion("TRANSFER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNotNull() {
            addCriterion("TRANSFER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeEqualTo(String value) {
            addCriterion("TRANSFER_TIME =", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotEqualTo(String value) {
            addCriterion("TRANSFER_TIME <>", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThan(String value) {
            addCriterion("TRANSFER_TIME >", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TIME >=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThan(String value) {
            addCriterion("TRANSFER_TIME <", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TIME <=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLike(String value) {
            addCriterion("TRANSFER_TIME like", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotLike(String value) {
            addCriterion("TRANSFER_TIME not like", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIn(List<String> values) {
            addCriterion("TRANSFER_TIME in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotIn(List<String> values) {
            addCriterion("TRANSFER_TIME not in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeBetween(String value1, String value2) {
            addCriterion("TRANSFER_TIME between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_TIME not between", value1, value2, "transferTime");
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

        public Criteria andPartnerTradeNoLikeInsensitive(String value) {
            addCriterion("upper(PARTNER_TRADE_NO) like", value.toUpperCase(), "partnerTradeNo");
            return (Criteria) this;
        }

        public Criteria andMchIdLikeInsensitive(String value) {
            addCriterion("upper(MCH_ID) like", value.toUpperCase(), "mchId");
            return (Criteria) this;
        }

        public Criteria andAppidLikeInsensitive(String value) {
            addCriterion("upper(APPID) like", value.toUpperCase(), "appid");
            return (Criteria) this;
        }

        public Criteria andDetailIdLikeInsensitive(String value) {
            addCriterion("upper(DETAIL_ID) like", value.toUpperCase(), "detailId");
            return (Criteria) this;
        }

        public Criteria andSignLikeInsensitive(String value) {
            addCriterion("upper(SIGN) like", value.toUpperCase(), "sign");
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

        public Criteria andTransferStatusLikeInsensitive(String value) {
            addCriterion("upper(TRANSFER_STATUS) like", value.toUpperCase(), "transferStatus");
            return (Criteria) this;
        }

        public Criteria andReasonLikeInsensitive(String value) {
            addCriterion("upper(REASON) like", value.toUpperCase(), "reason");
            return (Criteria) this;
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(OPENID) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }

        public Criteria andTransferNameLikeInsensitive(String value) {
            addCriterion("upper(TRANSFER_NAME) like", value.toUpperCase(), "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLikeInsensitive(String value) {
            addCriterion("upper(TRANSFER_TIME) like", value.toUpperCase(), "transferTime");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mch_pay_result_wx
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: mch_pay_result_wx
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