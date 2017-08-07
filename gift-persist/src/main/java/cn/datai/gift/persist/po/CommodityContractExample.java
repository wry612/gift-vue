package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityContractExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public CommodityContractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
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
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_contract
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

        public Criteria andOperatorInfoIdIsNull() {
            addCriterion("OPERATOR_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdIsNotNull() {
            addCriterion("OPERATOR_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID =", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID <>", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdGreaterThan(Long value) {
            addCriterion("OPERATOR_INFO_ID >", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID >=", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdLessThan(Long value) {
            addCriterion("OPERATOR_INFO_ID <", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_INFO_ID <=", value, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdIn(List<Long> values) {
            addCriterion("OPERATOR_INFO_ID in", values, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_INFO_ID not in", values, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_INFO_ID between", value1, value2, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andOperatorInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_INFO_ID not between", value1, value2, "operatorInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("COMMODITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("COMMODITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(Long value) {
            addCriterion("COMMODITY_TYPE_ID >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(Long value) {
            addCriterion("COMMODITY_TYPE_ID <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_TYPE_ID <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<Long> values) {
            addCriterion("COMMODITY_TYPE_ID in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_TYPE_ID not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TYPE_ID between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_TYPE_ID not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNull() {
            addCriterion("COMMODITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNotNull() {
            addCriterion("COMMODITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeEqualTo(String value) {
            addCriterion("COMMODITY_CODE =", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotEqualTo(String value) {
            addCriterion("COMMODITY_CODE <>", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThan(String value) {
            addCriterion("COMMODITY_CODE >", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_CODE >=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThan(String value) {
            addCriterion("COMMODITY_CODE <", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_CODE <=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLike(String value) {
            addCriterion("COMMODITY_CODE like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotLike(String value) {
            addCriterion("COMMODITY_CODE not like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIn(List<String> values) {
            addCriterion("COMMODITY_CODE in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotIn(List<String> values) {
            addCriterion("COMMODITY_CODE not in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeBetween(String value1, String value2) {
            addCriterion("COMMODITY_CODE between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_CODE not between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterIsNull() {
            addCriterion("SUBJECT_MATTER is null");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterIsNotNull() {
            addCriterion("SUBJECT_MATTER is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterEqualTo(String value) {
            addCriterion("SUBJECT_MATTER =", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterNotEqualTo(String value) {
            addCriterion("SUBJECT_MATTER <>", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterGreaterThan(String value) {
            addCriterion("SUBJECT_MATTER >", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_MATTER >=", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterLessThan(String value) {
            addCriterion("SUBJECT_MATTER <", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_MATTER <=", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterLike(String value) {
            addCriterion("SUBJECT_MATTER like", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterNotLike(String value) {
            addCriterion("SUBJECT_MATTER not like", value, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterIn(List<String> values) {
            addCriterion("SUBJECT_MATTER in", values, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterNotIn(List<String> values) {
            addCriterion("SUBJECT_MATTER not in", values, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterBetween(String value1, String value2) {
            addCriterion("SUBJECT_MATTER between", value1, value2, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_MATTER not between", value1, value2, "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("COMMODITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("COMMODITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("COMMODITY_NAME =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("COMMODITY_NAME <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("COMMODITY_NAME >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("COMMODITY_NAME <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("COMMODITY_NAME like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("COMMODITY_NAME not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("COMMODITY_NAME in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("COMMODITY_NAME not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitEnIsNull() {
            addCriterion("UNIT_EN is null");
            return (Criteria) this;
        }

        public Criteria andUnitEnIsNotNull() {
            addCriterion("UNIT_EN is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEnEqualTo(String value) {
            addCriterion("UNIT_EN =", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnNotEqualTo(String value) {
            addCriterion("UNIT_EN <>", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnGreaterThan(String value) {
            addCriterion("UNIT_EN >", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_EN >=", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnLessThan(String value) {
            addCriterion("UNIT_EN <", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnLessThanOrEqualTo(String value) {
            addCriterion("UNIT_EN <=", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnLike(String value) {
            addCriterion("UNIT_EN like", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnNotLike(String value) {
            addCriterion("UNIT_EN not like", value, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnIn(List<String> values) {
            addCriterion("UNIT_EN in", values, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnNotIn(List<String> values) {
            addCriterion("UNIT_EN not in", values, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnBetween(String value1, String value2) {
            addCriterion("UNIT_EN between", value1, value2, "unitEn");
            return (Criteria) this;
        }

        public Criteria andUnitEnNotBetween(String value1, String value2) {
            addCriterion("UNIT_EN not between", value1, value2, "unitEn");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameIsNull() {
            addCriterion("STANDARD_UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameIsNotNull() {
            addCriterion("STANDARD_UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameEqualTo(String value) {
            addCriterion("STANDARD_UNIT_NAME =", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameNotEqualTo(String value) {
            addCriterion("STANDARD_UNIT_NAME <>", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameGreaterThan(String value) {
            addCriterion("STANDARD_UNIT_NAME >", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD_UNIT_NAME >=", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameLessThan(String value) {
            addCriterion("STANDARD_UNIT_NAME <", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameLessThanOrEqualTo(String value) {
            addCriterion("STANDARD_UNIT_NAME <=", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameLike(String value) {
            addCriterion("STANDARD_UNIT_NAME like", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameNotLike(String value) {
            addCriterion("STANDARD_UNIT_NAME not like", value, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameIn(List<String> values) {
            addCriterion("STANDARD_UNIT_NAME in", values, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameNotIn(List<String> values) {
            addCriterion("STANDARD_UNIT_NAME not in", values, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameBetween(String value1, String value2) {
            addCriterion("STANDARD_UNIT_NAME between", value1, value2, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameNotBetween(String value1, String value2) {
            addCriterion("STANDARD_UNIT_NAME not between", value1, value2, "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleIsNull() {
            addCriterion("STANDARD_UNIT_MULTIPLE is null");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleIsNotNull() {
            addCriterion("STANDARD_UNIT_MULTIPLE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleEqualTo(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE =", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleNotEqualTo(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE <>", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleGreaterThan(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE >", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE >=", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleLessThan(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE <", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_UNIT_MULTIPLE <=", value, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleIn(List<BigDecimal> values) {
            addCriterion("STANDARD_UNIT_MULTIPLE in", values, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleNotIn(List<BigDecimal> values) {
            addCriterion("STANDARD_UNIT_MULTIPLE not in", values, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_UNIT_MULTIPLE between", value1, value2, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andStandardUnitMultipleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_UNIT_MULTIPLE not between", value1, value2, "standardUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleIsNull() {
            addCriterion("TRADE_UNIT_MULTIPLE is null");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleIsNotNull() {
            addCriterion("TRADE_UNIT_MULTIPLE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE =", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE <>", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleGreaterThan(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE >", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE >=", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleLessThan(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE <", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_UNIT_MULTIPLE <=", value, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleIn(List<BigDecimal> values) {
            addCriterion("TRADE_UNIT_MULTIPLE in", values, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_UNIT_MULTIPLE not in", values, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_UNIT_MULTIPLE between", value1, value2, "tradeUnitMultiple");
            return (Criteria) this;
        }

        public Criteria andTradeUnitMultipleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_UNIT_MULTIPLE not between", value1, value2, "tradeUnitMultiple");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("EXPIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("EXPIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("EXPIRE_TIME =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("EXPIRE_TIME >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("EXPIRE_TIME <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_TIME <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("EXPIRE_TIME in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("EXPIRE_TIME not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_TIME not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_CODE) like", value.toUpperCase(), "commodityCode");
            return (Criteria) this;
        }

        public Criteria andSubjectMatterLikeInsensitive(String value) {
            addCriterion("upper(SUBJECT_MATTER) like", value.toUpperCase(), "subjectMatter");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_NAME) like", value.toUpperCase(), "commodityName");
            return (Criteria) this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(UNIT) like", value.toUpperCase(), "unit");
            return (Criteria) this;
        }

        public Criteria andUnitEnLikeInsensitive(String value) {
            addCriterion("upper(UNIT_EN) like", value.toUpperCase(), "unitEn");
            return (Criteria) this;
        }

        public Criteria andStandardUnitNameLikeInsensitive(String value) {
            addCriterion("upper(STANDARD_UNIT_NAME) like", value.toUpperCase(), "standardUnitName");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_contract
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_contract
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