package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.UserInfoMapperExt;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.PasswordService;
import cn.datai.gift.web.utils.BaseUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private UserInfoMapperExt userInfoMapperExt;

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 查询用户信息
     * @param userInfoId
     * @return
     */
    @Override
    public UserInfo queryUserInfo(Long userInfoId) {
        return this.userInfoMapperExt.selectByPrimaryKey(userInfoId);
    }

    /**
     * 重置密码
     * @param userInfoId
     * @param pwd
     */
    @Transactional
    @Override
    public RespResult resetPassword(Long userInfoId, String pwd) throws NoSuchAlgorithmException {
        if(!BaseUtil.isNumeric(pwd)){
            return new RespResult(RespCode.FAIL,"密码不符合规范");
        }
        UserInfo queryUserInfo = baseInfoService.queryUserInfo(userInfoId);
        if(MyStringUtil.isBlank(queryUserInfo.getMobilePhone()) || MyStringUtil.isBlank(queryUserInfo.getPassword())){
            return new RespResult(RespCode.FAIL,"该用户尚未绑定手机号");
        }
        UserInfo userInfo = this.queryUserInfo(userInfoId);
        userInfo.setPassword(BaseUtil.encodePwd(pwd));
        this.userInfoMapperExt.updateByPrimaryKeySelective(userInfo);
        return new RespResult(RespCode.SUCCESS,"重置密码成功");
    }

    /**
     * 找回密码手机号校验
     *
     * @param userInfoId
     * @param mobile
     * @param code
     * @return
     */
    @Override
    public RespResult checkMobile(Long userInfoId, String mobile, String code) {

        UserInfo queryUserInfo = baseInfoService.queryUserInfo(userInfoId);
        if(MyStringUtil.isBlank(queryUserInfo.getMobilePhone()) || MyStringUtil.isBlank(queryUserInfo.getPassword())){
            return new RespResult(RespCode.FAIL,"该用户尚未绑定手机号");
        }

        if(!BaseUtil.isMobileNO(mobile)){
            return new RespResult(RespCode.FAIL,"请输入正确的手机号格式");
        }
        if(!BaseUtil.isNumeric(code)){
            return new RespResult(RespCode.FAIL,"请输入正确的手机验证码");
        }
        if(!mobile.equals(queryUserInfo.getMobilePhone())){
            return new RespResult(RespCode.FAIL,"请输入绑定的手机号");
        }

        Boolean hasKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_CODE + userInfoId);
        if(!hasKey){
            return new RespResult(RespCode.FAIL,"手机验证码超时");
        }
        String redisCode = redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_CODE + userInfoId).toString();
        if(!redisCode.equals(code)){
            return new RespResult(RespCode.FAIL,"请输入正确的手机号或验证码");
        }

        return new RespResult(RespCode.SUCCESS,"手机号验证成功");
    }


}
