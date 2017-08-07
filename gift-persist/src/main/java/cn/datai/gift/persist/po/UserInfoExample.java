package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
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
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_info
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

        public Criteria andBindAccountIsNull() {
            addCriterion("BIND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBindAccountIsNotNull() {
            addCriterion("BIND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBindAccountEqualTo(String value) {
            addCriterion("BIND_ACCOUNT =", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountNotEqualTo(String value) {
            addCriterion("BIND_ACCOUNT <>", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountGreaterThan(String value) {
            addCriterion("BIND_ACCOUNT >", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_ACCOUNT >=", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountLessThan(String value) {
            addCriterion("BIND_ACCOUNT <", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountLessThanOrEqualTo(String value) {
            addCriterion("BIND_ACCOUNT <=", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountLike(String value) {
            addCriterion("BIND_ACCOUNT like", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountNotLike(String value) {
            addCriterion("BIND_ACCOUNT not like", value, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountIn(List<String> values) {
            addCriterion("BIND_ACCOUNT in", values, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountNotIn(List<String> values) {
            addCriterion("BIND_ACCOUNT not in", values, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountBetween(String value1, String value2) {
            addCriterion("BIND_ACCOUNT between", value1, value2, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andBindAccountNotBetween(String value1, String value2) {
            addCriterion("BIND_ACCOUNT not between", value1, value2, "bindAccount");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressIsNull() {
            addCriterion("REGISTER_IP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressIsNotNull() {
            addCriterion("REGISTER_IP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressEqualTo(String value) {
            addCriterion("REGISTER_IP_ADDRESS =", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressNotEqualTo(String value) {
            addCriterion("REGISTER_IP_ADDRESS <>", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressGreaterThan(String value) {
            addCriterion("REGISTER_IP_ADDRESS >", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_IP_ADDRESS >=", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressLessThan(String value) {
            addCriterion("REGISTER_IP_ADDRESS <", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_IP_ADDRESS <=", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressLike(String value) {
            addCriterion("REGISTER_IP_ADDRESS like", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressNotLike(String value) {
            addCriterion("REGISTER_IP_ADDRESS not like", value, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressIn(List<String> values) {
            addCriterion("REGISTER_IP_ADDRESS in", values, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressNotIn(List<String> values) {
            addCriterion("REGISTER_IP_ADDRESS not in", values, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressBetween(String value1, String value2) {
            addCriterion("REGISTER_IP_ADDRESS between", value1, value2, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressNotBetween(String value1, String value2) {
            addCriterion("REGISTER_IP_ADDRESS not between", value1, value2, "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(String value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(String value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLike(String value) {
            addCriterion("LAST_LOGIN_TIME like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotLike(String value) {
            addCriterion("LAST_LOGIN_TIME not like", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<String> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNull() {
            addCriterion("RECOMMEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNotNull() {
            addCriterion("RECOMMEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdEqualTo(String value) {
            addCriterion("RECOMMEND_ID =", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotEqualTo(String value) {
            addCriterion("RECOMMEND_ID <>", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThan(String value) {
            addCriterion("RECOMMEND_ID >", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_ID >=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThan(String value) {
            addCriterion("RECOMMEND_ID <", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_ID <=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLike(String value) {
            addCriterion("RECOMMEND_ID like", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotLike(String value) {
            addCriterion("RECOMMEND_ID not like", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIn(List<String> values) {
            addCriterion("RECOMMEND_ID in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotIn(List<String> values) {
            addCriterion("RECOMMEND_ID not in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdBetween(String value1, String value2) {
            addCriterion("RECOMMEND_ID between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_ID not between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("RANK is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("RANK is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("RANK =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("RANK <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("RANK >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("RANK >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("RANK <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("RANK <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("RANK like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("RANK not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("RANK in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("RANK not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("RANK between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("RANK not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNull() {
            addCriterion("HEAD_IMG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIsNotNull() {
            addCriterion("HEAD_IMG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH =", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH <>", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThan(String value) {
            addCriterion("HEAD_IMG_PATH >", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH >=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThan(String value) {
            addCriterion("HEAD_IMG_PATH <", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLessThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG_PATH <=", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLike(String value) {
            addCriterion("HEAD_IMG_PATH like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotLike(String value) {
            addCriterion("HEAD_IMG_PATH not like", value, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathIn(List<String> values) {
            addCriterion("HEAD_IMG_PATH in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotIn(List<String> values) {
            addCriterion("HEAD_IMG_PATH not in", values, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathBetween(String value1, String value2) {
            addCriterion("HEAD_IMG_PATH between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathNotBetween(String value1, String value2) {
            addCriterion("HEAD_IMG_PATH not between", value1, value2, "headImgPath");
            return (Criteria) this;
        }

        public Criteria andIsBrokerIsNull() {
            addCriterion("IS_BROKER is null");
            return (Criteria) this;
        }

        public Criteria andIsBrokerIsNotNull() {
            addCriterion("IS_BROKER is not null");
            return (Criteria) this;
        }

        public Criteria andIsBrokerEqualTo(String value) {
            addCriterion("IS_BROKER =", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerNotEqualTo(String value) {
            addCriterion("IS_BROKER <>", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerGreaterThan(String value) {
            addCriterion("IS_BROKER >", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BROKER >=", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerLessThan(String value) {
            addCriterion("IS_BROKER <", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerLessThanOrEqualTo(String value) {
            addCriterion("IS_BROKER <=", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerLike(String value) {
            addCriterion("IS_BROKER like", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerNotLike(String value) {
            addCriterion("IS_BROKER not like", value, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerIn(List<String> values) {
            addCriterion("IS_BROKER in", values, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerNotIn(List<String> values) {
            addCriterion("IS_BROKER not in", values, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerBetween(String value1, String value2) {
            addCriterion("IS_BROKER between", value1, value2, "isBroker");
            return (Criteria) this;
        }

        public Criteria andIsBrokerNotBetween(String value1, String value2) {
            addCriterion("IS_BROKER not between", value1, value2, "isBroker");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdIsNull() {
            addCriterion("BROKER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdIsNotNull() {
            addCriterion("BROKER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdEqualTo(Long value) {
            addCriterion("BROKER_USER_ID =", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdNotEqualTo(Long value) {
            addCriterion("BROKER_USER_ID <>", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdGreaterThan(Long value) {
            addCriterion("BROKER_USER_ID >", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BROKER_USER_ID >=", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdLessThan(Long value) {
            addCriterion("BROKER_USER_ID <", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("BROKER_USER_ID <=", value, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdIn(List<Long> values) {
            addCriterion("BROKER_USER_ID in", values, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdNotIn(List<Long> values) {
            addCriterion("BROKER_USER_ID not in", values, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdBetween(Long value1, Long value2) {
            addCriterion("BROKER_USER_ID between", value1, value2, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andBrokerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("BROKER_USER_ID not between", value1, value2, "brokerUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdIsNull() {
            addCriterion("REFERER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdIsNotNull() {
            addCriterion("REFERER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdEqualTo(Long value) {
            addCriterion("REFERER_USER_ID =", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdNotEqualTo(Long value) {
            addCriterion("REFERER_USER_ID <>", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdGreaterThan(Long value) {
            addCriterion("REFERER_USER_ID >", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REFERER_USER_ID >=", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdLessThan(Long value) {
            addCriterion("REFERER_USER_ID <", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdLessThanOrEqualTo(Long value) {
            addCriterion("REFERER_USER_ID <=", value, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdIn(List<Long> values) {
            addCriterion("REFERER_USER_ID in", values, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdNotIn(List<Long> values) {
            addCriterion("REFERER_USER_ID not in", values, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdBetween(Long value1, Long value2) {
            addCriterion("REFERER_USER_ID between", value1, value2, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andRefererUserIdNotBetween(Long value1, Long value2) {
            addCriterion("REFERER_USER_ID not between", value1, value2, "refererUserId");
            return (Criteria) this;
        }

        public Criteria andBindAccountLikeInsensitive(String value) {
            addCriterion("upper(BIND_ACCOUNT) like", value.toUpperCase(), "bindAccount");
            return (Criteria) this;
        }

        public Criteria andLoginNameLikeInsensitive(String value) {
            addCriterion("upper(LOGIN_NAME) like", value.toUpperCase(), "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(PASSWORD) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andCountryLikeInsensitive(String value) {
            addCriterion("upper(COUNTRY) like", value.toUpperCase(), "country");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(PROVINCE) like", value.toUpperCase(), "province");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(CITY) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andNicknameLikeInsensitive(String value) {
            addCriterion("upper(NICKNAME) like", value.toUpperCase(), "nickname");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(SEX) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLikeInsensitive(String value) {
            addCriterion("upper(MOBILE_PHONE) like", value.toUpperCase(), "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(USER_TYPE) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andRegisterIpAddressLikeInsensitive(String value) {
            addCriterion("upper(REGISTER_IP_ADDRESS) like", value.toUpperCase(), "registerIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLikeInsensitive(String value) {
            addCriterion("upper(LAST_LOGIN_TIME) like", value.toUpperCase(), "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSourceLikeInsensitive(String value) {
            addCriterion("upper(SOURCE) like", value.toUpperCase(), "source");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLikeInsensitive(String value) {
            addCriterion("upper(RECOMMEND_ID) like", value.toUpperCase(), "recommendId");
            return (Criteria) this;
        }

        public Criteria andRankLikeInsensitive(String value) {
            addCriterion("upper(RANK) like", value.toUpperCase(), "rank");
            return (Criteria) this;
        }

        public Criteria andHeadImgPathLikeInsensitive(String value) {
            addCriterion("upper(HEAD_IMG_PATH) like", value.toUpperCase(), "headImgPath");
            return (Criteria) this;
        }

        public Criteria andIsBrokerLikeInsensitive(String value) {
            addCriterion("upper(IS_BROKER) like", value.toUpperCase(), "isBroker");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_info
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: user_info
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