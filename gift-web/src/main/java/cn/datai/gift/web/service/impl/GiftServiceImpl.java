package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.*;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.contants.enums.GiftType;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.BaseUtil;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.tradeAccount.HoldCommodityInfo;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by Administrator on 2017/3/14.
 */
@Service
public class GiftServiceImpl implements GiftService {

    private static final Logger logger = LoggerFactory.getLogger(GiftServiceImpl.class);

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private UserReltGiftAccountMapperExt userReltGiftAccountMapperExt;

    @Autowired
    private GiftAccountMapperExt giftAccountMapperExt;

    @Autowired
    private CommodityContractMapperExt commodityContractMapperExt;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private CommodityGiftInfoMapperExt commodityGiftInfoMapperExt;

    @Autowired
    private CommodityGiftDonationDetailMapperExt commodityGiftDonationDetailMapperExt;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private BaseInfoService baseInfoService;


    @Autowired
    private RecommoenderAndBrokerService recommoenderAndBrokerService;

    @Autowired
    private UserInfoMapperExt userInfoMapperExt;

    /**
     *  通过id和code查询大红包信息
     * @param giftInfoId
     * @param code
     * @return
     */
    @Override
    public CommodityGiftInfo findGiftInfo(long giftInfoId, String code) {
        CommodityGiftInfoExample example = new CommodityGiftInfoExample();
        example.or().andCommodityGiftInfoIdEqualTo(giftInfoId).andCodeEqualTo(code);
        List<CommodityGiftInfo> commodityGiftInfos = commodityGiftInfoMapperExt.selectByExample(example);
        if (commodityGiftInfos.isEmpty()) {
            throw new BizException(RespCode.GIFT_NOT_FOUND);
        }
        return commodityGiftInfos.get(0);
    }

    /**
     * 根据主键查询红包信息
     *
     * @param giftInfoId
     * @return
     */
    @Override
    public CommodityGiftInfo findGiftInfoById(long giftInfoId) {
       return commodityGiftInfoMapperExt.selectByPrimaryKey(giftInfoId);
    }

    /**
     * 根据主键查询小红包信息
     *
     * @param commodityGiftDonationDetailId
     * @return
     */
    @Override
    public CommodityGiftDonationDetail queryCommodityGiftDonationDetailById(Long commodityGiftDonationDetailId) {
        return this.commodityGiftDonationDetailMapperExt.selectByPrimaryKey(commodityGiftDonationDetailId);
    }

