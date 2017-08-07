package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.ActivityPresentMapperExt;
import cn.datai.gift.persist.mapper.BrokerInfoMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.contants.enums.TradeOrderStatus;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.CookieUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.Conversion.BrokerRules;
import cn.datai.gift.web.vo.Conversion.DonateType;
import cn.datai.gift.web.vo.Conversion.DonateTypeVo;
import cn.datai.gift.web.vo.Conversion.RecommenderRules;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 推荐人和经纪人
 * Created by Administrator on 2017/7/24.
 */
@Service
public class RecommoenderAndBrokerServiceImpl implements RecommoenderAndBrokerService {

    private static final Logger logger  = LoggerFactory.getLogger(RecommoenderAndBrokerServiceImpl.class);

    @Autowired
    private BrokerInfoMapperExt brokerInfoMapperExt;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private ActivityPresentMapperExt activityPresentMapperExt;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private TradeDetailService tradeDetailService;

    private static final String NOT_PRESENT = "NOT_PRESENT";

    private static final String PRESENTED = "PRESENTED";

    private static final String NEW_BIND_DONATE_GIFT = "NEW_BIND_DONATE_GIFT";

    private static final String OLD_RECOMMENDER_DONATE_GIFT = "OLD_RECOMMENDER_DONATE_GIFT";

    private static final String NEW_BROKER_DONATE_GIFT = "NEW_BROKER_DONATE_GIFT";

    private static final String OLD_BROKER_DONATE_GIFT = "OLD_BROKER_DONATE_GIFT";

