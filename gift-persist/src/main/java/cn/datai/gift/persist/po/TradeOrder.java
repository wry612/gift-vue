package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeOrder implements Serializable {
    public static final long serialVersionUID = -850594477L;

    /**
     * : trade_order.TRADE_ORDER_ID
     * @author MyBatis Generator
     */
    private Long tradeOrderId;

    /**
     * 当前交易账户id: trade_order.ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long accountId;

    /**
     * 当前主账户类型     USER:用户     OPERATOR:运营商: trade_order.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    private String accountType;

    /**
     * 对方交易账户id: trade_order.OPPONENT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long opponentAccountId;

    /**
     * 对方主账户类型     USER:用户     OPERATOR:运营商: trade_order.OPPONENT_ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    private String opponentAccountType;

    /**
     * 买卖方向   buy:买   sell:卖: trade_order.BUY_OR_SELL
     * @author MyBatis Generator
     */
    private String buyOrSell;

    /**
     * 商品合约id: trade_order.COMMODITY_ID
     * @author MyBatis Generator
     */
    private Long commodityId;

    /**
     * 商品单位数量: trade_order.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commodityUnitQuantity;

    /**
     * 商品单位单价, 分为单位: trade_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    private Long commodityUnitPrice;

    /**
     * 商品规格单位数量: trade_order.COMMODITY_STANDARD_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commodityStandardQuantity;

    /**
     * 商品规格单位单价 分为单位: trade_order.COMMODITY_STANDARD_PRICE
     * @author MyBatis Generator
     */
    private Long commodityStandardPrice;

    /**
     * 手续费比例, 百分比为单位: trade_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    private BigDecimal feePercent;

    /**
     * 手续费, 单位为分: trade_order.FEE_PRICE
     * @author MyBatis Generator
     */
    private Long feePrice;

    /**
     * 优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: trade_order.COUPON_INFO
     * @author MyBatis Generator
     */
    private String couponInfo;

    /**
     * 优惠折扣金额， 使用优惠券折扣券折扣或额外获取的金额，  正数：用户获得的额外金额    负数：用户需要额外支付的金额: trade_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    private Long couponPrice;

    /**
     * 用户实际金额变化， 商品总价加上优惠折扣金额  单位为分   正数：用户获得金额     负数：用户扣除金额: trade_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    private Long actualPrice;

    /**
     * 收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: trade_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    private String incomePayInfo;

    /**
     * 商品流通记录信息ids， 多个用逗号隔开: trade_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 注释: trade_order.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 状态        NOPAY：未支付   PAID：已支付   CANCELLED:已取消: trade_order.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 创建时间: trade_order.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 下单时间: trade_order.ORDER_TIME
     * @author MyBatis Generator
     */
    private Date orderTime;

    /**
     * 申请取消时间: trade_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    private Date applyCancelTime;

    /**
     * 完成时间: trade_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    private Date successTime;

    /**
     * 关闭时间: trade_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    private Date closeTime;

    /**
     * 超时时间: trade_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    private Date expireTime;

    /**
     * 获取: trade_order.TRADE_ORDER_ID
     * @return : trade_order.TRADE_ORDER_ID
     * @author MyBatis Generator
     */
    public Long getTradeOrderId() {
        return tradeOrderId;
    }

    /**
     * 设置: trade_order.TRADE_ORDER_ID
     * @param tradeOrderId 映射数据库字段: trade_order.TRADE_ORDER_ID
     * @author MyBatis Generator
     */
    public void setTradeOrderId(Long tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
    }

    /**
     * 获取当前交易账户id: trade_order.ACCOUNT_ID
     * @return 当前交易账户id: trade_order.ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置当前交易账户id: trade_order.ACCOUNT_ID
     * @param accountId 映射数据库字段: trade_order.ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取当前主账户类型     USER:用户     OPERATOR:运营商: trade_order.ACCOUNT_TYPE
     * @return 当前主账户类型     USER:用户     OPERATOR:运营商: trade_order.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置当前主账户类型     USER:用户     OPERATOR:运营商: trade_order.ACCOUNT_TYPE
     * @param accountType 映射数据库字段: trade_order.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取对方交易账户id: trade_order.OPPONENT_ACCOUNT_ID
     * @return 对方交易账户id: trade_order.OPPONENT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getOpponentAccountId() {
        return opponentAccountId;
    }

    /**
     * 设置对方交易账户id: trade_order.OPPONENT_ACCOUNT_ID
     * @param opponentAccountId 映射数据库字段: trade_order.OPPONENT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setOpponentAccountId(Long opponentAccountId) {
        this.opponentAccountId = opponentAccountId;
    }

    /**
     * 获取对方主账户类型     USER:用户     OPERATOR:运营商: trade_order.OPPONENT_ACCOUNT_TYPE
     * @return 对方主账户类型     USER:用户     OPERATOR:运营商: trade_order.OPPONENT_ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public String getOpponentAccountType() {
        return opponentAccountType;
    }

    /**
     * 设置对方主账户类型     USER:用户     OPERATOR:运营商: trade_order.OPPONENT_ACCOUNT_TYPE
     * @param opponentAccountType 映射数据库字段: trade_order.OPPONENT_ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public void setOpponentAccountType(String opponentAccountType) {
        this.opponentAccountType = opponentAccountType == null ? null : opponentAccountType.trim();
    }

    /**
     * 获取买卖方向   buy:买   sell:卖: trade_order.BUY_OR_SELL
     * @return 买卖方向   buy:买   sell:卖: trade_order.BUY_OR_SELL
     * @author MyBatis Generator
     */
    public String getBuyOrSell() {
        return buyOrSell;
    }

    /**
     * 设置买卖方向   buy:买   sell:卖: trade_order.BUY_OR_SELL
     * @param buyOrSell 映射数据库字段: trade_order.BUY_OR_SELL
     * @author MyBatis Generator
     */
    public void setBuyOrSell(String buyOrSell) {
        this.buyOrSell = buyOrSell == null ? null : buyOrSell.trim();
    }

    /**
     * 获取商品合约id: trade_order.COMMODITY_ID
     * @return 商品合约id: trade_order.COMMODITY_ID
     * @author MyBatis Generator
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品合约id: trade_order.COMMODITY_ID
     * @param commodityId 映射数据库字段: trade_order.COMMODITY_ID
     * @author MyBatis Generator
     */
    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品单位数量: trade_order.COMMODITY_UNIT_QUANTITY
     * @return 商品单位数量: trade_order.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommodityUnitQuantity() {
        return commodityUnitQuantity;
    }

    /**
     * 设置商品单位数量: trade_order.COMMODITY_UNIT_QUANTITY
     * @param commodityUnitQuantity 映射数据库字段: trade_order.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommodityUnitQuantity(BigDecimal commodityUnitQuantity) {
        this.commodityUnitQuantity = commodityUnitQuantity;
    }

    /**
     * 获取商品单位单价, 分为单位: trade_order.COMMODITY_UNIT_PRICE
     * @return 商品单位单价, 分为单位: trade_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    public Long getCommodityUnitPrice() {
        return commodityUnitPrice;
    }

    /**
     * 设置商品单位单价, 分为单位: trade_order.COMMODITY_UNIT_PRICE
     * @param commodityUnitPrice 映射数据库字段: trade_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    public void setCommodityUnitPrice(Long commodityUnitPrice) {
        this.commodityUnitPrice = commodityUnitPrice;
    }

    /**
     * 获取商品规格单位数量: trade_order.COMMODITY_STANDARD_QUANTITY
     * @return 商品规格单位数量: trade_order.COMMODITY_STANDARD_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommodityStandardQuantity() {
        return commodityStandardQuantity;
    }

    /**
     * 设置商品规格单位数量: trade_order.COMMODITY_STANDARD_QUANTITY
     * @param commodityStandardQuantity 映射数据库字段: trade_order.COMMODITY_STANDARD_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommodityStandardQuantity(BigDecimal commodityStandardQuantity) {
        this.commodityStandardQuantity = commodityStandardQuantity;
    }

    /**
     * 获取商品规格单位单价 分为单位: trade_order.COMMODITY_STANDARD_PRICE
     * @return 商品规格单位单价 分为单位: trade_order.COMMODITY_STANDARD_PRICE
     * @author MyBatis Generator
     */
    public Long getCommodityStandardPrice() {
        return commodityStandardPrice;
    }

    /**
     * 设置商品规格单位单价 分为单位: trade_order.COMMODITY_STANDARD_PRICE
     * @param commodityStandardPrice 映射数据库字段: trade_order.COMMODITY_STANDARD_PRICE
     * @author MyBatis Generator
     */
    public void setCommodityStandardPrice(Long commodityStandardPrice) {
        this.commodityStandardPrice = commodityStandardPrice;
    }

    /**
     * 获取手续费比例, 百分比为单位: trade_order.FEE_PERCENT
     * @return 手续费比例, 百分比为单位: trade_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    public BigDecimal getFeePercent() {
        return feePercent;
    }

    /**
     * 设置手续费比例, 百分比为单位: trade_order.FEE_PERCENT
     * @param feePercent 映射数据库字段: trade_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    public void setFeePercent(BigDecimal feePercent) {
        this.feePercent = feePercent;
    }

    /**
     * 获取手续费, 单位为分: trade_order.FEE_PRICE
     * @return 手续费, 单位为分: trade_order.FEE_PRICE
     * @author MyBatis Generator
     */
    public Long getFeePrice() {
        return feePrice;
    }

    /**
     * 设置手续费, 单位为分: trade_order.FEE_PRICE
     * @param feePrice 映射数据库字段: trade_order.FEE_PRICE
     * @author MyBatis Generator
     */
    public void setFeePrice(Long feePrice) {
        this.feePrice = feePrice;
    }

    /**
     * 获取优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: trade_order.COUPON_INFO
     * @return 优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: trade_order.COUPON_INFO
     * @author MyBatis Generator
     */
    public String getCouponInfo() {
        return couponInfo;
    }

    /**
     * 设置优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: trade_order.COUPON_INFO
     * @param couponInfo 映射数据库字段: trade_order.COUPON_INFO
     * @author MyBatis Generator
     */
    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    /**
     * 获取优惠折扣金额， 使用优惠券折扣券折扣或额外获取的金额，  正数：用户获得的额外金额    负数：用户需要额外支付的金额: trade_order.COUPON_PRICE
     * @return 优惠折扣金额， 使用优惠券折扣券折扣或额外获取的金额，  正数：用户获得的额外金额    负数：用户需要额外支付的金额: trade_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    public Long getCouponPrice() {
        return couponPrice;
    }

    /**
     * 设置优惠折扣金额， 使用优惠券折扣券折扣或额外获取的金额，  正数：用户获得的额外金额    负数：用户需要额外支付的金额: trade_order.COUPON_PRICE
     * @param couponPrice 映射数据库字段: trade_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    public void setCouponPrice(Long couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 获取用户实际金额变化， 商品总价加上优惠折扣金额  单位为分   正数：用户获得金额     负数：用户扣除金额: trade_order.ACTUAL_PRICE
     * @return 用户实际金额变化， 商品总价加上优惠折扣金额  单位为分   正数：用户获得金额     负数：用户扣除金额: trade_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    public Long getActualPrice() {
        return actualPrice;
    }

    /**
     * 设置用户实际金额变化， 商品总价加上优惠折扣金额  单位为分   正数：用户获得金额     负数：用户扣除金额: trade_order.ACTUAL_PRICE
     * @param actualPrice 映射数据库字段: trade_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    public void setActualPrice(Long actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * 获取收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: trade_order.INCOME_PAY_INFO
     * @return 收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: trade_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    public String getIncomePayInfo() {
        return incomePayInfo;
    }

    /**
     * 设置收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: trade_order.INCOME_PAY_INFO
     * @param incomePayInfo 映射数据库字段: trade_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    public void setIncomePayInfo(String incomePayInfo) {
        this.incomePayInfo = incomePayInfo == null ? null : incomePayInfo.trim();
    }

    /**
     * 获取商品流通记录信息ids， 多个用逗号隔开: trade_order.COMMODITY_FLOW_RECORD_IDS
     * @return 商品流通记录信息ids， 多个用逗号隔开: trade_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置商品流通记录信息ids， 多个用逗号隔开: trade_order.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: trade_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 获取注释: trade_order.REMARK
     * @return 注释: trade_order.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: trade_order.REMARK
     * @param remark 映射数据库字段: trade_order.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取状态        NOPAY：未支付   PAID：已支付   CANCELLED:已取消: trade_order.STATUS
     * @return 状态        NOPAY：未支付   PAID：已支付   CANCELLED:已取消: trade_order.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态        NOPAY：未支付   PAID：已支付   CANCELLED:已取消: trade_order.STATUS
     * @param status 映射数据库字段: trade_order.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间: trade_order.CREATE_TIME
     * @return 创建时间: trade_order.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: trade_order.CREATE_TIME
     * @param createTime 映射数据库字段: trade_order.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取下单时间: trade_order.ORDER_TIME
     * @return 下单时间: trade_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置下单时间: trade_order.ORDER_TIME
     * @param orderTime 映射数据库字段: trade_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取申请取消时间: trade_order.APPLY_CANCEL_TIME
     * @return 申请取消时间: trade_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public Date getApplyCancelTime() {
        return applyCancelTime;
    }

    /**
     * 设置申请取消时间: trade_order.APPLY_CANCEL_TIME
     * @param applyCancelTime 映射数据库字段: trade_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public void setApplyCancelTime(Date applyCancelTime) {
        this.applyCancelTime = applyCancelTime;
    }

    /**
     * 获取完成时间: trade_order.SUCCESS_TIME
     * @return 完成时间: trade_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置完成时间: trade_order.SUCCESS_TIME
     * @param successTime 映射数据库字段: trade_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取关闭时间: trade_order.CLOSE_TIME
     * @return 关闭时间: trade_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置关闭时间: trade_order.CLOSE_TIME
     * @param closeTime 映射数据库字段: trade_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取超时时间: trade_order.EXPIRE_TIME
     * @return 超时时间: trade_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置超时时间: trade_order.EXPIRE_TIME
     * @param expireTime 映射数据库字段: trade_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TradeOrder other = (TradeOrder) that;
        return (this.getTradeOrderId() == null ? other.getTradeOrderId() == null : this.getTradeOrderId().equals(other.getTradeOrderId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getOpponentAccountId() == null ? other.getOpponentAccountId() == null : this.getOpponentAccountId().equals(other.getOpponentAccountId()))
            && (this.getOpponentAccountType() == null ? other.getOpponentAccountType() == null : this.getOpponentAccountType().equals(other.getOpponentAccountType()))
            && (this.getBuyOrSell() == null ? other.getBuyOrSell() == null : this.getBuyOrSell().equals(other.getBuyOrSell()))
            && (this.getCommodityId() == null ? other.getCommodityId() == null : this.getCommodityId().equals(other.getCommodityId()))
            && (this.getCommodityUnitQuantity() == null ? other.getCommodityUnitQuantity() == null : this.getCommodityUnitQuantity().equals(other.getCommodityUnitQuantity()))
            && (this.getCommodityUnitPrice() == null ? other.getCommodityUnitPrice() == null : this.getCommodityUnitPrice().equals(other.getCommodityUnitPrice()))
            && (this.getCommodityStandardQuantity() == null ? other.getCommodityStandardQuantity() == null : this.getCommodityStandardQuantity().equals(other.getCommodityStandardQuantity()))
            && (this.getCommodityStandardPrice() == null ? other.getCommodityStandardPrice() == null : this.getCommodityStandardPrice().equals(other.getCommodityStandardPrice()))
            && (this.getFeePercent() == null ? other.getFeePercent() == null : this.getFeePercent().equals(other.getFeePercent()))
            && (this.getFeePrice() == null ? other.getFeePrice() == null : this.getFeePrice().equals(other.getFeePrice()))
            && (this.getCouponInfo() == null ? other.getCouponInfo() == null : this.getCouponInfo().equals(other.getCouponInfo()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getActualPrice() == null ? other.getActualPrice() == null : this.getActualPrice().equals(other.getActualPrice()))
            && (this.getIncomePayInfo() == null ? other.getIncomePayInfo() == null : this.getIncomePayInfo().equals(other.getIncomePayInfo()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getApplyCancelTime() == null ? other.getApplyCancelTime() == null : this.getApplyCancelTime().equals(other.getApplyCancelTime()))
            && (this.getSuccessTime() == null ? other.getSuccessTime() == null : this.getSuccessTime().equals(other.getSuccessTime()))
            && (this.getCloseTime() == null ? other.getCloseTime() == null : this.getCloseTime().equals(other.getCloseTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeOrderId() == null) ? 0 : getTradeOrderId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getOpponentAccountId() == null) ? 0 : getOpponentAccountId().hashCode());
        result = prime * result + ((getOpponentAccountType() == null) ? 0 : getOpponentAccountType().hashCode());
        result = prime * result + ((getBuyOrSell() == null) ? 0 : getBuyOrSell().hashCode());
        result = prime * result + ((getCommodityId() == null) ? 0 : getCommodityId().hashCode());
        result = prime * result + ((getCommodityUnitQuantity() == null) ? 0 : getCommodityUnitQuantity().hashCode());
        result = prime * result + ((getCommodityUnitPrice() == null) ? 0 : getCommodityUnitPrice().hashCode());
        result = prime * result + ((getCommodityStandardQuantity() == null) ? 0 : getCommodityStandardQuantity().hashCode());
        result = prime * result + ((getCommodityStandardPrice() == null) ? 0 : getCommodityStandardPrice().hashCode());
        result = prime * result + ((getFeePercent() == null) ? 0 : getFeePercent().hashCode());
        result = prime * result + ((getFeePrice() == null) ? 0 : getFeePrice().hashCode());
        result = prime * result + ((getCouponInfo() == null) ? 0 : getCouponInfo().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getActualPrice() == null) ? 0 : getActualPrice().hashCode());
        result = prime * result + ((getIncomePayInfo() == null) ? 0 : getIncomePayInfo().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getApplyCancelTime() == null) ? 0 : getApplyCancelTime().hashCode());
        result = prime * result + ((getSuccessTime() == null) ? 0 : getSuccessTime().hashCode());
        result = prime * result + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", tradeOrderId=").append(tradeOrderId);
        sb.append(", accountId=").append(accountId);
        sb.append(", accountType=").append(accountType);
        sb.append(", opponentAccountId=").append(opponentAccountId);
        sb.append(", opponentAccountType=").append(opponentAccountType);
        sb.append(", buyOrSell=").append(buyOrSell);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", commodityUnitQuantity=").append(commodityUnitQuantity);
        sb.append(", commodityUnitPrice=").append(commodityUnitPrice);
        sb.append(", commodityStandardQuantity=").append(commodityStandardQuantity);
        sb.append(", commodityStandardPrice=").append(commodityStandardPrice);
        sb.append(", feePercent=").append(feePercent);
        sb.append(", feePrice=").append(feePrice);
        sb.append(", couponInfo=").append(couponInfo);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", actualPrice=").append(actualPrice);
        sb.append(", incomePayInfo=").append(incomePayInfo);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", applyCancelTime=").append(applyCancelTime);
        sb.append(", successTime=").append(successTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append("]");
        return sb.toString();
    }
}