    /**
     * 查询某个大红包下所有的转赠明细,如果受赠人id不为空，则查询所有所属的转赠明细
     * @param commodityGiftId 大礼包id
     * @param doneeUserId 受赠人用户id
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<CommodityGiftDonationDetail> findGiftDonationDetail(long commodityGiftId, long doneeUserId) {
        CommodityGiftDonationDetailExample example = new CommodityGiftDonationDetailExample();
        CommodityGiftDonationDetailExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityGiftIdEqualTo(commodityGiftId);
        if (doneeUserId != 0L) {
            criteria.andDoneeUserIdEqualTo(doneeUserId);
        }
        return commodityGiftDonationDetailMapperExt.selectByExample(example);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public CommodityGiftDonationDetail grabGift(long commodityGiftInfoId, long userInfoId) throws IOException {
        //锁大礼包信息
        CommodityGiftInfo commodityGiftInfo = commodityGiftInfoMapperExt.selectByPrimaryKeyAndLock(commodityGiftInfoId);
        if (commodityGiftInfo == null) {
            throw new BizException(RespCode.GIFT_NOT_FOUND);
        }
        //检查当前用户是否已抢过此红包
        List<CommodityGiftDonationDetail> giftDonationDetailList = this.findGiftDonationDetail(commodityGiftInfoId, userInfoId);
        if (!giftDonationDetailList.isEmpty()) {
            throw new BizException(RespCode.GIFT_HAS_GRAB);
        }
        Date operateTime = new Date();
        //验证大礼包是否可抢
        //验证红包是否过期
        if (commodityGiftInfo.getExpiredTime().before(operateTime)) {
            throw new BizException(RespCode.GIFT_EXPIRED);
        }
        //验证受赠人是否还有剩余
        if (commodityGiftInfo.getDoneeSurplus() == 0) {
            throw new BizException(RespCode.GIFT_EMPTY);
        }
        String giftType = commodityGiftInfo.getType();
        //验证是否为指定某一受赠人
        if (giftType.equals(GiftType.SPECIFIED.getPersistKey())) {
            if (userInfoId != commodityGiftInfo.getSpecifiedDoneeUserId()) {
                throw new BizException(RespCode.GIFT_SPECIFIED_NO_AUTH);
            }
        }

        //验证礼包类型，拼手气和指定受赠人类型才可执行，平均策略代码未实现
        if (giftType.equals(GiftType.LUCKY.getPersistKey()) || giftType.equals(GiftType.SPECIFIED.getPersistKey())) {
            GiftAccount donatorGiftAccount = giftAccountMapperExt.selectByPrimaryKey(commodityGiftInfo.getDonatorGiftAccountId());
            CommodityVo commodityVo = commodityService.findById(donatorGiftAccount.getCommodityContractId());//缓存中获取商品相关信息

            //执行抢红包策略
            BigDecimal grabCommodityQuantity = this.grabGiftStrategy(commodityGiftInfo.getCommoditySurplusQuantity(), commodityGiftInfo.getDoneeSurplus(), BigDecimal.ONE, commodityVo.getStandardUnitMultiple());
            //执行成功后，解冻大礼包冻结商品至受赠人账户中
            long donatorUserId = this.findUserReltGiftAccountByGiftAccountId(commodityGiftInfo.getDonatorGiftAccountId()).getUserInfoId();

            RespResult respResult = tradeAccountService.grabGiftFlow(donatorUserId, AccountType.USER, userInfoId, AccountType.USER, donatorGiftAccount.getCommodityContractId(), grabCommodityQuantity);

            //更新修改后的大礼包信息
            commodityGiftInfo.setDoneeSurplus(commodityGiftInfo.getDoneeSurplus() - 1);
            commodityGiftInfo.setCommoditySurplusQuantity(commodityGiftInfo.getCommoditySurplusQuantity().subtract(grabCommodityQuantity));

            //检查受赠人是否已抢过红包
            String doneeUserIds = commodityGiftInfo.getDoneeUserIds();
            String[] array = StringUtils.split(doneeUserIds);
            ArrayList<String> list = new ArrayList<>();
            if (array != null) {
                list = new ArrayList(Arrays.asList(array));
                boolean contains = list.contains(Long.toString(userInfoId));
                if (contains) {
                    throw new BizException(RespCode.GIFT_HAS_GRAB);
                }
            }
            list.add(Long.toString(userInfoId));
            list.sort(String::compareTo);
            commodityGiftInfo.setDoneeUserIds(StringUtils.join(list, ","));

            commodityGiftInfoMapperExt.updateByPrimaryKeySelective(commodityGiftInfo);

            //新增商品礼包赠与明细
            CommodityGiftDonationDetail commodityGiftDonationDetail = new CommodityGiftDonationDetail();
            commodityGiftDonationDetail.setCommodityGiftId(commodityGiftInfo.getCommodityGiftInfoId());
            commodityGiftDonationDetail.setDoneeUserId(userInfoId);
            commodityGiftDonationDetail.setCommodityUnitQuantity(grabCommodityQuantity);
            commodityGiftDonationDetail.setAdoptTime(new Date());
            if (respResult.getCode().equals(RespCode.SUCCESS.getCode())) {
                HashMap<String, Object> body = (HashMap<String, Object>) respResult.getBody();
                CommodityFlowRecord unfreezeFlow = (CommodityFlowRecord) body.get("unfreezeFlow");
                CommodityFlowRecord inFlow = (CommodityFlowRecord) body.get("inFlow");
                commodityGiftDonationDetail.setCommodityFlowRecordIds(unfreezeFlow.getCommodityFlowRecordId().toString() + "," + inFlow.getCommodityFlowRecordId().toString());
            }
            commodityGiftDonationDetailMapperExt.insertSelective(commodityGiftDonationDetail);


            //添加抢红包的交易明细
            UserBizBrief userBizBrief = new UserBizBrief();
            userBizBrief.setUserInfoId(userInfoId);//用户Id
            userBizBrief.setCommodityContractId(donatorGiftAccount.getCommodityContractId());//商品合约Id
            userBizBrief.setBizType(PayBizType.ACCEPT_GIFT.getPersistKey());//业务类型Code
//            userBizBrief.setBizId(commodityGiftDonationDetail.getCommodityGiftDonationDetailId().toString());//业务Id
            userBizBrief.setBizId(commodityGiftDonationDetail.getCommodityGiftDonationDetailId().toString());//小红包ID
            userBizBrief.setCreateTime(new Date());//创建时间

            userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());//商品类型ID
            userBizBrief.setCommodityName(commodityVo.getCommodityName());//商品名称
            userBizBrief.setOpCommodityUnitQuantity(commodityGiftDonationDetail.getCommodityUnitQuantity());//操作商品数量
            AttachVo attachVo = new AttachVo();
            attachVo.setRemark("已领1/"+commodityGiftInfo.getDoneeQuota()+"个");
            userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

            userBizBriefMapperExt.insertSelective(userBizBrief);

            return commodityGiftDonationDetail;
        }

        //普通红包类型
        if (giftType.equals(GiftType.AVERAGE.getPersistKey())) {
            //执行抢红包策略
            BigDecimal grabCommodityQuantity = commodityGiftInfo.getCommodityTotalQuantity().divide(new BigDecimal(commodityGiftInfo.getDoneeQuota()));
            //执行成功后，解冻大礼包冻结商品至受赠人账户中
            long donatorUserId = this.findUserReltGiftAccountByGiftAccountId(commodityGiftInfo.getDonatorGiftAccountId()).getUserInfoId();
            GiftAccount donatorGiftAccount = giftAccountMapperExt.selectByPrimaryKey(commodityGiftInfo.getDonatorGiftAccountId());
            RespResult respResult = tradeAccountService.grabGiftFlow(donatorUserId, AccountType.USER, userInfoId, AccountType.USER, donatorGiftAccount.getCommodityContractId(), grabCommodityQuantity);

            //更新修改后的大礼包信息
            commodityGiftInfo.setDoneeSurplus(commodityGiftInfo.getDoneeSurplus() - 1);
            commodityGiftInfo.setCommoditySurplusQuantity(commodityGiftInfo.getCommoditySurplusQuantity().subtract(grabCommodityQuantity));
            //检查受赠人是否已抢过红包
            String doneeUserIds = commodityGiftInfo.getDoneeUserIds();
            String[] array = StringUtils.split(doneeUserIds);
            ArrayList<String> list = new ArrayList<>();
            if (array != null) {
                list = new ArrayList(Arrays.asList(array));
                boolean contains = list.contains(Long.toString(userInfoId));
                if (contains) {
                    throw new BizException(RespCode.GIFT_HAS_GRAB);
                }
            }
            list.add(Long.toString(userInfoId));
            list.sort(String::compareTo);
            commodityGiftInfo.setDoneeUserIds(StringUtils.join(list, ","));

            commodityGiftInfoMapperExt.updateByPrimaryKeySelective(commodityGiftInfo);

            //新增商品礼包赠与明细
            CommodityGiftDonationDetail commodityGiftDonationDetail = new CommodityGiftDonationDetail();
            commodityGiftDonationDetail.setCommodityGiftId(commodityGiftInfo.getCommodityGiftInfoId());
            commodityGiftDonationDetail.setDoneeUserId(userInfoId);
            commodityGiftDonationDetail.setCommodityUnitQuantity(grabCommodityQuantity);
            commodityGiftDonationDetail.setAdoptTime(new Date());
            if (respResult.getCode().equals(RespCode.SUCCESS.getCode())) {
                HashMap<String, Object> body = (HashMap<String, Object>) respResult.getBody();
                CommodityFlowRecord unfreezeFlow = (CommodityFlowRecord) body.get("unfreezeFlow");
                CommodityFlowRecord inFlow = (CommodityFlowRecord) body.get("inFlow");
                commodityGiftDonationDetail.setCommodityFlowRecordIds(unfreezeFlow.getCommodityFlowRecordId().toString() + "," + inFlow.getCommodityFlowRecordId().toString());
            }
            commodityGiftDonationDetailMapperExt.insertSelective(commodityGiftDonationDetail);


            //添加抢红包的交易明细
            UserBizBrief userBizBrief = new UserBizBrief();
            userBizBrief.setUserInfoId(userInfoId);//用户Id
            userBizBrief.setCommodityContractId(donatorGiftAccount.getCommodityContractId());//商品合约Id
            userBizBrief.setBizType(PayBizType.ACCEPT_GIFT.getPersistKey());//业务类型Code
//            userBizBrief.setBizId(commodityGiftDonationDetail.getCommodityGiftDonationDetailId().toString());//业务Id
            userBizBrief.setBizId(commodityGiftDonationDetail.getCommodityGiftDonationDetailId().toString());//小红包ID
            userBizBrief.setCreateTime(new Date());//创建时间

            CommodityVo commodityVo = commodityService.findById(donatorGiftAccount.getCommodityContractId());//缓存中获取商品相关信息
            userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());//商品类型ID
            userBizBrief.setCommodityName(commodityVo.getCommodityName());//商品名称
            userBizBrief.setOpCommodityUnitQuantity(commodityGiftDonationDetail.getCommodityUnitQuantity());//操作商品数量
            AttachVo attachVo = new AttachVo();
            attachVo.setRemark("已领1/"+commodityGiftInfo.getDoneeQuota()+"个");
            userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

            userBizBriefMapperExt.insertSelective(userBizBrief);

            return commodityGiftDonationDetail;
        }
        throw new BizException(RespCode.GIFT_TYPE_NOT_SUPPORT);
    }

    /**
     * 分抢礼包策略
     * @param commoditySurplusQuantity 礼包中剩余商品单位数量
     * @param doneeSurplus 剩余受赠人数
     * @param minGrabCommodityQuantity 最小能抢到的商品数量
     * @param maxGrabCommodityQuantity 最大能抢到的商品数量
     * @return 抢到的商品单位数量
     */
    @Override
    public BigDecimal grabGiftStrategy(BigDecimal commoditySurplusQuantity, int doneeSurplus, BigDecimal minGrabCommodityQuantity, BigDecimal maxGrabCommodityQuantity) {
        int i = maxGrabCommodityQuantity.multiply(new BigDecimal(doneeSurplus)).compareTo(commoditySurplusQuantity);
        if (i == -1) {
            throw new BizException("商品总数设置错误，所有用户抢得上限，最多能够抢得" + maxGrabCommodityQuantity.multiply(new BigDecimal(doneeSurplus)) + ",会有剩余商品");
        }
        long max, min;
        long grabCommodityQuantity;
        if (doneeSurplus == 1) {
            min = commoditySurplusQuantity.longValue();
            max = commoditySurplusQuantity.longValue();
            grabCommodityQuantity = commoditySurplusQuantity.longValue();
        } else {

            max = Math.min(
                    maxGrabCommodityQuantity.intValue(),
                    Math.min((int)(commoditySurplusQuantity.doubleValue() / doneeSurplus * 3), commoditySurplusQuantity.longValue()
                            - (doneeSurplus - 1) * minGrabCommodityQuantity.longValue()));

            min = Math.max(minGrabCommodityQuantity.longValue(), commoditySurplusQuantity.longValue() - (doneeSurplus - 1) * maxGrabCommodityQuantity.longValue());
            grabCommodityQuantity = min + (long) (new Random().nextDouble() * (max - min + 1));
        }
        logger.info("拼手气红包策略数据， min:{}, max:{}, 实际抢得：{}, 剩余：{}", min, max, grabCommodityQuantity, (commoditySurplusQuantity.longValue() - grabCommodityQuantity));
        return new BigDecimal(grabCommodityQuantity);
    }

