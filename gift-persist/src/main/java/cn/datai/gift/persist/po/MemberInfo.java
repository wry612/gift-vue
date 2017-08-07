package cn.datai.gift.persist.po;

import java.io.Serializable;

public class MemberInfo implements Serializable {
    public static final long serialVersionUID = 242063217L;

    /**
     * member_info_id: member_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    private Long memberInfoId;

    /**
     * 会员单位编号: member_info.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 名称: member_info.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 地址: member_info.ADDRESS
     * @author MyBatis Generator
     */
    private String address;

    /**
     * 联系人手机号: member_info.CONTACT_MOBILE_PHONE
     * @author MyBatis Generator
     */
    private String contactMobilePhone;

    /**
     * 联系人姓名: member_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    private String contactName;

    /**
     * 获取member_info_id: member_info.MEMBER_INFO_ID
     * @return member_info_id: member_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getMemberInfoId() {
        return memberInfoId;
    }

    /**
     * 设置member_info_id: member_info.MEMBER_INFO_ID
     * @param memberInfoId 映射数据库字段: member_info.MEMBER_INFO_ID
     * @author MyBatis Generator
     */
    public void setMemberInfoId(Long memberInfoId) {
        this.memberInfoId = memberInfoId;
    }

    /**
     * 获取会员单位编号: member_info.CODE
     * @return 会员单位编号: member_info.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置会员单位编号: member_info.CODE
     * @param code 映射数据库字段: member_info.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取名称: member_info.NAME
     * @return 名称: member_info.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称: member_info.NAME
     * @param name 映射数据库字段: member_info.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取地址: member_info.ADDRESS
     * @return 地址: member_info.ADDRESS
     * @author MyBatis Generator
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址: member_info.ADDRESS
     * @param address 映射数据库字段: member_info.ADDRESS
     * @author MyBatis Generator
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取联系人手机号: member_info.CONTACT_MOBILE_PHONE
     * @return 联系人手机号: member_info.CONTACT_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public String getContactMobilePhone() {
        return contactMobilePhone;
    }

    /**
     * 设置联系人手机号: member_info.CONTACT_MOBILE_PHONE
     * @param contactMobilePhone 映射数据库字段: member_info.CONTACT_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone == null ? null : contactMobilePhone.trim();
    }

    /**
     * 获取联系人姓名: member_info.CONTACT_NAME
     * @return 联系人姓名: member_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名: member_info.CONTACT_NAME
     * @param contactName 映射数据库字段: member_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
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
        MemberInfo other = (MemberInfo) that;
        return (this.getMemberInfoId() == null ? other.getMemberInfoId() == null : this.getMemberInfoId().equals(other.getMemberInfoId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContactMobilePhone() == null ? other.getContactMobilePhone() == null : this.getContactMobilePhone().equals(other.getContactMobilePhone()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberInfoId() == null) ? 0 : getMemberInfoId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContactMobilePhone() == null) ? 0 : getContactMobilePhone().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", memberInfoId=").append(memberInfoId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", contactMobilePhone=").append(contactMobilePhone);
        sb.append(", contactName=").append(contactName);
        sb.append("]");
        return sb.toString();
    }
}