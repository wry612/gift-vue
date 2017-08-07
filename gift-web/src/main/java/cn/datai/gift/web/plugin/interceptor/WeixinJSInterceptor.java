package cn.datai.gift.web.plugin.interceptor;

import cn.datai.gift.utils.WebUtil;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.utils.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 微信js授权
 */
@Component
public class WeixinJSInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(WeixinJSInterceptor.class);

    @Value("${weixin.appID}")
    private String APPID;

//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (WebUtil.isAjaxRequest(request)) {
            super.postHandle(request, response, handler, modelAndView);
        }else{
            HandlerMethod handler2 = (HandlerMethod) handler;
            Auth auth = handler2.getMethodAnnotation(Auth.class);
            if (auth == null) {
                super.postHandle(request, response, handler, modelAndView);
            }else {
                String ua = request.getHeader("user-agent").toLowerCase();
                if (auth.weixinJsAuth() && ua.indexOf("micromessenger") > 0) {//判断微信浏览器
                    String jsapiTicket = (String)redisTemplate.opsForValue().get(RedisConstants.WEIXIN_JSAPI_TICKET + APPID);
                    modelAndView.addObject("weixinJsSign", this.getJsApiSign(getOriginalUrl(request), jsapiTicket, APPID));
                }
                super.postHandle(request, response, handler, modelAndView);
            }
        }
    }

    public static Map<String, String> getJsApiSign(String wholeUrl, String jsapiTicketVal, String APPID){
        HashMap<String, String> ret = new HashMap<>();
        String nonceStr = createNonceStr();
        String timestamp = createTimestamp();
        String string1;
        String signature = "";

        //注意这里参数名必须全部小写，且必须有序
        string1 = "jsapi_ticket=" + jsapiTicketVal +
                "&noncestr=" + nonceStr +
                "&timestamp=" + timestamp +
                "&url=" + wholeUrl;
        logger.debug("微信jssdk签名字符串：" + string1);

        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
            logger.debug("微信jssdk sign：{}", signature);
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException("系统无加密算法");
        }
        catch (UnsupportedEncodingException e)
        {
            throw new RuntimeException("服务端错误");
        }

        ret.put("appId", APPID);
        ret.put("url", wholeUrl);
        ret.put("jsapiTicket", jsapiTicketVal);
        ret.put("nonceStr", nonceStr);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        return ret;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }


    private static String createNonceStr() {
        return UUID.randomUUID().toString();
    }

    private static String createTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    private String getOriginalUrl(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer(request.getScheme());
        sb.append("://").append(request.getServerName());
        if (request.getServerPort() != 80 && request.getServerPort() != 443) {
            sb.append(":" + request.getServerPort());
        }
        sb.append(request.getRequestURI());
        if (StrUtil.isNotBlank(request.getQueryString())) {
            sb.append("?").append(request.getQueryString());
        }
        return sb.toString();
    }
}
