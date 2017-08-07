package cn.datai.gift.web.plugin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 从微信服务器获取的用户令牌的相关数据
 */
public class WeixinUserToken {
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("openid")
    private String openid;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("unionid")
    private String unionid;

    @JsonProperty("errcode")
    private String errcode;

    @JsonProperty("errmsg")
    private String errmsg;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }


    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
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

        WeixinUserToken that = (WeixinUserToken) o;

        if (expiresIn != that.expiresIn) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (unionid != null ? !unionid.equals(that.unionid) : that.unionid != null) return false;
        if (errcode != null ? !errcode.equals(that.errcode) : that.errcode != null) return false;
        return errmsg != null ? errmsg.equals(that.errmsg) : that.errmsg == null;
    }

    @Override
    public int hashCode() {
        int result = accessToken != null ? accessToken.hashCode() : 0;
        result = 31 * result + expiresIn;
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (unionid != null ? unionid.hashCode() : 0);
        result = 31 * result + (errcode != null ? errcode.hashCode() : 0);
        result = 31 * result + (errmsg != null ? errmsg.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WeixinUserToken{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", refreshToken='" + refreshToken + '\'' +
                ", openid='" + openid + '\'' +
                ", scope='" + scope + '\'' +
                ", unionid='" + unionid + '\'' +
                ", errcode='" + errcode + '\'' +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}
