package cn.datai.gift.persist.po;

import cn.datai.gift.persist.vo.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeOrderExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public TradeOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
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
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: trade_order
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

        public Criteria andTradeOrderIdIsNull() {
            addCriterion("TRADE_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdIsNotNull() {
            addCriterion("TRADE_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdEqualTo(Long value) {
            addCriterion("TRADE_ORDER_ID =", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdNotEqualTo(Long value) {
            addCriterion("TRADE_ORDER_ID <>", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdGreaterThan(Long value) {
            addCriterion("TRADE_ORDER_ID >", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRADE_ORDER_ID >=", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdLessThan(Long value) {
            addCriterion("TRADE_ORDER_ID <", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("TRADE_ORDER_ID <=", value, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdIn(List<Long> values) {
            addCriterion("TRADE_ORDER_ID in", values, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdNotIn(List<Long> values) {
            addCriterion("TRADE_ORDER_ID not in", values, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdBetween(Long value1, Long value2) {
            addCriterion("TRADE_ORDER_ID between", value1, value2, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("TRADE_ORDER_ID not between", value1, value2, "tradeOrderId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("ACCOUNT_TYPE >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("ACCOUNT_TYPE <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_TYPE <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("ACCOUNT_TYPE like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("ACCOUNT_TYPE not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("ACCOUNT_TYPE not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_TYPE not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdIsNull() {
            addCriterion("OPPONENT_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdIsNotNull() {
            addCriterion("OPPONENT_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdEqualTo(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID =", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdNotEqualTo(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID <>", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdGreaterThan(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID >", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID >=", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdLessThan(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID <", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("OPPONENT_ACCOUNT_ID <=", value, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdIn(List<Long> values) {
            addCriterion("OPPONENT_ACCOUNT_ID in", values, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdNotIn(List<Long> values) {
            addCriterion("OPPONENT_ACCOUNT_ID not in", values, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdBetween(Long value1, Long value2) {
            addCriterion("OPPONENT_ACCOUNT_ID between", value1, value2, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("OPPONENT_ACCOUNT_ID not between", value1, value2, "opponentAccountId");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeIsNull() {
            addCriterion("OPPONENT_ACCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeIsNotNull() {
            addCriterion("OPPONENT_ACCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeEqualTo(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE =", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeNotEqualTo(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE <>", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeGreaterThan(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE >", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE >=", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeLessThan(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE <", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE <=", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeLike(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE like", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeNotLike(String value) {
            addCriterion("OPPONENT_ACCOUNT_TYPE not like", value, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeIn(List<String> values) {
            addCriterion("OPPONENT_ACCOUNT_TYPE in", values, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeNotIn(List<String> values) {
            addCriterion("OPPONENT_ACCOUNT_TYPE not in", values, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeBetween(String value1, String value2) {
            addCriterion("OPPONENT_ACCOUNT_TYPE between", value1, value2, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeNotBetween(String value1, String value2) {
            addCriterion("OPPONENT_ACCOUNT_TYPE not between", value1, value2, "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellIsNull() {
            addCriterion("BUY_OR_SELL is null");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellIsNotNull() {
            addCriterion("BUY_OR_SELL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellEqualTo(String value) {
            addCriterion("BUY_OR_SELL =", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellNotEqualTo(String value) {
            addCriterion("BUY_OR_SELL <>", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellGreaterThan(String value) {
            addCriterion("BUY_OR_SELL >", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_OR_SELL >=", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellLessThan(String value) {
            addCriterion("BUY_OR_SELL <", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellLessThanOrEqualTo(String value) {
            addCriterion("BUY_OR_SELL <=", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellLike(String value) {
            addCriterion("BUY_OR_SELL like", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellNotLike(String value) {
            addCriterion("BUY_OR_SELL not like", value, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellIn(List<String> values) {
            addCriterion("BUY_OR_SELL in", values, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellNotIn(List<String> values) {
            addCriterion("BUY_OR_SELL not in", values, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellBetween(String value1, String value2) {
            addCriterion("BUY_OR_SELL between", value1, value2, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellNotBetween(String value1, String value2) {
            addCriterion("BUY_OR_SELL not between", value1, value2, "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("COMMODITY_ID =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("COMMODITY_ID <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("COMMODITY_ID >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ID >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("COMMODITY_ID <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_ID <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("COMMODITY_ID in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("COMMODITY_ID not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ID between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_ID not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIsNull() {
            addCriterion("COMMODITY_UNIT_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIsNotNull() {
            addCriterion("COMMODITY_UNIT_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY =", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <>", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY >", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY >=", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityLessThan(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_UNIT_QUANTITY <=", value, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_UNIT_QUANTITY in", values, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_UNIT_QUANTITY not in", values, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_UNIT_QUANTITY between", value1, value2, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_UNIT_QUANTITY not between", value1, value2, "commodityUnitQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIsNull() {
            addCriterion("COMMODITY_UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIsNotNull() {
            addCriterion("COMMODITY_UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE =", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <>", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceGreaterThan(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE >", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE >=", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceLessThan(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_UNIT_PRICE <=", value, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceIn(List<Long> values) {
            addCriterion("COMMODITY_UNIT_PRICE in", values, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotIn(List<Long> values) {
            addCriterion("COMMODITY_UNIT_PRICE not in", values, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_UNIT_PRICE between", value1, value2, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitPriceNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_UNIT_PRICE not between", value1, value2, "commodityUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityIsNull() {
            addCriterion("COMMODITY_STANDARD_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityIsNotNull() {
            addCriterion("COMMODITY_STANDARD_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY =", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY <>", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY >", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY >=", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityLessThan(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY <", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_STANDARD_QUANTITY <=", value, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_STANDARD_QUANTITY in", values, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_STANDARD_QUANTITY not in", values, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_STANDARD_QUANTITY between", value1, value2, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_STANDARD_QUANTITY not between", value1, value2, "commodityStandardQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceIsNull() {
            addCriterion("COMMODITY_STANDARD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceIsNotNull() {
            addCriterion("COMMODITY_STANDARD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceEqualTo(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE =", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceNotEqualTo(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE <>", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceGreaterThan(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE >", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE >=", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceLessThan(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE <", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceLessThanOrEqualTo(Long value) {
            addCriterion("COMMODITY_STANDARD_PRICE <=", value, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceIn(List<Long> values) {
            addCriterion("COMMODITY_STANDARD_PRICE in", values, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceNotIn(List<Long> values) {
            addCriterion("COMMODITY_STANDARD_PRICE not in", values, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_STANDARD_PRICE between", value1, value2, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityStandardPriceNotBetween(Long value1, Long value2) {
            addCriterion("COMMODITY_STANDARD_PRICE not between", value1, value2, "commodityStandardPrice");
            return (Criteria) this;
        }

        public Criteria andFeePercentIsNull() {
            addCriterion("FEE_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andFeePercentIsNotNull() {
            addCriterion("FEE_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andFeePercentEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT =", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT <>", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentGreaterThan(BigDecimal value) {
            addCriterion("FEE_PERCENT >", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT >=", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentLessThan(BigDecimal value) {
            addCriterion("FEE_PERCENT <", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_PERCENT <=", value, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentIn(List<BigDecimal> values) {
            addCriterion("FEE_PERCENT in", values, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotIn(List<BigDecimal> values) {
            addCriterion("FEE_PERCENT not in", values, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERCENT between", value1, value2, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_PERCENT not between", value1, value2, "feePercent");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNull() {
            addCriterion("FEE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFeePriceIsNotNull() {
            addCriterion("FEE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFeePriceEqualTo(Long value) {
            addCriterion("FEE_PRICE =", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotEqualTo(Long value) {
            addCriterion("FEE_PRICE <>", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThan(Long value) {
            addCriterion("FEE_PRICE >", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("FEE_PRICE >=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThan(Long value) {
            addCriterion("FEE_PRICE <", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceLessThanOrEqualTo(Long value) {
            addCriterion("FEE_PRICE <=", value, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceIn(List<Long> values) {
            addCriterion("FEE_PRICE in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotIn(List<Long> values) {
            addCriterion("FEE_PRICE not in", values, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceBetween(Long value1, Long value2) {
            addCriterion("FEE_PRICE between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andFeePriceNotBetween(Long value1, Long value2) {
            addCriterion("FEE_PRICE not between", value1, value2, "feePrice");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNull() {
            addCriterion("COUPON_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNotNull() {
            addCriterion("COUPON_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoEqualTo(String value) {
            addCriterion("COUPON_INFO =", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotEqualTo(String value) {
            addCriterion("COUPON_INFO <>", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThan(String value) {
            addCriterion("COUPON_INFO >", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_INFO >=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThan(String value) {
            addCriterion("COUPON_INFO <", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThanOrEqualTo(String value) {
            addCriterion("COUPON_INFO <=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLike(String value) {
            addCriterion("COUPON_INFO like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotLike(String value) {
            addCriterion("COUPON_INFO not like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIn(List<String> values) {
            addCriterion("COUPON_INFO in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotIn(List<String> values) {
            addCriterion("COUPON_INFO not in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoBetween(String value1, String value2) {
            addCriterion("COUPON_INFO between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotBetween(String value1, String value2) {
            addCriterion("COUPON_INFO not between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("COUPON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("COUPON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Long value) {
            addCriterion("COUPON_PRICE =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Long value) {
            addCriterion("COUPON_PRICE <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Long value) {
            addCriterion("COUPON_PRICE >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Long value) {
            addCriterion("COUPON_PRICE <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Long value) {
            addCriterion("COUPON_PRICE <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Long> values) {
            addCriterion("COUPON_PRICE in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Long> values) {
            addCriterion("COUPON_PRICE not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Long value1, Long value2) {
            addCriterion("COUPON_PRICE not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNull() {
            addCriterion("ACTUAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNotNull() {
            addCriterion("ACTUAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andActualPriceEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE =", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE <>", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThan(Long value) {
            addCriterion("ACTUAL_PRICE >", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE >=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThan(Long value) {
            addCriterion("ACTUAL_PRICE <", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_PRICE <=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIn(List<Long> values) {
            addCriterion("ACTUAL_PRICE in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotIn(List<Long> values) {
            addCriterion("ACTUAL_PRICE not in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_PRICE between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_PRICE not between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIsNull() {
            addCriterion("INCOME_PAY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIsNotNull() {
            addCriterion("INCOME_PAY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO =", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO <>", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoGreaterThan(String value) {
            addCriterion("INCOME_PAY_INFO >", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoGreaterThanOrEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO >=", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLessThan(String value) {
            addCriterion("INCOME_PAY_INFO <", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLessThanOrEqualTo(String value) {
            addCriterion("INCOME_PAY_INFO <=", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLike(String value) {
            addCriterion("INCOME_PAY_INFO like", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotLike(String value) {
            addCriterion("INCOME_PAY_INFO not like", value, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoIn(List<String> values) {
            addCriterion("INCOME_PAY_INFO in", values, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotIn(List<String> values) {
            addCriterion("INCOME_PAY_INFO not in", values, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoBetween(String value1, String value2) {
            addCriterion("INCOME_PAY_INFO between", value1, value2, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoNotBetween(String value1, String value2) {
            addCriterion("INCOME_PAY_INFO not between", value1, value2, "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIsNull() {
            addCriterion("COMMODITY_FLOW_RECORD_IDS is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIsNotNull() {
            addCriterion("COMMODITY_FLOW_RECORD_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS =", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <>", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsGreaterThan(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS >", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS >=", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLessThan(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS <=", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLike(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS like", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotLike(String value) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not like", value, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS in", values, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotIn(List<String> values) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not in", values, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS between", value1, value2, "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_FLOW_RECORD_IDS not between", value1, value2, "commodityFlowRecordIds");
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNull() {
            addCriterion("APPLY_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIsNotNull() {
            addCriterion("APPLY_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME =", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <>", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME >", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME >=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThan(Date value) {
            addCriterion("APPLY_CANCEL_TIME <", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_CANCEL_TIME <=", value, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotIn(List<Date> values) {
            addCriterion("APPLY_CANCEL_TIME not in", values, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andApplyCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_CANCEL_TIME not between", value1, value2, "applyCancelTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("SUCCESS_TIME =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("SUCCESS_TIME >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("SUCCESS_TIME <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("SUCCESS_TIME <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("SUCCESS_TIME in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("SUCCESS_TIME not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("SUCCESS_TIME not between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
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

        public Criteria andAccountTypeLikeInsensitive(String value) {
            addCriterion("upper(ACCOUNT_TYPE) like", value.toUpperCase(), "accountType");
            return (Criteria) this;
        }

        public Criteria andOpponentAccountTypeLikeInsensitive(String value) {
            addCriterion("upper(OPPONENT_ACCOUNT_TYPE) like", value.toUpperCase(), "opponentAccountType");
            return (Criteria) this;
        }

        public Criteria andBuyOrSellLikeInsensitive(String value) {
            addCriterion("upper(BUY_OR_SELL) like", value.toUpperCase(), "buyOrSell");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLikeInsensitive(String value) {
            addCriterion("upper(COUPON_INFO) like", value.toUpperCase(), "couponInfo");
            return (Criteria) this;
        }

        public Criteria andIncomePayInfoLikeInsensitive(String value) {
            addCriterion("upper(INCOME_PAY_INFO) like", value.toUpperCase(), "incomePayInfo");
            return (Criteria) this;
        }

        public Criteria andCommodityFlowRecordIdsLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_FLOW_RECORD_IDS) like", value.toUpperCase(), "commodityFlowRecordIds");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trade_order
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: trade_order
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