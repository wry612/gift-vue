package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityPriceHistoryExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public CommodityPriceHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
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
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_price_history
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

        public Criteria andCommodityPriceHistoryIdIsNull() {
            addCriterion("COMMODITY_PRICE_HISTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdIsNotNull() {
            addCriterion("COMMODITY_PRICE_HISTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdEqualTo(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID =", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID <>", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdGreaterThan(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID >", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID >=", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdLessThan(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID <", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID <=", value, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdIn(List<Long> values) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID in", values, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID not in", values, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID between", value1, value2, "commodityPriceHistoryId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceHistoryIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_PRICE_HISTORY_ID not between", value1, value2, "commodityPriceHistoryId");
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

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Long value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Long value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Long value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Long value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Long> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Long> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Long value1, Long value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNull() {
            addCriterion("STANDARD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNotNull() {
            addCriterion("STANDARD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceEqualTo(Long value) {
            addCriterion("STANDARD_PRICE =", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualTo(Long value) {
            addCriterion("STANDARD_PRICE <>", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThan(Long value) {
            addCriterion("STANDARD_PRICE >", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("STANDARD_PRICE >=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThan(Long value) {
            addCriterion("STANDARD_PRICE <", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualTo(Long value) {
            addCriterion("STANDARD_PRICE <=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIn(List<Long> values) {
            addCriterion("STANDARD_PRICE in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotIn(List<Long> values) {
            addCriterion("STANDARD_PRICE not in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceBetween(Long value1, Long value2) {
            addCriterion("STANDARD_PRICE between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotBetween(Long value1, Long value2) {
            addCriterion("STANDARD_PRICE not between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_price_history
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_price_history
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