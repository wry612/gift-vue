package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.UserInfoMapperExt;
import cn.datai.gift.persist.mapper.UserWxInfoMapperExt;
import cn.datai.gift.persist.mapper.UserWxReltMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.HeadImgUrlContants;
import cn.datai.gift.web.contants.PhotoContants;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.utils.CookieUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.utils.PhotoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/10.
 */
@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseInfoServiceImpl.class);

    @Autowired
    private UserWxReltMapperExt userWxReltMapperExt;

    @Autowired
    private UserInfoMapperExt userInfoMapperExt;

    @Autowired
    private UserWxInfoMapperExt userWxInfoMapperExt;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 插入 用户微信信息
     *
     * @param userWxInfo
     */
    @Override
    public void insertUserWxInfo(UserWxInfo userWxInfo) {
        this.userWxInfoMapperExt.insertSelective(userWxInfo);
    }

    /**
     * 插入 微信用户与基本用户关联信息
     *
     * @param userWxRelt
     */
    @Override
    public void insertUserWxRelt(UserWxRelt userWxRelt) {
        this.userWxReltMapperExt.insertSelective(userWxRelt);
    }

    /**
     * 插入 用户（包含特别用户）基本信息
     *
     * @param userInfo
     */
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        this.userInfoMapperExt.insertSelective(userInfo);
    }

    /**
     * 通过openId查询 用户微信信息
     * @param openId
     * @param unionId
     * @return
     */
    @Override
    public UserWxInfo queryUserWxInfo(String openId,String unionId) {
        return this.userWxInfoMapperExt.selectByPrimaryKey(openId,unionId);
    }

    /**
     * 通过联合主键查询 微信用户与基本用户关联信息
     *
     * @param unionid
     * @param userInfoId
     * @return
     */
    @Override
    public UserWxRelt queryUserWxRelt(String unionid, Long userInfoId) {
        return this.userWxReltMapperExt.selectByPrimaryKey(userInfoId,unionid);
    }

    /**
     * 通过用户Id查询   用户（包含特别用户）基本信息
     *
     * @param userInfoId
     * @return
     */
    @Override
    public UserInfo queryUserInfo(Long userInfoId) {
        return this.userInfoMapperExt.selectByPrimaryKey(userInfoId);
    }

    /**
     * 更新 用户微信信息
     *
     * @param userWxInfo
     */
    @Override
    public void updateUserWxInfo(UserWxInfo userWxInfo) {
        this.userWxInfoMapperExt.updateByPrimaryKeySelective(userWxInfo);
    }

    /**
     * 更新  用户（包含特别用户）基本信息
     *
     * @param userInfo
     */
    @Override
    public void updateUserInfo(UserInfo userInfo) {
        this.userInfoMapperExt.updateByPrimaryKeySelective(userInfo);
    }

    /**
     * 通过unionId查询 微信用户与基本用户关联关系
     *
     * @param unionId
     * @return
     */
    @Override
    public UserWxRelt queryUserWxReltByUnionId(String unionId) {
        UserWxReltExample userWxReltExample = new UserWxReltExample();
        userWxReltExample.createCriteria().andUnionidEqualTo(unionId);
        List<UserWxRelt> list = userWxReltMapperExt.selectByExample(userWxReltExample);

        if(null != list && !list.isEmpty()){
            return list.get(0);
        }

        return null;

    }

    /**
     * 通过用户unionId查询 用户（包含特别用户）基本信息
     *
     * @param unionId
     * @return
     */
    @Override
    public UserInfo queryUserInfoByUnionId(String unionId) {
       UserWxRelt userWxRelt = this.queryUserWxReltByUnionId(unionId);
        if(null != userWxRelt){
            return this.queryUserInfo(userWxRelt.getUserInfoId());
        }
        return null;
    }

    /**
     * 数据库插入（或更新）用户微信信息,插入微信用户与基本用户关联信息，插入用户（包含特别用户）基本信息
     *
     * @param userWxInfo
     */
    @Transactional
    @Override
    public void insertOrUpDate(UserWxInfo userWxInfo, String userInfoId, HttpServletResponse response) throws Exception {

        UserWxInfo queryUserWxInfo = this.queryUserWxInfo(userWxInfo.getOpenid(),userWxInfo.getUnionid());
        if(null != queryUserWxInfo){
            userWxInfo.setNickname(URLEncoder.encode(userWxInfo.getNickname(),"utf-8"));
            this.updateUserWxInfo(userWxInfo);
            UserWxRelt userWxRelt = queryUserWxReltByUnionId(userWxInfo.getUnionid());
            //推荐人功能
            if(MyStringUtil.isNotBlank(userInfoId)){
                //将用户Id和推荐人Id放入cookie中
                CookieUtil.addCookie(StatusConstants.RECOMMENDER_MAX_AGE+ "_" + userWxRelt.getUserInfoId(),userInfoId,Integer.valueOf(this.getSystemParamsValue(StatusConstants.RECOMMENDER_MAX_AGE)),response);
            }
        }else{
            userWxInfo.setNickname(URLEncoder.encode(userWxInfo.getNickname(),"utf-8"));

            this.insertUserWxInfo(userWxInfo);//插入用户微信信息

            UserWxRelt userWxRelt = queryUserWxReltByUnionId(userWxInfo.getUnionid());

            if(userWxRelt == null){
                if(!StringUtils.isEmpty(userWxInfo.getHeadimgurl())){
                    //用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效
                    String headImgUrl = userWxInfo.getHeadimgurl().substring(0,userWxInfo.getHeadimgurl().length()-1) + HeadImgUrlContants.HEAD_IMG_URL_96;
                    userWxInfo.setHeadimgurl(headImgUrl);
                }
                this.uploadPhoto(userWxInfo.getUnionid(),userWxInfo.getHeadimgurl());//以用户的unionId为头像名称，格式为jpg

                UserInfo userInfo = userWxInfo2UserInfo(userWxInfo);

                this.insertUserInfo(userInfo);//插入用户信息

                //微信用户信与基本用户信息关联信息
                this.insertUserWxRelt(this.assemblyUserWxRelt(userWxInfo.getUnionid(),userInfo.getUserInfoId()));

                //推荐人功能
                if(MyStringUtil.isNotBlank(userInfoId)){
                    //将用户Id和推荐人Id放入cookie中
                    CookieUtil.addCookie(StatusConstants.RECOMMENDER_MAX_AGE + "_" + userInfo.getUserInfoId(),userInfoId,Integer.valueOf(this.getSystemParamsValue(StatusConstants.RECOMMENDER_MAX_AGE)),response);
                }
            }

        }

    }

    /**
     * 通过交易账户id查询用户基本信息
     * @param tradeAccountId
     * @return
     */
    @Override
    public UserInfo queryUserInfoByTradeAccount(Long tradeAccountId) {
        UserInfo userInfo = userInfoMapperExt.selectByTradeAccountId(tradeAccountId);
        return userInfo;
    }

    @Override
    public String getUserHeadImgUrl(Long userInfoId) {
        UserInfo userInfo = userInfoMapperExt.selectByPrimaryKey(userInfoId);
        return userInfo.getHeadImgPath();
    }

    /**
     * 通过手机号码满足手机号的记录数
     *
     * @param mobile
     * @return
     */
    @Override
    public int queryMobileCount(String mobile) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andMobilePhoneEqualTo(mobile);
        return userInfoMapperExt.countByExample(userInfoExample);
    }

    @Override
    public String getSystemParamsValue(String key){
        try {
            return redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get(key).toString();
        } catch (Exception e) {
            throw new BizException(RespCode.REDIS_NOT_FUND);
        }
    }

    /**
     * 用户信息的基本信息目前我们只获取用户第一次微信进入时的基本信息，
     * 在此之后用户再更新用户头像昵称等信息时，用户微信信息表和session中的用户微信信息会更新，但是用户基本信息表不会再更新
     * @param userWxInfo
     * @return
     */
    private static UserInfo userWxInfo2UserInfo(UserWxInfo userWxInfo){
        UserInfo userInfo = new UserInfo();
        userInfo.setCountry(userWxInfo.getCountry());
        userInfo.setProvince(userWxInfo.getProvince());
        userInfo.setCity(userWxInfo.getCity());
        userInfo.setNickname(userWxInfo.getNickname());
        userInfo.setSex(userWxInfo.getSex());
        userInfo.setHeadImgPath(userWxInfo.getUnionid()+ PhotoContants.FILENAME_SUFFIX);//只保存用户头像名称（unionId.jpg）
        userInfo.setIsBroker(Boolean.FALSE.toString().toUpperCase());
        userInfo.setRegisterTime(new Date());
        //...
        return userInfo;
    }

    /**
     * 上传图片
     * @param fileName
     * @param url
     */
    private static void uploadPhoto(String fileName,String url) throws Exception {
        PhotoUtil.uploadFile(fileName + PhotoContants.FILENAME_SUFFIX,url);
    }

    private static UserWxRelt assemblyUserWxRelt(String unionId,Long userInfoId){
        UserWxRelt userWxRelt = new UserWxRelt();
        userWxRelt.setUnionid(unionId);
        userWxRelt.setUserInfoId(userInfoId);
        userWxRelt.setCreateTime(new Date());
        return userWxRelt;
    }
}
