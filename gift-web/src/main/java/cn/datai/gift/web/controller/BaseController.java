package cn.datai.gift.web.controller;


import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.web.contants.SessionAttrs;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/3/3.
 */
public class BaseController {

    @Autowired
    private BaseInfoService baseInfoService;

    @ModelAttribute("userLoginInfo")
    public static UserLoginInfo getUserLoginInfo(HttpSession httpSession) {
        UserLoginInfo userLoginInfo = (UserLoginInfo) httpSession.getAttribute(SessionAttrs.USER_LOGIN_INFO);
        return userLoginInfo;
    }

    public static void setUserLoginInfo(HttpSession httpSession, UserLoginInfo userLoginInfo) {
        httpSession.setAttribute(SessionAttrs.USER_LOGIN_INFO, userLoginInfo);
    }

    public static UserWxInfo getUserWxInfo(HttpSession httpSession) {
        UserWxInfo userWxInfo = (UserWxInfo) httpSession.getAttribute(SessionAttrs.USER_WX_INFO);
        return userWxInfo;
    }

    public void setUserWxInfo(HttpSession httpSession, UserWxInfo userWxInfo) {
        httpSession.setAttribute(SessionAttrs.USER_WX_INFO, userWxInfo);
    }

    @ModelAttribute("userInfoId")
    public long getUserInfoId(HttpSession httpSession) {
        UserLoginInfo userLoginInfo = (UserLoginInfo) httpSession.getAttribute(SessionAttrs.USER_LOGIN_INFO);
        if (userLoginInfo == null) {
            return 0L;
        }
        return userLoginInfo.getUserInfoId();
    }

    @ModelAttribute("userInfo")
    public UserInfo getUserInfo(HttpSession httpSession) {
        UserLoginInfo userLoginInfo = (UserLoginInfo) httpSession.getAttribute(SessionAttrs.USER_LOGIN_INFO);
        if (userLoginInfo == null) {
            return null;
        }
        return baseInfoService.queryUserInfo(userLoginInfo.getUserInfoId());
    }
}