    /**
     * 检查推荐人和经纪人
     * @param queryUserInfo
     * @param request
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public List<ActivityPresent> checkRecommoenderAndBroker(UserInfo queryUserInfo, HttpServletRequest request) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        List<ActivityPresent> activityPresentArrayList = new ArrayList<>();//返回结果

        RecommenderRules rulesByRedis = this.getRecommenderRulesByRedis();//获取所有推荐相关的参数

        Long centerUserId = Long.valueOf(baseInfoService.getSystemParamsValue(StatusConstants.CERTER_USER_ID));//平台赠送推荐礼品的账号Id

        String recommenderId = CookieUtil.findCookie(StatusConstants.RECOMMENDER_MAX_AGE + "_" + queryUserInfo.getUserInfoId(), request);//cookie中获取推荐Id
        UserInfo recommenderUserInfo = null;//推荐人

        //判断是否有推荐
        if(MyStringUtil.isNotBlank(recommenderId)){
            recommenderUserInfo = baseInfoService.queryUserInfo(Long.valueOf(recommenderId));//推荐人信息
        }

        //推荐人总开关
        if(Boolean.valueOf(rulesByRedis.getBrokerParamValid())){
            //新用户绑定是否能有绑定礼品
            if(Boolean.valueOf(rulesByRedis.getBrokerParamNewGift())){
                //新用户绑定成功，获取新人绑定奖励
                List<ActivityPresent> list = this.parseParamsToActivityPresentList(rulesByRedis.getBrokerParamNewGift(), rulesByRedis.getBrokerParamNewId(), queryUserInfo.getUserInfoId(), centerUserId,NEW_BIND_DONATE_GIFT,"新用户绑定获得赠礼");
                activityPresentArrayList.addAll(list);
            }

            //推荐人不是经纪人并且老用户推荐活动开启
            if(null != recommenderUserInfo){
                queryUserInfo.setRecommendId(recommenderId);//推荐人Id
                if(Boolean.valueOf(rulesByRedis.getBrokerParamOldGift()) && !"TRUE".equals(recommenderUserInfo.getIsBroker()) && MyStringUtil.isNotBlank(recommenderUserInfo.getMobilePhone())){
                    //老用户推荐是否开启 //老用户推荐成功,老用户获取老用户推荐奖励
                    List<ActivityPresent> oldList = this.parseParamsToActivityPresentList(rulesByRedis.getBrokerParamOldGift(), rulesByRedis.getBrokerParamOldId(), Long.valueOf(recommenderId), centerUserId,OLD_RECOMMENDER_DONATE_GIFT,"老用户推荐获得赠礼");
                    activityPresentArrayList.addAll(oldList);
                }
            }
        }

        //推荐人是不经纪人，但是推荐人有经纪人
        if(null != recommenderUserInfo && !"TRUE".equals(recommenderUserInfo.getIsBroker()) && MyStringUtil.isNotBlank(recommenderUserInfo.getMobilePhone()) && null != recommenderUserInfo.getBrokerUserId()){
            BrokerInfo brokerInfo = this.queryBrokerInfoById(recommenderUserInfo.getBrokerUserId());//经纪人
            if(null == brokerInfo){
                logger.error("没有查到对应ID：{}的经纪人",recommenderUserInfo.getBrokerUserId());
                throw new BizException(RespCode.BROKER_NOT_FIND);
            }
            Map<String, String> paramsMap = this.getBrokerParamsRulesMap(brokerInfo);//经纪人规则参数
            String brokerValid = paramsMap.get(StatusConstants.BROKER_PARAM_VALID);

            //经纪人开启了
            if(Boolean.valueOf(brokerValid)){
                if(Boolean.valueOf(paramsMap.get(StatusConstants.BROKER_PARAM_NEW_GIFT))){
                    queryUserInfo.setBrokerUserId(recommenderUserInfo.getBrokerUserId());//经纪人Id
                    //新用户获取经纪人奖励是否开启 //老用户不是经纪人,新用户获取经纪人奖励
                    List<ActivityPresent> newBrokerList = this.parseParamsToActivityPresentList(paramsMap.get(StatusConstants.BROKER_PARAM_NEW_GIFT), paramsMap.get(StatusConstants.BROKER_PARAM_NEW_ID), queryUserInfo.getUserInfoId(), recommenderUserInfo.getBrokerUserId(),NEW_BROKER_DONATE_GIFT,"新用户获得经纪人赠礼");
                    activityPresentArrayList.addAll(newBrokerList);
                }

                if(Boolean.valueOf(paramsMap.get(StatusConstants.BROKER_PARAM_OLD_GIFT))){
                    //老用户获取经纪人奖励是否开启 //老用户不是经纪人,老用户获取经纪人奖励
                    List<ActivityPresent> oldBrokerList = this.parseParamsToActivityPresentList(paramsMap.get(StatusConstants.BROKER_PARAM_OLD_GIFT), paramsMap.get(StatusConstants.BROKER_PARAM_OLD_ID), Long.valueOf(recommenderId), recommenderUserInfo.getBrokerUserId(),OLD_BROKER_DONATE_GIFT,"老用户获得经纪人赠礼");
                    activityPresentArrayList.addAll(oldBrokerList);
                }
            }
        }

        //推荐人是经纪人
        if(null != recommenderUserInfo && "TRUE".equals(recommenderUserInfo.getIsBroker()) && MyStringUtil.isNotBlank(recommenderUserInfo.getMobilePhone())){
            BrokerInfo brokerInfo = this.queryBrokerInfoById(recommenderUserInfo.getUserInfoId());//经纪人
            if(null == brokerInfo){
                logger.error("没有查到对应ID：{}的经纪人",recommenderUserInfo.getBrokerUserId());
                throw new BizException(RespCode.BROKER_NOT_FIND);
            }
            Map<String, String> paramsMap = this.getBrokerParamsRulesMap(brokerInfo);//经纪人规则参数

            String brokerValid = paramsMap.get(StatusConstants.BROKER_PARAM_VALID);
            String newBrokerValid = paramsMap.get(StatusConstants.BROKER_PARAM_NEW_GIFT);

            //经纪人开启了、新用户开启了
            if(Boolean.valueOf(brokerValid) && Boolean.valueOf(newBrokerValid)){
                queryUserInfo.setBrokerUserId(recommenderUserInfo.getUserInfoId());//经纪人的本身Id
                //新用户获取经纪人奖励是否开启  //老用户是经纪人,新用户获取经纪人奖励
                List<ActivityPresent> oldBrokerList = this.parseParamsToActivityPresentList(paramsMap.get(StatusConstants.BROKER_PARAM_NEW_GIFT), paramsMap.get(StatusConstants.BROKER_PARAM_NEW_ID), queryUserInfo.getUserInfoId(), recommenderUserInfo.getUserInfoId(),NEW_BROKER_DONATE_GIFT,"新用户获得经纪人赠礼");
                activityPresentArrayList.addAll(oldBrokerList);
            }
        }

        return activityPresentArrayList;

    }

    /**
     * 从redis获取推荐人所有规则
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public RecommenderRules getRecommenderRulesByRedis() {
        BoundHashOperations boundHashOps = this.redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS);
        RecommenderRules recommenderRules = new RecommenderRules();
        Field[] field = recommenderRules.getClass().getDeclaredFields();//获取实体类的所有属性，返回Field数组

        Map<String,String> map = boundHashOps.entries();

        for (Map.Entry<String, String> entry : map.entrySet()) {

            for(int j=0 ; j<field.length ; j++){
                String s = this.tolowerCase(entry.getKey());
                if(s.equals(field[j].getName())){
                    try {
                        field[j].setAccessible(true);
                        field[j].set(recommenderRules,entry.getValue());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }

        }

        //检查所有参数是否有值，只要所有属性不是全是有值，证明后台参数设置和核心这边属性名称不匹配
        Field[] fieldArray = recommenderRules.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        for(int j=0 ; j<fieldArray.length ; j++){
            String name = field[j].getName();    //获取属性的名字
            name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造
            try {
                Method m = recommenderRules.getClass().getMethod("get"+name);
                String value = (String) m.invoke(recommenderRules);
                if(MyStringUtil.isBlank(value)){
                    throw new BizException(RespCode.PARSE_DONATE_RULES_ERROR);
                }
            }catch (Exception e) {
                e.printStackTrace();
                logger.error("解析redis的system_params，未正确的得到RecommenderRules对象，错误信息：{}",e);
                throw new BizException(RespCode.PARSE_DONATE_RULES_ERROR);
            }
        }

            return recommenderRules;
    }

    /**
     * 通过Id查询经纪人信息
     * @param userInfoId
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public BrokerInfo queryBrokerInfoById(Long userInfoId) {
        BrokerInfo brokerInfo = this.brokerInfoMapperExt.selectByPrimaryKey(userInfoId);
        if(null == brokerInfo || "FALSE".equals(brokerInfo.getStatus())){
            return null;
        }
        return brokerInfo;
    }

    /**
     * 通过经纪人对象查询出参数值
     *
     * @param brokerInfo
     * @return
     */
    @Override
    public Map<String, String> getBrokerParamsRulesMap(BrokerInfo brokerInfo) {
        if(null == brokerInfo){
            return null;
        }
        List<BrokerRules> paramsVoList = JSONObject.parseArray(brokerInfo.getActivityRule(),BrokerRules.class);
        return paramsVoList.stream().collect(Collectors.toMap(BrokerRules::getKey,BrokerRules::getValue));

    }