    /**
     * 通过交易账户id查询用户id
     * @param giftAccountId 交易账户id
     * @return
     */
    @Override
    public UserReltGiftAccount findUserReltGiftAccountByGiftAccountId(long giftAccountId){
        UserReltGiftAccountExample example = new UserReltGiftAccountExample();
        example.or().andGiftAccountIdEqualTo(giftAccountId);
        List<UserReltGiftAccount> userReltGiftAccounts = userReltGiftAccountMapperExt.selectByExample(example);
        return userReltGiftAccounts.get(0);
    }

    /**
     * 用过用户Id查询 用户与礼包账户关系表
     *
     * (联合主键，一个用户Id对应多个礼包账户Id)
     * (每一类红酒对应一个礼包账户)
     *
     * @param userInfoId
     * @return
     */
    @Override
    public List<UserReltGiftAccount> queryUserReltGiftAccountList(Long userInfoId) {
        UserReltGiftAccountExample userReltGiftAccountExample = new UserReltGiftAccountExample();
        userReltGiftAccountExample.createCriteria().andUserInfoIdEqualTo(userInfoId);
        return this.userReltGiftAccountMapperExt.selectByExample(userReltGiftAccountExample);
    }

    /**
     * 通过礼包账户Id查询礼包相关信息
     *
     * @param giftAccountId
     * @return
     */
    @Override
    public GiftAccount queryGiftAccount(Long giftAccountId) {
        return giftAccountMapperExt.selectByPrimaryKey(giftAccountId);
    }

