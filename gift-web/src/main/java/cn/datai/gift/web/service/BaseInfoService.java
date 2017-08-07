package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.persist.po.UserWxRelt;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/10.
 */
public interface BaseInfoService {

    /**
     * 插入 用户微信信息
     * @param userWxInfo
     */
    void insertUserWxInfo(UserWxInfo userWxInfo);

    /**
     * 插入 微信用户与基本用户关联信息
     * @param userWxRelt
     */
    void insertUserWxRelt(UserWxRelt userWxRelt);

    /**
     * 插入 用户（包含特别用户）基本信息
     * @param userInfo
     */
    void insertUserInfo(UserInfo userInfo);

    /**
     *通过openId查询 用户微信信息
     * @param openId
     * @param unionId
     * @return
     */
    UserWxInfo queryUserWxInfo(String openId,String unionId);

    /**
     *通过联合主键查询 微信用户与基本用户关联信息
     * @param unionid
     * @param userInfoId
     * @return
     */
    UserWxRelt queryUserWxRelt(String unionid,Long userInfoId);

    /**
     * 通过用户Id查询   用户（包含特别用户）基本信息
     * @param userInfoId
     * @return
     */
    UserInfo queryUserInfo(Long userInfoId);

    /**
     * 更新 用户微信信息
     * @param userWxInfo
     */
    void updateUserWxInfo(UserWxInfo userWxInfo);

    /**
     * 更新  用户（包含特别用户）基本信息
     * @param userInfo
     */
    void updateUserInfo(UserInfo userInfo);

    /**
     * 通过unionId查询 微信用户与基本用户关联关系
     * @param unionId
     * @return
     */
    UserWxRelt queryUserWxReltByUnionId(String unionId);

    /**
     * 通过用户unionId查询 用户（包含特别用户）基本信息
     * @param unionId
     * @return
     */
    UserInfo queryUserInfoByUnionId(String unionId);

    /**
     * 数据库插入（或更新）用户微信信息,插入微信用户与基本用户关联信息，插入用户（包含特别用户）基本信息
     * @param userWxInfo
     */
    void insertOrUpDate(UserWxInfo userWxInfo,String userInfoId,HttpServletResponse response) throws Exception;

    /**
     * 通过交易账户id查询用户基本信息
     * @param tradeAccountId
     * @return
     */
    UserInfo queryUserInfoByTradeAccount(Long tradeAccountId);

    /**
     * 通过用户id获取
     * @param userInfoId
     * @return
     */
    String getUserHeadImgUrl(Long userInfoId);


    /**
     * 通过手机号码满足手机号的记录数
     * @param mobile
     * @return
     */
    int queryMobileCount(String mobile);

    /**
     * 获取参数
     * @param key
     * @return
     */
    String getSystemParamsValue(String key);

}
