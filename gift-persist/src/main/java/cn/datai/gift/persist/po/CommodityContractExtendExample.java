package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.List;

public class CommodityContractExtendExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public CommodityContractExtendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
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
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_contract_extend
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

        public Criteria andPackTypeIsNull() {
            addCriterion("PACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPackTypeIsNotNull() {
            addCriterion("PACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPackTypeEqualTo(String value) {
            addCriterion("PACK_TYPE =", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotEqualTo(String value) {
            addCriterion("PACK_TYPE <>", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThan(String value) {
            addCriterion("PACK_TYPE >", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_TYPE >=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThan(String value) {
            addCriterion("PACK_TYPE <", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThanOrEqualTo(String value) {
            addCriterion("PACK_TYPE <=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLike(String value) {
            addCriterion("PACK_TYPE like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotLike(String value) {
            addCriterion("PACK_TYPE not like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeIn(List<String> values) {
            addCriterion("PACK_TYPE in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotIn(List<String> values) {
            addCriterion("PACK_TYPE not in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeBetween(String value1, String value2) {
            addCriterion("PACK_TYPE between", value1, value2, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotBetween(String value1, String value2) {
            addCriterion("PACK_TYPE not between", value1, value2, "packType");
            return (Criteria) this;
        }

        public Criteria andPackSizeIsNull() {
            addCriterion("PACK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPackSizeIsNotNull() {
            addCriterion("PACK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPackSizeEqualTo(String value) {
            addCriterion("PACK_SIZE =", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotEqualTo(String value) {
            addCriterion("PACK_SIZE <>", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeGreaterThan(String value) {
            addCriterion("PACK_SIZE >", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_SIZE >=", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLessThan(String value) {
            addCriterion("PACK_SIZE <", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLessThanOrEqualTo(String value) {
            addCriterion("PACK_SIZE <=", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeLike(String value) {
            addCriterion("PACK_SIZE like", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotLike(String value) {
            addCriterion("PACK_SIZE not like", value, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeIn(List<String> values) {
            addCriterion("PACK_SIZE in", values, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotIn(List<String> values) {
            addCriterion("PACK_SIZE not in", values, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeBetween(String value1, String value2) {
            addCriterion("PACK_SIZE between", value1, value2, "packSize");
            return (Criteria) this;
        }

        public Criteria andPackSizeNotBetween(String value1, String value2) {
            addCriterion("PACK_SIZE not between", value1, value2, "packSize");
            return (Criteria) this;
        }

        public Criteria andIntroBriefIsNull() {
            addCriterion("INTRO_BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andIntroBriefIsNotNull() {
            addCriterion("INTRO_BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andIntroBriefEqualTo(String value) {
            addCriterion("INTRO_BRIEF =", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefNotEqualTo(String value) {
            addCriterion("INTRO_BRIEF <>", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefGreaterThan(String value) {
            addCriterion("INTRO_BRIEF >", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO_BRIEF >=", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefLessThan(String value) {
            addCriterion("INTRO_BRIEF <", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefLessThanOrEqualTo(String value) {
            addCriterion("INTRO_BRIEF <=", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefLike(String value) {
            addCriterion("INTRO_BRIEF like", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefNotLike(String value) {
            addCriterion("INTRO_BRIEF not like", value, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefIn(List<String> values) {
            addCriterion("INTRO_BRIEF in", values, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefNotIn(List<String> values) {
            addCriterion("INTRO_BRIEF not in", values, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefBetween(String value1, String value2) {
            addCriterion("INTRO_BRIEF between", value1, value2, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroBriefNotBetween(String value1, String value2) {
            addCriterion("INTRO_BRIEF not between", value1, value2, "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharIsNull() {
            addCriterion("INTRO_DETAIL_CHAR is null");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharIsNotNull() {
            addCriterion("INTRO_DETAIL_CHAR is not null");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharEqualTo(String value) {
            addCriterion("INTRO_DETAIL_CHAR =", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharNotEqualTo(String value) {
            addCriterion("INTRO_DETAIL_CHAR <>", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharGreaterThan(String value) {
            addCriterion("INTRO_DETAIL_CHAR >", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO_DETAIL_CHAR >=", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharLessThan(String value) {
            addCriterion("INTRO_DETAIL_CHAR <", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharLessThanOrEqualTo(String value) {
            addCriterion("INTRO_DETAIL_CHAR <=", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharLike(String value) {
            addCriterion("INTRO_DETAIL_CHAR like", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharNotLike(String value) {
            addCriterion("INTRO_DETAIL_CHAR not like", value, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharIn(List<String> values) {
            addCriterion("INTRO_DETAIL_CHAR in", values, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharNotIn(List<String> values) {
            addCriterion("INTRO_DETAIL_CHAR not in", values, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharBetween(String value1, String value2) {
            addCriterion("INTRO_DETAIL_CHAR between", value1, value2, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharNotBetween(String value1, String value2) {
            addCriterion("INTRO_DETAIL_CHAR not between", value1, value2, "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkIsNull() {
            addCriterion("INTRO_DETAIL_LINK is null");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkIsNotNull() {
            addCriterion("INTRO_DETAIL_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkEqualTo(String value) {
            addCriterion("INTRO_DETAIL_LINK =", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkNotEqualTo(String value) {
            addCriterion("INTRO_DETAIL_LINK <>", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkGreaterThan(String value) {
            addCriterion("INTRO_DETAIL_LINK >", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkGreaterThanOrEqualTo(String value) {
            addCriterion("INTRO_DETAIL_LINK >=", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkLessThan(String value) {
            addCriterion("INTRO_DETAIL_LINK <", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkLessThanOrEqualTo(String value) {
            addCriterion("INTRO_DETAIL_LINK <=", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkLike(String value) {
            addCriterion("INTRO_DETAIL_LINK like", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkNotLike(String value) {
            addCriterion("INTRO_DETAIL_LINK not like", value, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkIn(List<String> values) {
            addCriterion("INTRO_DETAIL_LINK in", values, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkNotIn(List<String> values) {
            addCriterion("INTRO_DETAIL_LINK not in", values, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkBetween(String value1, String value2) {
            addCriterion("INTRO_DETAIL_LINK between", value1, value2, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkNotBetween(String value1, String value2) {
            addCriterion("INTRO_DETAIL_LINK not between", value1, value2, "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("ICON_URL is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("ICON_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("ICON_URL =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("ICON_URL <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("ICON_URL >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_URL >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("ICON_URL <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("ICON_URL <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("ICON_URL like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("ICON_URL not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("ICON_URL in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("ICON_URL not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("ICON_URL between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("ICON_URL not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNull() {
            addCriterion("PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNotNull() {
            addCriterion("PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesEqualTo(String value) {
            addCriterion("PROPERTIES =", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotEqualTo(String value) {
            addCriterion("PROPERTIES <>", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThan(String value) {
            addCriterion("PROPERTIES >", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTIES >=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThan(String value) {
            addCriterion("PROPERTIES <", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThanOrEqualTo(String value) {
            addCriterion("PROPERTIES <=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLike(String value) {
            addCriterion("PROPERTIES like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotLike(String value) {
            addCriterion("PROPERTIES not like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesIn(List<String> values) {
            addCriterion("PROPERTIES in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotIn(List<String> values) {
            addCriterion("PROPERTIES not in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesBetween(String value1, String value2) {
            addCriterion("PROPERTIES between", value1, value2, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotBetween(String value1, String value2) {
            addCriterion("PROPERTIES not between", value1, value2, "properties");
            return (Criteria) this;
        }

        public Criteria andPackTypeLikeInsensitive(String value) {
            addCriterion("upper(PACK_TYPE) like", value.toUpperCase(), "packType");
            return (Criteria) this;
        }

        public Criteria andPackSizeLikeInsensitive(String value) {
            addCriterion("upper(PACK_SIZE) like", value.toUpperCase(), "packSize");
            return (Criteria) this;
        }

        public Criteria andIntroBriefLikeInsensitive(String value) {
            addCriterion("upper(INTRO_BRIEF) like", value.toUpperCase(), "introBrief");
            return (Criteria) this;
        }

        public Criteria andIntroDetailCharLikeInsensitive(String value) {
            addCriterion("upper(INTRO_DETAIL_CHAR) like", value.toUpperCase(), "introDetailChar");
            return (Criteria) this;
        }

        public Criteria andIntroDetailLinkLikeInsensitive(String value) {
            addCriterion("upper(INTRO_DETAIL_LINK) like", value.toUpperCase(), "introDetailLink");
            return (Criteria) this;
        }

        public Criteria andPicUrlLikeInsensitive(String value) {
            addCriterion("upper(PIC_URL) like", value.toUpperCase(), "picUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLikeInsensitive(String value) {
            addCriterion("upper(ICON_URL) like", value.toUpperCase(), "iconUrl");
            return (Criteria) this;
        }

        public Criteria andPropertiesLikeInsensitive(String value) {
            addCriterion("upper(PROPERTIES) like", value.toUpperCase(), "properties");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_contract_extend
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: commodity_contract_extend
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