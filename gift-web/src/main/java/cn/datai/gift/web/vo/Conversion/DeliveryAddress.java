package cn.datai.gift.web.vo.Conversion;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 物品邮寄地址
 * Created by zhangyutao on 2017/6/20.
 */
public class DeliveryAddress {

    /**
     * 收货人姓名
     */
    private String addresseeName;

    /**
     * 收货人手机号
     */
    private String addresseeMobilePhone;
    /**
     * 收货地址第一级地址
     */
    private String proviceFirstStageName;
    /**
     * 收货地址第二级地址
     */
    private String addressCitySecondStageName;
    /**
     * 收货地址第三级地址
     */
    private String addressCountiesThirdStageName;
    /**
     * 详细收货地址信息
     */
    private String addressDetailInfo;
    /**
     * 邮编
     */
    private String addressPostalCode;
    /**
     * 期望的提货日期
     */
    private String dateExpect;

    public String getAddresseeName() {
        return addresseeName;
    }

    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName;
    }

    public String getAddresseeMobilePhone() {
        return addresseeMobilePhone;
    }

    public void setAddresseeMobilePhone(String addresseeMobilePhone) {
        this.addresseeMobilePhone = addresseeMobilePhone;
    }

    public String getProviceFirstStageName() {
        return proviceFirstStageName;
    }

    public void setProviceFirstStageName(String proviceFirstStageName) {
        this.proviceFirstStageName = proviceFirstStageName;
    }

    public String getAddressCitySecondStageName() {
        return addressCitySecondStageName;
    }

    public void setAddressCitySecondStageName(String addressCitySecondStageName) {
        this.addressCitySecondStageName = addressCitySecondStageName;
    }

    public String getAddressCountiesThirdStageName() {
        return addressCountiesThirdStageName;
    }

    public void setAddressCountiesThirdStageName(String addressCountiesThirdStageName) {
        this.addressCountiesThirdStageName = addressCountiesThirdStageName;
    }

    public String getAddressDetailInfo() {
        return addressDetailInfo;
    }

    public void setAddressDetailInfo(String addressDetailInfo) {
        this.addressDetailInfo = addressDetailInfo;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getDateExpect() {
        return dateExpect;
    }

    public void setDateExpect(String dateExpect) {
        this.dateExpect = dateExpect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DeliveryAddress that = (DeliveryAddress) o;

        return new EqualsBuilder()
                .append(addresseeName, that.addresseeName)
                .append(addresseeMobilePhone, that.addresseeMobilePhone)
                .append(proviceFirstStageName, that.proviceFirstStageName)
                .append(addressCitySecondStageName, that.addressCitySecondStageName)
                .append(addressCountiesThirdStageName, that.addressCountiesThirdStageName)
                .append(addressDetailInfo, that.addressDetailInfo)
                .append(addressPostalCode, that.addressPostalCode)
                .append(dateExpect, that.dateExpect)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(addresseeName)
                .append(addresseeMobilePhone)
                .append(proviceFirstStageName)
                .append(addressCitySecondStageName)
                .append(addressCountiesThirdStageName)
                .append(addressDetailInfo)
                .append(addressPostalCode)
                .append(dateExpect)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "addresseeName='" + addresseeName + '\'' +
                ", addresseeMobilePhone='" + addresseeMobilePhone + '\'' +
                ", proviceFirstStageName='" + proviceFirstStageName + '\'' +
                ", addressCitySecondStageName='" + addressCitySecondStageName + '\'' +
                ", addressCountiesThirdStageName='" + addressCountiesThirdStageName + '\'' +
                ", addressDetailInfo='" + addressDetailInfo + '\'' +
                ", addressPostalCode='" + addressPostalCode + '\'' +
                ", dateExpect='" + dateExpect + '\'' +
                '}';
    }
}
