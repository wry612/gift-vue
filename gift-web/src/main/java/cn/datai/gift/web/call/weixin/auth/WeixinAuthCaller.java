package cn.datai.gift.web.call.weixin.auth;

import cn.datai.gift.web.call.weixin.auth.response.UserWxInfoExt;
import cn.datai.gift.web.plugin.vo.JsapiTicket;
import cn.datai.gift.web.plugin.vo.WeixinUserToken;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 * Created by zhangyutao on 2017/7/21.
 */
public interface WeixinAuthCaller {

    /**
     * 获取access_token
     * @param grantType 微信授权类型
     * @param appid 公众号appid
     * @param secret 公众号密码
     * @return
     */
    @GET("cgi-bin/token")
    Call<Object> pullToken(@Query("grant_type") String grantType, @Query("appid") String appid, @Query("secret") String secret);

    /**
     * 获取微信jsticket
     * @param accessToken
     * @param type
     * @return
     */
    @GET("/cgi-bin/ticket/getticket")
    Call<JsapiTicket> getTicket(@Query("access_token") String accessToken, @Query("type") String type);


    /**
     * 获取用户令牌, 通过code换取网页授权access_token
     * <p>由于公众号的secret和获取到的access_token安全级别都非常高，必须只保存在服务器，不允许传给客户端。后续刷新access_token、通过access_token获取用户信息等步骤，也必须从服务器发起。</p>
     * @return
     */
    @GET("/sns/oauth2/access_token")
    Call<WeixinUserToken> snsOauth2AccessToken(@Query("appid") String appid,
                                               @Query("secret") String secret,
                                               @Query("code") String code,
                                               @Query("grant_type") String grantType);

    /**
     * 获取微信用户信息
     * @param accessToken
     * @param openid
     * @param language
     * @return
     */
    @GET("/sns/userinfo")
    Call<UserWxInfoExt> snsUserinfo(@Query("access_token") String accessToken, @Query("openid") String openid, @Query("lang") String language);
}
