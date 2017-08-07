package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public CouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
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
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon
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

        public Criteria andCouponIdIsNull() {
            addCriterion("COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("COUPON_ID =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("COUPON_ID <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("COUPON_ID >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_ID >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("COUPON_ID <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_ID <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("COUPON_ID in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("COUPON_ID not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("COUPON_ID between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_ID not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNull() {
            addCriterion("COUPON_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNotNull() {
            addCriterion("COUPON_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdEqualTo(Long value) {
            addCriterion("COUPON_TYPE_ID =", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotEqualTo(Long value) {
            addCriterion("COUPON_TYPE_ID <>", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThan(Long value) {
            addCriterion("COUPON_TYPE_ID >", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_TYPE_ID >=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThan(Long value) {
            addCriterion("COUPON_TYPE_ID <", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_TYPE_ID <=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIn(List<Long> values) {
            addCriterion("COUPON_TYPE_ID in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotIn(List<Long> values) {
            addCriterion("COUPON_TYPE_ID not in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdBetween(Long value1, Long value2) {
            addCriterion("COUPON_TYPE_ID between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_TYPE_ID not between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("ISVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("ISVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(String value) {
            addCriterion("ISVALID =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(String value) {
            addCriterion("ISVALID <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(String value) {
            addCriterion("ISVALID >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(String value) {
            addCriterion("ISVALID >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(String value) {
            addCriterion("ISVALID <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(String value) {
            addCriterion("ISVALID <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLike(String value) {
            addCriterion("ISVALID like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotLike(String value) {
            addCriterion("ISVALID not like", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<String> values) {
            addCriterion("ISVALID in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<String> values) {
            addCriterion("ISVALID not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(String value1, String value2) {
            addCriterion("ISVALID between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(String value1, String value2) {
            addCriterion("ISVALID not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("DISCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("DISCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(String value) {
            addCriterion("DISCOUNT_TYPE >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(String value) {
            addCriterion("DISCOUNT_TYPE <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLike(String value) {
            addCriterion("DISCOUNT_TYPE like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotLike(String value) {
            addCriterion("DISCOUNT_TYPE not like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<String> values) {
            addCriterion("DISCOUNT_TYPE in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<String> values) {
            addCriterion("DISCOUNT_TYPE not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TYPE between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TYPE not between", value1, value2, "discountType");
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

        public Criteria andUnitQuantityIsNull() {
            addCriterion("UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityIsNotNull() {
            addCriterion("UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("UNIT_QUANTITY =", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_QUANTITY <>", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("UNIT_QUANTITY >", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_QUANTITY >=", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityLessThan(BigDecimal value) {
            addCriterion("UNIT_QUANTITY <", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_QUANTITY <=", value, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("UNIT_QUANTITY in", values, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_QUANTITY not in", values, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_QUANTITY between", value1, value2, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_QUANTITY not between", value1, value2, "unitQuantity");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
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

        public Criteria andFixedStartTimeIsNull() {
            addCriterion("FIXED_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeIsNotNull() {
            addCriterion("FIXED_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeEqualTo(Date value) {
            addCriterion("FIXED_START_TIME =", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeNotEqualTo(Date value) {
            addCriterion("FIXED_START_TIME <>", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeGreaterThan(Date value) {
            addCriterion("FIXED_START_TIME >", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIXED_START_TIME >=", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeLessThan(Date value) {
            addCriterion("FIXED_START_TIME <", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIXED_START_TIME <=", value, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeIn(List<Date> values) {
            addCriterion("FIXED_START_TIME in", values, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeNotIn(List<Date> values) {
            addCriterion("FIXED_START_TIME not in", values, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeBetween(Date value1, Date value2) {
            addCriterion("FIXED_START_TIME between", value1, value2, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIXED_START_TIME not between", value1, value2, "fixedStartTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeIsNull() {
            addCriterion("FIXED_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeIsNotNull() {
            addCriterion("FIXED_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeEqualTo(Date value) {
            addCriterion("FIXED_END_TIME =", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeNotEqualTo(Date value) {
            addCriterion("FIXED_END_TIME <>", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeGreaterThan(Date value) {
            addCriterion("FIXED_END_TIME >", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIXED_END_TIME >=", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeLessThan(Date value) {
            addCriterion("FIXED_END_TIME <", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIXED_END_TIME <=", value, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeIn(List<Date> values) {
            addCriterion("FIXED_END_TIME in", values, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeNotIn(List<Date> values) {
            addCriterion("FIXED_END_TIME not in", values, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeBetween(Date value1, Date value2) {
            addCriterion("FIXED_END_TIME between", value1, value2, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andFixedEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIXED_END_TIME not between", value1, value2, "fixedEndTime");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayIsNull() {
            addCriterion("DYNAMIC_AVALID_DAY is null");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayIsNotNull() {
            addCriterion("DYNAMIC_AVALID_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayEqualTo(String value) {
            addCriterion("DYNAMIC_AVALID_DAY =", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayNotEqualTo(String value) {
            addCriterion("DYNAMIC_AVALID_DAY <>", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayGreaterThan(String value) {
            addCriterion("DYNAMIC_AVALID_DAY >", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_AVALID_DAY >=", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayLessThan(String value) {
            addCriterion("DYNAMIC_AVALID_DAY <", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_AVALID_DAY <=", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayLike(String value) {
            addCriterion("DYNAMIC_AVALID_DAY like", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayNotLike(String value) {
            addCriterion("DYNAMIC_AVALID_DAY not like", value, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayIn(List<String> values) {
            addCriterion("DYNAMIC_AVALID_DAY in", values, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayNotIn(List<String> values) {
            addCriterion("DYNAMIC_AVALID_DAY not in", values, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayBetween(String value1, String value2) {
            addCriterion("DYNAMIC_AVALID_DAY between", value1, value2, "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_AVALID_DAY not between", value1, value2, "dynamicAvalidDay");
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

        public Criteria andConditionEnoughMoneyIsNull() {
            addCriterion("CONDITION_ENOUGH_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyIsNotNull() {
            addCriterion("CONDITION_ENOUGH_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY =", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY <>", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyGreaterThan(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY >", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY >=", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyLessThan(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY <", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_MONEY <=", value, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyIn(List<BigDecimal> values) {
            addCriterion("CONDITION_ENOUGH_MONEY in", values, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CONDITION_ENOUGH_MONEY not in", values, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONDITION_ENOUGH_MONEY between", value1, value2, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONDITION_ENOUGH_MONEY not between", value1, value2, "conditionEnoughMoney");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityIsNull() {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityIsNotNull() {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY =", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY <>", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY >", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY >=", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityLessThan(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY <", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY <=", value, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY in", values, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY not in", values, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY between", value1, value2, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionEnoughUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONDITION_ENOUGH_UNIT_QUANTITY not between", value1, value2, "conditionEnoughUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupIsNull() {
            addCriterion("INCLUDE_COMMODITY_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupIsNotNull() {
            addCriterion("INCLUDE_COMMODITY_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupEqualTo(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP =", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupNotEqualTo(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP <>", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupGreaterThan(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP >", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupGreaterThanOrEqualTo(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP >=", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupLessThan(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP <", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupLessThanOrEqualTo(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP <=", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupLike(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP like", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupNotLike(String value) {
            addCriterion("INCLUDE_COMMODITY_GROUP not like", value, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupIn(List<String> values) {
            addCriterion("INCLUDE_COMMODITY_GROUP in", values, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupNotIn(List<String> values) {
            addCriterion("INCLUDE_COMMODITY_GROUP not in", values, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupBetween(String value1, String value2) {
            addCriterion("INCLUDE_COMMODITY_GROUP between", value1, value2, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupNotBetween(String value1, String value2) {
            addCriterion("INCLUDE_COMMODITY_GROUP not between", value1, value2, "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupIsNull() {
            addCriterion("EXCLUDE_COMMODITY_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupIsNotNull() {
            addCriterion("EXCLUDE_COMMODITY_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupEqualTo(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP =", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupNotEqualTo(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP <>", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupGreaterThan(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP >", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupGreaterThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP >=", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupLessThan(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP <", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupLessThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP <=", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupLike(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP like", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupNotLike(String value) {
            addCriterion("EXCLUDE_COMMODITY_GROUP not like", value, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupIn(List<String> values) {
            addCriterion("EXCLUDE_COMMODITY_GROUP in", values, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupNotIn(List<String> values) {
            addCriterion("EXCLUDE_COMMODITY_GROUP not in", values, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupBetween(String value1, String value2) {
            addCriterion("EXCLUDE_COMMODITY_GROUP between", value1, value2, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupNotBetween(String value1, String value2) {
            addCriterion("EXCLUDE_COMMODITY_GROUP not between", value1, value2, "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeIsNull() {
            addCriterion("IS_DELIVERY_FREE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeIsNotNull() {
            addCriterion("IS_DELIVERY_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeEqualTo(String value) {
            addCriterion("IS_DELIVERY_FREE =", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeNotEqualTo(String value) {
            addCriterion("IS_DELIVERY_FREE <>", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeGreaterThan(String value) {
            addCriterion("IS_DELIVERY_FREE >", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELIVERY_FREE >=", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeLessThan(String value) {
            addCriterion("IS_DELIVERY_FREE <", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeLessThanOrEqualTo(String value) {
            addCriterion("IS_DELIVERY_FREE <=", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeLike(String value) {
            addCriterion("IS_DELIVERY_FREE like", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeNotLike(String value) {
            addCriterion("IS_DELIVERY_FREE not like", value, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeIn(List<String> values) {
            addCriterion("IS_DELIVERY_FREE in", values, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeNotIn(List<String> values) {
            addCriterion("IS_DELIVERY_FREE not in", values, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeBetween(String value1, String value2) {
            addCriterion("IS_DELIVERY_FREE between", value1, value2, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeNotBetween(String value1, String value2) {
            addCriterion("IS_DELIVERY_FREE not between", value1, value2, "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdIsNull() {
            addCriterion("MODIFY_ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdIsNotNull() {
            addCriterion("MODIFY_ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdEqualTo(String value) {
            addCriterion("MODIFY_ADMIN_ID =", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdNotEqualTo(String value) {
            addCriterion("MODIFY_ADMIN_ID <>", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdGreaterThan(String value) {
            addCriterion("MODIFY_ADMIN_ID >", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_ADMIN_ID >=", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdLessThan(String value) {
            addCriterion("MODIFY_ADMIN_ID <", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_ADMIN_ID <=", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdLike(String value) {
            addCriterion("MODIFY_ADMIN_ID like", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdNotLike(String value) {
            addCriterion("MODIFY_ADMIN_ID not like", value, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdIn(List<String> values) {
            addCriterion("MODIFY_ADMIN_ID in", values, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdNotIn(List<String> values) {
            addCriterion("MODIFY_ADMIN_ID not in", values, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdBetween(String value1, String value2) {
            addCriterion("MODIFY_ADMIN_ID between", value1, value2, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdNotBetween(String value1, String value2) {
            addCriterion("MODIFY_ADMIN_ID not between", value1, value2, "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdIsNull() {
            addCriterion("FIXED_CREATE_SUBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdIsNotNull() {
            addCriterion("FIXED_CREATE_SUBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdEqualTo(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID =", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdNotEqualTo(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID <>", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdGreaterThan(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID >", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID >=", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdLessThan(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID <", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("FIXED_CREATE_SUBJECT_ID <=", value, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdIn(List<Long> values) {
            addCriterion("FIXED_CREATE_SUBJECT_ID in", values, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdNotIn(List<Long> values) {
            addCriterion("FIXED_CREATE_SUBJECT_ID not in", values, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdBetween(Long value1, Long value2) {
            addCriterion("FIXED_CREATE_SUBJECT_ID between", value1, value2, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("FIXED_CREATE_SUBJECT_ID not between", value1, value2, "fixedCreateSubjectId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeIsNull() {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeIsNotNull() {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeEqualTo(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE =", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeNotEqualTo(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE <>", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeGreaterThan(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE >", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE >=", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeLessThan(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE <", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeLessThanOrEqualTo(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE <=", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeLike(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE like", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeNotLike(String value) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE not like", value, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeIn(List<String> values) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE in", values, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeNotIn(List<String> values) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE not in", values, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeBetween(String value1, String value2) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE between", value1, value2, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeNotBetween(String value1, String value2) {
            addCriterion("FIXED_CREATE_SUBJECT_TYPE not between", value1, value2, "fixedCreateSubjectType");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andIsvalidLikeInsensitive(String value) {
            addCriterion("upper(ISVALID) like", value.toUpperCase(), "isvalid");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLikeInsensitive(String value) {
            addCriterion("upper(DISCOUNT_TYPE) like", value.toUpperCase(), "discountType");
            return (Criteria) this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(UNIT) like", value.toUpperCase(), "unit");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andDynamicAvalidDayLikeInsensitive(String value) {
            addCriterion("upper(DYNAMIC_AVALID_DAY) like", value.toUpperCase(), "dynamicAvalidDay");
            return (Criteria) this;
        }

        public Criteria andIncludeCommodityGroupLikeInsensitive(String value) {
            addCriterion("upper(INCLUDE_COMMODITY_GROUP) like", value.toUpperCase(), "includeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andExcludeCommodityGroupLikeInsensitive(String value) {
            addCriterion("upper(EXCLUDE_COMMODITY_GROUP) like", value.toUpperCase(), "excludeCommodityGroup");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryFreeLikeInsensitive(String value) {
            addCriterion("upper(IS_DELIVERY_FREE) like", value.toUpperCase(), "isDeliveryFree");
            return (Criteria) this;
        }

        public Criteria andModifyAdminIdLikeInsensitive(String value) {
            addCriterion("upper(MODIFY_ADMIN_ID) like", value.toUpperCase(), "modifyAdminId");
            return (Criteria) this;
        }

        public Criteria andFixedCreateSubjectTypeLikeInsensitive(String value) {
            addCriterion("upper(FIXED_CREATE_SUBJECT_TYPE) like", value.toUpperCase(), "fixedCreateSubjectType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon
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