    /**
     * 查询活动赠礼
     * @param activityPresent
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void insertActivityPresent(ActivityPresent activityPresent) {
        this.activityPresentMapperExt.insertSelective(activityPresent);
    }

    /**
     * 赠礼类型
     * @param donateTypeString
     * @return
     */
    @Override
    public List<DonateType> getDonateType(String donateTypeString){
        if(MyStringUtil.isBlank(donateTypeString)){
            throw new BizException(RespCode.NOT_FIND_DONATETYPE);
        }
        return JSONArray.parseArray(donateTypeString,DonateType.class);
    }

    /**
     * 处理推荐人和经纪人
     * @param activityPresentId
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public boolean operateRegister(Long activityPresentId) {
        ActivityPresent present = this.activityPresentMapperExt.findAndLockActivityPresent(activityPresentId);
        if(present == null || PRESENTED.equals(present.getStatus())){
            throw new BizException(RespCode.ACTIVITY_PRESENT_NOT_FIND);
        }

        if("COMMODITY".equals(present.getPresentType())){

            RespResult respResult = tradeAccountService.baseTransfer(present.getCommodityId(), present.getPresentUserId(), AccountType.USER, present.getUserInfoId(), AccountType.USER, new BigDecimal(present.getQuantity()), CommodityFlowType.REGISTER_PRESENT, CommodityFlowType.REGISTER_PRESENT.getPersistKey(), "用户注册绑定手机号相关送礼");

            present.setSuccessTime(new Date());//送礼的时间
            present.setStatus(PRESENTED);//已赠送

            Map<String,Object> map  =  (Map<String,Object>)respResult.getBody();
            CommodityFlowRecord outRecord = (CommodityFlowRecord)map.get("outCommodityFlowRecord");
            CommodityFlowRecord inRecord = (CommodityFlowRecord)map.get("inCommodityFlowRecord");
            present.setCommodityFlowIds(inRecord.getCommodityFlowRecordId() + "," +outRecord.getCommodityFlowRecordId());//商品流通记录
            this.activityPresentMapperExt.updateByPrimaryKeySelective(present);//更新

            List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(present.getActivityPresentId(), PayBizType.DONATE.getPersistKey());
            if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
                throw new BizException(RespCode.NOT_FIND_RECORD);
            }
            UserBizBrief userBizBrief = userBizBriefList.get(0);
            if(!userBizBrief.getBizType().equals(PayBizType.DONATE.getPersistKey())){
                throw new BizException(RespCode.NOT_FIND_RECORD);
            }
            userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
            userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
        }
        return true;
    }

    /**
     * 通过主键查询赠礼记录
     *
     * @param activityPresentId
     * @return
     */
    @Override
    public ActivityPresent queryActivityPresentById(Long activityPresentId) {
        return this.activityPresentMapperExt.selectByPrimaryKey(activityPresentId);
    }

