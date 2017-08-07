package cn.datai.gift.web.plugin.interceptor;


import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.call.weixin.auth.WeixinAuthAPI;
import cn.datai.gift.web.contants.SessionAttrs;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.plugin.vo.WeixinUserToken;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.SystemParamsService;
import cn.datai.gift.web.utils.BaseUtil;
import cn.datai.gift.web.utils.CookieUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.utils.StrUtil;
import com.alibaba.druid.util.Base64;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/6.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Value("${weixin.appID}")
    private String APPID;

    @Value("${weixin.appsecret}")
    private String SECRET;

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private WeixinAuthAPI weixinAuthAPI;


    /**
     * 通过注解进行拦截
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Auth auth = handlerMethod.getMethodAnnotation(Auth.class);

        //没有注解或者不需要用户授权登录
        if(null == auth || !auth.needLogin()){
            return true;
        }

        //有注解需要验证是否需要用户授权
        return wechatAuthHandler(auth,request,response);
    }

    /**
     *根据不同的注解方式分别校验
     * @param auth
     * @param request
     * @param response
     * @return
     */
    private boolean wechatAuthHandler(Auth auth,HttpServletRequest request,HttpServletResponse response) throws Exception {
        boolean result = false;

        //获取session
        UserLoginInfo userLoginInfo = (UserLoginInfo)(request.getSession().getAttribute(SessionAttrs.USER_LOGIN_INFO));

        //获取请求中的参数
        Map<String, String[]> parameterMap = request.getParameterMap();

        if(null == userLoginInfo || null == userLoginInfo.getWeixinOpenId()) {
            //情况一：无用户信息可能有两种情况，一种是用户第一次访问，无授权信息， 需要重定向去授权
            //情况二：另一种是可能用户的页面已被重定向至微信授权页面，微信再重定向回本系统的页面，但会带上授权信息例如code，这时不能把用户重定向，否则会死循环，而要根据拿到的code去获取用户openid，成功后放入session
            //如果包含参数code和state，说明微信服务器对用户已做了授权操作判断，然后微信服务器给客户做了个跳转，并带上能获取用户令牌的code参数及自定义参数state
            if (parameterMap.containsKey("code") && parameterMap.containsKey("state")) {
                return haveCodeAndState(request,response,auth);
            }else{
                return haveNoCodeAndNoState(request,response);
            }
        }else{
            //SESSION中有值
            //通过首页分享和发红包链接的url才会携带userInfoId
            if(parameterMap.containsKey("userInfoId")){
               String  userInfoId = request.getParameter("userInfoId");
                if(MyStringUtil.isNotBlank(userInfoId)){
                    //将用户Id和推荐人Id放入cookie中
                    CookieUtil.addCookie(StatusConstants.RECOMMENDER_MAX_AGE + "_" + userLoginInfo.getUserInfoId(),userInfoId,Integer.valueOf(baseInfoService.getSystemParamsValue(StatusConstants.RECOMMENDER_MAX_AGE)),response);
                }

            }
            result = true;
        }

        return result;
    }


    /**
     * 情况一
     * @param request
     * @param response
     * @return
     */
    private boolean haveNoCodeAndNoState(HttpServletRequest request,HttpServletResponse response) throws IOException {

        //此处为第一种情况
        if (BaseUtil.isAjaxRequest(request)) {
            //返回前端用户未登录的状态码，前端处理：强制刷新当前页面，目的重新获取微信授权信息
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSONObject.toJSONString(new RespResult(RespCode.USER_NOT_LOGIN)));
        }else {
            String authPage = buildWeixinOAuthUrl(getWholeURL(request), request);
            logger.debug("sessionid:{}会话无用户任何信息或微信账号信息， 重定向至微信认证接口", request.getRequestedSessionId());
            response.sendRedirect(authPage);
        }
        return false;
    }

    /**
     * 情况二
     * @param request
     * @param response
     * @return
     */
    private boolean haveCodeAndState(HttpServletRequest request,HttpServletResponse response,Auth auth) throws Exception {

        String code = request.getParameter("code");
        String state = request.getParameter("state");
        logger.debug("重定向回本系统包含微信认证必要的参数 code:{}, state:{}", code, state);
        WeixinUserToken weixinUserToken = this.weixinAuthAPI.webAccessToken(code);
        if (weixinUserToken != null && weixinUserToken.getOpenid() != null) {
            logger.debug("成功获取微信用户令牌 {}", JSONObject.toJSONString(weixinUserToken));

            //校验state
            Object originState = request.getSession().getAttribute(SessionAttrs.WEIXIN_AUTH_STATE);
            if (originState == null || !originState.equals(state)) {
                //有可能用户在授权页停留时间过长，造成session过期删除，state找不到，重新发起流程
                logger.warn("登录校验state不通过");
                //强制浏览器重新发起流程
                response.sendRedirect(getWholeURL(request));
                return false;
            }

            //成功获取令牌后，检查是否已注册，如果已注册，不需要再拉取用户信息，只需要获取openid unionid即可
            UserWxInfo userWxInfo = this.baseInfoService.queryUserWxInfo(weixinUserToken.getOpenid(), weixinUserToken.getUnionid());
            if (userWxInfo != null) {
                //用户已存在
                logger.debug("微信用户用户unionid:{},已注册,不再需要拉取用户信息", weixinUserToken.getUnionid());
                this.cacheWeixinUserInfo(userWxInfo, request.getSession());
            } else{
                //成功获取令牌后，使用令牌去获取用户基本信息
                UserWxInfo weixinUserInfo = this.weixinAuthAPI.fetchUserInfo(weixinUserToken.getAccessToken(), weixinUserToken.getOpenid());
                weixinUserInfo.setAppid(APPID);
                //数据库插入（或更新）用户微信信息,插入微信用户与基本用户关联信息，插入用户（包含特别用户）基本信息
                //判断是否是从推荐路径过来的
                Map<String, String[]> parameterMap = request.getParameterMap();
                String userInfoId = "";//推荐人Id
                //通过首页分享和发红包链接的url才会携带userInfoId
                if(parameterMap.containsKey("userInfoId")){
                    userInfoId = request.getParameter("userInfoId");
                }

                //数据库插入（或更新）用户微信信息,插入微信用户与基本用户关联信息，插入用户（包含特别用户）基本信息
                baseInfoService.insertOrUpDate(weixinUserInfo,userInfoId,response);
                //存入session
                UserLoginInfo userLoginInfo = this.cacheWeixinUserInfo(weixinUserInfo, request.getSession());
                logger.info("微信用户登录成功，登录信息：{}", request.getSession().getAttribute(SessionAttrs.USER_LOGIN_INFO));
            }
            return true;
        } else {
            if (BaseUtil.isAjaxRequest(request)) {
                //返回前端用户未登录的状态码，前端处理：强制刷新当前页面，目的重新获取微信授权信息
                response.setContentType("application/json;charset=utf-8");
                response.getWriter().write(JSONObject.toJSONString(new RespResult(RespCode.USER_NOT_LOGIN)));
            }else {
                //用户会话过期， 但用户依然访问原附带code和state参数的链接，这时使用code去腾讯获取令牌时会返回无效令牌
                //将重新去获取code，并在之后重走之前申请token的流程
                response.sendRedirect(getWholeURL(request));
            }
            return false;
        }
    }

    /**
     * 构建微信认证地址
     * @param wholeURL 用户尝试请求的地址
     * @return
     */
    private String buildWeixinOAuthUrl(String wholeURL, HttpServletRequest request) throws UnsupportedEncodingException {
        //生成state，保存在session中,登录时需校验此值是否匹配，用于防止重定向后的csrf漏洞
        String state = UUID.randomUUID().toString();
        request.getSession().setAttribute(SessionAttrs.WEIXIN_AUTH_STATE, state);

        StringBuffer weixinAuthUrl = new StringBuffer("https://open.weixin.qq.com/connect/oauth2/authorize?appid=");
        weixinAuthUrl.append(this.APPID)
                .append("&redirect_uri=")
                .append(URLEncoder.encode(wholeURL, "utf-8"))
                .append("&response_type=code&scope=snsapi_userinfo&state=")
                .append(state)
                .append("#wechat_redirect");

        return weixinAuthUrl.toString();
    }

    /**
     * 获取完整的url 包括请求参数, 剔除 code 和 state 参数
     * @return String
     */
    private String getWholeURL(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(request.getRequestURL().toString());
        parameterMap.keySet().stream().filter(key -> !"code".equals(key) && !"state".equals(key)).forEach(key -> uriComponentsBuilder.queryParam(key, parameterMap.get(key)));
        return uriComponentsBuilder.build().toString();
    }

    /**
     * 将微信用户信息缓存入session中
     * @param weixinUserInfo @See {@link UserWxInfo}
     * @param session        @See {@link HttpSession}
     * @return boolean
     */
    private UserLoginInfo cacheWeixinUserInfo(UserWxInfo weixinUserInfo, HttpSession session) {
        UserLoginInfo userLoginInfo = (UserLoginInfo) session.getAttribute(SessionAttrs.USER_LOGIN_INFO);
        if (userLoginInfo == null || userLoginInfo.getUserInfoId() == null) {
            userLoginInfo = new UserLoginInfo();
            UserInfo userInfo = baseInfoService.queryUserInfoByUnionId(weixinUserInfo.getUnionid());
            if(null != userInfo){
                userLoginInfo.setUserInfoId(userInfo.getUserInfoId());//用户Id
//                session.setAttribute(SessionAttrs.USER_INFO, userInfo);
            }
        }
        userLoginInfo.setAppId(this.APPID);//appID
        userLoginInfo.setUnionId(weixinUserInfo.getUnionid());//unionId
        userLoginInfo.setWeixinOpenId(weixinUserInfo.getOpenid());//openId

        session.setAttribute(SessionAttrs.USER_LOGIN_INFO, userLoginInfo);
        session.setAttribute(SessionAttrs.USER_WX_INFO, weixinUserInfo);

        return userLoginInfo;
    }
}
