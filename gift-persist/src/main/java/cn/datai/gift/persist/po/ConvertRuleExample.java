package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvertRuleExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public ConvertRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
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
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_rule
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

        public Criteria andComodityObjRatioIsNull() {
            addCriterion("COMODITY_OBJ_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioIsNotNull() {
            addCriterion("COMODITY_OBJ_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioEqualTo(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO =", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioNotEqualTo(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO <>", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioGreaterThan(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO >", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO >=", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioLessThan(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO <", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioLessThanOrEqualTo(Integer value) {
            addCriterion("COMODITY_OBJ_RATIO <=", value, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioIn(List<Integer> values) {
            addCriterion("COMODITY_OBJ_RATIO in", values, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioNotIn(List<Integer> values) {
            addCriterion("COMODITY_OBJ_RATIO not in", values, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioBetween(Integer value1, Integer value2) {
            addCriterion("COMODITY_OBJ_RATIO between", value1, value2, "comodityObjRatio");
            return (Criteria) this;
        }

        public Criteria andComodityObjRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("COMODITY_OBJ_RATIO not between", value1, value2, "comodityObjRatio");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table convert_rule
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_rule
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