package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.CommodityFlowRecordMapperExt;
import cn.datai.gift.persist.mapper.GiftAccountMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.CommodityFlowRecord;
import cn.datai.gift.persist.po.CommodityGiftInfo;
import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.BaseTradeAccountService;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.GiftService;
import cn.datai.gift.web.service.TradeAccountService;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by zhangyutao on 2017/3/15.
 */
@Service
public class TradeAccountServiceImpl extends BaseTradeAccountService implements TradeAccountService {

    @Autowired
    private GiftService giftService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private GiftAccountMapperExt giftAccountMapperExt;

    @Autowired
    private CommodityFlowRecordMapperExt commodityFlowRecordMapperExt;

    /**
     * 发红包业务的商品流通
     * @param giftCount 个数
     * @param giftNum 数量
     * @param giftType 类型
     * @param commodityId 商品Id
     * @param greeting 祝福语
     * @param userLoginInfo 各种Id
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public CommodityGiftInfo giveGift(int giftCount, BigDecimal giftNum, short giftType, Long commodityId,String greeting, UserLoginInfo userLoginInfo) throws NoSuchAlgorithmException, IOException {
        if(1 == giftType){
            //拼手气红包
            return angrRedBag(giftCount,giftNum,giftType,commodityId,greeting,userLoginInfo);
        }
        if(2 == giftType){
            //普通红包
            return averageRedBag(giftCount,giftNum,giftType,commodityId,greeting,userLoginInfo);
        }
        throw new BizException(RespCode.GIFT_TYPE);
    }

    /**
     * 普通红包
     * @param giftCount 红包个数
     * @param giftNum 商品总数量
     * @param giftType 红包类型（1：普通红包）
     * @param commodityId 商品Id
     * @param greeting 祝福语
     * @param userLoginInfo 用户信息
     * @return
     */
    private CommodityGiftInfo averageRedBag(int giftCount, BigDecimal giftNum, short giftType, Long commodityId, String greeting, UserLoginInfo userLoginInfo) throws NoSuchAlgorithmException, IOException {
        RespResult findOrCreateResult = this.findOrCreateTradeAccount(commodityId, userLoginInfo.getUserInfoId(), AccountType.USER);
        if (!findOrCreateResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            throw new BizException(RespCode.SERVER_ERROR);
        }
        //查询并锁住对应礼包账户信息
        GiftAccount giftAccount = giftService.findAndLockGiftAccountByUserIdAndCommodityId(userLoginInfo.getUserInfoId(),commodityId);

        if(null == giftAccount){
            throw new BizException(RespCode.GIFTACCOUNT_NOT_FUND);
        }

        CommodityVo commodityVo = commodityService.findById(commodityId);//缓存中获取商品相关信息
        //检查所有参数是否满足发放条件(普通红包)
        boolean checkResult = giftService.checkAverageRedBagCondi(commodityVo, giftAccount,giftCount,giftNum,giftType,commodityId);
        if(!checkResult){
            throw new BizException(RespCode.GIFTPARAM_NOT_FUND);
        }

        //冻结礼包账户,生成流通记录,调用公共接口
        RespResult freezeResult = baseFreeze(commodityId, userLoginInfo.getUserInfoId(), AccountType.USER, giftNum, CommodityFlowType.GIFT_GIVE, null, "发红包-普通红包");
        if (!freezeResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            throw new BizException(RespCode.SERVER_BIZ_ERROR);
        }

        //添加商品礼包信息
        CommodityGiftInfo commodityGiftInfo = giftService.assCommodityGiftInfo(giftAccount.getGiftAccountId(),greeting,giftType,giftCount,giftNum,commodityId);
        HashMap<String, Object> map = (HashMap<String, Object>)freezeResult.getBody();
        CommodityFlowRecord outFlow = (CommodityFlowRecord)map.get("outFlow");
        CommodityFlowRecord freezeFlow = (CommodityFlowRecord)map.get("freezeFlow");
        commodityGiftInfo.setCommodityFlowRecordIds(outFlow.getCommodityFlowRecordId() + "," + freezeFlow.getCommodityFlowRecordId());
        giftService.inserCommodityGiftInfo(commodityGiftInfo);

        //添加发红包交易明细记录
        UserBizBrief userBizBrief = new UserBizBrief();
        userBizBrief.setUserInfoId(userLoginInfo.getUserInfoId());//用户Id
        userBizBrief.setCommodityContractId(commodityId);//商品合约Id
        userBizBrief.setBizType(PayBizType.GIVE_GIFT.getPersistKey());//业务类型Code
        userBizBrief.setBizId(commodityGiftInfo.getCommodityGiftInfoId().toString());//业务Id
        userBizBrief.setCreateTime(new Date());//创建时间

        userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());//商品类型ID
        userBizBrief.setCommodityName(commodityVo.getCommodityName());//商品名称
        userBizBrief.setOpCommodityUnitQuantity(commodityGiftInfo.getCommodityTotalQuantity());//操作商品数量
        AttachVo attachVo = new AttachVo();
        attachVo.setGiftTotalNum(commodityGiftInfo.getDoneeQuota());//红包总个数
        attachVo.setHaveAcceptGiftNum(0);
        attachVo.setRemark("已领0/"+commodityGiftInfo.getDoneeQuota()+"个");
        userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

