package cn.datai.gift.web.task;

import cn.datai.gift.web.call.weixin.auth.WeixinAuthCaller;
import cn.datai.gift.web.contants.LockPrefixConstants;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.plugin.vo.JsapiTicket;
import cn.datai.gift.web.plugin.vo.WeixinErrorResp;
import cn.datai.gift.web.plugin.vo.WeixinResult;
import cn.datai.gift.web.plugin.vo.WeixinToken;
import cn.datai.gift.web.utils.RedisLock;
import cn.datai.gift.web.utils.StrUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 微信刷新基础token
 * Created by Administrator on 2017/3/7.
 */
@Component
public class WeixinTask {

    private static Logger logger = LoggerFactory.getLogger(WeixinTask.class);

    @Value("${weixin.appID}")
    private String appid;

    @Value("${weixin.appsecret}")
    private String secret;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeixinAuthCaller weixinAuthCaller;

    @PostConstruct
    public void init(){
        try {
            //系统启动时加redis锁检查redis中是否拥有微信token和jsapiTicket
            logger.info("系统启动微信公众号授权");
            RedisLock weixinLock = new RedisLock(redisTemplate, LockPrefixConstants.WEIXIN_APP + appid, 60000, 60000);
            boolean acquire = weixinLock.acquire();
            String appidKey = RedisConstants.WEIXIN_ACCESS_TOKEN + appid;
            String jsapiTicketKey = RedisConstants.WEIXIN_JSAPI_TICKET + appid;
            if (acquire) {
                //检查是否拥有微信token和jsapiTicket
                String accessToken = (String)redisTemplate.opsForValue().get(appidKey);
                String jsapiTicket = (String)redisTemplate.opsForValue().get(jsapiTicketKey);
                if (StrUtil.isBlank(accessToken) || StrUtil.isBlank(jsapiTicket)) {
                    logger.info("检查系统不存在授权信息，获取授权信息中......");
                    //如果系统中没有两个值，系统启动时就需要执行一次获取动作
                    this.refreshToken();
                    logger.info("微信授权信息获取结束。");
                }else {
                    //检查过期时间是否小于一个小时，小于的话需要主动刷新一次
                    logger.info("检查微信accessToken过期时间");
                    Long appidExpireMinutes = redisTemplate.getExpire(appidKey, TimeUnit.MINUTES);
                    if (appidExpireMinutes < 58) {
                        logger.info("微信accessToken即将过期，尝试重新获取");
                        accessToken = this.refreshToken().getAccessToken();
                        logger.info("微信授权信息获取结束。");
                    }
                    Long jsapiExpireMinutes = redisTemplate.getExpire(jsapiTicketKey, TimeUnit.MINUTES);
                    if (jsapiExpireMinutes < 58) {
                        logger.info("微信jsapi ticket 即将过期，尝试重新获取");
                        this.refreshJsapiTicket(accessToken);
                    }
                    if (appidExpireMinutes >= 58 && jsapiExpireMinutes >= 58) {
                        logger.info("检查系统中已存在微信授权信息，不需要重复获取。");
                    }
                }
                weixinLock.release();
            } else {
                logger.warn("系统启动，获取微信信息任务忙");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 定时刷微信Token
     *
     * @return
     */
    public WeixinToken refreshToken() throws InterruptedException, IOException {
        try {
            StringBuffer apiURL = new StringBuffer("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&&appid=");
            apiURL.append(this.appid)
                    .append("&secret=")
                    .append(this.secret);
            String tokenJson = restTemplate.getForObject(apiURL.toString(), String.class);
            logger.info("获取微信服务器令牌：{}", tokenJson);
            ObjectMapper jsonMapper = new ObjectMapper();
            WeixinToken weixinToken = null;
            try {
                weixinToken = jsonMapper.readValue(tokenJson, WeixinToken.class);
            } catch (IOException e) {
                WeixinErrorResp weixinErrorResp = jsonMapper.readValue(tokenJson, WeixinErrorResp.class);
                if (weixinErrorResp.getErrcode() == WeixinResult.SYS_BUSY) {
                    //微信服务器忙，稍后重试，抛出异常，让elastic job重试
                    logger.warn("获取微信accessToken异常：系统忙，稍后再试, {}", weixinErrorResp);
                    throw new RuntimeException("获取微信accessToken异常：系统忙，稍后再试");
                }else {
                    //其他错误，重试也不可能成功
                    logger.error("获取微信access token 失败,{}", weixinErrorResp);
                    return null;
                }
            }
            //获取到微信accessToken之后的动作
            redisTemplate.opsForValue().set(RedisConstants.WEIXIN_ACCESS_TOKEN + appid, weixinToken.getAccessToken(), weixinToken.getExpiresIn() - 120, TimeUnit.SECONDS);
            logger.info("存储微信accessToken成功");
            JsapiTicket jsapiTicket = this.refreshJsapiTicket(weixinToken.getAccessToken());//尝试获取jsapiTicket
            return weixinToken;
        } catch (IOException e) {
            logger.error(e.toString());
            throw e;
        }
    }

    /**
     * 刷微信jsapiTicket
     *
     * @param weixinAccessToken @see {@link WeixinToken#accessToken}
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public JsapiTicket refreshJsapiTicket(String weixinAccessToken) throws IOException, InterruptedException {
        JsapiTicket jsapiTicket = new JsapiTicket();
        jsapiTicket = weixinAuthCaller.getTicket(weixinAccessToken, "jsapi").execute().body();
        long errcode = jsapiTicket.getErrcode();
        if (errcode == WeixinResult.REQUEST_SUCCESS) {

            redisTemplate.opsForValue().set(RedisConstants.WEIXIN_JSAPI_TICKET + appid, jsapiTicket.getTicket(), jsapiTicket.getExpires_in() - 120, TimeUnit.SECONDS);
            logger.info("获取jsapi_ticket成功, {}", jsapiTicket);
            return jsapiTicket;
        } else if (errcode == WeixinResult.SYS_BUSY) {
            //系统忙才可以重试，其他状态重试也不可能成功
            logger.warn("获取微信jsapi_ticket失败，稍后重试，{}", jsapiTicket);
            throw new RuntimeException("获取微信jsapi_ticket失败");//抛异常，让elastic job 重新执行
        }
        logger.error("获取微信jsapi_ticket失败， 原因：{}", jsapiTicket);
        return null;
    }


}
