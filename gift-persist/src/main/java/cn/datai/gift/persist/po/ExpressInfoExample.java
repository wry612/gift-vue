package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpressInfoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public ExpressInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
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
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: express_info
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

        public Criteria andExpTextNameIsNull() {
            addCriterion("EXP_TEXT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExpTextNameIsNotNull() {
            addCriterion("EXP_TEXT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExpTextNameEqualTo(String value) {
            addCriterion("EXP_TEXT_NAME =", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameNotEqualTo(String value) {
            addCriterion("EXP_TEXT_NAME <>", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameGreaterThan(String value) {
            addCriterion("EXP_TEXT_NAME >", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_TEXT_NAME >=", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameLessThan(String value) {
            addCriterion("EXP_TEXT_NAME <", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameLessThanOrEqualTo(String value) {
            addCriterion("EXP_TEXT_NAME <=", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameLike(String value) {
            addCriterion("EXP_TEXT_NAME like", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameNotLike(String value) {
            addCriterion("EXP_TEXT_NAME not like", value, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameIn(List<String> values) {
            addCriterion("EXP_TEXT_NAME in", values, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameNotIn(List<String> values) {
            addCriterion("EXP_TEXT_NAME not in", values, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameBetween(String value1, String value2) {
            addCriterion("EXP_TEXT_NAME between", value1, value2, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpTextNameNotBetween(String value1, String value2) {
            addCriterion("EXP_TEXT_NAME not between", value1, value2, "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameIsNull() {
            addCriterion("EXP_SPELL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameIsNotNull() {
            addCriterion("EXP_SPELL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameEqualTo(String value) {
            addCriterion("EXP_SPELL_NAME =", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameNotEqualTo(String value) {
            addCriterion("EXP_SPELL_NAME <>", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameGreaterThan(String value) {
            addCriterion("EXP_SPELL_NAME >", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_SPELL_NAME >=", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameLessThan(String value) {
            addCriterion("EXP_SPELL_NAME <", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameLessThanOrEqualTo(String value) {
            addCriterion("EXP_SPELL_NAME <=", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameLike(String value) {
            addCriterion("EXP_SPELL_NAME like", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameNotLike(String value) {
            addCriterion("EXP_SPELL_NAME not like", value, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameIn(List<String> values) {
            addCriterion("EXP_SPELL_NAME in", values, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameNotIn(List<String> values) {
            addCriterion("EXP_SPELL_NAME not in", values, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameBetween(String value1, String value2) {
            addCriterion("EXP_SPELL_NAME between", value1, value2, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameNotBetween(String value1, String value2) {
            addCriterion("EXP_SPELL_NAME not between", value1, value2, "expSpellName");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNull() {
            addCriterion("MAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNotNull() {
            addCriterion("MAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMailNoEqualTo(String value) {
            addCriterion("MAIL_NO =", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotEqualTo(String value) {
            addCriterion("MAIL_NO <>", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThan(String value) {
            addCriterion("MAIL_NO >", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_NO >=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThan(String value) {
            addCriterion("MAIL_NO <", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThanOrEqualTo(String value) {
            addCriterion("MAIL_NO <=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLike(String value) {
            addCriterion("MAIL_NO like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotLike(String value) {
            addCriterion("MAIL_NO not like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoIn(List<String> values) {
            addCriterion("MAIL_NO in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotIn(List<String> values) {
            addCriterion("MAIL_NO not in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoBetween(String value1, String value2) {
            addCriterion("MAIL_NO between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotBetween(String value1, String value2) {
            addCriterion("MAIL_NO not between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNull() {
            addCriterion("QUERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("QUERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(Date value) {
            addCriterion("QUERY_TIME =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(Date value) {
            addCriterion("QUERY_TIME <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(Date value) {
            addCriterion("QUERY_TIME >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUERY_TIME >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(Date value) {
            addCriterion("QUERY_TIME <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUERY_TIME <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<Date> values) {
            addCriterion("QUERY_TIME in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<Date> values) {
            addCriterion("QUERY_TIME not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(Date value1, Date value2) {
            addCriterion("QUERY_TIME between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUERY_TIME not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNull() {
            addCriterion("DATA_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNotNull() {
            addCriterion("DATA_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeEqualTo(Date value) {
            addCriterion("DATA_UPDATE_TIME =", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotEqualTo(Date value) {
            addCriterion("DATA_UPDATE_TIME <>", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThan(Date value) {
            addCriterion("DATA_UPDATE_TIME >", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATA_UPDATE_TIME >=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThan(Date value) {
            addCriterion("DATA_UPDATE_TIME <", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATA_UPDATE_TIME <=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIn(List<Date> values) {
            addCriterion("DATA_UPDATE_TIME in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotIn(List<Date> values) {
            addCriterion("DATA_UPDATE_TIME not in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("DATA_UPDATE_TIME between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATA_UPDATE_TIME not between", value1, value2, "dataUpdateTime");
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

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andDatumIsNull() {
            addCriterion("DATUM is null");
            return (Criteria) this;
        }

        public Criteria andDatumIsNotNull() {
            addCriterion("DATUM is not null");
            return (Criteria) this;
        }

        public Criteria andDatumEqualTo(String value) {
            addCriterion("DATUM =", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotEqualTo(String value) {
            addCriterion("DATUM <>", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumGreaterThan(String value) {
            addCriterion("DATUM >", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumGreaterThanOrEqualTo(String value) {
            addCriterion("DATUM >=", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLessThan(String value) {
            addCriterion("DATUM <", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLessThanOrEqualTo(String value) {
            addCriterion("DATUM <=", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumLike(String value) {
            addCriterion("DATUM like", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotLike(String value) {
            addCriterion("DATUM not like", value, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumIn(List<String> values) {
            addCriterion("DATUM in", values, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotIn(List<String> values) {
            addCriterion("DATUM not in", values, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumBetween(String value1, String value2) {
            addCriterion("DATUM between", value1, value2, "datum");
            return (Criteria) this;
        }

        public Criteria andDatumNotBetween(String value1, String value2) {
            addCriterion("DATUM not between", value1, value2, "datum");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("RECEIVER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("RECEIVER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("RECEIVER_NAME =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("RECEIVER_NAME <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("RECEIVER_NAME >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("RECEIVER_NAME <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_NAME <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("RECEIVER_NAME like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("RECEIVER_NAME not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("RECEIVER_NAME in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("RECEIVER_NAME not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_NAME not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverContactIsNull() {
            addCriterion("RECEIVER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andReceiverContactIsNotNull() {
            addCriterion("RECEIVER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverContactEqualTo(String value) {
            addCriterion("RECEIVER_CONTACT =", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactNotEqualTo(String value) {
            addCriterion("RECEIVER_CONTACT <>", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactGreaterThan(String value) {
            addCriterion("RECEIVER_CONTACT >", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_CONTACT >=", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactLessThan(String value) {
            addCriterion("RECEIVER_CONTACT <", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_CONTACT <=", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactLike(String value) {
            addCriterion("RECEIVER_CONTACT like", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactNotLike(String value) {
            addCriterion("RECEIVER_CONTACT not like", value, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactIn(List<String> values) {
            addCriterion("RECEIVER_CONTACT in", values, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactNotIn(List<String> values) {
            addCriterion("RECEIVER_CONTACT not in", values, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactBetween(String value1, String value2) {
            addCriterion("RECEIVER_CONTACT between", value1, value2, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverContactNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_CONTACT not between", value1, value2, "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("RECEIVER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("RECEIVER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("RECEIVER_ADDRESS >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("RECEIVER_ADDRESS <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ADDRESS <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("RECEIVER_ADDRESS like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("RECEIVER_ADDRESS not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("RECEIVER_ADDRESS in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("RECEIVER_ADDRESS not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("RECEIVER_ADDRESS between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ADDRESS not between", value1, value2, "receiverAddress");
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

        public Criteria andExpTextNameLikeInsensitive(String value) {
            addCriterion("upper(EXP_TEXT_NAME) like", value.toUpperCase(), "expTextName");
            return (Criteria) this;
        }

        public Criteria andExpSpellNameLikeInsensitive(String value) {
            addCriterion("upper(EXP_SPELL_NAME) like", value.toUpperCase(), "expSpellName");
            return (Criteria) this;
        }

        public Criteria andMailNoLikeInsensitive(String value) {
            addCriterion("upper(MAIL_NO) like", value.toUpperCase(), "mailNo");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andTelLikeInsensitive(String value) {
            addCriterion("upper(TEL) like", value.toUpperCase(), "tel");
            return (Criteria) this;
        }

        public Criteria andDatumLikeInsensitive(String value) {
            addCriterion("upper(DATUM) like", value.toUpperCase(), "datum");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLikeInsensitive(String value) {
            addCriterion("upper(RECEIVER_NAME) like", value.toUpperCase(), "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverContactLikeInsensitive(String value) {
            addCriterion("upper(RECEIVER_CONTACT) like", value.toUpperCase(), "receiverContact");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLikeInsensitive(String value) {
            addCriterion("upper(RECEIVER_ADDRESS) like", value.toUpperCase(), "receiverAddress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express_info
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: express_info
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