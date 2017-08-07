package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.datai.gift.web.plugin.annotation.Auth;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
@Controller
@RequestMapping("/")
public class LoginController extends BaseController{

    @Autowired
    private GiftService giftService;

    @RequestMapping(value ="/homepage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String toHomePage(Model model, HttpSession httpSession, HttpServletResponse response){

        UserWxInfo userWxInfo = getUserWxInfo(httpSession);
        UserLoginInfo userLoginInfo = getUserLoginInfo(httpSession);

        model.addAttribute("userWxInfo",userWxInfo);

        //获取所有用户持有的礼包账户信息
        List<GiftAccount> giftList =  giftService.queryGiftAccountByUserInfoId(userLoginInfo.getUserInfoId());

        model.addAttribute("giftList",giftList);



    return "homepage/index";
    }

}