    /**
     * 通过用户ID查询用户所持有的礼包信息
     *
     * @param userInfoId
     * @return
     */
    @Override
    public List<GiftAccount> queryGiftAccountByUserInfoId(Long userInfoId) {
        List<GiftAccount> result = new ArrayList<>();
        List<UserReltGiftAccount> list = this.queryUserReltGiftAccountList(userInfoId);
        if(null != list && !list.isEmpty()) {
            for(UserReltGiftAccount userReltGiftAccount : list){
                GiftAccount giftAccount = this.queryGiftAccount(userReltGiftAccount.getGiftAccountId());
                result.add(giftAccount);
            }
        }
        return result;
    }

    /**
     * 用户持仓展现
     *
     * @param userInfoId
     * @return
     */
    @Override
    public List<HoldCommodityInfo> queryUserHoldCommodityList(Long userInfoId) throws IOException {
        List<GiftAccount> list = this.queryGiftAccountByUserInfoId(userInfoId);
        List<HoldCommodityInfo> holdList = new ArrayList<>();
        HoldCommodityInfo holdCommodityInfo = null;
        for(GiftAccount giftAccount :list){
            holdCommodityInfo = new HoldCommodityInfo();
            CommodityVo commodityVo = this.commodityService.findById(giftAccount.getCommodityContractId());
            holdCommodityInfo.setCommodityCode(commodityVo.getCommodityCode());
            holdCommodityInfo.setCommodityName(commodityVo.getCommodityName());
            holdCommodityInfo.setCommodityTypeCode(commodityVo.getCommodityTypeCode());
            holdCommodityInfo.setCommodityContractId(commodityVo.getCommodityContractId());
            holdCommodityInfo.setCommodityTypeId(commodityVo.getCommodityTypeId());
            holdCommodityInfo.setHoldCommodityQuantity(giftAccount.getAvailableUnitQuantity());
            holdCommodityInfo.setLastUnitPrice(commodityVo.getUnitPrice().toString());
            holdCommodityInfo.setStandardPrice(commodityVo.getStandardPrice() == null ? null : commodityVo.getStandardPrice().toString());
            holdCommodityInfo.setSubjectMatter(commodityVo.getSubjectMatter());
            holdCommodityInfo.setStandardUnitName(commodityVo.getStandardUnitName());
            holdCommodityInfo.setUnit(commodityVo.getUnit());
            holdCommodityInfo.setStandardUnitMultiple(commodityVo.getStandardUnitMultiple());
            holdCommodityInfo.setIconUrl(commodityVo.getIconUrl());
            holdCommodityInfo.setPicUrl(commodityVo.getPicUrl());
            holdCommodityInfo.setIntroDetailLink(commodityVo.getIntroDetailLink());
            holdCommodityInfo.setTypeName(commodityVo.getTypeName());
            holdCommodityInfo.setExpireTime(commodityVo.getExpireTime());

            holdList.add(holdCommodityInfo);
        }
        return holdList;
    }

