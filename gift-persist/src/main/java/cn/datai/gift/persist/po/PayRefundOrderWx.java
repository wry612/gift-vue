package cn.datai.gift.persist.po;

import java.io.Serializable;

public class PayRefundOrderWx implements Serializable {
    public static final long serialVersionUID = 945032888L;

    /**
     * 商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: PAY_REFUND_ORDER_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    private String payRefundOrderWxId;

    /**
     * 微信支付订单号: PAY_REFUND_ORDER_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    private String transactionId;

    /**
     * 订单金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer totalFee;

    /**
     * 退款金额，退款总金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    private Integer refundFee;

    /**
     * 货币种类，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_REFUND_ORDER_WX.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    private String refundFeeType;

    /**
     * 操作员，操作员帐号, 默认为商户号: PAY_REFUND_ORDER_WX.OP_USER_ID
     * @author MyBatis Generator
     */
    private String opUserId;

    /**
     * 退款资金来源，仅针对老资金流商户使用
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
            REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款(限非当日交易订单的退款）: PAY_REFUND_ORDER_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    private String refundAccount;

    /**
     * 返回状态码，SUCCESS/FAIL: PAY_REFUND_ORDER_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    private String returnCode;

    /**
     * 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_REFUND_ORDER_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    private String returnMsg;

    /**
     * 获取商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: PAY_REFUND_ORDER_WX.PAY_REFUND_ORDER_WX_ID
     * @return 商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: PAY_REFUND_ORDER_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public String getPayRefundOrderWxId() {
        return payRefundOrderWxId;
    }

    /**
     * 设置商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: PAY_REFUND_ORDER_WX.PAY_REFUND_ORDER_WX_ID
     * @param payRefundOrderWxId 映射数据库字段: PAY_REFUND_ORDER_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public void setPayRefundOrderWxId(String payRefundOrderWxId) {
        this.payRefundOrderWxId = payRefundOrderWxId == null ? null : payRefundOrderWxId.trim();
    }

    /**
     * 获取微信支付订单号: PAY_REFUND_ORDER_WX.TRANSACTION_ID
     * @return 微信支付订单号: PAY_REFUND_ORDER_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置微信支付订单号: PAY_REFUND_ORDER_WX.TRANSACTION_ID
     * @param transactionId 映射数据库字段: PAY_REFUND_ORDER_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取订单金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.TOTAL_FEE
     * @return 订单金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * 设置订单金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.TOTAL_FEE
     * @param totalFee 映射数据库字段: PAY_REFUND_ORDER_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取退款金额，退款总金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.REFUND_FEE
     * @return 退款金额，退款总金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    public Integer getRefundFee() {
        return refundFee;
    }

    /**
     * 设置退款金额，退款总金额，订单总金额，单位为分，只能为整数: PAY_REFUND_ORDER_WX.REFUND_FEE
     * @param refundFee 映射数据库字段: PAY_REFUND_ORDER_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * 获取货币种类，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_REFUND_ORDER_WX.REFUND_FEE_TYPE
     * @return 货币种类，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_REFUND_ORDER_WX.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getRefundFeeType() {
        return refundFeeType;
    }

    /**
     * 设置货币种类，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_REFUND_ORDER_WX.REFUND_FEE_TYPE
     * @param refundFeeType 映射数据库字段: PAY_REFUND_ORDER_WX.REFUND_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType == null ? null : refundFeeType.trim();
    }

    /**
     * 获取操作员，操作员帐号, 默认为商户号: PAY_REFUND_ORDER_WX.OP_USER_ID
     * @return 操作员，操作员帐号, 默认为商户号: PAY_REFUND_ORDER_WX.OP_USER_ID
     * @author MyBatis Generator
     */
    public String getOpUserId() {
        return opUserId;
    }

    /**
     * 设置操作员，操作员帐号, 默认为商户号: PAY_REFUND_ORDER_WX.OP_USER_ID
     * @param opUserId 映射数据库字段: PAY_REFUND_ORDER_WX.OP_USER_ID
     * @author MyBatis Generator
     */
    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId == null ? null : opUserId.trim();
    }

    /**
     * 获取退款资金来源，仅针对老资金流商户使用
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
            REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款(限非当日交易订单的退款）: PAY_REFUND_ORDER_WX.REFUND_ACCOUNT
     * @return 退款资金来源，仅针对老资金流商户使用
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
            REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款(限非当日交易订单的退款）: PAY_REFUND_ORDER_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    public String getRefundAccount() {
        return refundAccount;
    }

    /**
     * 设置退款资金来源，仅针对老资金流商户使用
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
            REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款(限非当日交易订单的退款）: PAY_REFUND_ORDER_WX.REFUND_ACCOUNT
     * @param refundAccount 映射数据库字段: PAY_REFUND_ORDER_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    /**
     * 获取返回状态码，SUCCESS/FAIL: PAY_REFUND_ORDER_WX.RETURN_CODE
     * @return 返回状态码，SUCCESS/FAIL: PAY_REFUND_ORDER_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 设置返回状态码，SUCCESS/FAIL: PAY_REFUND_ORDER_WX.RETURN_CODE
     * @param returnCode 映射数据库字段: PAY_REFUND_ORDER_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    /**
     * 获取返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_REFUND_ORDER_WX.RETURN_MSG
     * @return 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_REFUND_ORDER_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * 设置返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_REFUND_ORDER_WX.RETURN_MSG
     * @param returnMsg 映射数据库字段: PAY_REFUND_ORDER_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
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
        PayRefundOrderWx other = (PayRefundOrderWx) that;
        return (this.getPayRefundOrderWxId() == null ? other.getPayRefundOrderWxId() == null : this.getPayRefundOrderWxId().equals(other.getPayRefundOrderWxId()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getRefundFee() == null ? other.getRefundFee() == null : this.getRefundFee().equals(other.getRefundFee()))
            && (this.getRefundFeeType() == null ? other.getRefundFeeType() == null : this.getRefundFeeType().equals(other.getRefundFeeType()))
            && (this.getOpUserId() == null ? other.getOpUserId() == null : this.getOpUserId().equals(other.getOpUserId()))
            && (this.getRefundAccount() == null ? other.getRefundAccount() == null : this.getRefundAccount().equals(other.getRefundAccount()))
            && (this.getReturnCode() == null ? other.getReturnCode() == null : this.getReturnCode().equals(other.getReturnCode()))
            && (this.getReturnMsg() == null ? other.getReturnMsg() == null : this.getReturnMsg().equals(other.getReturnMsg()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayRefundOrderWxId() == null) ? 0 : getPayRefundOrderWxId().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getRefundFee() == null) ? 0 : getRefundFee().hashCode());
        result = prime * result + ((getRefundFeeType() == null) ? 0 : getRefundFeeType().hashCode());
        result = prime * result + ((getOpUserId() == null) ? 0 : getOpUserId().hashCode());
        result = prime * result + ((getRefundAccount() == null) ? 0 : getRefundAccount().hashCode());
        result = prime * result + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        result = prime * result + ((getReturnMsg() == null) ? 0 : getReturnMsg().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", payRefundOrderWxId=").append(payRefundOrderWxId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", refundFeeType=").append(refundFeeType);
        sb.append(", opUserId=").append(opUserId);
        sb.append(", refundAccount=").append(refundAccount);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append("]");
        return sb.toString();
    }
}