        userBizBriefMapperExt.insertSelective(userBizBrief);

        return commodityGiftInfo;


    }

    /**
     * 手气红包
     * @param giftCount 红包个数
     * @param giftNum 红包的总数量
     * @param giftType 红包类型 （0：拼手气红包）
     * @param commodityId 商品Id
     * @param greeting 祝福语
     * @param userLoginInfo 用户信息
     * @return
     * @throws NoSuchAlgorithmException
     */
    private CommodityGiftInfo angrRedBag(int giftCount, BigDecimal giftNum, short giftType, Long commodityId,String greeting, UserLoginInfo userLoginInfo) throws NoSuchAlgorithmException, IOException {
        RespResult findOrCreateResult = this.findOrCreateTradeAccount(commodityId, userLoginInfo.getUserInfoId(), AccountType.USER);
        if (!findOrCreateResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            throw new BizException(RespCode.SERVER_ERROR);
        }
        //查询并锁住对应礼包账户信息
        GiftAccount giftAccount = giftService.findAndLockGiftAccountByUserIdAndCommodityId(userLoginInfo.getUserInfoId(),commodityId);

        if(null == giftAccount){
            throw new BizException(RespCode.GIFTACCOUNT_NOT_FUND);
        }

        CommodityVo commodityVo = commodityService.findById(commodityId);//缓存中获取商品相关信息
        //检查所有参数是否满足发放条件
        boolean checkResult = giftService.checkAngrRedBagCondi(commodityVo, giftAccount,giftCount,giftNum,giftType,commodityId);
        if(!checkResult){
            throw new BizException(RespCode.GIFTPARAM_NOT_FUND);
        }
        //冻结礼包账户,生成流通记录,调用公共接口
        RespResult freezeResult = baseFreeze(commodityId, userLoginInfo.getUserInfoId(), AccountType.USER, giftNum, CommodityFlowType.GIFT_GIVE, null, "发红包-手气红包");
        if (!freezeResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            throw new BizException(RespCode.SERVER_BIZ_ERROR);
        }

        //添加商品礼包信息
        CommodityGiftInfo commodityGiftInfo = giftService.assCommodityGiftInfo(giftAccount.getGiftAccountId(),greeting,giftType,giftCount,giftNum,commodityId);
        HashMap<String, Object> map = (HashMap<String, Object>)freezeResult.getBody();
        CommodityFlowRecord outFlow = (CommodityFlowRecord)map.get("outFlow");
        CommodityFlowRecord freezeFlow = (CommodityFlowRecord)map.get("freezeFlow");
        commodityGiftInfo.setCommodityFlowRecordIds(outFlow.getCommodityFlowRecordId() + "," + freezeFlow.getCommodityFlowRecordId());
        giftService.inserCommodityGiftInfo(commodityGiftInfo);

        //添加发红包交易明细记录
        UserBizBrief userBizBrief = new UserBizBrief();
        userBizBrief.setUserInfoId(userLoginInfo.getUserInfoId());//用户Id
        userBizBrief.setCommodityContractId(commodityId);//商品合约Id
        userBizBrief.setBizType(PayBizType.GIVE_GIFT.getPersistKey());//业务类型Code
        userBizBrief.setBizId(commodityGiftInfo.getCommodityGiftInfoId().toString());//业务Id
        userBizBrief.setCreateTime(new Date());//创建时间

        userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());//商品类型ID
        userBizBrief.setCommodityName(commodityVo.getCommodityName());//商品名称
        userBizBrief.setOpCommodityUnitQuantity(commodityGiftInfo.getCommodityTotalQuantity());//操作商品数量
        AttachVo attachVo = new AttachVo();
        attachVo.setGiftTotalNum(commodityGiftInfo.getDoneeQuota());//红包总个数
        attachVo.setHaveAcceptGiftNum(0);
        attachVo.setRemark("已领0/"+commodityGiftInfo.getDoneeQuota()+"个");
        userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

        userBizBriefMapperExt.insertSelective(userBizBrief);

        return commodityGiftInfo;
    }

    /**
     * 抢红包业务的商品流通
     * @param donatorAccountId 赠与人基本账户id
     * @param donatorType 赠与人基本账户类型， @see {@link AccountType}
     * @param doneeAccountId 受赠人基本账户id
     * @param doneeType 受赠人基本账户类型 @see {@link AccountType}
     * @param commodityContractId 商品合约id
     * @param commodityUnitQuantity 商品单位数量   @return         */
    @Override
    public RespResult grabGiftFlow(long donatorAccountId, AccountType donatorType, long doneeAccountId, AccountType doneeType, long commodityContractId, BigDecimal commodityUnitQuantity) {
        RespResult respResult = super.baseUnfreeze(commodityContractId, donatorAccountId, donatorType, doneeAccountId, doneeType, commodityUnitQuantity, CommodityFlowType.GIFT_ACCEPT, null, "抢红包");
        return respResult;
    }

    /**
     * 商品调拨
     * @param giftAccountId 礼包账户id
     * @param availableOrFreezeAccount 操作可用账户还是冻结账户
     * @param commodityFlowType 操作业务类型
     * @param quantity 操作数量， 正数为增加当前操作账户的商品数量，负数为减少当前操作账户的商品数量
     * @param extendInfo 附加信息
     * @param remark 注释
     */
    @Override
    public void allot(long giftAccountId, String availableOrFreezeAccount, CommodityFlowType commodityFlowType, BigDecimal quantity, String extendInfo, String remark) {
        GiftAccount giftAccount = this.giftAccountMapperExt.selectByPrimaryKeyAndLock(giftAccountId);
        if (giftAccount == null) {
            throw new BizException(RespCode.GIFTACCOUNT_NOT_FUND);
        }

        Date currentTime = new Date();

        if ("available".equals(availableOrFreezeAccount)) {
            //操作可用账户
            BigDecimal beforeAvailableUnitQuantity = giftAccount.getAvailableUnitQuantity();
            BigDecimal afterAvailableUnitQuantity = beforeAvailableUnitQuantity.add(quantity);
            if (afterAvailableUnitQuantity.compareTo(BigDecimal.ZERO) == -1) {
                throw new BizException(RespCode.TRADE_NO_AVAILABLE);
            }
            //更新交易账户
            giftAccount.setAvailableUnitQuantity(afterAvailableUnitQuantity);
            giftAccount.setLastOpSeq(giftAccount.getLastOpSeq() + 1);
            giftAccount.setUpdateTime(currentTime);
            this.giftAccountMapperExt.updateByPrimaryKeySelective(giftAccount);

            //新增商品流通记录
            CommodityFlowRecord record = new CommodityFlowRecord();
            record.setGiftAccountId(giftAccountId);
            record.setGiftAccountOpSeq(giftAccount.getLastOpSeq());
            record.setType(CommodityFlowType.OTHER_SYS_TRANSFER_IN.getPersistKey());
            record.setAllotOrTransfer("allot");
            if (quantity.compareTo(BigDecimal.ZERO) == 1) {
                record.setInOrOut("in");
            }else {
                record.setInOrOut("out");
            }
            record.setBeforeUnitQuantity(beforeAvailableUnitQuantity);
            record.setTradeUnitQuantity(quantity.abs());
            record.setAfterUnitQuantity(afterAvailableUnitQuantity);
            //TODO 商品价格
            record.setTradeTime(currentTime);
            record.setExtendInfo(extendInfo);
            record.setRemark(remark);
            this.commodityFlowRecordMapperExt.insert(record);

        } else if ("freeze".equals(availableOrFreezeAccount)) {
            //操作冻结账户
            BigDecimal beforeFrozenUnitQuantity = giftAccount.getFrozenUnitQuantity();
            BigDecimal afterFrozenUnitQuantity = beforeFrozenUnitQuantity.add(quantity);
            if (afterFrozenUnitQuantity.compareTo(BigDecimal.ZERO) == -1) {
                throw new BizException(RespCode.TRADE_NO_AVAILABLE);
            }
            //更新交易账户
            giftAccount.setAvailableUnitQuantity(afterFrozenUnitQuantity);
            giftAccount.setLastOpSeq(giftAccount.getLastOpSeq() + 1);
            giftAccount.setUpdateTime(currentTime);
            this.giftAccountMapperExt.updateByPrimaryKeySelective(giftAccount);


            //新增商品流通记录
            CommodityFlowRecord record = new CommodityFlowRecord();
            record.setGiftAccountId(giftAccountId);
            record.setGiftAccountOpSeq(giftAccount.getLastOpSeq());
            record.setType(CommodityFlowType.OTHER_SYS_TRANSFER_IN.getPersistKey());
            record.setAllotOrTransfer("allot");
            if (quantity.compareTo(BigDecimal.ZERO) == 1) {
                record.setFreezeOrUnfreeze("freeze");
            }else {
                record.setFreezeOrUnfreeze("unfreeze");
            }
            record.setBeforeUnitQuantity(beforeFrozenUnitQuantity);
            record.setTradeUnitQuantity(quantity.abs());
            record.setAfterUnitQuantity(afterFrozenUnitQuantity);
            //TODO 商品价格
            record.setTradeTime(currentTime);
            record.setExtendInfo(extendInfo);
            record.setRemark(remark);
            this.commodityFlowRecordMapperExt.insert(record);
        }else{
            throw new BizException(RespCode.PARAMS_ERROR);
        }
    }

}
