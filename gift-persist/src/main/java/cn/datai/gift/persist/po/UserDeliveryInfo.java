package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class UserDeliveryInfo implements Serializable {
    public static final long serialVersionUID = -391436170L;

    /**
     * : user_delivery_info.USER_DELIVERY_INFO_ID
     * @author MyBatis Generator
     */
    private Long userDeliveryInfoId;

    /**
     * 用户id: user_delivery_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 收货人姓名: user_delivery_info.USERNAME
     * @author MyBatis Generator
     */
    private String username;

    /**
     * 收货人电话: user_delivery_info.TEL_NUMBER
     * @author MyBatis Generator
     */
    private String telNumber;

    /**
     * 邮编: user_delivery_info.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    private String addressPostalCode;

    /**
     * 国标收货地址第一级地址: user_delivery_info.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    private String proviceFirstStageName;

    /**
     * 国标收货地址第二级地址: user_delivery_info.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCitySecondStageName;

    /**
     * 国标收货地址第三级地址: user_delivery_info.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCountiesThirdStageName;

    /**
     * 详细收货地址信息: user_delivery_info.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    private String addressDetailInfo;

    /**
     * 收货地址国家码: user_delivery_info.NATIONAL_CODE
     * @author MyBatis Generator
     */
    private String nationalCode;

    /**
     * true  : 默认  false:不是默认: user_delivery_info.IS_DEFAULT
     * @author MyBatis Generator
     */
    private String isDefault;

    /**
     * 创建时间: user_delivery_info.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: user_delivery_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    private Date updateTime;

    /**
     * 获取: user_delivery_info.USER_DELIVERY_INFO_ID
     * @return : user_delivery_info.USER_DELIVERY_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserDeliveryInfoId() {
        return userDeliveryInfoId;
    }

    /**
     * 设置: user_delivery_info.USER_DELIVERY_INFO_ID
     * @param userDeliveryInfoId 映射数据库字段: user_delivery_info.USER_DELIVERY_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserDeliveryInfoId(Long userDeliveryInfoId) {
        this.userDeliveryInfoId = userDeliveryInfoId;
    }

    /**
     * 获取用户id: user_delivery_info.USER_INFO_ID
     * @return 用户id: user_delivery_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: user_delivery_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: user_delivery_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取收货人姓名: user_delivery_info.USERNAME
     * @return 收货人姓名: user_delivery_info.USERNAME
     * @author MyBatis Generator
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置收货人姓名: user_delivery_info.USERNAME
     * @param username 映射数据库字段: user_delivery_info.USERNAME
     * @author MyBatis Generator
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取收货人电话: user_delivery_info.TEL_NUMBER
     * @return 收货人电话: user_delivery_info.TEL_NUMBER
     * @author MyBatis Generator
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * 设置收货人电话: user_delivery_info.TEL_NUMBER
     * @param telNumber 映射数据库字段: user_delivery_info.TEL_NUMBER
     * @author MyBatis Generator
     */
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber == null ? null : telNumber.trim();
    }

    /**
     * 获取邮编: user_delivery_info.ADDRESS_POSTAL_CODE
     * @return 邮编: user_delivery_info.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * 设置邮编: user_delivery_info.ADDRESS_POSTAL_CODE
     * @param addressPostalCode 映射数据库字段: user_delivery_info.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode == null ? null : addressPostalCode.trim();
    }

    /**
     * 获取国标收货地址第一级地址: user_delivery_info.PROVICE_FIRST_STAGE_NAME
     * @return 国标收货地址第一级地址: user_delivery_info.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getProviceFirstStageName() {
        return proviceFirstStageName;
    }

    /**
     * 设置国标收货地址第一级地址: user_delivery_info.PROVICE_FIRST_STAGE_NAME
     * @param proviceFirstStageName 映射数据库字段: user_delivery_info.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setProviceFirstStageName(String proviceFirstStageName) {
        this.proviceFirstStageName = proviceFirstStageName == null ? null : proviceFirstStageName.trim();
    }

    /**
     * 获取国标收货地址第二级地址: user_delivery_info.ADDRESS_CITY_SECOND_STAGE_NAME
     * @return 国标收货地址第二级地址: user_delivery_info.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCitySecondStageName() {
        return addressCitySecondStageName;
    }

    /**
     * 设置国标收货地址第二级地址: user_delivery_info.ADDRESS_CITY_SECOND_STAGE_NAME
     * @param addressCitySecondStageName 映射数据库字段: user_delivery_info.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCitySecondStageName(String addressCitySecondStageName) {
        this.addressCitySecondStageName = addressCitySecondStageName == null ? null : addressCitySecondStageName.trim();
    }

    /**
     * 获取国标收货地址第三级地址: user_delivery_info.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @return 国标收货地址第三级地址: user_delivery_info.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCountiesThirdStageName() {
        return addressCountiesThirdStageName;
    }

    /**
     * 设置国标收货地址第三级地址: user_delivery_info.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @param addressCountiesThirdStageName 映射数据库字段: user_delivery_info.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCountiesThirdStageName(String addressCountiesThirdStageName) {
        this.addressCountiesThirdStageName = addressCountiesThirdStageName == null ? null : addressCountiesThirdStageName.trim();
    }

    /**
     * 获取详细收货地址信息: user_delivery_info.ADDRESS_DETAIL_INFO
     * @return 详细收货地址信息: user_delivery_info.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public String getAddressDetailInfo() {
        return addressDetailInfo;
    }

    /**
     * 设置详细收货地址信息: user_delivery_info.ADDRESS_DETAIL_INFO
     * @param addressDetailInfo 映射数据库字段: user_delivery_info.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public void setAddressDetailInfo(String addressDetailInfo) {
        this.addressDetailInfo = addressDetailInfo == null ? null : addressDetailInfo.trim();
    }

    /**
     * 获取收货地址国家码: user_delivery_info.NATIONAL_CODE
     * @return 收货地址国家码: user_delivery_info.NATIONAL_CODE
     * @author MyBatis Generator
     */
    public String getNationalCode() {
        return nationalCode;
    }

    /**
     * 设置收货地址国家码: user_delivery_info.NATIONAL_CODE
     * @param nationalCode 映射数据库字段: user_delivery_info.NATIONAL_CODE
     * @author MyBatis Generator
     */
    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode == null ? null : nationalCode.trim();
    }

    /**
     * 获取true  : 默认  false:不是默认: user_delivery_info.IS_DEFAULT
     * @return true  : 默认  false:不是默认: user_delivery_info.IS_DEFAULT
     * @author MyBatis Generator
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 设置true  : 默认  false:不是默认: user_delivery_info.IS_DEFAULT
     * @param isDefault 映射数据库字段: user_delivery_info.IS_DEFAULT
     * @author MyBatis Generator
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * 获取创建时间: user_delivery_info.CREATE_TIME
     * @return 创建时间: user_delivery_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: user_delivery_info.CREATE_TIME
     * @param createTime 映射数据库字段: user_delivery_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间: user_delivery_info.UPDATE_TIME
     * @return 修改时间: user_delivery_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间: user_delivery_info.UPDATE_TIME
     * @param updateTime 映射数据库字段: user_delivery_info.UPDATE_TIME
     * @author MyBatis Generator
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
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
        UserDeliveryInfo other = (UserDeliveryInfo) that;
        return (this.getUserDeliveryInfoId() == null ? other.getUserDeliveryInfoId() == null : this.getUserDeliveryInfoId().equals(other.getUserDeliveryInfoId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getTelNumber() == null ? other.getTelNumber() == null : this.getTelNumber().equals(other.getTelNumber()))
            && (this.getAddressPostalCode() == null ? other.getAddressPostalCode() == null : this.getAddressPostalCode().equals(other.getAddressPostalCode()))
            && (this.getProviceFirstStageName() == null ? other.getProviceFirstStageName() == null : this.getProviceFirstStageName().equals(other.getProviceFirstStageName()))
            && (this.getAddressCitySecondStageName() == null ? other.getAddressCitySecondStageName() == null : this.getAddressCitySecondStageName().equals(other.getAddressCitySecondStageName()))
            && (this.getAddressCountiesThirdStageName() == null ? other.getAddressCountiesThirdStageName() == null : this.getAddressCountiesThirdStageName().equals(other.getAddressCountiesThirdStageName()))
            && (this.getAddressDetailInfo() == null ? other.getAddressDetailInfo() == null : this.getAddressDetailInfo().equals(other.getAddressDetailInfo()))
            && (this.getNationalCode() == null ? other.getNationalCode() == null : this.getNationalCode().equals(other.getNationalCode()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserDeliveryInfoId() == null) ? 0 : getUserDeliveryInfoId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getTelNumber() == null) ? 0 : getTelNumber().hashCode());
        result = prime * result + ((getAddressPostalCode() == null) ? 0 : getAddressPostalCode().hashCode());
        result = prime * result + ((getProviceFirstStageName() == null) ? 0 : getProviceFirstStageName().hashCode());
        result = prime * result + ((getAddressCitySecondStageName() == null) ? 0 : getAddressCitySecondStageName().hashCode());
        result = prime * result + ((getAddressCountiesThirdStageName() == null) ? 0 : getAddressCountiesThirdStageName().hashCode());
        result = prime * result + ((getAddressDetailInfo() == null) ? 0 : getAddressDetailInfo().hashCode());
        result = prime * result + ((getNationalCode() == null) ? 0 : getNationalCode().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userDeliveryInfoId=").append(userDeliveryInfoId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", username=").append(username);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", addressPostalCode=").append(addressPostalCode);
        sb.append(", proviceFirstStageName=").append(proviceFirstStageName);
        sb.append(", addressCitySecondStageName=").append(addressCitySecondStageName);
        sb.append(", addressCountiesThirdStageName=").append(addressCountiesThirdStageName);
        sb.append(", addressDetailInfo=").append(addressDetailInfo);
        sb.append(", nationalCode=").append(nationalCode);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}