    /**
     * 检查商品合约状态
     *
     * @param commodityContractId
     * @return
     */
    @Override
    public boolean checkCommodityContractStatus(Long commodityContractId) {
        CommodityContract commodityContract = commodityContractMapperExt.selectByPrimaryKey(commodityContractId);
        if(null == commodityContract){
           throw new BizException(RespCode.COMMODITY_NOT_FUND);
        }
        if(commodityContract.getStatus().equals(StatusConstants.COMMODITY_STATUS_N)){
            return false;
        }
        return true;
    }

    /**
     * 是否超过了最大可发数量
     *
     * @param quantity
     * @param giftAccount
     */
    @Override
    public boolean isOverMaxquantity(GiftAccount giftAccount,BigDecimal quantity) {
        int compResult = giftAccount.getAvailableUnitQuantity().compareTo(quantity);
        if(-1 == compResult){
            return true;
        }
        return false;
    }

    /**
     * 是否超过最大人数
     *
     * @param count
     * @return
     */
    @Override
    public boolean isOverMaxCount(int count) {
        String value = baseInfoService.getSystemParamsValue(StatusConstants.MAX_PEOPLE_COUNT);
        if((Integer.valueOf(value))<count){
            return true;
        }
        return false;
    }

    /**
     * 单个用户一个红包最多能够得到的数量
     * @return
     */
    @Override
    public int getSinglePeopleAccept() {
        String singlePeopleAccept = baseInfoService.getSystemParamsValue(StatusConstants.SINGLE_PEOPLE_ACCEPT);
        return Integer.valueOf(singlePeopleAccept);
    }

    /**
     * 是否包含可发红包的类型
     *
     * @param type
     * @return
     */
    @Override
    public boolean isContainGiveType(String type) {
        String allType = baseInfoService.getSystemParamsValue(StatusConstants.GIFT_TYPE);
        if(allType.contains(type)){
            return true;
        }

        return false;
    }

