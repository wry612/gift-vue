package cn.datai.gift.persist.po;

import java.io.Serializable;

public class UserWxInfo implements Serializable {
    public static final long serialVersionUID = -1002294301L;

    /**
     * 微信用户的唯一标识: user_wx_info.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_info.UNIONID
     * @author MyBatis Generator
     */
    private String unionid;

    /**
     * 微信公众号或应用id: user_wx_info.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 用户昵称: user_wx_info.NICKNAME
     * @author MyBatis Generator
     */
    private String nickname;

    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知: user_wx_info.SEX
     * @author MyBatis Generator
     */
    private String sex;

    /**
     * 用户个人资料填写的省份: user_wx_info.PROVINCE
     * @author MyBatis Generator
     */
    private String province;

    /**
     * 普通用户个人资料填写的城市: user_wx_info.CITY
     * @author MyBatis Generator
     */
    private String city;

    /**
     * 国家，如中国为CN: user_wx_info.COUNTRY
     * @author MyBatis Generator
     */
    private String country;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。: user_wx_info.HEADIMGURL
     * @author MyBatis Generator
     */
    private String headimgurl;

    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）: user_wx_info.PRIVILEGE
     * @author MyBatis Generator
     */
    private String privilege;

    /**
     * 获取微信用户的唯一标识: user_wx_info.OPENID
     * @return 微信用户的唯一标识: user_wx_info.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信用户的唯一标识: user_wx_info.OPENID
     * @param openid 映射数据库字段: user_wx_info.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_info.UNIONID
     * @return 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_info.UNIONID
     * @author MyBatis Generator
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 设置只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_info.UNIONID
     * @param unionid 映射数据库字段: user_wx_info.UNIONID
     * @author MyBatis Generator
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * 获取微信公众号或应用id: user_wx_info.APPID
     * @return 微信公众号或应用id: user_wx_info.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置微信公众号或应用id: user_wx_info.APPID
     * @param appid 映射数据库字段: user_wx_info.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取用户昵称: user_wx_info.NICKNAME
     * @return 用户昵称: user_wx_info.NICKNAME
     * @author MyBatis Generator
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称: user_wx_info.NICKNAME
     * @param nickname 映射数据库字段: user_wx_info.NICKNAME
     * @author MyBatis Generator
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取用户的性别，值为1时是男性，值为2时是女性，值为0时是未知: user_wx_info.SEX
     * @return 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知: user_wx_info.SEX
     * @author MyBatis Generator
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置用户的性别，值为1时是男性，值为2时是女性，值为0时是未知: user_wx_info.SEX
     * @param sex 映射数据库字段: user_wx_info.SEX
     * @author MyBatis Generator
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取用户个人资料填写的省份: user_wx_info.PROVINCE
     * @return 用户个人资料填写的省份: user_wx_info.PROVINCE
     * @author MyBatis Generator
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置用户个人资料填写的省份: user_wx_info.PROVINCE
     * @param province 映射数据库字段: user_wx_info.PROVINCE
     * @author MyBatis Generator
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取普通用户个人资料填写的城市: user_wx_info.CITY
     * @return 普通用户个人资料填写的城市: user_wx_info.CITY
     * @author MyBatis Generator
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置普通用户个人资料填写的城市: user_wx_info.CITY
     * @param city 映射数据库字段: user_wx_info.CITY
     * @author MyBatis Generator
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取国家，如中国为CN: user_wx_info.COUNTRY
     * @return 国家，如中国为CN: user_wx_info.COUNTRY
     * @author MyBatis Generator
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家，如中国为CN: user_wx_info.COUNTRY
     * @param country 映射数据库字段: user_wx_info.COUNTRY
     * @author MyBatis Generator
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。: user_wx_info.HEADIMGURL
     * @return 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。: user_wx_info.HEADIMGURL
     * @author MyBatis Generator
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。: user_wx_info.HEADIMGURL
     * @param headimgurl 映射数据库字段: user_wx_info.HEADIMGURL
     * @author MyBatis Generator
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    /**
     * 获取用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）: user_wx_info.PRIVILEGE
     * @return 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）: user_wx_info.PRIVILEGE
     * @author MyBatis Generator
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * 设置用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）: user_wx_info.PRIVILEGE
     * @param privilege 映射数据库字段: user_wx_info.PRIVILEGE
     * @author MyBatis Generator
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege == null ? null : privilege.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
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
        UserWxInfo other = (UserWxInfo) that;
        return (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getHeadimgurl() == null ? other.getHeadimgurl() == null : this.getHeadimgurl().equals(other.getHeadimgurl()))
            && (this.getPrivilege() == null ? other.getPrivilege() == null : this.getPrivilege().equals(other.getPrivilege()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getHeadimgurl() == null) ? 0 : getHeadimgurl().hashCode());
        result = prime * result + ((getPrivilege() == null) ? 0 : getPrivilege().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", openid=").append(openid);
        sb.append(", unionid=").append(unionid);
        sb.append(", appid=").append(appid);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", headimgurl=").append(headimgurl);
        sb.append(", privilege=").append(privilege);
        sb.append("]");
        return sb.toString();
    }
}