package cn.datai.gift.web.controller;

import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.PasswordService;
import cn.datai.gift.web.utils.BaseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

/**
 *密码相关
 * Created by Administrator on 2017/4/26.
 */
@Controller
@RequestMapping("password")
public class PasswordController extends BaseController{

    private final static Logger logger = LoggerFactory.getLogger(PasswordController.class);

    @Autowired
    private PasswordService passwordService;


    /**
     * 跳转设置密码
     * @return
     */
    @RequestMapping(value ="/setPassword",method = RequestMethod.GET)
    @Auth(needLogin = true,weixinJsAuth = true)
    public String setPassword(){
        return "gift/setPassword";
    }

    @RequestMapping(value ="/paymentPassword")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String paymentPassword(){
        return "gift/paymentPassword";
    }

    /**
     * 重置密码
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value="/resetPassword",method = RequestMethod.POST)
    @ResponseBody
    public RespResult resetPassword( @ModelAttribute("userInfoId") Long userInfoId,
                                    @RequestParam("pwd") String pwd){
        try {
            return passwordService.resetPassword(userInfoId,pwd);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            logger.error("重置密码失败：{}",e);
            return new RespResult(RespCode.FAIL,"重置密码失败");
        }
    }

    /**
     * 通过验证手机号重新设置密码
     * @param userInfoId
     * @param mobile
     * @param code
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value = "/checkMobile",method = RequestMethod.POST)
    @ResponseBody
    public RespResult checkMobile(
            @ModelAttribute("userInfoId") long userInfoId,
            @RequestParam("mobile") String mobile,
            @RequestParam("code") String code){
        try {
            return passwordService.checkMobile(userInfoId,mobile,code);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("手机号验证失败：{}",e);
            return new RespResult(RespCode.FAIL,"手机号验证失败");
        }
    }

}
