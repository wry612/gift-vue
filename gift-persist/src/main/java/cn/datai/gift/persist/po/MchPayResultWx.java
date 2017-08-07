package cn.datai.gift.persist.po;

import java.io.Serializable;

public class MchPayResultWx implements Serializable {
    public static final long serialVersionUID = 145867837L;

    /**
     * 商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_result_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    private String partnerTradeNo;

    /**
     * 商户号，微信支付分配的商户号: mch_pay_result_wx.MCH_ID
     * @author MyBatis Generator
     */
    private String mchId;

    /**
     * Appid，商户号的appid: mch_pay_result_wx.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 付款单号，调用企业付款API时，微信系统内部产生的单号: mch_pay_result_wx.DETAIL_ID
     * @author MyBatis Generator
     */
    private String detailId;

    /**
     * 签名: mch_pay_result_wx.SIGN
     * @author MyBatis Generator
     */
    private String sign;

    /**
     * 业务结果 SUCCESS/FAIL: mch_pay_result_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * 错误码信息: mch_pay_result_wx.ERR_CODE
     * @author MyBatis Generator
     */
    private String errCode;

    /**
     * 错误代码描述，结果信息描述: mch_pay_result_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    private String errCodeDes;

    /**
     * 转账状态: mch_pay_result_wx.TRANSFER_STATUS
     * @author MyBatis Generator
     */
    private String transferStatus;

    /**
     * 失败原因,如果失败则有失败原因: mch_pay_result_wx.REASON
     * @author MyBatis Generator
     */
    private String reason;

    /**
     * 收款用户openid: mch_pay_result_wx.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * 收款用户姓名: mch_pay_result_wx.TRANSFER_NAME
     * @author MyBatis Generator
     */
    private String transferName;

    /**
     * 付款金额: mch_pay_result_wx.PAYMENT_AMOUNT
     * @author MyBatis Generator
     */
    private Integer paymentAmount;

    /**
     * 转账时间，示例 2015-04-21 20:00:00: mch_pay_result_wx.TRANSFER_TIME
     * @author MyBatis Generator
     */
    private String transferTime;

    /**
     * 付款描述: mch_pay_result_wx.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 获取商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_result_wx.PARTNER_TRADE_NO
     * @return 商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_result_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    /**
     * 设置商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_result_wx.PARTNER_TRADE_NO
     * @param partnerTradeNo 映射数据库字段: mch_pay_result_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo == null ? null : partnerTradeNo.trim();
    }

    /**
     * 获取商户号，微信支付分配的商户号: mch_pay_result_wx.MCH_ID
     * @return 商户号，微信支付分配的商户号: mch_pay_result_wx.MCH_ID
     * @author MyBatis Generator
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置商户号，微信支付分配的商户号: mch_pay_result_wx.MCH_ID
     * @param mchId 映射数据库字段: mch_pay_result_wx.MCH_ID
     * @author MyBatis Generator
     */
    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    /**
     * 获取Appid，商户号的appid: mch_pay_result_wx.APPID
     * @return Appid，商户号的appid: mch_pay_result_wx.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置Appid，商户号的appid: mch_pay_result_wx.APPID
     * @param appid 映射数据库字段: mch_pay_result_wx.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取付款单号，调用企业付款API时，微信系统内部产生的单号: mch_pay_result_wx.DETAIL_ID
     * @return 付款单号，调用企业付款API时，微信系统内部产生的单号: mch_pay_result_wx.DETAIL_ID
     * @author MyBatis Generator
     */
    public String getDetailId() {
        return detailId;
    }