    /**
     * 通过用户Id和商品ID，查询并锁住礼包账户
     *
     * @param userInfoId
     * @param commodityId
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public GiftAccount findAndLockGiftAccountByUserIdAndCommodityId(Long userInfoId, Long commodityId) {
        UserReltGiftAccountExample userReltGiftAccountExample = new UserReltGiftAccountExample();
        userReltGiftAccountExample.createCriteria().andUserInfoIdEqualTo(userInfoId).andCommodityContractIdEqualTo(commodityId);
        List<UserReltGiftAccount> list = userReltGiftAccountMapperExt.selectByExample(userReltGiftAccountExample);
        if(null == list || list.isEmpty()){
            throw new BizException(RespCode.GIFTRELTACCOUNT_NOT_FUND);
        }
        return giftAccountMapperExt.selectByPrimaryKeyAndLock(list.get(0).getGiftAccountId());

    }

    /**
     * 通过用户Id和商品ID，查询礼包账户
     * @param userInfoId
     * @param commodityId
     * @return
     */
    @Override
    public GiftAccount queryGiftAccountByUserIdAndCommodityId(Long userInfoId, Long commodityId) {
        UserReltGiftAccountExample userReltGiftAccountExample = new UserReltGiftAccountExample();
        userReltGiftAccountExample.createCriteria().andUserInfoIdEqualTo(userInfoId).andCommodityContractIdEqualTo(commodityId);
        List<UserReltGiftAccount> list = userReltGiftAccountMapperExt.selectByExample(userReltGiftAccountExample);
        if(null == list || list.isEmpty()){
            throw new BizException(RespCode.GIFTRELTACCOUNT_NOT_FUND);
        }
        return giftAccountMapperExt.selectByPrimaryKey(list.get(0).getGiftAccountId());
    }

    /**
     * 校验 计算是否满足条件（拼手气红包）
     * @param commodityVo
     * @param giftAccount
     * @param giftCount
     * @param giftNum
     * @param giftType
     * @param commodityId
     * @return
     */
    @Override
    public boolean checkAngrRedBagCondi(CommodityVo commodityVo, GiftAccount giftAccount, int giftCount, BigDecimal giftNum, short giftType, Long commodityId) {

        int cg = giftNum.compareTo(new BigDecimal(giftCount));//所发红包的数量不能小于人数
        if(-1 == cg){
            return false;
        }

        boolean typeResult = this.isContainGiveType(String.valueOf(giftType));
        if(!typeResult){
            return false;
        }

        boolean statusResult = this.checkCommodityContractStatus(commodityId);
        if(!statusResult){
            return false;
        }

        boolean countResult = this.isOverMaxCount(giftCount);
        if(countResult){
            return false;
        }

        boolean numResult = this.isOverMaxquantity(giftAccount,giftNum);//是否超过最大持有量
        if(numResult){
            return false;
        }

        int accept =(giftNum.intValue())/giftCount;
//        int maxAccept = getSinglePeopleAccept();//超过每个用户最大可获得数量（数据库默认200）
//        if(accept>maxAccept){
//            return false;
//        }
        // 超过限制，单个用户最多只能收一个规格的商品
        if (accept > commodityVo.getStandardUnitMultiple().intValue()) {
            logger.warn("拼手气红包超过限制，单用户最多只能接收一个规格的商品，规格单位/基本单位数:{}, 红包个数：{}，红包总量: {}",
                    commodityVo.getStandardUnitMultiple().intValue(), giftCount, giftNum.intValue());
            return false;
        }

        return true;
    }

    /**
     * 生成商品礼包信息
     *
     * @param giftAccountId
     * @param giftType
     * @param giftCount
     * @param giftNum
     * @return
     */
    @Override
    public CommodityGiftInfo assCommodityGiftInfo(Long giftAccountId,String greeting, short giftType, int giftCount, BigDecimal giftNum,Long commodityId) throws NoSuchAlgorithmException {
        CommodityGiftInfo commodityGiftInfo = new CommodityGiftInfo();
        String encodedPwd = BaseUtil.encodeGiftCode();//加密后的唯一码
        commodityGiftInfo.setCode(encodedPwd);
        commodityGiftInfo.setDonatorGiftAccountId(giftAccountId);//发红包用户的礼包账户ID
        commodityGiftInfo.setGreeting(greeting);//祝福语
        commodityGiftInfo.setType(String.valueOf(giftType));//红包类型
        commodityGiftInfo.setDoneeQuota(giftCount);//总人数配额
        commodityGiftInfo.setDoneeSurplus(giftCount);//剩余人数
        commodityGiftInfo.setCommodityTotalQuantity(giftNum);//商品总数量
        commodityGiftInfo.setCommoditySurplusQuantity(giftNum);//剩余数量
        commodityGiftInfo.setCommodityContractId(commodityId);//商品ID
        Date date = new Date();
        commodityGiftInfo.setCreateTime(date);//红包生成的时间
        String expireTime = baseInfoService.getSystemParamsValue(StatusConstants.EXPIRE_TIME);//redis中获取数据库中设置的过期时间以秒为单位
        commodityGiftInfo.setExpiredTime(DateUtil.plusSomeTimes(date,expireTime));//具体的红包过期时间
        return commodityGiftInfo;
    }

