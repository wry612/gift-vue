package cn.datai.gift.web.controller;

import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.SmsSenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/13.
 */
@Controller
@RequestMapping("smsSender")
public class SmsSenderController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(SmsSenderController.class);

    @Autowired
    private SmsSenderService smsSenderService;


    /**绑定手机号
     *获取手机验证码
     * @param userInfoId
     * @param mobile 手机号
     * @return
     */
    @RequestMapping(value = "/getBindMobileCode",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true)
    public RespResult getBindMobileCode(@ModelAttribute("userInfoId") Long userInfoId,String mobile){
        try {
            return smsSenderService.getBindMobileCode(userInfoId,mobile);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取绑定手机验证码失败，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"获取验证码失败");
        }
    }

    /**忘记密码
     *获取手机验证码
     * @param userInfoId
     * @param mobile 手机号
     * @return
     */
    @RequestMapping(value = "/getResetPwdMobileCode",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true)
    public RespResult getResetPwdMobileCode(@ModelAttribute("userInfoId") Long userInfoId,String mobile){
        try {
            return smsSenderService.getResetPwdMobileCode(userInfoId,mobile);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("获取重置密码验证码失败，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"获取重置密码验证码失败");
        }
    }


}
