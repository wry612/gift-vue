package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.HttpRequestUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.SmsSenderService;
import cn.datai.gift.web.utils.BaseUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.MobileCode;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by H.CAAHN on 2017/6/6.
 */
@Service
public class SmsSenderServiceImpl implements SmsSenderService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private BaseInfoService baseInfoService;

    @Value("${customer.service.cell.phone}")
    private String customerServiceCellphone;

    @Value("${api.sms.open}")
    private boolean open;

    @Value("${api.sms.url}")
    private String url;

    @Value("${api.sms.appcode}")
    private String appcode;

    //礼尚_绑定手机号
    @Value("${api.sms.signtip}")
    private String signtip;


    @Value("${api.sms.captcha.code.bind}")
    private String captchaCodeBind;

    @Value("${api.sms.captcha.code.resetPwd}")
    private String captchaCodeResetPwd;

    private static final Logger logger = LoggerFactory.getLogger(SmsSenderServiceImpl.class);

    public boolean sendCaptcha(String mobileno, String captcha,String jsonString,String templateCode) {
        if (!open) {
            logger.info("aliyun sms api closed, mobile: {}, captcha: {}", mobileno, captcha);
            return true;
        }

        String rsp = null;
        try {
            Map<String, String> header = new HashMap<String, String>();
            header.put("Authorization", "APPCODE " + appcode);
            Map<String, String> querys = new HashMap<String, String>();
            querys.put("ParamString", URLEncoder.encode(jsonString, "utf-8"));
            querys.put("RecNum", mobileno);
            querys.put("SignName", signtip);
            querys.put("TemplateCode", templateCode);

            rsp = HttpRequestUtil.get(url, header, querys, "utf-8");
            JSONObject jsonObject = JSONObject.parseObject(rsp);
            boolean result = jsonObject.getBoolean("success");
            if (result) {
                logger.debug("aliyun sms api send captcha success, mobile: {}, captcha: {}", mobileno, captcha);
            }
            else {
                logger.warn("aliyun sms api send captcha fail, mobile: {}, captcha: {}, reason: {}", mobileno, captcha, jsonObject.get("message"));
            }
            return result;
        }
        catch (JSONException ex) {
            logger.error("aliyun sms api send error, JSON format exception: {}", rsp);
        }
        catch (Exception ex) {
            logger.error("aliyun sms api send error", ex);
        }
        return false;
    }

    /**忘记密码
     * 获取手机验证码
     *
     * @param userInfoId
     * @param mobile
     * @return
     */
    @Override
    public RespResult getResetPwdMobileCode(Long userInfoId, String mobile) {
        if(!BaseUtil.isMobileNO(mobile)){
            return new RespResult(RespCode.FAIL,"请输入正确的手机号格式");
        }

        Boolean hasKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_CODE + userInfoId);
        if(hasKey){
            return new RespResult(RespCode.FAIL,"2分钟内不能连续发送");
        }

        UserInfo queryUserInfo = baseInfoService.queryUserInfo(userInfoId);
        if(MyStringUtil.isBlank(queryUserInfo.getMobilePhone()) || MyStringUtil.isBlank(queryUserInfo.getPassword())){
            return new RespResult(RespCode.FAIL,"该用户尚未绑定手机号");
        }
        if(!queryUserInfo.getMobilePhone().equals(mobile)){
            return new RespResult(RespCode.FAIL,"请输入绑定的手机号");
        }

      /*  Boolean hasCountKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_COUNT + userInfoId);
        boolean canSend = false;
        int count = 0;
        if(hasCountKey){
            count = Integer.valueOf(redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_COUNT + userInfoId).toString());
            if(count < 20){
                canSend = true;
            }else{
                return new RespResult(RespCode.FAIL,"24小时内上限20条短信");
            }
        }*/

        String code  = BaseUtil.getRandomCode();
        //发送短信
        Map<String,String> map = new HashMap();
        map.put("msgCode",code);
        boolean sendCaptcha = this.sendCaptcha(mobile, code,JSONObject.toJSONString(map),captchaCodeResetPwd);
        if(!sendCaptcha){
            return new RespResult(RespCode.FAIL,"短信发送失败,请联系客服");
        }

        redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_CODE + userInfoId,code, 120, TimeUnit.SECONDS);

        Long currentTimeMillis = System.currentTimeMillis();
        redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_TIME + userInfoId,currentTimeMillis.toString(), 120, TimeUnit.SECONDS);
       /* if(canSend){
            redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_COUNT + userInfoId,count + 1,24,TimeUnit.HOURS);
        }*/

        MobileCode mobileCode = new MobileCode(code, currentTimeMillis, 0L, 120);
        return new RespResult(RespCode.SUCCESS, mobileCode);
    }

    /**
     * 用户绑定手机号
     * <p>
     * 获取手机验证码
     *
     * @param userInfoId
     * @param mobile
     * @return
     */
    @Override
    public RespResult getBindMobileCode(Long userInfoId, String mobile) {
        if(!BaseUtil.isMobileNO(mobile)){
            return new RespResult(RespCode.FAIL,"请输入正确的手机号格式");
        }

        Boolean hasKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_CODE + userInfoId);
        if(hasKey){
            return new RespResult(RespCode.FAIL,"2分钟内不能连续发送");
        }

