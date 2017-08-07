package cn.datai.gift.web.plugin.interceptor;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.crypto.bcrypt.BCryptPasswordEncoder;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.SessionAttrs;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.utils.BaseUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/9.
 */
public class PwdInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private RedisTemplate redisTemplate;


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

        //没有注解或者不需要用户输入密码
        if(null == auth || !auth.needPassword()){
            return true;
        }

        //绑定手机号
        return bindHandler(auth,request,response);
    }

    /**
     *根据不同的注解方式分别校验
     * @param auth
     * @param request
     * @param response
     * @return
     */
    private boolean bindHandler(Auth auth,HttpServletRequest request,HttpServletResponse response) throws IOException, NoSuchAlgorithmException {

        String needPwd = redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get(StatusConstants.NEED_PWD).toString();
        if(needPwd.equals("false")){
            return true;
        }
        String pwd = request.getParameter("pwd");

        String totalMoneyFlag = request.getParameter("totalMoneyFlag");

        if(!StringUtils.isEmpty(totalMoneyFlag)){
            //金额大于0，则不需要弹出交易密码输入框，直接会唤醒微信支付窗口（收货）
            if(totalMoneyFlag.equals("true")){
                return true;
            }
        }

        //没有携带密码参数
        if(StringUtils.isEmpty(pwd)){
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSONObject.toJSONString(new RespResult(RespCode.PWD_EMPTY)));
            return false;
        }

        UserLoginInfo userLoginInfo = (UserLoginInfo)(request.getSession().getAttribute(SessionAttrs.USER_LOGIN_INFO));
        UserInfo userInfo = baseInfoService.queryUserInfo(userLoginInfo.getUserInfoId());

        //验证密码是否正确
        boolean matchPwd = BaseUtil.matchPwd(pwd, userInfo.getPassword());
        if(!matchPwd){
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSONObject.toJSONString(new RespResult(RespCode.PWD_ERROR)));
            return false;
        }
        return true;
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

}
