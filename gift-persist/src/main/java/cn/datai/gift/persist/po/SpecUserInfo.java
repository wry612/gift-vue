package cn.datai.gift.persist.po;

import java.io.Serializable;

public class SpecUserInfo implements Serializable {
    public static final long serialVersionUID = -1776137539L;

    /**
     * 用户id: spec_user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 会员单位id: spec_user_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    private Long memberInfoId;

    /**
     * 获取用户id: spec_user_info.USER_INFO_ID
     * @return 用户id: spec_user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: spec_user_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: spec_user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取会员单位id: spec_user_info.MEMBER_INFO_ID
     * @return 会员单位id: spec_user_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getMemberInfoId() {
        return memberInfoId;
    }

    /**
     * 设置会员单位id: spec_user_info.MEMBER_INFO_ID
     * @param memberInfoId 映射数据库字段: spec_user_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    public void setMemberInfoId(Long memberInfoId) {
        this.memberInfoId = memberInfoId;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
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
        SpecUserInfo other = (SpecUserInfo) that;
        return (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getMemberInfoId() == null ? other.getMemberInfoId() == null : this.getMemberInfoId().equals(other.getMemberInfoId()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getMemberInfoId() == null) ? 0 : getMemberInfoId().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
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
        sb.append(", memberInfoId=").append(memberInfoId);
        sb.append("]");
        return sb.toString();
    }
}