/*        Boolean hasCountKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_COUNT + userInfoId);
        boolean canSend = false;
        int count = 0;
        if(hasCountKey){
            count = Integer.valueOf(redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_COUNT + userInfoId).toString());
            if(count < 20){
                canSend = true;
            }else{
                return new RespResult(RespCode.FAIL,"24小时上限20条短信");
            }
        }*/

        UserInfo queryUserInfo = baseInfoService.queryUserInfo(userInfoId);
        if(MyStringUtil.isNotBlank(queryUserInfo.getMobilePhone()) || MyStringUtil.isNotBlank(queryUserInfo.getPassword())){
            return new RespResult(RespCode.FAIL,"该用户已绑定手机号");
        }

        int mobileCount = baseInfoService.queryMobileCount(mobile);
        if(mobileCount != 0) {
            return new RespResult(RespCode.FAIL,"该手机已被注册");
        }

        String code  = BaseUtil.getRandomCode();
        //发送短信
        Map<String,String> map = new HashMap();
        map.put("msgCode",code);
        map.put("customerServiceCellphone",customerServiceCellphone);
        boolean sendCaptcha = this.sendCaptcha(mobile, code, JSONObject.toJSONString(map),captchaCodeBind);
        if(!sendCaptcha){
            return new RespResult(RespCode.FAIL,"短信发送失败,请联系客服");
        }

        //将手机号和验证码一同放入redis，绑定提交的时候，不仅验证code，还要验证与code绑定的是不是同一个手机号
        redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_CODE + userInfoId, mobile + ":" + code, 120, TimeUnit.SECONDS);

        //记录将验证码放入redis的时间点
        Long currentTimeMillis = System.currentTimeMillis();
        redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_TIME + userInfoId,currentTimeMillis.toString(), 120, TimeUnit.SECONDS);

      /*  if(canSend){
            //目前设置为24小时内只能发送20次
            redisTemplate.opsForValue().set(RedisConstants.USER_MOBILE_COUNT + userInfoId,count + 1,24,TimeUnit.HOURS);
        }*/

        MobileCode mobileCode = new MobileCode(code,currentTimeMillis,0L,120);
        return new RespResult(RespCode.SUCCESS,mobileCode);
    }

//    public static void main(String[] args) {
//        try {

//            String [] mobileArray = new String[]{"15895999857","13770504450","11111111111","18951434066","13611569194"};
//            for(int i = 0 ;i<mobileArray.length;i++){
//
//                Map<String, String> header = new HashMap<String, String>();
//                header.put("Authorization", "APPCODE " + "69bedf87828c4de0a870166531988527");
//                Map<String, String> querys = new HashMap<String, String>();
//                querys.put("ParamString", URLEncoder.encode("{\"vcode\":\"" + "123456" + "\"}", "utf-8"));
//                querys.put("RecNum", mobileArray[i]);
//                querys.put("SignName", "礼尚");
//                querys.put("TemplateCode", "SMS_70010676");
//
//                String str = HttpRequestUtil.get("http://sms.market.alicloudapi.com/singleSendSms", header, querys, "utf-8");
//                System.out.println("============" + str);
//            }
//            boolean flag =true;
//            int count =0;
//            while (flag){
//                count++;
//                Map<String, String> header = new HashMap<String, String>();
//                header.put("Authorization", "APPCODE " + "69bedf87828c4de0a870166531988527");
//                Map<String, String> querys = new HashMap<String, String>();
//                querys.put("ParamString", URLEncoder.encode("{\"vcode\":\"" + "123456" + "\"}", "utf-8"));
//                querys.put("RecNum", "13770504450");
//                querys.put("SignName", "礼尚");
//                querys.put("TemplateCode", "SMS_70010676");
//
//                String str = HttpRequestUtil.get("http://sms.market.alicloudapi.com/singleSendSms", header, querys, "utf-8");
//                JSONObject jsonObject = JSONObject.parseObject(str);
//                Thread.sleep(1 * 1000);
//                boolean result = jsonObject.getBoolean("success");
//                System.out.println(count);
//                if(result){
//                    System.out.println(DateUtil.toString(new Date()));
//                }
//            }
//
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

}
