package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ActivityPresent implements Serializable {
    public static final long serialVersionUID = 1167690563L;

    /**
     * 活动赠礼id: activity_present.ACTIVITY_PRESENT_ID
     * @author MyBatis Generator
     */
    private Long activityPresentId;

    /**
     * 用户id: activity_present.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 赠礼人id: activity_present.PRESENT_USER_ID
     * @author MyBatis Generator
     */
    private Long presentUserId;

    /**
     * 赠送类型， COMMODITY：商品  ，   TICKET：券    : activity_present.PRESENT_TYPE
     * @author MyBatis Generator
     */
    private String presentType;

    /**
     * 赠礼原因: activity_present.PRESENT_REASON
     * @author MyBatis Generator
     */
    private String presentReason;

    /**
     * 赠送的商品id: activity_present.COMMODITY_ID
     * @author MyBatis Generator
     */
    private Long commodityId;

    /**
     * 赠送商品数量: activity_present.QUANTITY
     * @author MyBatis Generator
     */
    private Long quantity;

    /**
     * 赠送的券id: activity_present.TICKET_ID
     * @author MyBatis Generator
     */
    private Long ticketId;

    /**
     * 状态   NOT_PRESENT:未赠送      PRESENTED:已赠送: activity_present.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 创建时间: activity_present.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 赠送成功时间: activity_present.SUCCESS_TIME
     * @author MyBatis Generator
     */
    private Date successTime;

    /**
     * 备注: activity_present.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 商品流通记录, 多个用英文逗号隔开: activity_present.COMMODITY_FLOW_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowIds;

    /**
     * 获取活动赠礼id: activity_present.ACTIVITY_PRESENT_ID
     * @return 活动赠礼id: activity_present.ACTIVITY_PRESENT_ID
     * @author MyBatis Generator
     */
    public Long getActivityPresentId() {
        return activityPresentId;
    }

    /**
     * 设置活动赠礼id: activity_present.ACTIVITY_PRESENT_ID
     * @param activityPresentId 映射数据库字段: activity_present.ACTIVITY_PRESENT_ID
     * @author MyBatis Generator
     */
    public void setActivityPresentId(Long activityPresentId) {
        this.activityPresentId = activityPresentId;
    }

    /**
     * 获取用户id: activity_present.USER_INFO_ID
     * @return 用户id: activity_present.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: activity_present.USER_INFO_ID
     * @param userInfoId 映射数据库字段: activity_present.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取赠礼人id: activity_present.PRESENT_USER_ID
     * @return 赠礼人id: activity_present.PRESENT_USER_ID
     * @author MyBatis Generator
     */
    public Long getPresentUserId() {
        return presentUserId;
    }

    /**
     * 设置赠礼人id: activity_present.PRESENT_USER_ID
     * @param presentUserId 映射数据库字段: activity_present.PRESENT_USER_ID
     * @author MyBatis Generator
     */
    public void setPresentUserId(Long presentUserId) {
        this.presentUserId = presentUserId;
    }

    /**
     * 获取赠送类型， COMMODITY：商品  ，   TICKET：券    : activity_present.PRESENT_TYPE
     * @return 赠送类型， COMMODITY：商品  ，   TICKET：券    : activity_present.PRESENT_TYPE
     * @author MyBatis Generator
     */
    public String getPresentType() {
        return presentType;
    }

    /**
     * 设置赠送类型， COMMODITY：商品  ，   TICKET：券    : activity_present.PRESENT_TYPE
     * @param presentType 映射数据库字段: activity_present.PRESENT_TYPE
     * @author MyBatis Generator
     */
    public void setPresentType(String presentType) {
        this.presentType = presentType == null ? null : presentType.trim();
    }

    /**
     * 获取赠礼原因: activity_present.PRESENT_REASON
     * @return 赠礼原因: activity_present.PRESENT_REASON
     * @author MyBatis Generator
     */
    public String getPresentReason() {
        return presentReason;
    }

    /**
     * 设置赠礼原因: activity_present.PRESENT_REASON
     * @param presentReason 映射数据库字段: activity_present.PRESENT_REASON
     * @author MyBatis Generator
     */
    public void setPresentReason(String presentReason) {
        this.presentReason = presentReason == null ? null : presentReason.trim();
    }

    /**
     * 获取赠送的商品id: activity_present.COMMODITY_ID
     * @return 赠送的商品id: activity_present.COMMODITY_ID
     * @author MyBatis Generator
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * 设置赠送的商品id: activity_present.COMMODITY_ID
     * @param commodityId 映射数据库字段: activity_present.COMMODITY_ID
     * @author MyBatis Generator
     */
    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取赠送商品数量: activity_present.QUANTITY
     * @return 赠送商品数量: activity_present.QUANTITY
     * @author MyBatis Generator
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * 设置赠送商品数量: activity_present.QUANTITY
     * @param quantity 映射数据库字段: activity_present.QUANTITY
     * @author MyBatis Generator
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取赠送的券id: activity_present.TICKET_ID
     * @return 赠送的券id: activity_present.TICKET_ID
     * @author MyBatis Generator
     */
    public Long getTicketId() {
        return ticketId;
    }

    /**
     * 设置赠送的券id: activity_present.TICKET_ID
     * @param ticketId 映射数据库字段: activity_present.TICKET_ID
     * @author MyBatis Generator
     */
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * 获取状态   NOT_PRESENT:未赠送      PRESENTED:已赠送: activity_present.STATUS
     * @return 状态   NOT_PRESENT:未赠送      PRESENTED:已赠送: activity_present.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态   NOT_PRESENT:未赠送      PRESENTED:已赠送: activity_present.STATUS
     * @param status 映射数据库字段: activity_present.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间: activity_present.CREATE_TIME
     * @return 创建时间: activity_present.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: activity_present.CREATE_TIME
     * @param createTime 映射数据库字段: activity_present.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取赠送成功时间: activity_present.SUCCESS_TIME
     * @return 赠送成功时间: activity_present.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置赠送成功时间: activity_present.SUCCESS_TIME
     * @param successTime 映射数据库字段: activity_present.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取备注: activity_present.REMARK
     * @return 备注: activity_present.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注: activity_present.REMARK
     * @param remark 映射数据库字段: activity_present.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取商品流通记录, 多个用英文逗号隔开: activity_present.COMMODITY_FLOW_IDS
     * @return 商品流通记录, 多个用英文逗号隔开: activity_present.COMMODITY_FLOW_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowIds() {
        return commodityFlowIds;
    }

    /**
     * 设置商品流通记录, 多个用英文逗号隔开: activity_present.COMMODITY_FLOW_IDS
     * @param commodityFlowIds 映射数据库字段: activity_present.COMMODITY_FLOW_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowIds(String commodityFlowIds) {
        this.commodityFlowIds = commodityFlowIds == null ? null : commodityFlowIds.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
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
        ActivityPresent other = (ActivityPresent) that;
        return (this.getActivityPresentId() == null ? other.getActivityPresentId() == null : this.getActivityPresentId().equals(other.getActivityPresentId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getPresentUserId() == null ? other.getPresentUserId() == null : this.getPresentUserId().equals(other.getPresentUserId()))
            && (this.getPresentType() == null ? other.getPresentType() == null : this.getPresentType().equals(other.getPresentType()))
            && (this.getPresentReason() == null ? other.getPresentReason() == null : this.getPresentReason().equals(other.getPresentReason()))
            && (this.getCommodityId() == null ? other.getCommodityId() == null : this.getCommodityId().equals(other.getCommodityId()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getTicketId() == null ? other.getTicketId() == null : this.getTicketId().equals(other.getTicketId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSuccessTime() == null ? other.getSuccessTime() == null : this.getSuccessTime().equals(other.getSuccessTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCommodityFlowIds() == null ? other.getCommodityFlowIds() == null : this.getCommodityFlowIds().equals(other.getCommodityFlowIds()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivityPresentId() == null) ? 0 : getActivityPresentId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getPresentUserId() == null) ? 0 : getPresentUserId().hashCode());
        result = prime * result + ((getPresentType() == null) ? 0 : getPresentType().hashCode());
        result = prime * result + ((getPresentReason() == null) ? 0 : getPresentReason().hashCode());
        result = prime * result + ((getCommodityId() == null) ? 0 : getCommodityId().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSuccessTime() == null) ? 0 : getSuccessTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCommodityFlowIds() == null) ? 0 : getCommodityFlowIds().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", activityPresentId=").append(activityPresentId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", presentUserId=").append(presentUserId);
        sb.append(", presentType=").append(presentType);
        sb.append(", presentReason=").append(presentReason);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", quantity=").append(quantity);
        sb.append(", ticketId=").append(ticketId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", successTime=").append(successTime);
        sb.append(", remark=").append(remark);
        sb.append(", commodityFlowIds=").append(commodityFlowIds);
        sb.append("]");
        return sb.toString();
    }
}