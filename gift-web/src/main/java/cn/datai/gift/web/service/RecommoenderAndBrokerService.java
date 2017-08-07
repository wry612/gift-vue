package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.ActivityPresent;
import cn.datai.gift.persist.po.BrokerInfo;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.Conversion.DonateType;
import cn.datai.gift.web.vo.Conversion.RecommenderRules;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/24.
 */
public interface RecommoenderAndBrokerService {

    /**
     * 检查推荐人和经纪人
     * @param queryUserInfo
     * @param request
     */
    List<ActivityPresent> checkRecommoenderAndBroker(UserInfo queryUserInfo, HttpServletRequest request) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

    /**
     * 从redis获取
     * @return
     */
    RecommenderRules getRecommenderRulesByRedis();

    /**
     * 通过Id查询经纪人信息
     * @param userInfoId
     * @return
     */
    BrokerInfo queryBrokerInfoById(Long userInfoId);

    /**
     * 通过经纪人对象查询出参数值
     * @param brokerInfo
     * @return
     */
    Map<String,String> getBrokerParamsRulesMap(BrokerInfo brokerInfo);

    /**
     * 查询活动赠礼
     * @param activityPresent
     */
    void insertActivityPresent(ActivityPresent activityPresent);

    /**
     * 获取赠礼类型
     * @param donateTypeString
     * @return
     */
    List<DonateType> getDonateType(String donateTypeString);

    /**
     * 处理推荐人和经纪人
     * @param activityPresent
     */
    boolean operateRegister(Long activityPresent);

    /**
     * 通过主键查询赠礼记录
     * @param activityPresentId
     * @return
     */
    ActivityPresent queryActivityPresentById(Long activityPresentId);
}
