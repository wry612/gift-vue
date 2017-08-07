package cn.datai.gift.persist.po;

import java.io.Serializable;

public class OperatorInfo implements Serializable {
    public static final long serialVersionUID = 1273168443L;

    /**
     * operator_info_id: operator_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 运营商编号: operator_info.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 运营商名称: operator_info.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 联系电话: operator_info.TELEPHONE
     * @author MyBatis Generator
     */
    private String telephone;

    /**
     * 手机号: operator_info.MOBILEPHONE
     * @author MyBatis Generator
     */
    private String mobilephone;

    /**
     * 地址: operator_info.ADDRESS
     * @author MyBatis Generator
     */
    private String address;

    /**
     * 邮编: operator_info.POSTCODE
     * @author MyBatis Generator
     */
    private String postcode;

    /**
     * 负责人姓名: operator_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    private String contactName;

    /**
     * 绑定的外部账号: operator_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    private String bindAccount;

    /**
     * 微信商户号: operator_info.WX_MERCHANT_CODE
     * @author MyBatis Generator
     */
    private String wxMerchantCode;

    /**
     * 微信商户联系人手机号: operator_info.WX_CONTACT_PHONE
     * @author MyBatis Generator
     */
    private String wxContactPhone;

    /**
     * 获取operator_info_id: operator_info.OPERATOR_INFO_ID
     * @return operator_info_id: operator_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    /**
     * 设置operator_info_id: operator_info.OPERATOR_INFO_ID
     * @param operatorInfoId 映射数据库字段: operator_info.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    /**
     * 获取运营商编号: operator_info.CODE
     * @return 运营商编号: operator_info.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置运营商编号: operator_info.CODE
     * @param code 映射数据库字段: operator_info.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取运营商名称: operator_info.NAME
     * @return 运营商名称: operator_info.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置运营商名称: operator_info.NAME
     * @param name 映射数据库字段: operator_info.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取联系电话: operator_info.TELEPHONE
     * @return 联系电话: operator_info.TELEPHONE
     * @author MyBatis Generator
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话: operator_info.TELEPHONE
     * @param telephone 映射数据库字段: operator_info.TELEPHONE
     * @author MyBatis Generator
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取手机号: operator_info.MOBILEPHONE
     * @return 手机号: operator_info.MOBILEPHONE
     * @author MyBatis Generator
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * 设置手机号: operator_info.MOBILEPHONE
     * @param mobilephone 映射数据库字段: operator_info.MOBILEPHONE
     * @author MyBatis Generator
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * 获取地址: operator_info.ADDRESS
     * @return 地址: operator_info.ADDRESS
     * @author MyBatis Generator
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址: operator_info.ADDRESS
     * @param address 映射数据库字段: operator_info.ADDRESS
     * @author MyBatis Generator
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取邮编: operator_info.POSTCODE
     * @return 邮编: operator_info.POSTCODE
     * @author MyBatis Generator
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮编: operator_info.POSTCODE
     * @param postcode 映射数据库字段: operator_info.POSTCODE
     * @author MyBatis Generator
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * 获取负责人姓名: operator_info.CONTACT_NAME
     * @return 负责人姓名: operator_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置负责人姓名: operator_info.CONTACT_NAME
     * @param contactName 映射数据库字段: operator_info.CONTACT_NAME
     * @author MyBatis Generator
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取绑定的外部账号: operator_info.BIND_ACCOUNT
     * @return 绑定的外部账号: operator_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    public String getBindAccount() {
        return bindAccount;
    }

    /**
     * 设置绑定的外部账号: operator_info.BIND_ACCOUNT
     * @param bindAccount 映射数据库字段: operator_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    public void setBindAccount(String bindAccount) {
        this.bindAccount = bindAccount == null ? null : bindAccount.trim();
    }

    /**
     * 获取微信商户号: operator_info.WX_MERCHANT_CODE
     * @return 微信商户号: operator_info.WX_MERCHANT_CODE
     * @author MyBatis Generator
     */
    public String getWxMerchantCode() {
        return wxMerchantCode;
    }

    /**
     * 设置微信商户号: operator_info.WX_MERCHANT_CODE
     * @param wxMerchantCode 映射数据库字段: operator_info.WX_MERCHANT_CODE
     * @author MyBatis Generator
     */
    public void setWxMerchantCode(String wxMerchantCode) {
        this.wxMerchantCode = wxMerchantCode == null ? null : wxMerchantCode.trim();
    }

    /**
     * 获取微信商户联系人手机号: operator_info.WX_CONTACT_PHONE
     * @return 微信商户联系人手机号: operator_info.WX_CONTACT_PHONE
     * @author MyBatis Generator
     */
    public String getWxContactPhone() {
        return wxContactPhone;
    }

    /**
     * 设置微信商户联系人手机号: operator_info.WX_CONTACT_PHONE
     * @param wxContactPhone 映射数据库字段: operator_info.WX_CONTACT_PHONE
     * @author MyBatis Generator
     */
    public void setWxContactPhone(String wxContactPhone) {
        this.wxContactPhone = wxContactPhone == null ? null : wxContactPhone.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
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
        OperatorInfo other = (OperatorInfo) that;
        return (this.getOperatorInfoId() == null ? other.getOperatorInfoId() == null : this.getOperatorInfoId().equals(other.getOperatorInfoId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getBindAccount() == null ? other.getBindAccount() == null : this.getBindAccount().equals(other.getBindAccount()))
            && (this.getWxMerchantCode() == null ? other.getWxMerchantCode() == null : this.getWxMerchantCode().equals(other.getWxMerchantCode()))
            && (this.getWxContactPhone() == null ? other.getWxContactPhone() == null : this.getWxContactPhone().equals(other.getWxContactPhone()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperatorInfoId() == null) ? 0 : getOperatorInfoId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getBindAccount() == null) ? 0 : getBindAccount().hashCode());
        result = prime * result + ((getWxMerchantCode() == null) ? 0 : getWxMerchantCode().hashCode());
        result = prime * result + ((getWxContactPhone() == null) ? 0 : getWxContactPhone().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", operatorInfoId=").append(operatorInfoId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", address=").append(address);
        sb.append(", postcode=").append(postcode);
        sb.append(", contactName=").append(contactName);
        sb.append(", bindAccount=").append(bindAccount);
        sb.append(", wxMerchantCode=").append(wxMerchantCode);
        sb.append(", wxContactPhone=").append(wxContactPhone);
        sb.append("]");
        return sb.toString();
    }
}