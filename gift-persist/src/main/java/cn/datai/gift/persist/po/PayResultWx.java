package cn.datai.gift.persist.po;

import java.io.Serializable;

public class PayResultWx implements Serializable {
    public static final long serialVersionUID = 638598333L;

    /**
     * : PAY_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    private String transactionId;

    /**
     * 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    private Integer payOrderWxId;

    /**
     * : PAY_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * : PAY_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    private String mchId;

    /**
     * : PAY_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    private String deviceInfo;

    /**
     * : PAY_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    private String nonceStr;

    /**
     * : PAY_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    private String sign;

    /**
     * : PAY_RESULT_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    private String signType;

    /**
     * : PAY_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * : PAY_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    private String errCode;

    /**
     * : PAY_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    private String errCodeDes;

    /**
     * : PAY_RESULT_WX.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * : PAY_RESULT_WX.IS_SUBSCRIBE
     * @author MyBatis Generator
     */
    private String isSubscribe;

    /**
     * : PAY_RESULT_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    private String tradeType;

    /**
     * : PAY_RESULT_WX.BANK_TYPE
     * @author MyBatis Generator
     */
    private String bankType;

    /**
     * : PAY_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer totalFee;

    /**
     * : PAY_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer settlementTotalFee;

    /**
     * : PAY_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    private String feeType;

    /**
     * : PAY_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    private Integer cashFee;

    /**
     * : PAY_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    private String cashFeeType;

    /**
     * : PAY_RESULT_WX.COUPON_FEE
     * @author MyBatis Generator
     */
    private Integer couponFee;

    /**
     * : PAY_RESULT_WX.COUPON_COUNT
     * @author MyBatis Generator
     */
    private Integer couponCount;

    /**
     * : PAY_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    private String couponType;

    /**
     * : PAY_RESULT_WX.COUPON_ID
     * @author MyBatis Generator
     */
    private String couponId;

    /**
     * jason格式{0:abc}: PAY_RESULT_WX.COUPON_FEE_SINGLE
     * @author MyBatis Generator
     */
    private Integer couponFeeSingle;

    /**
     * : PAY_RESULT_WX.ATTACH
     * @author MyBatis Generator
     */
    private String attach;

    /**
     * : PAY_RESULT_WX.TIME_END
     * @author MyBatis Generator
     */
    private String timeEnd;

    /**
     * 获取: PAY_RESULT_WX.TRANSACTION_ID
     * @return : PAY_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置: PAY_RESULT_WX.TRANSACTION_ID
     * @param transactionId 映射数据库字段: PAY_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_RESULT_WX.PAY_ORDER_WX_ID
     * @return 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public Integer getPayOrderWxId() {
        return payOrderWxId;
    }

    /**
     * 设置微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_RESULT_WX.PAY_ORDER_WX_ID
     * @param payOrderWxId 映射数据库字段: PAY_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public void setPayOrderWxId(Integer payOrderWxId) {
        this.payOrderWxId = payOrderWxId;
    }

    /**
     * 获取: PAY_RESULT_WX.APPID
     * @return : PAY_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置: PAY_RESULT_WX.APPID
     * @param appid 映射数据库字段: PAY_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.MCH_ID
     * @return : PAY_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置: PAY_RESULT_WX.MCH_ID
     * @param mchId 映射数据库字段: PAY_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.DEVICE_INFO
     * @return : PAY_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 设置: PAY_RESULT_WX.DEVICE_INFO
     * @param deviceInfo 映射数据库字段: PAY_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.NONCE_STR
     * @return : PAY_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public String getNonceStr() {
        return nonceStr;
    }

    /**
     * 设置: PAY_RESULT_WX.NONCE_STR
     * @param nonceStr 映射数据库字段: PAY_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr == null ? null : nonceStr.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.SIGN
     * @return : PAY_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置: PAY_RESULT_WX.SIGN
     * @param sign 映射数据库字段: PAY_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.SIGN_TYPE
     * @return : PAY_RESULT_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置: PAY_RESULT_WX.SIGN_TYPE
     * @param signType 映射数据库字段: PAY_RESULT_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.RESULT_CODE
     * @return : PAY_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置: PAY_RESULT_WX.RESULT_CODE
     * @param resultCode 映射数据库字段: PAY_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.ERR_CODE
     * @return : PAY_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置: PAY_RESULT_WX.ERR_CODE
     * @param errCode 映射数据库字段: PAY_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.ERR_CODE_DES
     * @return : PAY_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * 设置: PAY_RESULT_WX.ERR_CODE_DES
     * @param errCodeDes 映射数据库字段: PAY_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.OPENID
     * @return : PAY_RESULT_WX.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置: PAY_RESULT_WX.OPENID
     * @param openid 映射数据库字段: PAY_RESULT_WX.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.IS_SUBSCRIBE
     * @return : PAY_RESULT_WX.IS_SUBSCRIBE
     * @author MyBatis Generator
     */
    public String getIsSubscribe() {
        return isSubscribe;
    }

