package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvertObjExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public ConvertObjExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
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
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj
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

        public Criteria andTransferToUserIdIsNull() {
            addCriterion("TRANSFER_TO_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdIsNotNull() {
            addCriterion("TRANSFER_TO_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdEqualTo(Long value) {
            addCriterion("TRANSFER_TO_USER_ID =", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdNotEqualTo(Long value) {
            addCriterion("TRANSFER_TO_USER_ID <>", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdGreaterThan(Long value) {
            addCriterion("TRANSFER_TO_USER_ID >", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSFER_TO_USER_ID >=", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdLessThan(Long value) {
            addCriterion("TRANSFER_TO_USER_ID <", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdLessThanOrEqualTo(Long value) {
            addCriterion("TRANSFER_TO_USER_ID <=", value, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdIn(List<Long> values) {
            addCriterion("TRANSFER_TO_USER_ID in", values, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdNotIn(List<Long> values) {
            addCriterion("TRANSFER_TO_USER_ID not in", values, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdBetween(Long value1, Long value2) {
            addCriterion("TRANSFER_TO_USER_ID between", value1, value2, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andTransferToUserIdNotBetween(Long value1, Long value2) {
            addCriterion("TRANSFER_TO_USER_ID not between", value1, value2, "transferToUserId");
            return (Criteria) this;
        }

        public Criteria andLiteNameIsNull() {
            addCriterion("LITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLiteNameIsNotNull() {
            addCriterion("LITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLiteNameEqualTo(String value) {
            addCriterion("LITE_NAME =", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameNotEqualTo(String value) {
            addCriterion("LITE_NAME <>", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameGreaterThan(String value) {
            addCriterion("LITE_NAME >", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("LITE_NAME >=", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameLessThan(String value) {
            addCriterion("LITE_NAME <", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameLessThanOrEqualTo(String value) {
            addCriterion("LITE_NAME <=", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameLike(String value) {
            addCriterion("LITE_NAME like", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameNotLike(String value) {
            addCriterion("LITE_NAME not like", value, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameIn(List<String> values) {
            addCriterion("LITE_NAME in", values, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameNotIn(List<String> values) {
            addCriterion("LITE_NAME not in", values, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameBetween(String value1, String value2) {
            addCriterion("LITE_NAME between", value1, value2, "liteName");
            return (Criteria) this;
        }

        public Criteria andLiteNameNotBetween(String value1, String value2) {
            addCriterion("LITE_NAME not between", value1, value2, "liteName");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualIsNull() {
            addCriterion("VRTUAL_OR_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualIsNotNull() {
            addCriterion("VRTUAL_OR_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualEqualTo(String value) {
            addCriterion("VRTUAL_OR_ACTUAL =", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualNotEqualTo(String value) {
            addCriterion("VRTUAL_OR_ACTUAL <>", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualGreaterThan(String value) {
            addCriterion("VRTUAL_OR_ACTUAL >", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualGreaterThanOrEqualTo(String value) {
            addCriterion("VRTUAL_OR_ACTUAL >=", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualLessThan(String value) {
            addCriterion("VRTUAL_OR_ACTUAL <", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualLessThanOrEqualTo(String value) {
            addCriterion("VRTUAL_OR_ACTUAL <=", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualLike(String value) {
            addCriterion("VRTUAL_OR_ACTUAL like", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualNotLike(String value) {
            addCriterion("VRTUAL_OR_ACTUAL not like", value, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualIn(List<String> values) {
            addCriterion("VRTUAL_OR_ACTUAL in", values, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualNotIn(List<String> values) {
            addCriterion("VRTUAL_OR_ACTUAL not in", values, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualBetween(String value1, String value2) {
            addCriterion("VRTUAL_OR_ACTUAL between", value1, value2, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualNotBetween(String value1, String value2) {
            addCriterion("VRTUAL_OR_ACTUAL not between", value1, value2, "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("UNIT_NAME =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("UNIT_NAME <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("UNIT_NAME >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("UNIT_NAME <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("UNIT_NAME <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("UNIT_NAME like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("UNIT_NAME not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("UNIT_NAME in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("UNIT_NAME not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("UNIT_NAME between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("UNIT_NAME not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("RULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("RULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("RULE_TYPE =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("RULE_TYPE <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("RULE_TYPE >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_TYPE >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("RULE_TYPE <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("RULE_TYPE <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("RULE_TYPE like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("RULE_TYPE not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("RULE_TYPE in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("RULE_TYPE not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("RULE_TYPE between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("RULE_TYPE not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("MARKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("MARKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Integer value) {
            addCriterion("MARKET_PRICE =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Integer value) {
            addCriterion("MARKET_PRICE <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Integer value) {
            addCriterion("MARKET_PRICE >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("MARKET_PRICE >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Integer value) {
            addCriterion("MARKET_PRICE <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("MARKET_PRICE <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Integer> values) {
            addCriterion("MARKET_PRICE in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Integer> values) {
            addCriterion("MARKET_PRICE not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
            addCriterion("MARKET_PRICE between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("MARKET_PRICE not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityIsNull() {
            addCriterion("TOTAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityIsNotNull() {
            addCriterion("TOTAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityEqualTo(Integer value) {
            addCriterion("TOTAL_QUANTITY =", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityNotEqualTo(Integer value) {
            addCriterion("TOTAL_QUANTITY <>", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityGreaterThan(Integer value) {
            addCriterion("TOTAL_QUANTITY >", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_QUANTITY >=", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityLessThan(Integer value) {
            addCriterion("TOTAL_QUANTITY <", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_QUANTITY <=", value, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityIn(List<Integer> values) {
            addCriterion("TOTAL_QUANTITY in", values, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityNotIn(List<Integer> values) {
            addCriterion("TOTAL_QUANTITY not in", values, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_QUANTITY between", value1, value2, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_QUANTITY not between", value1, value2, "totalQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIsNull() {
            addCriterion("AVAILABLE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIsNotNull() {
            addCriterion("AVAILABLE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityEqualTo(Integer value) {
            addCriterion("AVAILABLE_QUANTITY =", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotEqualTo(Integer value) {
            addCriterion("AVAILABLE_QUANTITY <>", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityGreaterThan(Integer value) {
            addCriterion("AVAILABLE_QUANTITY >", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("AVAILABLE_QUANTITY >=", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityLessThan(Integer value) {
            addCriterion("AVAILABLE_QUANTITY <", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("AVAILABLE_QUANTITY <=", value, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityIn(List<Integer> values) {
            addCriterion("AVAILABLE_QUANTITY in", values, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotIn(List<Integer> values) {
            addCriterion("AVAILABLE_QUANTITY not in", values, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityBetween(Integer value1, Integer value2) {
            addCriterion("AVAILABLE_QUANTITY between", value1, value2, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andAvailableQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("AVAILABLE_QUANTITY not between", value1, value2, "availableQuantity");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andHeadImgsIsNull() {
            addCriterion("HEAD_IMGS is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgsIsNotNull() {
            addCriterion("HEAD_IMGS is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgsEqualTo(String value) {
            addCriterion("HEAD_IMGS =", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsNotEqualTo(String value) {
            addCriterion("HEAD_IMGS <>", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsGreaterThan(String value) {
            addCriterion("HEAD_IMGS >", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_IMGS >=", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsLessThan(String value) {
            addCriterion("HEAD_IMGS <", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsLessThanOrEqualTo(String value) {
            addCriterion("HEAD_IMGS <=", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsLike(String value) {
            addCriterion("HEAD_IMGS like", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsNotLike(String value) {
            addCriterion("HEAD_IMGS not like", value, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsIn(List<String> values) {
            addCriterion("HEAD_IMGS in", values, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsNotIn(List<String> values) {
            addCriterion("HEAD_IMGS not in", values, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsBetween(String value1, String value2) {
            addCriterion("HEAD_IMGS between", value1, value2, "headImgs");
            return (Criteria) this;
        }

        public Criteria andHeadImgsNotBetween(String value1, String value2) {
            addCriterion("HEAD_IMGS not between", value1, value2, "headImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsIsNull() {
            addCriterion("INTRODUCE_IMGS is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsIsNotNull() {
            addCriterion("INTRODUCE_IMGS is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsEqualTo(String value) {
            addCriterion("INTRODUCE_IMGS =", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsNotEqualTo(String value) {
            addCriterion("INTRODUCE_IMGS <>", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsGreaterThan(String value) {
            addCriterion("INTRODUCE_IMGS >", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCE_IMGS >=", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsLessThan(String value) {
            addCriterion("INTRODUCE_IMGS <", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCE_IMGS <=", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsLike(String value) {
            addCriterion("INTRODUCE_IMGS like", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsNotLike(String value) {
            addCriterion("INTRODUCE_IMGS not like", value, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsIn(List<String> values) {
            addCriterion("INTRODUCE_IMGS in", values, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsNotIn(List<String> values) {
            addCriterion("INTRODUCE_IMGS not in", values, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsBetween(String value1, String value2) {
            addCriterion("INTRODUCE_IMGS between", value1, value2, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsNotBetween(String value1, String value2) {
            addCriterion("INTRODUCE_IMGS not between", value1, value2, "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesIsNull() {
            addCriterion("OTHER_PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesIsNotNull() {
            addCriterion("OTHER_PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesEqualTo(String value) {
            addCriterion("OTHER_PROPERTIES =", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesNotEqualTo(String value) {
            addCriterion("OTHER_PROPERTIES <>", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesGreaterThan(String value) {
            addCriterion("OTHER_PROPERTIES >", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_PROPERTIES >=", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesLessThan(String value) {
            addCriterion("OTHER_PROPERTIES <", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesLessThanOrEqualTo(String value) {
            addCriterion("OTHER_PROPERTIES <=", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesLike(String value) {
            addCriterion("OTHER_PROPERTIES like", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesNotLike(String value) {
            addCriterion("OTHER_PROPERTIES not like", value, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesIn(List<String> values) {
            addCriterion("OTHER_PROPERTIES in", values, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesNotIn(List<String> values) {
            addCriterion("OTHER_PROPERTIES not in", values, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesBetween(String value1, String value2) {
            addCriterion("OTHER_PROPERTIES between", value1, value2, "otherProperties");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesNotBetween(String value1, String value2) {
            addCriterion("OTHER_PROPERTIES not between", value1, value2, "otherProperties");
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

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("VALID like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("VALID not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andDrawedIsNull() {
            addCriterion("DRAWED is null");
            return (Criteria) this;
        }

        public Criteria andDrawedIsNotNull() {
            addCriterion("DRAWED is not null");
            return (Criteria) this;
        }

        public Criteria andDrawedEqualTo(String value) {
            addCriterion("DRAWED =", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedNotEqualTo(String value) {
            addCriterion("DRAWED <>", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedGreaterThan(String value) {
            addCriterion("DRAWED >", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWED >=", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedLessThan(String value) {
            addCriterion("DRAWED <", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedLessThanOrEqualTo(String value) {
            addCriterion("DRAWED <=", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedLike(String value) {
            addCriterion("DRAWED like", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedNotLike(String value) {
            addCriterion("DRAWED not like", value, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedIn(List<String> values) {
            addCriterion("DRAWED in", values, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedNotIn(List<String> values) {
            addCriterion("DRAWED not in", values, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedBetween(String value1, String value2) {
            addCriterion("DRAWED between", value1, value2, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawedNotBetween(String value1, String value2) {
            addCriterion("DRAWED not between", value1, value2, "drawed");
            return (Criteria) this;
        }

        public Criteria andDrawTimeIsNull() {
            addCriterion("DRAW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDrawTimeIsNotNull() {
            addCriterion("DRAW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDrawTimeEqualTo(Date value) {
            addCriterion("DRAW_TIME =", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotEqualTo(Date value) {
            addCriterion("DRAW_TIME <>", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThan(Date value) {
            addCriterion("DRAW_TIME >", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DRAW_TIME >=", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThan(Date value) {
            addCriterion("DRAW_TIME <", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThanOrEqualTo(Date value) {
            addCriterion("DRAW_TIME <=", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeIn(List<Date> values) {
            addCriterion("DRAW_TIME in", values, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotIn(List<Date> values) {
            addCriterion("DRAW_TIME not in", values, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeBetween(Date value1, Date value2) {
            addCriterion("DRAW_TIME between", value1, value2, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotBetween(Date value1, Date value2) {
            addCriterion("DRAW_TIME not between", value1, value2, "drawTime");
            return (Criteria) this;
        }

        public Criteria andSignQuantityIsNull() {
            addCriterion("SIGN_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityIsNotNull() {
            addCriterion("SIGN_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY =", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityNotEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY <>", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityGreaterThan(Integer value) {
            addCriterion("SIGN_QUANTITY >", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY >=", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityLessThan(Integer value) {
            addCriterion("SIGN_QUANTITY <", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY <=", value, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY in", values, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityNotIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY not in", values, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY between", value1, value2, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andSignQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY not between", value1, value2, "signQuantity");
            return (Criteria) this;
        }

        public Criteria andOpSeqIsNull() {
            addCriterion("OP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andOpSeqIsNotNull() {
            addCriterion("OP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andOpSeqEqualTo(Long value) {
            addCriterion("OP_SEQ =", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotEqualTo(Long value) {
            addCriterion("OP_SEQ <>", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqGreaterThan(Long value) {
            addCriterion("OP_SEQ >", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("OP_SEQ >=", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqLessThan(Long value) {
            addCriterion("OP_SEQ <", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqLessThanOrEqualTo(Long value) {
            addCriterion("OP_SEQ <=", value, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqIn(List<Long> values) {
            addCriterion("OP_SEQ in", values, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotIn(List<Long> values) {
            addCriterion("OP_SEQ not in", values, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqBetween(Long value1, Long value2) {
            addCriterion("OP_SEQ between", value1, value2, "opSeq");
            return (Criteria) this;
        }

        public Criteria andOpSeqNotBetween(Long value1, Long value2) {
            addCriterion("OP_SEQ not between", value1, value2, "opSeq");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinIsNull() {
            addCriterion("SIGN_QUANTITY_MIN is null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinIsNotNull() {
            addCriterion("SIGN_QUANTITY_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN =", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinNotEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN <>", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinGreaterThan(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN >", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN >=", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinLessThan(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN <", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MIN <=", value, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY_MIN in", values, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinNotIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY_MIN not in", values, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY_MIN between", value1, value2, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMinNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY_MIN not between", value1, value2, "signQuantityMin");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxIsNull() {
            addCriterion("SIGN_QUANTITY_MAX is null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxIsNotNull() {
            addCriterion("SIGN_QUANTITY_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX =", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxNotEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX <>", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxGreaterThan(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX >", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX >=", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxLessThan(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX <", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_QUANTITY_MAX <=", value, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY_MAX in", values, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxNotIn(List<Integer> values) {
            addCriterion("SIGN_QUANTITY_MAX not in", values, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY_MAX between", value1, value2, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andSignQuantityMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_QUANTITY_MAX not between", value1, value2, "signQuantityMax");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIsNull() {
            addCriterion("multi_obj_detail is null");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIsNotNull() {
            addCriterion("multi_obj_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailEqualTo(String value) {
            addCriterion("multi_obj_detail =", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotEqualTo(String value) {
            addCriterion("multi_obj_detail <>", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailGreaterThan(String value) {
            addCriterion("multi_obj_detail >", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailGreaterThanOrEqualTo(String value) {
            addCriterion("multi_obj_detail >=", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLessThan(String value) {
            addCriterion("multi_obj_detail <", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLessThanOrEqualTo(String value) {
            addCriterion("multi_obj_detail <=", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLike(String value) {
            addCriterion("multi_obj_detail like", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotLike(String value) {
            addCriterion("multi_obj_detail not like", value, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailIn(List<String> values) {
            addCriterion("multi_obj_detail in", values, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotIn(List<String> values) {
            addCriterion("multi_obj_detail not in", values, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailBetween(String value1, String value2) {
            addCriterion("multi_obj_detail between", value1, value2, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailNotBetween(String value1, String value2) {
            addCriterion("multi_obj_detail not between", value1, value2, "multiObjDetail");
            return (Criteria) this;
        }

        public Criteria andLiteNameLikeInsensitive(String value) {
            addCriterion("upper(LITE_NAME) like", value.toUpperCase(), "liteName");
            return (Criteria) this;
        }

        public Criteria andFullNameLikeInsensitive(String value) {
            addCriterion("upper(FULL_NAME) like", value.toUpperCase(), "fullName");
            return (Criteria) this;
        }

        public Criteria andVrtualOrActualLikeInsensitive(String value) {
            addCriterion("upper(VRTUAL_OR_ACTUAL) like", value.toUpperCase(), "vrtualOrActual");
            return (Criteria) this;
        }

        public Criteria andUnitNameLikeInsensitive(String value) {
            addCriterion("upper(UNIT_NAME) like", value.toUpperCase(), "unitName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLikeInsensitive(String value) {
            addCriterion("upper(RULE_TYPE) like", value.toUpperCase(), "ruleType");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andIconLikeInsensitive(String value) {
            addCriterion("upper(ICON) like", value.toUpperCase(), "icon");
            return (Criteria) this;
        }

        public Criteria andHeadImgsLikeInsensitive(String value) {
            addCriterion("upper(HEAD_IMGS) like", value.toUpperCase(), "headImgs");
            return (Criteria) this;
        }

        public Criteria andIntroduceImgsLikeInsensitive(String value) {
            addCriterion("upper(INTRODUCE_IMGS) like", value.toUpperCase(), "introduceImgs");
            return (Criteria) this;
        }

        public Criteria andOtherPropertiesLikeInsensitive(String value) {
            addCriterion("upper(OTHER_PROPERTIES) like", value.toUpperCase(), "otherProperties");
            return (Criteria) this;
        }

        public Criteria andValidLikeInsensitive(String value) {
            addCriterion("upper(VALID) like", value.toUpperCase(), "valid");
            return (Criteria) this;
        }

        public Criteria andDrawedLikeInsensitive(String value) {
            addCriterion("upper(DRAWED) like", value.toUpperCase(), "drawed");
            return (Criteria) this;
        }

        public Criteria andMultiObjDetailLikeInsensitive(String value) {
            addCriterion("upper(multi_obj_detail) like", value.toUpperCase(), "multiObjDetail");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table convert_obj
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: convert_obj
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