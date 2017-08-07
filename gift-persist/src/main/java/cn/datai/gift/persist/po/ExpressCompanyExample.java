package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class ExpressCompanyExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public ExpressCompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
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
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: express_company
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

        public Criteria andExpressCompanyIdIsNull() {
            addCriterion("EXPRESS_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdIsNotNull() {
            addCriterion("EXPRESS_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdEqualTo(Long value) {
            addCriterion("EXPRESS_COMPANY_ID =", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdNotEqualTo(Long value) {
            addCriterion("EXPRESS_COMPANY_ID <>", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdGreaterThan(Long value) {
            addCriterion("EXPRESS_COMPANY_ID >", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_COMPANY_ID >=", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdLessThan(Long value) {
            addCriterion("EXPRESS_COMPANY_ID <", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("EXPRESS_COMPANY_ID <=", value, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdIn(List<Long> values) {
            addCriterion("EXPRESS_COMPANY_ID in", values, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdNotIn(List<Long> values) {
            addCriterion("EXPRESS_COMPANY_ID not in", values, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_COMPANY_ID between", value1, value2, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("EXPRESS_COMPANY_ID not between", value1, value2, "expressCompanyId");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameIsNull() {
            addCriterion("COMPANY_EXP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameIsNotNull() {
            addCriterion("COMPANY_EXP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameEqualTo(String value) {
            addCriterion("COMPANY_EXP_NAME =", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameNotEqualTo(String value) {
            addCriterion("COMPANY_EXP_NAME <>", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameGreaterThan(String value) {
            addCriterion("COMPANY_EXP_NAME >", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_EXP_NAME >=", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameLessThan(String value) {
            addCriterion("COMPANY_EXP_NAME <", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_EXP_NAME <=", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameLike(String value) {
            addCriterion("COMPANY_EXP_NAME like", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameNotLike(String value) {
            addCriterion("COMPANY_EXP_NAME not like", value, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameIn(List<String> values) {
            addCriterion("COMPANY_EXP_NAME in", values, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameNotIn(List<String> values) {
            addCriterion("COMPANY_EXP_NAME not in", values, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameBetween(String value1, String value2) {
            addCriterion("COMPANY_EXP_NAME between", value1, value2, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_EXP_NAME not between", value1, value2, "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameIsNull() {
            addCriterion("COMPANY_SIMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameIsNotNull() {
            addCriterion("COMPANY_SIMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameEqualTo(String value) {
            addCriterion("COMPANY_SIMPLE_NAME =", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameNotEqualTo(String value) {
            addCriterion("COMPANY_SIMPLE_NAME <>", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameGreaterThan(String value) {
            addCriterion("COMPANY_SIMPLE_NAME >", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_SIMPLE_NAME >=", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameLessThan(String value) {
            addCriterion("COMPANY_SIMPLE_NAME <", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_SIMPLE_NAME <=", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameLike(String value) {
            addCriterion("COMPANY_SIMPLE_NAME like", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameNotLike(String value) {
            addCriterion("COMPANY_SIMPLE_NAME not like", value, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameIn(List<String> values) {
            addCriterion("COMPANY_SIMPLE_NAME in", values, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameNotIn(List<String> values) {
            addCriterion("COMPANY_SIMPLE_NAME not in", values, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameBetween(String value1, String value2) {
            addCriterion("COMPANY_SIMPLE_NAME between", value1, value2, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_SIMPLE_NAME not between", value1, value2, "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("IMGURL is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("IMGURL is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("IMGURL =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("IMGURL <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("IMGURL >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("IMGURL <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("IMGURL <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("IMGURL like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("IMGURL not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("IMGURL in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("IMGURL not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("IMGURL between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("IMGURL not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andRandomseqIsNull() {
            addCriterion("RANDOMSEQ is null");
            return (Criteria) this;
        }

        public Criteria andRandomseqIsNotNull() {
            addCriterion("RANDOMSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRandomseqEqualTo(Integer value) {
            addCriterion("RANDOMSEQ =", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqNotEqualTo(Integer value) {
            addCriterion("RANDOMSEQ <>", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqGreaterThan(Integer value) {
            addCriterion("RANDOMSEQ >", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("RANDOMSEQ >=", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqLessThan(Integer value) {
            addCriterion("RANDOMSEQ <", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqLessThanOrEqualTo(Integer value) {
            addCriterion("RANDOMSEQ <=", value, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqIn(List<Integer> values) {
            addCriterion("RANDOMSEQ in", values, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqNotIn(List<Integer> values) {
            addCriterion("RANDOMSEQ not in", values, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqBetween(Integer value1, Integer value2) {
            addCriterion("RANDOMSEQ between", value1, value2, "randomseq");
            return (Criteria) this;
        }

        public Criteria andRandomseqNotBetween(Integer value1, Integer value2) {
            addCriterion("RANDOMSEQ not between", value1, value2, "randomseq");
            return (Criteria) this;
        }

        public Criteria andCompanyExpNameLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_EXP_NAME) like", value.toUpperCase(), "companyExpName");
            return (Criteria) this;
        }

        public Criteria andCompanySimpleNameLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_SIMPLE_NAME) like", value.toUpperCase(), "companySimpleName");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(PHONE) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andImgurlLikeInsensitive(String value) {
            addCriterion("upper(IMGURL) like", value.toUpperCase(), "imgurl");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(URL) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andNoteLikeInsensitive(String value) {
            addCriterion("upper(NOTE) like", value.toUpperCase(), "note");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express_company
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: express_company
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