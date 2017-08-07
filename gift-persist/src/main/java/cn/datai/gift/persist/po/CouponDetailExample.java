package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponDetailExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public CouponDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
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
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon_detail
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

        public Criteria andCouponDetailIdIsNull() {
            addCriterion("COUPON_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdIsNotNull() {
            addCriterion("COUPON_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID =", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID <>", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdGreaterThan(Long value) {
            addCriterion("COUPON_DETAIL_ID >", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID >=", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdLessThan(Long value) {
            addCriterion("COUPON_DETAIL_ID <", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_DETAIL_ID <=", value, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdIn(List<Long> values) {
            addCriterion("COUPON_DETAIL_ID in", values, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotIn(List<Long> values) {
            addCriterion("COUPON_DETAIL_ID not in", values, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdBetween(Long value1, Long value2) {
            addCriterion("COUPON_DETAIL_ID between", value1, value2, "couponDetailId");
            return (Criteria) this;
        }

        public Criteria andCouponDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_DETAIL_ID not between", value1, value2, "couponDetailId");
            return (Criteria) this;
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
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

        public Criteria andTimeCreateIsNull() {
            addCriterion("TIME_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIsNotNull() {
            addCriterion("TIME_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCreateEqualTo(Date value) {
            addCriterion("TIME_CREATE =", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotEqualTo(Date value) {
            addCriterion("TIME_CREATE <>", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThan(Date value) {
            addCriterion("TIME_CREATE >", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_CREATE >=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThan(Date value) {
            addCriterion("TIME_CREATE <", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateLessThanOrEqualTo(Date value) {
            addCriterion("TIME_CREATE <=", value, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateIn(List<Date> values) {
            addCriterion("TIME_CREATE in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotIn(List<Date> values) {
            addCriterion("TIME_CREATE not in", values, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateBetween(Date value1, Date value2) {
            addCriterion("TIME_CREATE between", value1, value2, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeCreateNotBetween(Date value1, Date value2) {
            addCriterion("TIME_CREATE not between", value1, value2, "timeCreate");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNull() {
            addCriterion("TIME_EXPIRE is null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIsNotNull() {
            addCriterion("TIME_EXPIRE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeExpireEqualTo(Date value) {
            addCriterion("TIME_EXPIRE =", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotEqualTo(Date value) {
            addCriterion("TIME_EXPIRE <>", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThan(Date value) {
            addCriterion("TIME_EXPIRE >", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_EXPIRE >=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThan(Date value) {
            addCriterion("TIME_EXPIRE <", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireLessThanOrEqualTo(Date value) {
            addCriterion("TIME_EXPIRE <=", value, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireIn(List<Date> values) {
            addCriterion("TIME_EXPIRE in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotIn(List<Date> values) {
            addCriterion("TIME_EXPIRE not in", values, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireBetween(Date value1, Date value2) {
            addCriterion("TIME_EXPIRE between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeExpireNotBetween(Date value1, Date value2) {
            addCriterion("TIME_EXPIRE not between", value1, value2, "timeExpire");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveIsNull() {
            addCriterion("TIME_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveIsNotNull() {
            addCriterion("TIME_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveEqualTo(Date value) {
            addCriterion("TIME_RECEIVE =", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveNotEqualTo(Date value) {
            addCriterion("TIME_RECEIVE <>", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveGreaterThan(Date value) {
            addCriterion("TIME_RECEIVE >", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_RECEIVE >=", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveLessThan(Date value) {
            addCriterion("TIME_RECEIVE <", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveLessThanOrEqualTo(Date value) {
            addCriterion("TIME_RECEIVE <=", value, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveIn(List<Date> values) {
            addCriterion("TIME_RECEIVE in", values, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveNotIn(List<Date> values) {
            addCriterion("TIME_RECEIVE not in", values, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveBetween(Date value1, Date value2) {
            addCriterion("TIME_RECEIVE between", value1, value2, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andTimeReceiveNotBetween(Date value1, Date value2) {
            addCriterion("TIME_RECEIVE not between", value1, value2, "timeReceive");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("IS_USED is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("IS_USED is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(String value) {
            addCriterion("IS_USED =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(String value) {
            addCriterion("IS_USED <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(String value) {
            addCriterion("IS_USED >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USED >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(String value) {
            addCriterion("IS_USED <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(String value) {
            addCriterion("IS_USED <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLike(String value) {
            addCriterion("IS_USED like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotLike(String value) {
            addCriterion("IS_USED not like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<String> values) {
            addCriterion("IS_USED in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<String> values) {
            addCriterion("IS_USED not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(String value1, String value2) {
            addCriterion("IS_USED between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(String value1, String value2) {
            addCriterion("IS_USED not between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsAvalidIsNull() {
            addCriterion("IS_AVALID is null");
            return (Criteria) this;
        }

        public Criteria andIsAvalidIsNotNull() {
            addCriterion("IS_AVALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvalidEqualTo(String value) {
            addCriterion("IS_AVALID =", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidNotEqualTo(String value) {
            addCriterion("IS_AVALID <>", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidGreaterThan(String value) {
            addCriterion("IS_AVALID >", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AVALID >=", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidLessThan(String value) {
            addCriterion("IS_AVALID <", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidLessThanOrEqualTo(String value) {
            addCriterion("IS_AVALID <=", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidLike(String value) {
            addCriterion("IS_AVALID like", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidNotLike(String value) {
            addCriterion("IS_AVALID not like", value, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidIn(List<String> values) {
            addCriterion("IS_AVALID in", values, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidNotIn(List<String> values) {
            addCriterion("IS_AVALID not in", values, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidBetween(String value1, String value2) {
            addCriterion("IS_AVALID between", value1, value2, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andIsAvalidNotBetween(String value1, String value2) {
            addCriterion("IS_AVALID not between", value1, value2, "isAvalid");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNull() {
            addCriterion("PRODUCER_ID is null");
            return (Criteria) this;
        }

        public Criteria andProducerIdIsNotNull() {
            addCriterion("PRODUCER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProducerIdEqualTo(Long value) {
            addCriterion("PRODUCER_ID =", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotEqualTo(Long value) {
            addCriterion("PRODUCER_ID <>", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThan(Long value) {
            addCriterion("PRODUCER_ID >", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCER_ID >=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThan(Long value) {
            addCriterion("PRODUCER_ID <", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCER_ID <=", value, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdIn(List<Long> values) {
            addCriterion("PRODUCER_ID in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotIn(List<Long> values) {
            addCriterion("PRODUCER_ID not in", values, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdBetween(Long value1, Long value2) {
            addCriterion("PRODUCER_ID between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerIdNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCER_ID not between", value1, value2, "producerId");
            return (Criteria) this;
        }

        public Criteria andProducerTypeIsNull() {
            addCriterion("PRODUCER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProducerTypeIsNotNull() {
            addCriterion("PRODUCER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProducerTypeEqualTo(String value) {
            addCriterion("PRODUCER_TYPE =", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeNotEqualTo(String value) {
            addCriterion("PRODUCER_TYPE <>", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeGreaterThan(String value) {
            addCriterion("PRODUCER_TYPE >", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER_TYPE >=", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeLessThan(String value) {
            addCriterion("PRODUCER_TYPE <", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER_TYPE <=", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeLike(String value) {
            addCriterion("PRODUCER_TYPE like", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeNotLike(String value) {
            addCriterion("PRODUCER_TYPE not like", value, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeIn(List<String> values) {
            addCriterion("PRODUCER_TYPE in", values, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeNotIn(List<String> values) {
            addCriterion("PRODUCER_TYPE not in", values, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeBetween(String value1, String value2) {
            addCriterion("PRODUCER_TYPE between", value1, value2, "producerType");
            return (Criteria) this;
        }

        public Criteria andProducerTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCER_TYPE not between", value1, value2, "producerType");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIsNull() {
            addCriterion("CONSUMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIsNotNull() {
            addCriterion("CONSUMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerIdEqualTo(Long value) {
            addCriterion("CONSUMER_ID =", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotEqualTo(Long value) {
            addCriterion("CONSUMER_ID <>", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdGreaterThan(Long value) {
            addCriterion("CONSUMER_ID >", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONSUMER_ID >=", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdLessThan(Long value) {
            addCriterion("CONSUMER_ID <", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdLessThanOrEqualTo(Long value) {
            addCriterion("CONSUMER_ID <=", value, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdIn(List<Long> values) {
            addCriterion("CONSUMER_ID in", values, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotIn(List<Long> values) {
            addCriterion("CONSUMER_ID not in", values, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdBetween(Long value1, Long value2) {
            addCriterion("CONSUMER_ID between", value1, value2, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerIdNotBetween(Long value1, Long value2) {
            addCriterion("CONSUMER_ID not between", value1, value2, "consumerId");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeIsNull() {
            addCriterion("CONSUMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeIsNotNull() {
            addCriterion("CONSUMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeEqualTo(String value) {
            addCriterion("CONSUMER_TYPE =", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeNotEqualTo(String value) {
            addCriterion("CONSUMER_TYPE <>", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeGreaterThan(String value) {
            addCriterion("CONSUMER_TYPE >", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUMER_TYPE >=", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeLessThan(String value) {
            addCriterion("CONSUMER_TYPE <", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeLessThanOrEqualTo(String value) {
            addCriterion("CONSUMER_TYPE <=", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeLike(String value) {
            addCriterion("CONSUMER_TYPE like", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeNotLike(String value) {
            addCriterion("CONSUMER_TYPE not like", value, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeIn(List<String> values) {
            addCriterion("CONSUMER_TYPE in", values, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeNotIn(List<String> values) {
            addCriterion("CONSUMER_TYPE not in", values, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeBetween(String value1, String value2) {
            addCriterion("CONSUMER_TYPE between", value1, value2, "consumerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeNotBetween(String value1, String value2) {
            addCriterion("CONSUMER_TYPE not between", value1, value2, "consumerType");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("MODIFY_USER like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("MODIFY_USER not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(PASSWORD) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andIsUsedLikeInsensitive(String value) {
            addCriterion("upper(IS_USED) like", value.toUpperCase(), "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsAvalidLikeInsensitive(String value) {
            addCriterion("upper(IS_AVALID) like", value.toUpperCase(), "isAvalid");
            return (Criteria) this;
        }

        public Criteria andProducerTypeLikeInsensitive(String value) {
            addCriterion("upper(PRODUCER_TYPE) like", value.toUpperCase(), "producerType");
            return (Criteria) this;
        }

        public Criteria andConsumerTypeLikeInsensitive(String value) {
            addCriterion("upper(CONSUMER_TYPE) like", value.toUpperCase(), "consumerType");
            return (Criteria) this;
        }

        public Criteria andModifyUserLikeInsensitive(String value) {
            addCriterion("upper(MODIFY_USER) like", value.toUpperCase(), "modifyUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_detail
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: coupon_detail
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