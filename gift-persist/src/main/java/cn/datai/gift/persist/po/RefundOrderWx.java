package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class RefundOrderWx implements Serializable {
    public static final long serialVersionUID = -2026029426L;

    /**
     * 商户退款单号: refund_order_wx.OUT_REFUND_NO
     * @author MyBatis Generator
     */
    private String outRefundNo;

    /**
     * 微信退款单号: refund_order_wx.REFUND_ID
     * @author MyBatis Generator
     */
    private String refundId;

    /**
     * 微信支付订单号: refund_order_wx.TRANSACTION_ID
     * @author MyBatis Generator
     */
    private String transactionId;

    /**
     * 商户订单号: refund_order_wx.OUT_TRADE_NO
     * @author MyBatis Generator
     */
    private String outTradeNo;

    /**
     * 微信分配的公众账号ID: refund_order_wx.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 订单总金额，单位为分，只能为整数: refund_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Long totalFee;

    /**
     * 退款总金额，订单总金额，单位为分，只能为整数: refund_order_wx.REFUND_FEE
     * @author MyBatis Generator
     */
    private Long refundFee;

    /**
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    private String refundFeeType;

    /**
     * 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: refund_order_wx.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    private Long settlementRefundFee;

    /**
     * 去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额: refund_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    private Long settlementTotalFee;

    /**
     * 现金支付金额，单位为分，只能为整数: refund_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    private Long cashFee;

    /**
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    private String cashFeeType;

    /**
     * 现金退款金额，单位为分，只能为整数: refund_order_wx.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    private Long cashRefundFee;

    /**
     * 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: refund_order_wx.COUPON_REFUND_FEE
     * @author MyBatis Generator
     */
    private Long couponRefundFee;

    /**
     * 退款代金券使用数量: refund_order_wx.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    private Integer couponRefundCount;

    /**
     * 代金券退款信息JSON: refund_order_wx.COUPON_INFO
     * @author MyBatis Generator
     */
    private String couponInfo;

    /**
     * SUCCESS/FAIL，SUCCESS退款申请接收成功，结果通过退款查询接口查询: refund_order_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * 退款状态：SUCCESS—退款成功；REFUNDCLOSE—退款关闭；NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中；CHANGE—退款异常: refund_order_wx.REFUND_STATUS
     * @author MyBatis Generator
     */
    private String refundStatus;

    /**
     * 已查询次数: refund_order_wx.QUERY_COUNT
     * @author MyBatis Generator
     */
    private Integer queryCount;

    /**
     * 下次查询退款状态时间: refund_order_wx.QUERY_TIME
     * @author MyBatis Generator
     */
    private Date queryTime;

    /**
     * 创建时间: refund_order_wx.CREATETIME
     * @author MyBatis Generator
     */
    private Date createtime;

    /**
     * 获取商户退款单号: refund_order_wx.OUT_REFUND_NO
     * @return 商户退款单号: refund_order_wx.OUT_REFUND_NO
     * @author MyBatis Generator
     */
    public String getOutRefundNo() {
        return outRefundNo;
    }

    /**
     * 设置商户退款单号: refund_order_wx.OUT_REFUND_NO
     * @param outRefundNo 映射数据库字段: refund_order_wx.OUT_REFUND_NO
     * @author MyBatis Generator
     */
    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo == null ? null : outRefundNo.trim();
    }

    /**
     * 获取微信退款单号: refund_order_wx.REFUND_ID
     * @return 微信退款单号: refund_order_wx.REFUND_ID
     * @author MyBatis Generator
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * 设置微信退款单号: refund_order_wx.REFUND_ID
     * @param refundId 映射数据库字段: refund_order_wx.REFUND_ID
     * @author MyBatis Generator
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    /**
     * 获取微信支付订单号: refund_order_wx.TRANSACTION_ID
     * @return 微信支付订单号: refund_order_wx.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置微信支付订单号: refund_order_wx.TRANSACTION_ID
     * @param transactionId 映射数据库字段: refund_order_wx.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取商户订单号: refund_order_wx.OUT_TRADE_NO
     * @return 商户订单号: refund_order_wx.OUT_TRADE_NO
     * @author MyBatis Generator
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * 设置商户订单号: refund_order_wx.OUT_TRADE_NO
     * @param outTradeNo 映射数据库字段: refund_order_wx.OUT_TRADE_NO
     * @author MyBatis Generator
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    /**
     * 获取微信分配的公众账号ID: refund_order_wx.APPID
     * @return 微信分配的公众账号ID: refund_order_wx.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置微信分配的公众账号ID: refund_order_wx.APPID
     * @param appid 映射数据库字段: refund_order_wx.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取订单总金额，单位为分，只能为整数: refund_order_wx.TOTAL_FEE
     * @return 订单总金额，单位为分，只能为整数: refund_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 设置订单总金额，单位为分，只能为整数: refund_order_wx.TOTAL_FEE
     * @param totalFee 映射数据库字段: refund_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取退款总金额，订单总金额，单位为分，只能为整数: refund_order_wx.REFUND_FEE
     * @return 退款总金额，订单总金额，单位为分，只能为整数: refund_order_wx.REFUND_FEE
     * @author MyBatis Generator
     */
    public Long getRefundFee() {
        return refundFee;
    }

    /**
     * 设置退款总金额，订单总金额，单位为分，只能为整数: refund_order_wx.REFUND_FEE
     * @param refundFee 映射数据库字段: refund_order_wx.REFUND_FEE
     * @author MyBatis Generator
     */
    public void setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * 获取货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.REFUND_FEE_TYPE
     * @return 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getRefundFeeType() {
        return refundFeeType;
    }

    /**
     * 设置货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.REFUND_FEE_TYPE
     * @param refundFeeType 映射数据库字段: refund_order_wx.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType == null ? null : refundFeeType.trim();
    }

    /**
     * 获取去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: refund_order_wx.SETTLEMENT_REFUND_FEE
     * @return 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: refund_order_wx.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    public Long getSettlementRefundFee() {
        return settlementRefundFee;
    }

    /**
     * 设置去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: refund_order_wx.SETTLEMENT_REFUND_FEE
     * @param settlementRefundFee 映射数据库字段: refund_order_wx.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    public void setSettlementRefundFee(Long settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    /**
     * 获取去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额: refund_order_wx.SETTLEMENT_TOTAL_FEE
     * @return 去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额: refund_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public Long getSettlementTotalFee() {
        return settlementTotalFee;
    }

    /**
     * 设置去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额: refund_order_wx.SETTLEMENT_TOTAL_FEE
     * @param settlementTotalFee 映射数据库字段: refund_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setSettlementTotalFee(Long settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 获取现金支付金额，单位为分，只能为整数: refund_order_wx.CASH_FEE
     * @return 现金支付金额，单位为分，只能为整数: refund_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    public Long getCashFee() {
        return cashFee;
    }

    /**
     * 设置现金支付金额，单位为分，只能为整数: refund_order_wx.CASH_FEE
     * @param cashFee 映射数据库字段: refund_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    public void setCashFee(Long cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * 获取货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.CASH_FEE_TYPE
     * @return 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getCashFeeType() {
        return cashFeeType;
    }

    /**
     * 设置货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: refund_order_wx.CASH_FEE_TYPE
     * @param cashFeeType 映射数据库字段: refund_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType == null ? null : cashFeeType.trim();
    }

    /**
     * 获取现金退款金额，单位为分，只能为整数: refund_order_wx.CASH_REFUND_FEE
     * @return 现金退款金额，单位为分，只能为整数: refund_order_wx.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    public Long getCashRefundFee() {
        return cashRefundFee;
    }

    /**
     * 设置现金退款金额，单位为分，只能为整数: refund_order_wx.CASH_REFUND_FEE
     * @param cashRefundFee 映射数据库字段: refund_order_wx.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    public void setCashRefundFee(Long cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    /**
     * 获取代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: refund_order_wx.COUPON_REFUND_FEE
     * @return 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: refund_order_wx.COUPON_REFUND_FEE
     * @author MyBatis Generator
     */
    public Long getCouponRefundFee() {
        return couponRefundFee;
    }

    /**
     * 设置代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: refund_order_wx.COUPON_REFUND_FEE
     * @param couponRefundFee 映射数据库字段: refund_order_wx.COUPON_REFUND_FEE
     * @author MyBatis Generator
     */
    public void setCouponRefundFee(Long couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    /**
     * 获取退款代金券使用数量: refund_order_wx.COUPON_REFUND_COUNT
     * @return 退款代金券使用数量: refund_order_wx.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    public Integer getCouponRefundCount() {
        return couponRefundCount;
    }

    /**
     * 设置退款代金券使用数量: refund_order_wx.COUPON_REFUND_COUNT
     * @param couponRefundCount 映射数据库字段: refund_order_wx.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    public void setCouponRefundCount(Integer couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    /**
     * 获取代金券退款信息JSON: refund_order_wx.COUPON_INFO
     * @return 代金券退款信息JSON: refund_order_wx.COUPON_INFO
     * @author MyBatis Generator
     */
    public String getCouponInfo() {
        return couponInfo;
    }

    /**
     * 设置代金券退款信息JSON: refund_order_wx.COUPON_INFO
     * @param couponInfo 映射数据库字段: refund_order_wx.COUPON_INFO
     * @author MyBatis Generator
     */
    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    /**
     * 获取SUCCESS/FAIL，SUCCESS退款申请接收成功，结果通过退款查询接口查询: refund_order_wx.RESULT_CODE
     * @return SUCCESS/FAIL，SUCCESS退款申请接收成功，结果通过退款查询接口查询: refund_order_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置SUCCESS/FAIL，SUCCESS退款申请接收成功，结果通过退款查询接口查询: refund_order_wx.RESULT_CODE
     * @param resultCode 映射数据库字段: refund_order_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取退款状态：SUCCESS—退款成功；REFUNDCLOSE—退款关闭；NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中；CHANGE—退款异常: refund_order_wx.REFUND_STATUS
     * @return 退款状态：SUCCESS—退款成功；REFUNDCLOSE—退款关闭；NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中；CHANGE—退款异常: refund_order_wx.REFUND_STATUS
     * @author MyBatis Generator
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态：SUCCESS—退款成功；REFUNDCLOSE—退款关闭；NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中；CHANGE—退款异常: refund_order_wx.REFUND_STATUS
     * @param refundStatus 映射数据库字段: refund_order_wx.REFUND_STATUS
     * @author MyBatis Generator
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    /**
     * 获取已查询次数: refund_order_wx.QUERY_COUNT
     * @return 已查询次数: refund_order_wx.QUERY_COUNT
     * @author MyBatis Generator
     */
    public Integer getQueryCount() {
        return queryCount;
    }

    /**
     * 设置已查询次数: refund_order_wx.QUERY_COUNT
     * @param queryCount 映射数据库字段: refund_order_wx.QUERY_COUNT
     * @author MyBatis Generator
     */
    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    /**
     * 获取下次查询退款状态时间: refund_order_wx.QUERY_TIME
     * @return 下次查询退款状态时间: refund_order_wx.QUERY_TIME
     * @author MyBatis Generator
     */
    public Date getQueryTime() {
        return queryTime;
    }

    /**
     * 设置下次查询退款状态时间: refund_order_wx.QUERY_TIME
     * @param queryTime 映射数据库字段: refund_order_wx.QUERY_TIME
     * @author MyBatis Generator
     */
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * 获取创建时间: refund_order_wx.CREATETIME
     * @return 创建时间: refund_order_wx.CREATETIME
     * @author MyBatis Generator
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间: refund_order_wx.CREATETIME
     * @param createtime 映射数据库字段: refund_order_wx.CREATETIME
     * @author MyBatis Generator
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
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
        RefundOrderWx other = (RefundOrderWx) that;
        return (this.getOutRefundNo() == null ? other.getOutRefundNo() == null : this.getOutRefundNo().equals(other.getOutRefundNo()))
            && (this.getRefundId() == null ? other.getRefundId() == null : this.getRefundId().equals(other.getRefundId()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getOutTradeNo() == null ? other.getOutTradeNo() == null : this.getOutTradeNo().equals(other.getOutTradeNo()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getRefundFee() == null ? other.getRefundFee() == null : this.getRefundFee().equals(other.getRefundFee()))
            && (this.getRefundFeeType() == null ? other.getRefundFeeType() == null : this.getRefundFeeType().equals(other.getRefundFeeType()))
            && (this.getSettlementRefundFee() == null ? other.getSettlementRefundFee() == null : this.getSettlementRefundFee().equals(other.getSettlementRefundFee()))
            && (this.getSettlementTotalFee() == null ? other.getSettlementTotalFee() == null : this.getSettlementTotalFee().equals(other.getSettlementTotalFee()))
            && (this.getCashFee() == null ? other.getCashFee() == null : this.getCashFee().equals(other.getCashFee()))
            && (this.getCashFeeType() == null ? other.getCashFeeType() == null : this.getCashFeeType().equals(other.getCashFeeType()))
            && (this.getCashRefundFee() == null ? other.getCashRefundFee() == null : this.getCashRefundFee().equals(other.getCashRefundFee()))
            && (this.getCouponRefundFee() == null ? other.getCouponRefundFee() == null : this.getCouponRefundFee().equals(other.getCouponRefundFee()))
            && (this.getCouponRefundCount() == null ? other.getCouponRefundCount() == null : this.getCouponRefundCount().equals(other.getCouponRefundCount()))
            && (this.getCouponInfo() == null ? other.getCouponInfo() == null : this.getCouponInfo().equals(other.getCouponInfo()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()))
            && (this.getQueryCount() == null ? other.getQueryCount() == null : this.getQueryCount().equals(other.getQueryCount()))
            && (this.getQueryTime() == null ? other.getQueryTime() == null : this.getQueryTime().equals(other.getQueryTime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutRefundNo() == null) ? 0 : getOutRefundNo().hashCode());
        result = prime * result + ((getRefundId() == null) ? 0 : getRefundId().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getOutTradeNo() == null) ? 0 : getOutTradeNo().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getRefundFee() == null) ? 0 : getRefundFee().hashCode());
        result = prime * result + ((getRefundFeeType() == null) ? 0 : getRefundFeeType().hashCode());
        result = prime * result + ((getSettlementRefundFee() == null) ? 0 : getSettlementRefundFee().hashCode());
        result = prime * result + ((getSettlementTotalFee() == null) ? 0 : getSettlementTotalFee().hashCode());
        result = prime * result + ((getCashFee() == null) ? 0 : getCashFee().hashCode());
        result = prime * result + ((getCashFeeType() == null) ? 0 : getCashFeeType().hashCode());
        result = prime * result + ((getCashRefundFee() == null) ? 0 : getCashRefundFee().hashCode());
        result = prime * result + ((getCouponRefundFee() == null) ? 0 : getCouponRefundFee().hashCode());
        result = prime * result + ((getCouponRefundCount() == null) ? 0 : getCouponRefundCount().hashCode());
        result = prime * result + ((getCouponInfo() == null) ? 0 : getCouponInfo().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        result = prime * result + ((getQueryCount() == null) ? 0 : getQueryCount().hashCode());
        result = prime * result + ((getQueryTime() == null) ? 0 : getQueryTime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", outRefundNo=").append(outRefundNo);
        sb.append(", refundId=").append(refundId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", appid=").append(appid);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", refundFeeType=").append(refundFeeType);
        sb.append(", settlementRefundFee=").append(settlementRefundFee);
        sb.append(", settlementTotalFee=").append(settlementTotalFee);
        sb.append(", cashFee=").append(cashFee);
        sb.append(", cashFeeType=").append(cashFeeType);
        sb.append(", cashRefundFee=").append(cashRefundFee);
        sb.append(", couponRefundFee=").append(couponRefundFee);
        sb.append(", couponRefundCount=").append(couponRefundCount);
        sb.append(", couponInfo=").append(couponInfo);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", queryCount=").append(queryCount);
        sb.append(", queryTime=").append(queryTime);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}