    /**
     * 插入商品礼包信息
     *
     * @param commodityGiftInfo
     */
    @Override
    @Transactional
    public void inserCommodityGiftInfo(CommodityGiftInfo commodityGiftInfo) {
        commodityGiftInfoMapperExt.insertSelective(commodityGiftInfo);
    }

    /**
     * 查询过期时间在一定返回内的商品大礼包
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<CommodityGiftInfo> selectExpiredGiftInfo(Date startExpiredTime, Date endExpiredTime) {
        List<CommodityGiftInfo> commodityGiftInfos = this.commodityGiftInfoMapperExt.selectExpired(startExpiredTime, endExpiredTime);
        return commodityGiftInfos;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Long> selectExpiredGiftInfoId(Date startExpiredTime, Date endExpiredTime) {
        logger.info("查询过期未处理红包");
        List<Long> commodityGiftInfoIds = this.commodityGiftInfoMapperExt.selectExpiredId(startExpiredTime, endExpiredTime);
        String join = StringUtils.join(commodityGiftInfoIds, ",");
        if (StringUtils.isNotBlank(join)) {
            logger.info("查询出过期未处理红包id：{}", join);
        }
        return commodityGiftInfoIds;
    }


    /**
     * 处理过期的红包，退还给赠与人, 异步执行
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    @Async
    public boolean handleExpiredGiftInfo(long commodityGiftInfoId) {
        //TODO 后面改成修改红包信息使用乐观锁
        CommodityGiftInfo commodityGiftInfo = commodityGiftInfoMapperExt.selectByPrimaryKeyAndLock(commodityGiftInfoId);
        if ("true".equals(commodityGiftInfo.getRefunded())) {
            //已处理过不需要处理
            return false;
        }
        if (commodityGiftInfo.getCommoditySurplusQuantity().compareTo(BigDecimal.ZERO) == 1) {//有剩余商品需要退还

            //将红包剩余商品数量解冻，解冻至赠与人账户下
            GiftAccount giftAccount = giftAccountMapperExt.selectByPrimaryKey(commodityGiftInfo.getDonatorGiftAccountId());
            UserReltGiftAccount userReltGiftAccount = this.findUserReltGiftAccountByGiftAccountId(giftAccount.getGiftAccountId());
            RespResult respResult = tradeAccountService.baseUnfreeze(giftAccount.getCommodityContractId(), userReltGiftAccount.getUserInfoId(), AccountType.USER,
                    userReltGiftAccount.getUserInfoId(), AccountType.USER, commodityGiftInfo.getCommoditySurplusQuantity(), CommodityFlowType.GIFT_REFUND, null, null);

            if (respResult.getCode().equals(RespCode.SUCCESS.getCode())) {
                //将流通记录存入大红包退还id中
                HashMap<String, Object> body = (HashMap<String, Object>) respResult.getBody();
                commodityGiftInfo = new CommodityGiftInfo();
                commodityGiftInfo.setCommodityGiftInfoId(commodityGiftInfoId);
                CommodityFlowRecord unfreezeFlow = (CommodityFlowRecord) body.get("unfreezeFlow");
                CommodityFlowRecord inFlow = (CommodityFlowRecord) body.get("inFlow");
                commodityGiftInfo.setRefundFlowRecordId(unfreezeFlow.getCommodityFlowRecordId().toString() + "," + inFlow.getCommodityFlowRecordId().toString());
                commodityGiftInfo.setRefunded("true");
                commodityGiftInfoMapperExt.updateByPrimaryKeySelective(commodityGiftInfo);
                logger.info("处理过期红包成功，红包id：{}, 退还用户商品流通编号：{}", commodityGiftInfoId, inFlow.getCommodityFlowRecordId().toString());
            }
        } else {
            //没有商品需要退还，只更新是否已处理过期
            commodityGiftInfo = new CommodityGiftInfo();
            commodityGiftInfo.setCommodityGiftInfoId(commodityGiftInfoId);
            commodityGiftInfo.setRefunded("true");
            commodityGiftInfoMapperExt.updateByPrimaryKeySelective(commodityGiftInfo);
            logger.info("处理过期红包成功，红包id：{}, 已被抢光，不需要退还赠与人", commodityGiftInfoId);
        }
        return true;
    }

    /**
     * 普通红包
     * @param commodityVo
     * @param giftAccount
     * @param giftCount
     * @param giftNum
     * @param giftType
     * @param commodityId
     * @return
     */
    @Override
    public boolean checkAverageRedBagCondi(CommodityVo commodityVo, GiftAccount giftAccount, int giftCount, BigDecimal giftNum, short giftType, Long commodityId) {

        boolean typeResult = this.isContainGiveType(String.valueOf(giftType));
        if(!typeResult){
            return false;
        }

        boolean statusResult = this.checkCommodityContractStatus(commodityId);
        if(!statusResult){
            return false;
        }

        boolean countResult = this.isOverMaxCount(giftCount);
        if(countResult){
            return false;
        }

        boolean numResult = this.isOverMaxquantity(giftAccount,giftNum);
        if(numResult){
            return false;
        }

        int i = (giftNum.intValue()) % giftCount;//不能整除
        if(0 != i){
            return false;
        }

        int accept =(giftNum.intValue())/giftCount;
//        int maxAccept = getSinglePeopleAccept();//超过每个用户最大可获得数量（数据库默认100）
//        if(accept>maxAccept){
//            return false;
//        }

        // 超过限制，单个用户最多只能收一个规格的商品
        if (accept > commodityVo.getStandardUnitMultiple().intValue()) {
            logger.warn("普通红包超过限制，单用户最多只能接收一个规格的商品，规格单位/基本单位数:{}, 红包个数：{}，红包总量: {}",
                    commodityVo.getStandardUnitMultiple().intValue(), giftCount, giftNum.intValue());
            return false;
        }
        return true;
    }

