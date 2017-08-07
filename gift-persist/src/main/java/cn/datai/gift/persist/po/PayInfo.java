package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class PayInfo implements Serializable {
    public static final long serialVersionUID = -62084851L;

    /**
     * : pay_info.PAY_INFO_ID
     * @author MyBatis Generator
     */
    private Long payInfoId;

    /**
     * 支付发起人id,发起付款申请的人, 与实际付款人有别，因为支付订单可被代付，实际付款人在对应的付款明细中提现，若业务上发生退款只会将退款退还给实际付款人。: pay_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 运营商id: pay_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 支付金额: pay_info.PAY_AMOUNT
     * @author MyBatis Generator
     */
    private Long payAmount;

    /**
     * 支付渠道     wx:微信   ali:支付宝   jd：京东支付  union:银联: pay_info.CHANNEL
     * @author MyBatis Generator
     */
    private String channel;

    /**
     * 当前绑定的支付订单明细id， 对应渠道下的订单明细id: pay_info.PAY_DETAIL_ID
     * @author MyBatis Generator
     */
    private String payDetailId;

    /**
     * 业务类型   自己系统的业务类型     暂定  buy:购买业务    delivery：提货业务: pay_info.BIZ_TYPE
     * @author MyBatis Generator
     */
    private String bizType;

    /**
     * 业务id, 关联的业务id: pay_info.BIZ_ID
     * @author MyBatis Generator
     */
    private String bizId;

    /**
     * 是否已处理关联的业务订单,     true:已处理    false: 未处理: pay_info.BIZ_PROCESSED
     * @author MyBatis Generator
     */
    private String bizProcessed;

    /**
     * 支付状态   NO_CHANNEL：订单已生成，但未选择支付渠道  UNPAYING：支付渠道已选择，但未付款  CANCELLED：支付已取消  SUCCESS:支付成功: pay_info.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 状态历史: pay_info.STATUS_HISTORY
     * @author MyBatis Generator
     */
    private String statusHistory;

    /**
     * 创建时间: pay_info.TIME_START
     * @author MyBatis Generator
     */
    private Date timeStart;

    /**
     * 支付过期时间: pay_info.TIME_EXPIRE
     * @author MyBatis Generator
     */
    private Date timeExpire;

    /**
     * 退款状态, 退款是按原支付渠道退回，退款详细信息请到对应的支付渠道查询: pay_info.REFUND_STATUS
     * @author MyBatis Generator
     */
    private String refundStatus;

    /**
     * 已退款金额，单位为分: pay_info.REFUNDED_PRICE
     * @author MyBatis Generator
     */
    private Long refundedPrice;

    /**
     * 创建时间: pay_info.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: pay_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    private Date updateTime;

    /**
     * 支付完成时间: pay_info.PAY_SUCCESS_TIME
     * @author MyBatis Generator
     */
    private Date paySuccessTime;

    /**
     * 退款发起时间: pay_info.REFUND_APPLY_TIME
     * @author MyBatis Generator
     */
    private Date refundApplyTime;

    /**
     * 退款完成时间: pay_info.REFUND_SUCCESS_TIME
     * @author MyBatis Generator
     */
    private Date refundSuccessTime;

    /**
     * 上次查询时间: pay_info.QUERY_TIME
     * @author MyBatis Generator
     */
    private Date queryTime;

    /**
     * 获取: pay_info.PAY_INFO_ID
     * @return : pay_info.PAY_INFO_ID
     * @author MyBatis Generator
     */
    public Long getPayInfoId() {
        return payInfoId;
    }

    /**
     * 设置: pay_info.PAY_INFO_ID
     * @param payInfoId 映射数据库字段: pay_info.PAY_INFO_ID
     * @author MyBatis Generator
     */
    public void setPayInfoId(Long payInfoId) {
        this.payInfoId = payInfoId;
    }

    /**
     * 获取支付发起人id,发起付款申请的人, 与实际付款人有别，因为支付订单可被代付，实际付款人在对应的付款明细中提现，若业务上发生退款只会将退款退还给实际付款人。: pay_info.USER_INFO_ID
     * @return 支付发起人id,发起付款申请的人, 与实际付款人有别，因为支付订单可被代付，实际付款人在对应的付款明细中提现，若业务上发生退款只会将退款退还给实际付款人。: pay_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置支付发起人id,发起付款申请的人, 与实际付款人有别，因为支付订单可被代付，实际付款人在对应的付款明细中提现，若业务上发生退款只会将退款退还给实际付款人。: pay_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: pay_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取运营商id: pay_info.OPERATOR_INFO_ID
     * @return 运营商id: pay_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    /**
     * 设置运营商id: pay_info.OPERATOR_INFO_ID
     * @param operatorInfoId 映射数据库字段: pay_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    /**
     * 获取支付金额: pay_info.PAY_AMOUNT
     * @return 支付金额: pay_info.PAY_AMOUNT
     * @author MyBatis Generator
     */
    public Long getPayAmount() {
        return payAmount;
    }

    /**
     * 设置支付金额: pay_info.PAY_AMOUNT
     * @param payAmount 映射数据库字段: pay_info.PAY_AMOUNT
     * @author MyBatis Generator
     */
    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取支付渠道     wx:微信   ali:支付宝   jd：京东支付  union:银联: pay_info.CHANNEL
     * @return 支付渠道     wx:微信   ali:支付宝   jd：京东支付  union:银联: pay_info.CHANNEL
     * @author MyBatis Generator
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置支付渠道     wx:微信   ali:支付宝   jd：京东支付  union:银联: pay_info.CHANNEL
     * @param channel 映射数据库字段: pay_info.CHANNEL
     * @author MyBatis Generator
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 获取当前绑定的支付订单明细id， 对应渠道下的订单明细id: pay_info.PAY_DETAIL_ID
     * @return 当前绑定的支付订单明细id， 对应渠道下的订单明细id: pay_info.PAY_DETAIL_ID
     * @author MyBatis Generator
     */
    public String getPayDetailId() {
        return payDetailId;
    }

    /**
     * 设置当前绑定的支付订单明细id， 对应渠道下的订单明细id: pay_info.PAY_DETAIL_ID
     * @param payDetailId 映射数据库字段: pay_info.PAY_DETAIL_ID
     * @author MyBatis Generator
     */
    public void setPayDetailId(String payDetailId) {
        this.payDetailId = payDetailId == null ? null : payDetailId.trim();
    }

    /**
     * 获取业务类型   自己系统的业务类型     暂定  buy:购买业务    delivery：提货业务: pay_info.BIZ_TYPE
     * @return 业务类型   自己系统的业务类型     暂定  buy:购买业务    delivery：提货业务: pay_info.BIZ_TYPE
     * @author MyBatis Generator
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型   自己系统的业务类型     暂定  buy:购买业务    delivery：提货业务: pay_info.BIZ_TYPE
     * @param bizType 映射数据库字段: pay_info.BIZ_TYPE
     * @author MyBatis Generator
     */
    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    /**
     * 获取业务id, 关联的业务id: pay_info.BIZ_ID
     * @return 业务id, 关联的业务id: pay_info.BIZ_ID
     * @author MyBatis Generator
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * 设置业务id, 关联的业务id: pay_info.BIZ_ID
     * @param bizId 映射数据库字段: pay_info.BIZ_ID
     * @author MyBatis Generator
     */
    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    /**
     * 获取是否已处理关联的业务订单,     true:已处理    false: 未处理: pay_info.BIZ_PROCESSED
     * @return 是否已处理关联的业务订单,     true:已处理    false: 未处理: pay_info.BIZ_PROCESSED
     * @author MyBatis Generator
     */
    public String getBizProcessed() {
        return bizProcessed;
    }

    /**
     * 设置是否已处理关联的业务订单,     true:已处理    false: 未处理: pay_info.BIZ_PROCESSED
     * @param bizProcessed 映射数据库字段: pay_info.BIZ_PROCESSED
     * @author MyBatis Generator
     */
    public void setBizProcessed(String bizProcessed) {
        this.bizProcessed = bizProcessed == null ? null : bizProcessed.trim();
    }

    /**
     * 获取支付状态   NO_CHANNEL：订单已生成，但未选择支付渠道  UNPAYING：支付渠道已选择，但未付款  CANCELLED：支付已取消  SUCCESS:支付成功: pay_info.STATUS
     * @return 支付状态   NO_CHANNEL：订单已生成，但未选择支付渠道  UNPAYING：支付渠道已选择，但未付款  CANCELLED：支付已取消  SUCCESS:支付成功: pay_info.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置支付状态   NO_CHANNEL：订单已生成，但未选择支付渠道  UNPAYING：支付渠道已选择，但未付款  CANCELLED：支付已取消  SUCCESS:支付成功: pay_info.STATUS
     * @param status 映射数据库字段: pay_info.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取状态历史: pay_info.STATUS_HISTORY
     * @return 状态历史: pay_info.STATUS_HISTORY
     * @author MyBatis Generator
     */
    public String getStatusHistory() {
        return statusHistory;
    }

    /**
     * 设置状态历史: pay_info.STATUS_HISTORY
     * @param statusHistory 映射数据库字段: pay_info.STATUS_HISTORY
     * @author MyBatis Generator
     */
    public void setStatusHistory(String statusHistory) {
        this.statusHistory = statusHistory == null ? null : statusHistory.trim();
    }

    /**
     * 获取创建时间: pay_info.TIME_START
     * @return 创建时间: pay_info.TIME_START
     * @author MyBatis Generator
     */
    public Date getTimeStart() {
        return timeStart;
    }

    /**
     * 设置创建时间: pay_info.TIME_START
     * @param timeStart 映射数据库字段: pay_info.TIME_START
     * @author MyBatis Generator
     */
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    /**
     * 获取支付过期时间: pay_info.TIME_EXPIRE
     * @return 支付过期时间: pay_info.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public Date getTimeExpire() {
        return timeExpire;
    }

    /**
     * 设置支付过期时间: pay_info.TIME_EXPIRE
     * @param timeExpire 映射数据库字段: pay_info.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public void setTimeExpire(Date timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * 获取退款状态, 退款是按原支付渠道退回，退款详细信息请到对应的支付渠道查询: pay_info.REFUND_STATUS
     * @return 退款状态, 退款是按原支付渠道退回，退款详细信息请到对应的支付渠道查询: pay_info.REFUND_STATUS
     * @author MyBatis Generator
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态, 退款是按原支付渠道退回，退款详细信息请到对应的支付渠道查询: pay_info.REFUND_STATUS
     * @param refundStatus 映射数据库字段: pay_info.REFUND_STATUS
     * @author MyBatis Generator
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    /**
     * 获取已退款金额，单位为分: pay_info.REFUNDED_PRICE
     * @return 已退款金额，单位为分: pay_info.REFUNDED_PRICE
     * @author MyBatis Generator
     */
    public Long getRefundedPrice() {
        return refundedPrice;
    }

    /**
     * 设置已退款金额，单位为分: pay_info.REFUNDED_PRICE
     * @param refundedPrice 映射数据库字段: pay_info.REFUNDED_PRICE
     * @author MyBatis Generator
     */
    public void setRefundedPrice(Long refundedPrice) {
        this.refundedPrice = refundedPrice;
    }

    /**
     * 获取创建时间: pay_info.CREATE_TIME
     * @return 创建时间: pay_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: pay_info.CREATE_TIME
     * @param createTime 映射数据库字段: pay_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间: pay_info.UPDATE_TIME
     * @return 修改时间: pay_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间: pay_info.UPDATE_TIME
     * @param updateTime 映射数据库字段: pay_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取支付完成时间: pay_info.PAY_SUCCESS_TIME
     * @return 支付完成时间: pay_info.PAY_SUCCESS_TIME
     * @author MyBatis Generator
     */
    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    /**
     * 设置支付完成时间: pay_info.PAY_SUCCESS_TIME
     * @param paySuccessTime 映射数据库字段: pay_info.PAY_SUCCESS_TIME
     * @author MyBatis Generator
     */
    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    /**
     * 获取退款发起时间: pay_info.REFUND_APPLY_TIME
     * @return 退款发起时间: pay_info.REFUND_APPLY_TIME
     * @author MyBatis Generator
     */
    public Date getRefundApplyTime() {
        return refundApplyTime;
    }

    /**
     * 设置退款发起时间: pay_info.REFUND_APPLY_TIME
     * @param refundApplyTime 映射数据库字段: pay_info.REFUND_APPLY_TIME
     * @author MyBatis Generator
     */
    public void setRefundApplyTime(Date refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }

    /**
     * 获取退款完成时间: pay_info.REFUND_SUCCESS_TIME
     * @return 退款完成时间: pay_info.REFUND_SUCCESS_TIME
     * @author MyBatis Generator
     */
    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    /**
     * 设置退款完成时间: pay_info.REFUND_SUCCESS_TIME
     * @param refundSuccessTime 映射数据库字段: pay_info.REFUND_SUCCESS_TIME
     * @author MyBatis Generator
     */
    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }

    /**
     * 获取上次查询时间: pay_info.QUERY_TIME
     * @return 上次查询时间: pay_info.QUERY_TIME
     * @author MyBatis Generator
     */
    public Date getQueryTime() {
        return queryTime;
    }

    /**
     * 设置上次查询时间: pay_info.QUERY_TIME
     * @param queryTime 映射数据库字段: pay_info.QUERY_TIME
     * @author MyBatis Generator
     */
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
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
        PayInfo other = (PayInfo) that;
        return (this.getPayInfoId() == null ? other.getPayInfoId() == null : this.getPayInfoId().equals(other.getPayInfoId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getOperatorInfoId() == null ? other.getOperatorInfoId() == null : this.getOperatorInfoId().equals(other.getOperatorInfoId()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getPayDetailId() == null ? other.getPayDetailId() == null : this.getPayDetailId().equals(other.getPayDetailId()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getBizId() == null ? other.getBizId() == null : this.getBizId().equals(other.getBizId()))
            && (this.getBizProcessed() == null ? other.getBizProcessed() == null : this.getBizProcessed().equals(other.getBizProcessed()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStatusHistory() == null ? other.getStatusHistory() == null : this.getStatusHistory().equals(other.getStatusHistory()))
            && (this.getTimeStart() == null ? other.getTimeStart() == null : this.getTimeStart().equals(other.getTimeStart()))
            && (this.getTimeExpire() == null ? other.getTimeExpire() == null : this.getTimeExpire().equals(other.getTimeExpire()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()))
            && (this.getRefundedPrice() == null ? other.getRefundedPrice() == null : this.getRefundedPrice().equals(other.getRefundedPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPaySuccessTime() == null ? other.getPaySuccessTime() == null : this.getPaySuccessTime().equals(other.getPaySuccessTime()))
            && (this.getRefundApplyTime() == null ? other.getRefundApplyTime() == null : this.getRefundApplyTime().equals(other.getRefundApplyTime()))
            && (this.getRefundSuccessTime() == null ? other.getRefundSuccessTime() == null : this.getRefundSuccessTime().equals(other.getRefundSuccessTime()))
            && (this.getQueryTime() == null ? other.getQueryTime() == null : this.getQueryTime().equals(other.getQueryTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayInfoId() == null) ? 0 : getPayInfoId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getOperatorInfoId() == null) ? 0 : getOperatorInfoId().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getPayDetailId() == null) ? 0 : getPayDetailId().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getBizId() == null) ? 0 : getBizId().hashCode());
        result = prime * result + ((getBizProcessed() == null) ? 0 : getBizProcessed().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStatusHistory() == null) ? 0 : getStatusHistory().hashCode());
        result = prime * result + ((getTimeStart() == null) ? 0 : getTimeStart().hashCode());
        result = prime * result + ((getTimeExpire() == null) ? 0 : getTimeExpire().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        result = prime * result + ((getRefundedPrice() == null) ? 0 : getRefundedPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPaySuccessTime() == null) ? 0 : getPaySuccessTime().hashCode());
        result = prime * result + ((getRefundApplyTime() == null) ? 0 : getRefundApplyTime().hashCode());
        result = prime * result + ((getRefundSuccessTime() == null) ? 0 : getRefundSuccessTime().hashCode());
        result = prime * result + ((getQueryTime() == null) ? 0 : getQueryTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", payInfoId=").append(payInfoId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", operatorInfoId=").append(operatorInfoId);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", channel=").append(channel);
        sb.append(", payDetailId=").append(payDetailId);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizId=").append(bizId);
        sb.append(", bizProcessed=").append(bizProcessed);
        sb.append(", status=").append(status);
        sb.append(", statusHistory=").append(statusHistory);
        sb.append(", timeStart=").append(timeStart);
        sb.append(", timeExpire=").append(timeExpire);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundedPrice=").append(refundedPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", paySuccessTime=").append(paySuccessTime);
        sb.append(", refundApplyTime=").append(refundApplyTime);
        sb.append(", refundSuccessTime=").append(refundSuccessTime);
        sb.append(", queryTime=").append(queryTime);
        sb.append("]");
        return sb.toString();
    }
}