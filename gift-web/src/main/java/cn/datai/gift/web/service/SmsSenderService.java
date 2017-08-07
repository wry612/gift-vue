package cn.datai.gift.web.service;

import cn.datai.gift.utils.RespResult;

/**
 * Created by H.CAAHN on 2017/6/6.
 */
public interface SmsSenderService {
    /**
     * 发送短信验证码
     * @param mobileno 手机号
     * @param captcha 验证码
     * @param jsonString 参数
     * @param templateCode 模板code
     * @return
     */
    boolean sendCaptcha(String mobileno, String captcha,String jsonString,String templateCode);

    /**忘记密码
     *
     * 获取手机验证码
     * @param userInfoId
     * @param mobile
     * @return
     */
    RespResult getResetPwdMobileCode(Long userInfoId,String mobile);

    /**用户绑定手机号
     *
     * 获取手机验证码
     * @param userInfoId
     * @param mobile
     * @return
     */
    RespResult getBindMobileCode(Long userInfoId,String mobile);
}
