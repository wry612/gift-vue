package cn.datai.gift.web.plugin.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/6.
 */
public class UserLoginInfo implements Serializable {

    /**
     * 微信APPID
     */
    private String appId;

    /**
     * 微信openID
     */
    private String weixinOpenId;

    /**
     * 用户信息Id
     */
    private Long userInfoId;

    /**
     * 微信unionId
     */
    private String unionId;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    @Override
    public String toString() {
        return "UserLoginInfo{" +
                "appId='" + appId + '\'' +
                ", weixinOpenId='" + weixinOpenId + '\'' +
                ", userInfoId=" + userInfoId +
                ", unionId='" + unionId + '\'' +
                '}';
    }
}