    /**
     * 绑定手机号
     *
     * @param userInfoId
     * @param mobile
     * @param code
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public RespResult bindMobile(Long userInfoId, String mobile, String code, HttpServletRequest request) throws NoSuchAlgorithmException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UserInfo queryUserInfo = userInfoMapperExt.findAndLockById(userInfoId);
        //已经绑定的用户不能在绑定
//        if(MyStringUtil.isNotBlank(queryUserInfo.getMobilePhone())){
//            return new RespResult(RespCode.FAIL,"该用户已绑定手机号");
//        }
//        if(!BaseUtil.isMobileNO(mobile)){
//            return new RespResult(RespCode.FAIL,"请输入正确的手机号格式");
//        }
//        if(!BaseUtil.isNumeric(code)){
//            return new RespResult(RespCode.FAIL,"请输入正确的手机验证码");
//        }
//        //初次绑定的手机号验证其唯一性
//        int mobileCount = baseInfoService.queryMobileCount(mobile);
//        if(mobileCount > 0){
//            return new RespResult(RespCode.FAIL,"该手机号已被绑定");
//        }
//
//        //验证手机验证码
//        Boolean hasKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_CODE + userInfoId);
//        if(!hasKey){
//            return new RespResult(RespCode.FAIL,"手机验证码超时");
//        }
//        String mobileAndCode = redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_CODE + userInfoId).toString();
//        String [] strArr = mobileAndCode.split(":");
//        if(strArr.length != 2){
//            return new RespResult(RespCode.FAIL,"请输入正确的手机号和验证码");
//        }
//        if(!strArr[0].equals(mobile) || !strArr[1].equals(code)){
//            return new RespResult(RespCode.FAIL,"请输入正确的手机号或验证码");
//        }

        List<ActivityPresent> activityPresentList = null;//推荐人和经纪人机制
        try {
            activityPresentList = this.recommoenderAndBrokerService.checkRecommoenderAndBroker(queryUserInfo, request);
        }catch (InvocationTargetException e) {
            e.printStackTrace();
            logger.error("推荐人或者经纪人业务发生异常,错误信息{}",e);
            throw new BizException(RespCode.RECOMMENDER_BROKER_ERROR);
        }

        queryUserInfo.setMobilePhone(mobile);//手机号
        baseInfoService.updateUserInfo(queryUserInfo);

        return new RespResult(RespCode.SUCCESS,activityPresentList);
    }



}
