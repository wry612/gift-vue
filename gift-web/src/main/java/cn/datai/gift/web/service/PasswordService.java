package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.RespResult;

import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface PasswordService {
    /**
     * 查询用户信息
     * @param userInfoId
     * @return
     */
    UserInfo queryUserInfo(Long userInfoId);

    RespResult resetPassword(Long userInfoId,String pwd) throws NoSuchAlgorithmException;

    /**
     * 找回密码手机号校验
     * @param userInfoId
     * @param mobile
     * @param code
     * @return
     */
    RespResult checkMobile(Long userInfoId, String mobile, String code);
}