    /**
     * 设置: PAY_RESULT_WX.IS_SUBSCRIBE
     * @param isSubscribe 映射数据库字段: PAY_RESULT_WX.IS_SUBSCRIBE
     * @author MyBatis Generator
     */
    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe == null ? null : isSubscribe.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.TRADE_TYPE
     * @return : PAY_RESULT_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * 设置: PAY_RESULT_WX.TRADE_TYPE
     * @param tradeType 映射数据库字段: PAY_RESULT_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.BANK_TYPE
     * @return : PAY_RESULT_WX.BANK_TYPE
     * @author MyBatis Generator
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * 设置: PAY_RESULT_WX.BANK_TYPE
     * @param bankType 映射数据库字段: PAY_RESULT_WX.BANK_TYPE
     * @author MyBatis Generator
     */
    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.TOTAL_FEE
     * @return : PAY_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * 设置: PAY_RESULT_WX.TOTAL_FEE
     * @param totalFee 映射数据库字段: PAY_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取: PAY_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @return : PAY_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    /**
     * 设置: PAY_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @param settlementTotalFee 映射数据库字段: PAY_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 获取: PAY_RESULT_WX.FEE_TYPE
     * @return : PAY_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * 设置: PAY_RESULT_WX.FEE_TYPE
     * @param feeType 映射数据库字段: PAY_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.CASH_FEE
     * @return : PAY_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    public Integer getCashFee() {
        return cashFee;
    }

    /**
     * 设置: PAY_RESULT_WX.CASH_FEE
     * @param cashFee 映射数据库字段: PAY_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * 获取: PAY_RESULT_WX.CASH_FEE_TYPE
     * @return : PAY_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getCashFeeType() {
        return cashFeeType;
    }

    /**
     * 设置: PAY_RESULT_WX.CASH_FEE_TYPE
     * @param cashFeeType 映射数据库字段: PAY_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType == null ? null : cashFeeType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.COUPON_FEE
     * @return : PAY_RESULT_WX.COUPON_FEE
     * @author MyBatis Generator
     */
    public Integer getCouponFee() {
        return couponFee;
    }

    /**
     * 设置: PAY_RESULT_WX.COUPON_FEE
     * @param couponFee 映射数据库字段: PAY_RESULT_WX.COUPON_FEE
     * @author MyBatis Generator
     */
    public void setCouponFee(Integer couponFee) {
        this.couponFee = couponFee;
    }

    /**
     * 获取: PAY_RESULT_WX.COUPON_COUNT
     * @return : PAY_RESULT_WX.COUPON_COUNT
     * @author MyBatis Generator
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * 设置: PAY_RESULT_WX.COUPON_COUNT
     * @param couponCount 映射数据库字段: PAY_RESULT_WX.COUPON_COUNT
     * @author MyBatis Generator
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 获取: PAY_RESULT_WX.COUPON_TYPE
     * @return : PAY_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * 设置: PAY_RESULT_WX.COUPON_TYPE
     * @param couponType 映射数据库字段: PAY_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.COUPON_ID
     * @return : PAY_RESULT_WX.COUPON_ID
     * @author MyBatis Generator
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置: PAY_RESULT_WX.COUPON_ID
     * @param couponId 映射数据库字段: PAY_RESULT_WX.COUPON_ID
     * @author MyBatis Generator
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * 获取jason格式{0:abc}: PAY_RESULT_WX.COUPON_FEE_SINGLE
     * @return jason格式{0:abc}: PAY_RESULT_WX.COUPON_FEE_SINGLE
     * @author MyBatis Generator
     */
    public Integer getCouponFeeSingle() {
        return couponFeeSingle;
    }

    /**
     * 设置jason格式{0:abc}: PAY_RESULT_WX.COUPON_FEE_SINGLE
     * @param couponFeeSingle 映射数据库字段: PAY_RESULT_WX.COUPON_FEE_SINGLE
     * @author MyBatis Generator
     */
    public void setCouponFeeSingle(Integer couponFeeSingle) {
        this.couponFeeSingle = couponFeeSingle;
    }