    /**
     * column数据格式转换
     * @param value
     * @return
     */
    private String tolowerCase(String value) {
        if(!value.contains("_")){
            return value.toLowerCase();
        }
        String[] strings = MyStringUtil.split(value, "_");
        for (int i = 1; i < strings.length; i++){
            strings[i] = new StringBuilder(strings[i].length())
                    .append(Character.toUpperCase(strings[i].charAt(0)))
                    .append((strings[i].toLowerCase()).substring(1))
                    .toString();
        }
        strings[0] = new String( strings[0].toLowerCase());
        return MyStringUtil.join(strings);
    }

    /**
     * 拼装活动赠礼对象
     * @param userInfoId
     * @param presentUserId
     * @param presentType
     * @param quantity
     * @param commondityId
     * @param ticketId
     * @param remark
     * @return
     */
    private static ActivityPresent columnToActivityPresent(Long userInfoId,Long presentUserId,String presentType,Long quantity,Long commondityId,Long ticketId,String presentReason,String remark){
        ActivityPresent activityPresent = new ActivityPresent();
        activityPresent.setUserInfoId(userInfoId);//用户id
        activityPresent.setPresentUserId(presentUserId);//赠礼人id
        activityPresent.setPresentType(presentType);//赠送类型， COMMODITY：商品  ，   TICKET：券
        activityPresent.setQuantity(quantity);//赠送数量
        activityPresent.setPresentReason(presentReason);//赠送的理由
        activityPresent.setCommodityId(commondityId);//赠送的商品id
        activityPresent.setTicketId(ticketId);//赠送的券id
        activityPresent.setStatus(NOT_PRESENT);//状态   NOT_PRESENT:未赠送      PRESENTED:已赠送
        activityPresent.setCreateTime(new Date());//创建时间
        activityPresent.setRemark(remark);//备注
        return activityPresent;
    }

