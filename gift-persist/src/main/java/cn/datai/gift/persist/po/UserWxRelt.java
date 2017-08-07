package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class UserWxRelt implements Serializable {
    public static final long serialVersionUID = -1002034640L;

    /**
     * 用户id: user_wx_relt.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_relt.UNIONID
     * @author MyBatis Generator
     */
    private String unionid;

    /**
     * 创建时间: user_wx_relt.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 注释: user_wx_relt.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 获取用户id: user_wx_relt.USER_INFO_ID
     * @return 用户id: user_wx_relt.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: user_wx_relt.USER_INFO_ID
     * @param userInfoId 映射数据库字段: user_wx_relt.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_relt.UNIONID
     * @return 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_relt.UNIONID
     * @author MyBatis Generator
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 设置只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_relt.UNIONID
     * @param unionid 映射数据库字段: user_wx_relt.UNIONID
     * @author MyBatis Generator
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * 获取创建时间: user_wx_relt.CREATE_TIME
     * @return 创建时间: user_wx_relt.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: user_wx_relt.CREATE_TIME
     * @param createTime 映射数据库字段: user_wx_relt.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取注释: user_wx_relt.REMARK
     * @return 注释: user_wx_relt.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: user_wx_relt.REMARK
     * @param remark 映射数据库字段: user_wx_relt.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
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
        UserWxRelt other = (UserWxRelt) that;
        return (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
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
        sb.append(", unionid=").append(unionid);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}