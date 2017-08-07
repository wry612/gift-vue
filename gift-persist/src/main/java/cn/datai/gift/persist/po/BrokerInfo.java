package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class BrokerInfo implements Serializable {
    public static final long serialVersionUID = -1030107856L;

    /**
     * 经纪人用户id: broker_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 激活时间: broker_info.ACT_TIME
     * @author MyBatis Generator
     */
    private Date actTime;

    /**
     * 注销时间: broker_info.DESTROY_TIME
     * @author MyBatis Generator
     */
    private Date destroyTime;

    /**
     * 状态: broker_info.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 活动规则, json格式  包含字段：版本号（必要字段）、是否有效（必要字段） 针对版本1的字段： 赠礼使用的账号、老用户赠礼开关、给老用户赠礼类型（券或商品）、给老用户赠送物品id、给老用户赠送数量、新用户赠礼开关、给新用户赠礼类型（券或商品）、给新用户赠送物品id、给新用户赠送数量: broker_info.ACTIVITY_RULE
     * @author MyBatis Generator
     */
    private String activityRule;

    /**
     * 获取经纪人用户id: broker_info.USER_INFO_ID
     * @return 经纪人用户id: broker_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置经纪人用户id: broker_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: broker_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取激活时间: broker_info.ACT_TIME
     * @return 激活时间: broker_info.ACT_TIME
     * @author MyBatis Generator
     */
    public Date getActTime() {
        return actTime;
    }

    /**
     * 设置激活时间: broker_info.ACT_TIME
     * @param actTime 映射数据库字段: broker_info.ACT_TIME
     * @author MyBatis Generator
     */
    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    /**
     * 获取注销时间: broker_info.DESTROY_TIME
     * @return 注销时间: broker_info.DESTROY_TIME
     * @author MyBatis Generator
     */
    public Date getDestroyTime() {
        return destroyTime;
    }

    /**
     * 设置注销时间: broker_info.DESTROY_TIME
     * @param destroyTime 映射数据库字段: broker_info.DESTROY_TIME
     * @author MyBatis Generator
     */
    public void setDestroyTime(Date destroyTime) {
        this.destroyTime = destroyTime;
    }

    /**
     * 获取状态: broker_info.STATUS
     * @return 状态: broker_info.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态: broker_info.STATUS
     * @param status 映射数据库字段: broker_info.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取活动规则, json格式  包含字段：版本号（必要字段）、是否有效（必要字段） 针对版本1的字段： 赠礼使用的账号、老用户赠礼开关、给老用户赠礼类型（券或商品）、给老用户赠送物品id、给老用户赠送数量、新用户赠礼开关、给新用户赠礼类型（券或商品）、给新用户赠送物品id、给新用户赠送数量: broker_info.ACTIVITY_RULE
     * @return 活动规则, json格式  包含字段：版本号（必要字段）、是否有效（必要字段） 针对版本1的字段： 赠礼使用的账号、老用户赠礼开关、给老用户赠礼类型（券或商品）、给老用户赠送物品id、给老用户赠送数量、新用户赠礼开关、给新用户赠礼类型（券或商品）、给新用户赠送物品id、给新用户赠送数量: broker_info.ACTIVITY_RULE
     * @author MyBatis Generator
     */
    public String getActivityRule() {
        return activityRule;
    }

    /**
     * 设置活动规则, json格式  包含字段：版本号（必要字段）、是否有效（必要字段） 针对版本1的字段： 赠礼使用的账号、老用户赠礼开关、给老用户赠礼类型（券或商品）、给老用户赠送物品id、给老用户赠送数量、新用户赠礼开关、给新用户赠礼类型（券或商品）、给新用户赠送物品id、给新用户赠送数量: broker_info.ACTIVITY_RULE
     * @param activityRule 映射数据库字段: broker_info.ACTIVITY_RULE
     * @author MyBatis Generator
     */
    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule == null ? null : activityRule.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
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
        BrokerInfo other = (BrokerInfo) that;
        return (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getActTime() == null ? other.getActTime() == null : this.getActTime().equals(other.getActTime()))
            && (this.getDestroyTime() == null ? other.getDestroyTime() == null : this.getDestroyTime().equals(other.getDestroyTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getActivityRule() == null ? other.getActivityRule() == null : this.getActivityRule().equals(other.getActivityRule()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getActTime() == null) ? 0 : getActTime().hashCode());
        result = prime * result + ((getDestroyTime() == null) ? 0 : getDestroyTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getActivityRule() == null) ? 0 : getActivityRule().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", actTime=").append(actTime);
        sb.append(", destroyTime=").append(destroyTime);
        sb.append(", status=").append(status);
        sb.append(", activityRule=").append(activityRule);
        sb.append("]");
        return sb.toString();
    }
}