    /**
     * 获取赠送的类型相关信息
     * @return
     */
    private List<DonateTypeVo> getDonateVoList(String str){
        List<DonateType> donateTypeList = this.getDonateType(str);//新用户绑定手机获取的奖励类型

        List<DonateTypeVo> donateTypeVos = new ArrayList<>();
        donateTypeList.forEach(item ->{
            DonateTypeVo donateTypeVo = new DonateTypeVo();
            try {
                PropertyUtils.copyProperties(donateTypeVo,item);
            } catch (Exception e) {
                e.printStackTrace();
                throw new BizException(RespCode.PARSE_GIFT_ERROR);
            }
            if(item.getId() == null){
                logger.error("没有找到规则中的赠品Id");
                throw new BizException(RespCode.RULES_COMMODITY_ID_NOT_FIND);
            }
            if(MyStringUtil.isBlank(item.getType())){
                logger.error("没有找到规则中的赠品类型");
                throw new BizException(RespCode.RULES_COMMODITY_TYPE_NOT_FIND);
            }
            if(item.getCount() <= 0){
                logger.error("没有找到规则中的赠品数量");
                throw new BizException(RespCode.RULES_COMMODITY_NUM_NOT_FIND);
            }
            switch (item.getType()){
                case "TICKET":
                    donateTypeVo.setTicketId(item.getId());
                    break;
                case "COMMODITY":
                    donateTypeVo.setCommondityId(item.getId());
                    break;
                default:
                    break;
            }
            donateTypeVos.add(donateTypeVo);
        });
        return donateTypeVos;
    }

    /**
     * 根据类型向数据库插入数据库得到返回值(activity_present)
     * @param userInfoId
     * @param otherId
     * @param donateTypeVos
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    private List<ActivityPresent> getInsertActivityPresentList(Long userInfoId,Long otherId,List<DonateTypeVo> donateTypeVos,String presentReason,String remark){
        List<ActivityPresent> list  = new ArrayList<>();

        donateTypeVos.forEach(donateVo ->{
            if("TICKET".equals(donateVo.getType())){

            }
            if("COMMODITY".equals(donateVo.getType())){
                ActivityPresent activityPresent = this.columnToActivityPresent(userInfoId,otherId, donateVo.getType(),donateVo.getCount(), donateVo.getCommondityId(), donateVo.getTicketId(),presentReason,remark);
                this.insertActivityPresent(activityPresent);//将数据插入活动赠礼

                CommodityVo commodityVo = null;
                try {
                    commodityVo = commodityService.findById(activityPresent.getCommodityId());
                } catch (IOException e) {
                    logger.error("从redis获取商品相关信息失败");
                    throw new BizException(RespCode.REDIS_NOT_FUND);
                }

                UserBizBrief userBizBrief = new UserBizBrief();
                userBizBrief.setUserInfoId(activityPresent.getUserInfoId());
                userBizBrief.setBizId(activityPresent.getActivityPresentId().toString());//以物换物订单Id
                userBizBrief.setCommodityContractId(activityPresent.getCommodityId());//商品Id
                userBizBrief.setBizType(PayBizType.DONATE.getPersistKey());//推荐人、经纪人相关都为此状态
                userBizBrief.setCreateTime(activityPresent.getCreateTime());
                userBizBrief.setOpCommodityUnitQuantity(new BigDecimal(activityPresent.getQuantity()));//数量
                userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());
                userBizBrief.setCommodityName(commodityVo.getCommodityName());
                userBizBrief.setBizStatus(PayBizType.DONATE.getPersistKey());//推荐人、经纪人相关都为此状态
                this.userBizBriefMapperExt.insertSelective(userBizBrief);

                list.add(activityPresent);//返回列表
            }
        });
        return list;
    }

    private List<ActivityPresent> parseParamsToActivityPresentList(String booleanValue,String donateTypeListStr,Long userInfoId,Long donateId,String presentReason,String remark){
        if(Boolean.valueOf(booleanValue)){
            List<DonateTypeVo> donateTypeVos = this.getDonateVoList(donateTypeListStr);//新用户获取经纪人奖励类型（券||商品)
            if(donateTypeVos == null || donateTypeListStr.isEmpty()){
                logger.error("没有找到需要赠送的商品类型列表");
                throw new BizException(RespCode.DONATE_TYPE_NOT_FIND);
            }
            return getInsertActivityPresentList(userInfoId,donateId,donateTypeVos,presentReason,remark);
        }
        return null;
    }

}
