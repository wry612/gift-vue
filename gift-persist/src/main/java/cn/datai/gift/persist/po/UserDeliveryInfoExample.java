package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDeliveryInfoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public UserDeliveryInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
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
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_delivery_info
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

        public Criteria andUserDeliveryInfoIdIsNull() {
            addCriterion("USER_DELIVERY_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdIsNotNull() {
            addCriterion("USER_DELIVERY_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdEqualTo(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID =", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdNotEqualTo(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID <>", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdGreaterThan(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID >", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID >=", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdLessThan(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID <", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_DELIVERY_INFO_ID <=", value, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdIn(List<Long> values) {
            addCriterion("USER_DELIVERY_INFO_ID in", values, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdNotIn(List<Long> values) {
            addCriterion("USER_DELIVERY_INFO_ID not in", values, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdBetween(Long value1, Long value2) {
            addCriterion("USER_DELIVERY_INFO_ID between", value1, value2, "userDeliveryInfoId");
            return (Criteria) this;
        }

        public Criteria andUserDeliveryInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_DELIVERY_INFO_ID not between", value1, value2, "userDeliveryInfoId");
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNull() {
            addCriterion("TEL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTelNumberIsNotNull() {
            addCriterion("TEL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumberEqualTo(String value) {
            addCriterion("TEL_NUMBER =", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotEqualTo(String value) {
            addCriterion("TEL_NUMBER <>", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThan(String value) {
            addCriterion("TEL_NUMBER >", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER >=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThan(String value) {
            addCriterion("TEL_NUMBER <", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLessThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER <=", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberLike(String value) {
            addCriterion("TEL_NUMBER like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotLike(String value) {
            addCriterion("TEL_NUMBER not like", value, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberIn(List<String> values) {
            addCriterion("TEL_NUMBER in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotIn(List<String> values) {
            addCriterion("TEL_NUMBER not in", values, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andTelNumberNotBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER not between", value1, value2, "telNumber");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNull() {
            addCriterion("ADDRESS_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIsNotNull() {
            addCriterion("ADDRESS_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE =", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <>", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE >=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThan(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_POSTAL_CODE <=", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotLike(String value) {
            addCriterion("ADDRESS_POSTAL_CODE not like", value, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotIn(List<String> values) {
            addCriterion("ADDRESS_POSTAL_CODE not in", values, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_POSTAL_CODE not between", value1, value2, "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIsNotNull() {
            addCriterion("PROVICE_FIRST_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME =", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <>", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME >=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThan(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLessThanOrEqualTo(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME <=", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotLike(String value) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not like", value, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotIn(List<String> values) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not in", values, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameNotBetween(String value1, String value2) {
            addCriterion("PROVICE_FIRST_STAGE_NAME not between", value1, value2, "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIsNotNull() {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME =", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <>", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME >=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThan(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME <=", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotLike(String value) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not like", value, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not in", values, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_CITY_SECOND_STAGE_NAME not between", value1, value2, "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIsNotNull() {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME =", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <>", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME >=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThan(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME <=", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotLike(String value) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not like", value, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotIn(List<String> values) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not in", values, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_COUNTIES_THIRD_STAGE_NAME not between", value1, value2, "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNull() {
            addCriterion("ADDRESS_DETAIL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIsNotNull() {
            addCriterion("ADDRESS_DETAIL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO =", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <>", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO >=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThan(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_DETAIL_INFO <=", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotLike(String value) {
            addCriterion("ADDRESS_DETAIL_INFO not like", value, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotIn(List<String> values) {
            addCriterion("ADDRESS_DETAIL_INFO not in", values, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_DETAIL_INFO not between", value1, value2, "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andNationalCodeIsNull() {
            addCriterion("NATIONAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNationalCodeIsNotNull() {
            addCriterion("NATIONAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNationalCodeEqualTo(String value) {
            addCriterion("NATIONAL_CODE =", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeNotEqualTo(String value) {
            addCriterion("NATIONAL_CODE <>", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeGreaterThan(String value) {
            addCriterion("NATIONAL_CODE >", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL_CODE >=", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeLessThan(String value) {
            addCriterion("NATIONAL_CODE <", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL_CODE <=", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeLike(String value) {
            addCriterion("NATIONAL_CODE like", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeNotLike(String value) {
            addCriterion("NATIONAL_CODE not like", value, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeIn(List<String> values) {
            addCriterion("NATIONAL_CODE in", values, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeNotIn(List<String> values) {
            addCriterion("NATIONAL_CODE not in", values, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeBetween(String value1, String value2) {
            addCriterion("NATIONAL_CODE between", value1, value2, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andNationalCodeNotBetween(String value1, String value2) {
            addCriterion("NATIONAL_CODE not between", value1, value2, "nationalCode");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("IS_DEFAULT like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("IS_DEFAULT not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT not between", value1, value2, "isDefault");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(USERNAME) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andTelNumberLikeInsensitive(String value) {
            addCriterion("upper(TEL_NUMBER) like", value.toUpperCase(), "telNumber");
            return (Criteria) this;
        }

        public Criteria andAddressPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_POSTAL_CODE) like", value.toUpperCase(), "addressPostalCode");
            return (Criteria) this;
        }

        public Criteria andProviceFirstStageNameLikeInsensitive(String value) {
            addCriterion("upper(PROVICE_FIRST_STAGE_NAME) like", value.toUpperCase(), "proviceFirstStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCitySecondStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_CITY_SECOND_STAGE_NAME) like", value.toUpperCase(), "addressCitySecondStageName");
            return (Criteria) this;
        }

        public Criteria andAddressCountiesThirdStageNameLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_COUNTIES_THIRD_STAGE_NAME) like", value.toUpperCase(), "addressCountiesThirdStageName");
            return (Criteria) this;
        }

        public Criteria andAddressDetailInfoLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS_DETAIL_INFO) like", value.toUpperCase(), "addressDetailInfo");
            return (Criteria) this;
        }

        public Criteria andNationalCodeLikeInsensitive(String value) {
            addCriterion("upper(NATIONAL_CODE) like", value.toUpperCase(), "nationalCode");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLikeInsensitive(String value) {
            addCriterion("upper(IS_DEFAULT) like", value.toUpperCase(), "isDefault");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_delivery_info
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_delivery_info
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