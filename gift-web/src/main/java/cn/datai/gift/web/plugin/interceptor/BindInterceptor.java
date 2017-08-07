package cn.datai.gift.web.plugin.interceptor;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.SessionAttrs;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.utils.BaseUtil;
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
import java.util.Map;

/**
 * Created by Administrator on 2017/6/9.
 */
public class BindInterceptor extends HandlerInterceptorAdapter {

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

        //没有注解或者不需要用户绑定手机号
        if(null == auth || !auth.needBind()){
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
    private boolean bindHandler(Auth auth,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String needBind = redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get(StatusConstants.NEED_BIND).toString();
        if(needBind.equals("false")){
            return true;
        }
        UserLoginInfo userLoginInfo = (UserLoginInfo)(request.getSession().getAttribute(SessionAttrs.USER_LOGIN_INFO));
        UserInfo userInfo = baseInfoService.queryUserInfo(userLoginInfo.getUserInfoId());
        String redirecturl = "";
        if(StringUtils.isEmpty(userInfo.getMobilePhone())){
            if(BaseUtil.isAjaxRequest(request)){
                redirecturl = BaseUtil.getPath(request) + "gift/index";
            }else{
                redirecturl = this.getWholeURL(request);
            }
            String redirect = BaseUtil.getPath(request) + "gift/bindMobile";
            response.sendRedirect(redirect + "?redirecturl=" + URLEncoder.encode(redirecturl,"UTF-8"));
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
