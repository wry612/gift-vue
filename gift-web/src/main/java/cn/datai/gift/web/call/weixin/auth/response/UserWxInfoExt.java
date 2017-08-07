package cn.datai.gift.web.call.weixin.auth.response;

import cn.datai.gift.persist.po.UserWxInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;

public class UserWxInfoExt extends UserWxInfo {

    /**
     * 微信用户的唯一标识: user_wx_info.OPENID
     * @author MyBatis Generator
     */
    @JsonProperty("openid")
    private String openid;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。: user_wx_info.UNIONID
     * @author MyBatis Generator
     */
    @JsonProperty("unionid")
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
    @JsonProperty("nickname")
    private String nickname;

    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知: user_wx_info.SEX
     * @author MyBatis Generator
     */
    @JsonProperty("sex")
    private String sex;

    @JsonProperty("language")
    private String language;

    /**
     * 用户个人资料填写的省份: user_wx_info.PROVINCE
     * @author MyBatis Generator
     */
    @JsonProperty("province")
    private String province;

    /**
     * 普通用户个人资料填写的城市: user_wx_info.CITY
     * @author MyBatis Generator
     */
    @JsonProperty("city")
    private String city;

    /**
     * 国家，如中国为CN: user_wx_info.COUNTRY
     * @author MyBatis Generator
     */
    @JsonProperty("country")
    private String country;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。: user_wx_info.HEADIMGURL
     * @author MyBatis Generator
     */
    @JsonProperty("headimgurl")
    private String headimgurl;

    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）: user_wx_info.PRIVILEGE
     * @author MyBatis Generator
     */
    @JsonProperty("privilege")
    @JsonDeserialize(as = ArrayList.class, contentAs = String.class)
    private ArrayList<String> privilegeList;

    @JsonProperty("errcode")
    private long errcode;

    @JsonProperty("errmsg")
    private String errmsg;

    @Override
    public String getOpenid() {
        return openid;
    }

    @Override
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String getUnionid() {
        return unionid;
    }

    @Override
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Override
    public String getAppid() {
        return appid;
    }

    @Override
    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getHeadimgurl() {
        return headimgurl;
    }

    @Override
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public ArrayList<String> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(ArrayList<String> privilegeList) {
        this.privilegeList = privilegeList;
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserWxInfoExt that = (UserWxInfoExt) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(errcode, that.errcode)
                .append(openid, that.openid)
                .append(unionid, that.unionid)
                .append(appid, that.appid)
                .append(nickname, that.nickname)
                .append(sex, that.sex)
                .append(language, that.language)
                .append(province, that.province)
                .append(city, that.city)
                .append(country, that.country)
                .append(headimgurl, that.headimgurl)
                .append(privilegeList, that.privilegeList)
                .append(errmsg, that.errmsg)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(openid)
                .append(unionid)
                .append(appid)
                .append(nickname)
                .append(sex)
                .append(language)
                .append(province)
                .append(city)
                .append(country)
                .append(headimgurl)
                .append(privilegeList)
                .append(errcode)
                .append(errmsg)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "UserWxInfoExt{" +
                "openid='" + openid + '\'' +
                ", unionid='" + unionid + '\'' +
                ", appid='" + appid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", language='" + language + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", privilegeList=" + privilegeList +
                ", errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                "} " + super.toString();
    }
}