    /**
     * 设置付款单号，调用企业付款API时，微信系统内部产生的单号: mch_pay_result_wx.DETAIL_ID
     * @param detailId 映射数据库字段: mch_pay_result_wx.DETAIL_ID
     * @author MyBatis Generator
     */
    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    /**
     * 获取签名: mch_pay_result_wx.SIGN
     * @return 签名: mch_pay_result_wx.SIGN
     * @author MyBatis Generator
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名: mch_pay_result_wx.SIGN
     * @param sign 映射数据库字段: mch_pay_result_wx.SIGN
     * @author MyBatis Generator
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取业务结果 SUCCESS/FAIL: mch_pay_result_wx.RESULT_CODE
     * @return 业务结果 SUCCESS/FAIL: mch_pay_result_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置业务结果 SUCCESS/FAIL: mch_pay_result_wx.RESULT_CODE
     * @param resultCode 映射数据库字段: mch_pay_result_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取错误码信息: mch_pay_result_wx.ERR_CODE
     * @return 错误码信息: mch_pay_result_wx.ERR_CODE
     * @author MyBatis Generator
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置错误码信息: mch_pay_result_wx.ERR_CODE
     * @param errCode 映射数据库字段: mch_pay_result_wx.ERR_CODE
     * @author MyBatis Generator
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * 获取错误代码描述，结果信息描述: mch_pay_result_wx.ERR_CODE_DES
     * @return 错误代码描述，结果信息描述: mch_pay_result_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * 设置错误代码描述，结果信息描述: mch_pay_result_wx.ERR_CODE_DES
     * @param errCodeDes 映射数据库字段: mch_pay_result_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    /**
     * 获取转账状态: mch_pay_result_wx.TRANSFER_STATUS
     * @return 转账状态: mch_pay_result_wx.TRANSFER_STATUS
     * @author MyBatis Generator
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    /**
     * 设置转账状态: mch_pay_result_wx.TRANSFER_STATUS
     * @param transferStatus 映射数据库字段: mch_pay_result_wx.TRANSFER_STATUS
     * @author MyBatis Generator
     */
    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus == null ? null : transferStatus.trim();
    }

    /**
     * 获取失败原因,如果失败则有失败原因: mch_pay_result_wx.REASON
     * @return 失败原因,如果失败则有失败原因: mch_pay_result_wx.REASON
     * @author MyBatis Generator
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置失败原因,如果失败则有失败原因: mch_pay_result_wx.REASON
     * @param reason 映射数据库字段: mch_pay_result_wx.REASON
     * @author MyBatis Generator
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取收款用户openid: mch_pay_result_wx.OPENID
     * @return 收款用户openid: mch_pay_result_wx.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置收款用户openid: mch_pay_result_wx.OPENID
     * @param openid 映射数据库字段: mch_pay_result_wx.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取收款用户姓名: mch_pay_result_wx.TRANSFER_NAME
     * @return 收款用户姓名: mch_pay_result_wx.TRANSFER_NAME
     * @author MyBatis Generator
     */
    public String getTransferName() {
        return transferName;
    }

    /**
     * 设置收款用户姓名: mch_pay_result_wx.TRANSFER_NAME
     * @param transferName 映射数据库字段: mch_pay_result_wx.TRANSFER_NAME
     * @author MyBatis Generator
     */
    public void setTransferName(String transferName) {
        this.transferName = transferName == null ? null : transferName.trim();
    }

    /**
     * 获取付款金额: mch_pay_result_wx.PAYMENT_AMOUNT
     * @return 付款金额: mch_pay_result_wx.PAYMENT_AMOUNT
     * @author MyBatis Generator
     */
    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 设置付款金额: mch_pay_result_wx.PAYMENT_AMOUNT
     * @param paymentAmount 映射数据库字段: mch_pay_result_wx.PAYMENT_AMOUNT
     * @author MyBatis Generator
     */
    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * 获取转账时间，示例 2015-04-21 20:00:00: mch_pay_result_wx.TRANSFER_TIME
     * @return 转账时间，示例 2015-04-21 20:00:00: mch_pay_result_wx.TRANSFER_TIME
     * @author MyBatis Generator
     */
    public String getTransferTime() {
        return transferTime;
    }

    /**
     * 设置转账时间，示例 2015-04-21 20:00:00: mch_pay_result_wx.TRANSFER_TIME
     * @param transferTime 映射数据库字段: mch_pay_result_wx.TRANSFER_TIME
     * @author MyBatis Generator
     */
    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime == null ? null : transferTime.trim();
    }

    /**
     * 获取付款描述: mch_pay_result_wx.REMARK
     * @return 付款描述: mch_pay_result_wx.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置付款描述: mch_pay_result_wx.REMARK
     * @param remark 映射数据库字段: mch_pay_result_wx.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
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
        MchPayResultWx other = (MchPayResultWx) that;
        return (this.getPartnerTradeNo() == null ? other.getPartnerTradeNo() == null : this.getPartnerTradeNo().equals(other.getPartnerTradeNo()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()))
            && (this.getTransferStatus() == null ? other.getTransferStatus() == null : this.getTransferStatus().equals(other.getTransferStatus()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getTransferName() == null ? other.getTransferName() == null : this.getTransferName().equals(other.getTransferName()))
            && (this.getPaymentAmount() == null ? other.getPaymentAmount() == null : this.getPaymentAmount().equals(other.getPaymentAmount()))
            && (this.getTransferTime() == null ? other.getTransferTime() == null : this.getTransferTime().equals(other.getTransferTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPartnerTradeNo() == null) ? 0 : getPartnerTradeNo().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getDetailId() == null) ? 0 : getDetailId().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        result = prime * result + ((getTransferStatus() == null) ? 0 : getTransferStatus().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getTransferName() == null) ? 0 : getTransferName().hashCode());
        result = prime * result + ((getPaymentAmount() == null) ? 0 : getPaymentAmount().hashCode());
        result = prime * result + ((getTransferTime() == null) ? 0 : getTransferTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", partnerTradeNo=").append(partnerTradeNo);
        sb.append(", mchId=").append(mchId);
        sb.append(", appid=").append(appid);
        sb.append(", detailId=").append(detailId);
        sb.append(", sign=").append(sign);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
        sb.append(", transferStatus=").append(transferStatus);
        sb.append(", reason=").append(reason);
        sb.append(", openid=").append(openid);
        sb.append(", transferName=").append(transferName);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", transferTime=").append(transferTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}