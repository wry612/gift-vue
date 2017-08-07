package cn.datai.gift.web.call.weixin.auth;

import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.call.weixin.auth.response.UserWxInfoExt;
import cn.datai.gift.web.plugin.vo.WeixinUserToken;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.Call;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhangyutao on 2017/7/24.
 */
@Component
public class WeixinAuthAPI {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${weixin.appID}")
    private String appid;

    @Value("${weixin.appsecret}")
    private String secret;


    @Autowired
    private WeixinAuthCaller weixinAuthCaller;

    /**
     * 通过code换取网页授权access_token
     *
     * @param code <p>code作为换取access_token的票据，每次用户授权带上的code将不一样，code只能使用一次，5分钟未被使用自动过期。 </p>
     */
    public WeixinUserToken webAccessToken(String code) throws IOException {
        Call<WeixinUserToken> caller = this.weixinAuthCaller.snsOauth2AccessToken(appid, secret, code, "authorization_code");
        WeixinUserToken weixinUserToken = caller.execute().body();
        if (StringUtils.isNotBlank(weixinUserToken.getErrcode())) {
            if (Integer.valueOf(weixinUserToken.getErrcode()).equals(new Integer(40163)) || Integer.valueOf(weixinUserToken.getErrcode()).equals(new Integer(40029))) {
                //code 已被使用或无效,返回空
                return null;
            }
            logger.error("通过code换取网页授权access_token失败, {}", weixinUserToken);
            throw new BizException("通过code换取网页授权access_token失败");
        }
        logger.info("通过code换取网页授权access_token成功，openid: {}, token：{}", weixinUserToken.getOpenid(), weixinUserToken.getAccessToken());
        return weixinUserToken;
    }

    /**
     * 拉取用户信息
     * @param accessToken
     * @param openid
     */
    public UserWxInfo fetchUserInfo(String accessToken, String openid) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Call<UserWxInfoExt> caller = this.weixinAuthCaller.snsUserinfo(accessToken, openid, "zh_CN");
        UserWxInfoExt userWxInfoExt = caller.execute().body();
        if (userWxInfoExt != null && userWxInfoExt.getErrcode() != 0) {
            logger.error("拉取用户信息失败, openid:{}, accessToken:{}", openid, accessToken);
            throw new BizException("通过code换取网页授权access_token失败");
        }
        logger.info("通过accessToken拉取用户信息成功，userWxInfo：{}", userWxInfoExt);

        UserWxInfo userWxInfo = new UserWxInfo();
        PropertyUtils.copyProperties(userWxInfo, userWxInfoExt);
        userWxInfo.setPrivilege(StringUtils.join(userWxInfoExt.getPrivilegeList(), ","));
        return userWxInfo;
    }
}