    /**
     * 获取: PAY_RESULT_WX.ATTACH
     * @return : PAY_RESULT_WX.ATTACH
     * @author MyBatis Generator
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置: PAY_RESULT_WX.ATTACH
     * @param attach 映射数据库字段: PAY_RESULT_WX.ATTACH
     * @author MyBatis Generator
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    /**
     * 获取: PAY_RESULT_WX.TIME_END
     * @return : PAY_RESULT_WX.TIME_END
     * @author MyBatis Generator
     */
    public String getTimeEnd() {
        return timeEnd;
    }

    /**
     * 设置: PAY_RESULT_WX.TIME_END
     * @param timeEnd 映射数据库字段: PAY_RESULT_WX.TIME_END
     * @author MyBatis Generator
     */
    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd == null ? null : timeEnd.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
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
        PayResultWx other = (PayResultWx) that;
        return (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getPayOrderWxId() == null ? other.getPayOrderWxId() == null : this.getPayOrderWxId().equals(other.getPayOrderWxId()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getDeviceInfo() == null ? other.getDeviceInfo() == null : this.getDeviceInfo().equals(other.getDeviceInfo()))
            && (this.getNonceStr() == null ? other.getNonceStr() == null : this.getNonceStr().equals(other.getNonceStr()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getSignType() == null ? other.getSignType() == null : this.getSignType().equals(other.getSignType()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getIsSubscribe() == null ? other.getIsSubscribe() == null : this.getIsSubscribe().equals(other.getIsSubscribe()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getBankType() == null ? other.getBankType() == null : this.getBankType().equals(other.getBankType()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getSettlementTotalFee() == null ? other.getSettlementTotalFee() == null : this.getSettlementTotalFee().equals(other.getSettlementTotalFee()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getCashFee() == null ? other.getCashFee() == null : this.getCashFee().equals(other.getCashFee()))
            && (this.getCashFeeType() == null ? other.getCashFeeType() == null : this.getCashFeeType().equals(other.getCashFeeType()))
            && (this.getCouponFee() == null ? other.getCouponFee() == null : this.getCouponFee().equals(other.getCouponFee()))
            && (this.getCouponCount() == null ? other.getCouponCount() == null : this.getCouponCount().equals(other.getCouponCount()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponFeeSingle() == null ? other.getCouponFeeSingle() == null : this.getCouponFeeSingle().equals(other.getCouponFeeSingle()))
            && (this.getAttach() == null ? other.getAttach() == null : this.getAttach().equals(other.getAttach()))
            && (this.getTimeEnd() == null ? other.getTimeEnd() == null : this.getTimeEnd().equals(other.getTimeEnd()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getPayOrderWxId() == null) ? 0 : getPayOrderWxId().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        result = prime * result + ((getNonceStr() == null) ? 0 : getNonceStr().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getSignType() == null) ? 0 : getSignType().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getIsSubscribe() == null) ? 0 : getIsSubscribe().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getBankType() == null) ? 0 : getBankType().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getSettlementTotalFee() == null) ? 0 : getSettlementTotalFee().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getCashFee() == null) ? 0 : getCashFee().hashCode());
        result = prime * result + ((getCashFeeType() == null) ? 0 : getCashFeeType().hashCode());
        result = prime * result + ((getCouponFee() == null) ? 0 : getCouponFee().hashCode());
        result = prime * result + ((getCouponCount() == null) ? 0 : getCouponCount().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponFeeSingle() == null) ? 0 : getCouponFeeSingle().hashCode());
        result = prime * result + ((getAttach() == null) ? 0 : getAttach().hashCode());
        result = prime * result + ((getTimeEnd() == null) ? 0 : getTimeEnd().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", payOrderWxId=").append(payOrderWxId);
        sb.append(", appid=").append(appid);
        sb.append(", mchId=").append(mchId);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", nonceStr=").append(nonceStr);
        sb.append(", sign=").append(sign);
        sb.append(", signType=").append(signType);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
        sb.append(", openid=").append(openid);
        sb.append(", isSubscribe=").append(isSubscribe);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", bankType=").append(bankType);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", settlementTotalFee=").append(settlementTotalFee);
        sb.append(", feeType=").append(feeType);
        sb.append(", cashFee=").append(cashFee);
        sb.append(", cashFeeType=").append(cashFeeType);
        sb.append(", couponFee=").append(couponFee);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponFeeSingle=").append(couponFeeSingle);
        sb.append(", attach=").append(attach);
        sb.append(", timeEnd=").append(timeEnd);
        sb.append("]");
        return sb.toString();
    }
}