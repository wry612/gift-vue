package cn.datai.gift.web.service;

import cn.datai.gift.persist.mapper.*;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangyutao on 2017/3/15.
 */
public abstract class BaseTradeAccountService implements TradeAccountService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private GiftAccountMapperExt giftAccountMapperExt;

    @Autowired
    private UserReltGiftAccountMapperExt userReltGiftAccountMapperExt;

    @Autowired
    private OperatorReltGiftAccountMapperExt operatorReltGiftAccountMapperExt;

    @Autowired
    private CommodityContractMapperExt commodityContractMapperExt;

    @Autowired
    private UserInfoMapperExt userInfoMapperExt;

    @Autowired
    private CommodityFlowRecordMapperExt commodityFlowRecordMapperExt;

    @Autowired
    private OperatorInfoMapperExt operatorInfoMapperExt;

    /**
     * 转账（可用区转至可用区）
     * 扣除转出方交易账户可用区相应的商品数量
     * 新增转出方商品转出流通记录
     * 增加转入方交易账户可用区相应的商品数量
     * 新增转入方商品转入流通记录
     *
     * @param outGiftAccountId      转出方交易账户
     * @param inGiftAccountId       转入方交易账户
     * @param commodityUnitQuantity 转移商品单位数量
     * @param commodityFlowType     流通业务类型
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    private RespResult baseTransfer(long outGiftAccountId, long inGiftAccountId, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        Date date = new Date();
        GiftAccount outGiftAccount = giftAccountMapperExt.selectByPrimaryKeyAndLock(outGiftAccountId);
        GiftAccount inGiftAccount = giftAccountMapperExt.selectByPrimaryKeyAndLock(inGiftAccountId);

        //转出账户可用余额不足
        BigDecimal beforeAvailableUnitQty = outGiftAccount.getAvailableUnitQuantity();
        if (beforeAvailableUnitQty.compareTo(commodityUnitQuantity) == -1) {
            logger.warn("需扣除账户的可用数量不足");
            throw new BizException(RespCode.TRADE_NO_AVAILABLE);
        }
        BigDecimal outAfterAvailableUnitQty = beforeAvailableUnitQty.subtract(commodityUnitQuantity);
        outGiftAccount.setAvailableUnitQuantity(outAfterAvailableUnitQty);
        long newOutOpSeq = outGiftAccount.getLastOpSeq() + 1;
        outGiftAccount.setLastOpSeq(newOutOpSeq);
        outGiftAccount.setUpdateTime(date);
        giftAccountMapperExt.updateByPrimaryKeySelective(outGiftAccount);

        //转出商品流通记录
        CommodityFlowRecord outCommodityFlowRecord = new CommodityFlowRecord();
        outCommodityFlowRecord.setGiftAccountId(outGiftAccountId);
        outCommodityFlowRecord.setGiftAccountOpSeq(newOutOpSeq);
        outCommodityFlowRecord.setOpponentGiftAccountId(inGiftAccountId);
        outCommodityFlowRecord.setType(commodityFlowType.getPersistKey());
        outCommodityFlowRecord.setAllotOrTransfer("transfer");
        outCommodityFlowRecord.setInOrOut("out");
        outCommodityFlowRecord.setBeforeUnitQuantity(beforeAvailableUnitQty);
        outCommodityFlowRecord.setTradeUnitQuantity(commodityUnitQuantity);
        outCommodityFlowRecord.setAfterUnitQuantity(outAfterAvailableUnitQty);
        outCommodityFlowRecord.setTradeTime(date);
        commodityFlowRecordMapperExt.insert(outCommodityFlowRecord);


        BigDecimal inBeforeAvailableUnitQty = inGiftAccount.getAvailableUnitQuantity();
        BigDecimal inAfterAvailableUnitQty = inBeforeAvailableUnitQty.add(commodityUnitQuantity);
        inGiftAccount.setAvailableUnitQuantity(inAfterAvailableUnitQty);
        long newInOpSeq = inGiftAccount.getLastOpSeq() + 1;
        inGiftAccount.setLastOpSeq(newInOpSeq);
        inGiftAccount.setUpdateTime(date);
        giftAccountMapperExt.updateByPrimaryKeySelective(inGiftAccount);


        //转入商品流通记录
        CommodityFlowRecord inCommodityFlowRecord = new CommodityFlowRecord();
        inCommodityFlowRecord.setGiftAccountId(inGiftAccountId);
        inCommodityFlowRecord.setGiftAccountOpSeq(newInOpSeq);
        inCommodityFlowRecord.setOpponentGiftAccountId(outGiftAccountId);
        inCommodityFlowRecord.setType(commodityFlowType.getPersistKey());
        inCommodityFlowRecord.setAllotOrTransfer("transfer");
        inCommodityFlowRecord.setInOrOut("in");
        inCommodityFlowRecord.setBeforeUnitQuantity(inBeforeAvailableUnitQty);
        inCommodityFlowRecord.setTradeUnitQuantity(commodityUnitQuantity);
        inCommodityFlowRecord.setAfterUnitQuantity(inAfterAvailableUnitQty);
        inCommodityFlowRecord.setTradeTime(date);
        commodityFlowRecordMapperExt.insert(inCommodityFlowRecord);

        HashMap<String, Object> resultBody = new HashMap<>();
        resultBody.put("outGiftAccount", outGiftAccount);
        resultBody.put("outCommodityFlowRecord", outCommodityFlowRecord);
        resultBody.put("inGiftAccount", inGiftAccount);
        resultBody.put("inCommodityFlowRecord", inCommodityFlowRecord);

        return new RespResult(RespCode.SUCCESS, resultBody);
    }

    /**
     * 转账（可用区转至可用区）
     * 扣除转出方主账户对应交易账户可用区相应的商品数量
     * 新增转出方主账户对应交易账户商品转出流通记录
     * 增加转入方主账户交易账户可用区相应的商品数量
     * 新增转入方主账户对应交易账户商品转入流通记录
     *
     * @param commodityId           商品合约id
     * @param outAccountId          转出的用户id或运营商id
     * @param outAccountType        转出账户类型 @see {@link AccountType}
     * @param inAccountId           转入的用户id或运营商id
     * @param inAccountType         转入账户类型 @see {@link AccountType}
     * @param commodityUnitQuantity 转移商品单位数量
     * @param commodityFlowType     流通业务类型 @see {@link CommodityFlowType}
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult baseTransfer(long commodityId, long outAccountId, AccountType outAccountType, long inAccountId, AccountType inAccountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        RespResult outTradeAccountResult = this.findOrCreateTradeAccount(commodityId, outAccountId, outAccountType);
        RespResult inTradeAccountResult = this.findOrCreateTradeAccount(commodityId, inAccountId, inAccountType);

        if (outTradeAccountResult.getCode().equals(RespCode.SUCCESS.getCode()) && inTradeAccountResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            GiftAccount outTradeAccount = (GiftAccount)outTradeAccountResult.getBody();
            GiftAccount inTradeAccount = (GiftAccount)inTradeAccountResult.getBody();
            return this.baseTransfer(outTradeAccount.getGiftAccountId(), inTradeAccount.getGiftAccountId(), commodityUnitQuantity, commodityFlowType, extendInfo, remark);
        }else{
            return outTradeAccountResult;
        }
    }

    /**
     * 冻结(可用区转至冻结区)
     * 扣除当前交易账户可用区相应的商品数量
     * 新增当前交易账户商品转出流通记录
     * 新增当前交易账户冻结区相应的商品数量
     * 新增当前交易账户商品冻结流通记录
     * @param giftAccountId         交易账户id
     * @param commodityUnitQuantity 冻结的商品单位数量
     * @param commodityFlowType     流通业务类型
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    private RespResult baseFreeze(long giftAccountId, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        Date operateTime = new Date();
        GiftAccount giftAccount = giftAccountMapperExt.selectByPrimaryKeyAndLock(giftAccountId);
        logger.debug("冻结----礼包账户：{}", giftAccount);

        //校验交易规则
        BigDecimal beforeAvailableUnitQuantity = giftAccount.getAvailableUnitQuantity();
        logger.debug("冻结----操作前的可用商品数量：{}", beforeAvailableUnitQuantity);
        BigDecimal afterAvailableUnitQuantity = beforeAvailableUnitQuantity.subtract(commodityUnitQuantity);
        logger.debug("冻结----操作后的可用商品数量：{}", afterAvailableUnitQuantity);
        if (afterAvailableUnitQuantity.compareTo(BigDecimal.ZERO) == -1) {
            logger.error("冻结----发生交易后的可用商品数量:{}， 小于0，不可交易", afterAvailableUnitQuantity);
            throw new BizException(RespCode.TRADE_NO_AVAILABLE);
        }

        BigDecimal beforeFrozenUnitQuantity = giftAccount.getFrozenUnitQuantity();
        logger.debug("冻结----操作前的冻结商品数量：", beforeFrozenUnitQuantity);

        BigDecimal afterFrozenUnitQuantity = beforeFrozenUnitQuantity.add(commodityUnitQuantity);
        logger.debug("冻结----操作后的冻结商品数量：", afterFrozenUnitQuantity);

        //新增转出类型商品流通记录
        CommodityFlowRecord commodityFlowRecord = new CommodityFlowRecord();
        commodityFlowRecord.setGiftAccountId(giftAccountId);
        Long lastOpSeq1 = giftAccount.getLastOpSeq() + 1;
        commodityFlowRecord.setGiftAccountOpSeq(lastOpSeq1);
        commodityFlowRecord.setOpponentGiftAccountId(giftAccountId);
        commodityFlowRecord.setType(commodityFlowType.getPersistKey());
        commodityFlowRecord.setAllotOrTransfer("transfer");
        commodityFlowRecord.setInOrOut("out");
        commodityFlowRecord.setBeforeUnitQuantity(beforeAvailableUnitQuantity);
        commodityFlowRecord.setTradeUnitQuantity(commodityUnitQuantity);
        commodityFlowRecord.setAfterUnitQuantity(afterAvailableUnitQuantity);
        commodityFlowRecord.setTradeTime(operateTime);
        logger.debug("冻结---新增转出类型商品流通记录：{}", commodityFlowRecord);
        commodityFlowRecordMapperExt.insert(commodityFlowRecord);

        //新增冻结类型商品流通记录
        CommodityFlowRecord commodityFlowRecord2 = new CommodityFlowRecord();
        commodityFlowRecord2.setGiftAccountId(giftAccountId);
        Long lastOpSeq2 = lastOpSeq1 + 1;
        commodityFlowRecord2.setGiftAccountOpSeq(lastOpSeq2);
        commodityFlowRecord2.setOpponentGiftAccountId(giftAccountId);
        commodityFlowRecord2.setType(commodityFlowType.getPersistKey());
        commodityFlowRecord2.setAllotOrTransfer("transfer");
        commodityFlowRecord2.setFreezeOrUnfreeze("freeze");
        commodityFlowRecord2.setBeforeUnitQuantity(beforeFrozenUnitQuantity);
        commodityFlowRecord2.setTradeUnitQuantity(commodityUnitQuantity);
        commodityFlowRecord2.setAfterUnitQuantity(afterFrozenUnitQuantity);
        commodityFlowRecord2.setTradeTime(operateTime);
        logger.debug("冻结---新增冻结类型商品流通记录：{}", commodityFlowRecord);
        commodityFlowRecordMapperExt.insert(commodityFlowRecord2);

        //更新交易账户信息
        giftAccount.setAvailableUnitQuantity(afterAvailableUnitQuantity);
        giftAccount.setFrozenUnitQuantity(afterFrozenUnitQuantity);
        giftAccount.setUpdateTime(operateTime);
        giftAccount.setLastOpSeq(lastOpSeq2);
        logger.debug("冻结----操作完成后交易账户明细：{}", giftAccount);
        giftAccountMapperExt.updateByPrimaryKeySelective(giftAccount);

        HashMap<String, Object> resultBody = new HashMap<>();
        resultBody.put("giftAccount", giftAccount);
        resultBody.put("outFlow", commodityFlowRecord);
        resultBody.put("freezeFlow", commodityFlowRecord2);
        return new RespResult(RespCode.SUCCESS, resultBody);
    }

    /**
     * 冻结(可用区转至冻结区)
     * 扣除当前主账户对应交易账户可用区相应的商品数量
     * 新增当前主账户对应交易账户商品转出流通记录
     * 新增当前主账户对应交易账户冻结区相应的商品数量
     * 新增当前主账户对应交易账户商品冻结流通记录
     *
     * @param commodityId           商品合约id
     * @param accountId             用户id或运营商id
     * @param accountType           主账户类型 @see {@link AccountType}
     * @param commodityUnitQuantity 冻结的商品单位数量
     * @param commodityFlowType     流通业务类型 @see {@link CommodityFlowType}
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult baseFreeze(long commodityId, long accountId, AccountType accountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        RespResult tradeAccountResult = this.findOrCreateTradeAccount(commodityId, accountId, accountType);
        logger.debug("查询或创建的交易账户信息：{}", JSONObject.toJSONString(tradeAccountResult));
        if (tradeAccountResult.getCode().equals(RespCode.SUCCESS.getCode())) {
            GiftAccount giftAccount = (GiftAccount)tradeAccountResult.getBody();
            return this.baseFreeze(giftAccount.getGiftAccountId(), commodityUnitQuantity, commodityFlowType, extendInfo, remark);
        }else{
            return tradeAccountResult;
        }
    }

    /**
     * 解冻（冻结区转至可用区）
     * 扣除冻结方交易账户冻结区的商品数量
     * 新增冻结方交易账户商品解冻流通记录
     * 新增解冻后资金流入的交易账户可用区的商品数量
     * 新增解冻后资金流入的交易账户商品转入流通记录
     *
     * @param unfreezeGiftAccountId   冻结方交易账户id
     * @param inGiftAccountId       解冻后资金流入的交易账户id
     * @param commodityUnitQuantity 解冻的商品单位数量
     * @param commodityFlowType     流通业务类型 @see {@link CommodityFlowType}
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    private RespResult baseUnfreeze(long unfreezeGiftAccountId, long inGiftAccountId, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        Date operateTime = new Date();
        GiftAccount unfreezeTradeAccount = giftAccountMapperExt.selectByPrimaryKeyAndLock(unfreezeGiftAccountId);

        BigDecimal beforeFrozenUnitQuantity = unfreezeTradeAccount.getFrozenUnitQuantity();
        BigDecimal afterFrozenUnitQuantity = beforeFrozenUnitQuantity.subtract(commodityUnitQuantity);
        //校验交易规则
        if (afterFrozenUnitQuantity.compareTo(BigDecimal.ZERO) == -1) {
            throw new BizException(RespCode.TRADE_UNFREEZE_NO_AVAILABLE);
        }

        //更新需要解冻的账户
        long newUnfreezeOpSeq = unfreezeTradeAccount.getLastOpSeq() + 1L;
        unfreezeTradeAccount.setLastOpSeq(newUnfreezeOpSeq);
        unfreezeTradeAccount.setFrozenUnitQuantity(afterFrozenUnitQuantity);
        unfreezeTradeAccount.setUpdateTime(operateTime);
        giftAccountMapperExt.updateByPrimaryKeySelective(unfreezeTradeAccount);
        //新增解冻明细
        CommodityFlowRecord unfreezeCommodityFlowRecord = new CommodityFlowRecord();
        unfreezeCommodityFlowRecord.setGiftAccountId(unfreezeGiftAccountId);
        unfreezeCommodityFlowRecord.setGiftAccountOpSeq(newUnfreezeOpSeq);
        unfreezeCommodityFlowRecord.setOpponentGiftAccountId(inGiftAccountId);
        unfreezeCommodityFlowRecord.setType(commodityFlowType.getPersistKey());
        if (inGiftAccountId == 0L) {
            //存在转入的账户不存在，说明是从本系统转出至外部
            unfreezeCommodityFlowRecord.setAllotOrTransfer("allot");
        }else{
            //内部流转
            unfreezeCommodityFlowRecord.setAllotOrTransfer("transfer");
        }
        unfreezeCommodityFlowRecord.setFreezeOrUnfreeze("unfreeze");
        unfreezeCommodityFlowRecord.setBeforeUnitQuantity(beforeFrozenUnitQuantity);
        unfreezeCommodityFlowRecord.setTradeUnitQuantity(commodityUnitQuantity);
        unfreezeCommodityFlowRecord.setAfterUnitQuantity(afterFrozenUnitQuantity);
        unfreezeCommodityFlowRecord.setTradeTime(operateTime);
        commodityFlowRecordMapperExt.insert(unfreezeCommodityFlowRecord);


        GiftAccount inTradeAccount = null;
        CommodityFlowRecord inCommodityFlowRecord = null;
        //更新转入的账户
        if (inGiftAccountId != 0L) {
            //内部流转才有转入账户
            inTradeAccount = giftAccountMapperExt.selectByPrimaryKeyAndLock(inGiftAccountId);
            BigDecimal beforeAvailableUnitQuantity = inTradeAccount.getAvailableUnitQuantity();
            BigDecimal afterAvailableUnitQuantity = beforeAvailableUnitQuantity.add(commodityUnitQuantity);
            long newInOpSeq = inTradeAccount.getLastOpSeq() + 1L;

            inTradeAccount.setLastOpSeq(newInOpSeq);
            inTradeAccount.setAvailableUnitQuantity(afterAvailableUnitQuantity);
            inTradeAccount.setUpdateTime(operateTime);
            giftAccountMapperExt.updateByPrimaryKeySelective(inTradeAccount);
            //新增转入明细
            inCommodityFlowRecord = new CommodityFlowRecord();
            inCommodityFlowRecord.setGiftAccountId(inGiftAccountId);
            inCommodityFlowRecord.setGiftAccountOpSeq(newInOpSeq);
            inCommodityFlowRecord.setOpponentGiftAccountId(unfreezeGiftAccountId);
            inCommodityFlowRecord.setType(commodityFlowType.getPersistKey());
            inCommodityFlowRecord.setAllotOrTransfer("transfer");
            inCommodityFlowRecord.setInOrOut("in");
            inCommodityFlowRecord.setBeforeUnitQuantity(beforeAvailableUnitQuantity);
            inCommodityFlowRecord.setTradeUnitQuantity(commodityUnitQuantity);
            inCommodityFlowRecord.setAfterUnitQuantity(afterAvailableUnitQuantity);
            inCommodityFlowRecord.setTradeTime(operateTime);
            commodityFlowRecordMapperExt.insert(inCommodityFlowRecord);
        }


        HashMap<String, Object> resultBody = new HashMap<>();
        resultBody.put("unfreezeGiftAccount", unfreezeTradeAccount);
        resultBody.put("unfreezeFlow", unfreezeCommodityFlowRecord);
        resultBody.put("inGiftAccount", inTradeAccount);
        resultBody.put("inFlow", inCommodityFlowRecord);
        return new RespResult(RespCode.SUCCESS, resultBody);
    }

    /**
     * 解冻（冻结区转至可用区）
     * 扣除解冻方交易账户冻结区的商品数量
     * 新增解冻方交易账户商品解冻流通记录
     * 新增解冻后商品流入的交易账户可用区的商品数量
     * 新增解冻后商品流入的交易账户商品转入流通记录
     *
     * @param commodityId           商品合约id
     * @param unfreezeAccountId     需要被解冻的账户id（用户id或运营商id）
     * @param unfreezeAccountType   需要被解冻方的账户类型 @see {@link AccountType}
     * @param inAccountId           解冻后商品流入的主账号id（用户id或运营商id）
     * @param inAccountType         解冻后商品流入的主账号id类型 @see {@link AccountType}
     * @param commodityUnitQuantity 解冻的商品单位数量
     * @param commodityFlowType     流通业务类型 @see {@link CommodityFlowType}
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult baseUnfreeze(long commodityId, long unfreezeAccountId, AccountType unfreezeAccountType, long inAccountId, AccountType inAccountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark) {
        RespResult unfreezeTradeAccountResult = this.findOrCreateTradeAccount(commodityId, unfreezeAccountId, unfreezeAccountType);

        RespResult inTradeAccountResult = null;
        if (inAccountId != 0L) {
            inTradeAccountResult = this.findOrCreateTradeAccount(commodityId, inAccountId, inAccountType);
        }
        if ( unfreezeTradeAccountResult.getCode().equals(RespCode.SUCCESS.getCode()) && ( inTradeAccountResult == null || inTradeAccountResult.getCode().equals(RespCode.SUCCESS.getCode()) ) ) {
            GiftAccount unfreezeGiftAccount = (GiftAccount)unfreezeTradeAccountResult.getBody();
            if (inAccountId == 0L) {
                //转出本系统，不需要转入的账户
                return this.baseUnfreeze(unfreezeGiftAccount.getGiftAccountId(), 0L, commodityUnitQuantity, commodityFlowType, extendInfo, remark);
            }else {
                GiftAccount inGiftAccount = (GiftAccount)inTradeAccountResult.getBody();
                return this.baseUnfreeze(unfreezeGiftAccount.getGiftAccountId(), inGiftAccount.getGiftAccountId(), commodityUnitQuantity, commodityFlowType, extendInfo, remark);
            }
        }
        throw new BizException(RespCode.CREATE_TRADE_ACCOUNT_ERROR);
    }

    /**
     * 开户（交易账户）
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult createTradeAccount(long commodityId, long accountId, AccountType accountType, String remark){

        //检查商品id
        CommodityContract commodityContract = commodityContractMapperExt.selectByPrimaryKey(commodityId);
        if (commodityContract == null) {
            throw new BizException(RespCode.COMMODITY_NOT_FUND);
        }

        Date createTime = new Date();

        if (accountType.equals(AccountType.USER)) {
            //检查账户id
            UserInfo userInfo = userInfoMapperExt.selectByPrimaryKey(accountId);
            if (userInfo == null) {
                throw new BizException(RespCode.USER_NOT_FOUND);
            }

            GiftAccount giftAccount = new GiftAccount();
            giftAccount.setCommodityContractId(commodityId);
            giftAccount.setLastOpSeq(0L);
            giftAccount.setAvailableUnitQuantity(BigDecimal.ZERO);
            giftAccount.setFrozenUnitQuantity(BigDecimal.ZERO);
            giftAccount.setUpdateTime(createTime);
            giftAccount.setCreateTime(createTime);
            giftAccount.setType(accountType.getPersistKey());
            giftAccountMapperExt.insert(giftAccount);

            UserReltGiftAccount userReltGiftAccount = new UserReltGiftAccount();
            userReltGiftAccount.setUserInfoId(accountId);
            userReltGiftAccount.setGiftAccountId(giftAccount.getGiftAccountId());
            userReltGiftAccount.setCommodityContractId(commodityId);
            userReltGiftAccount.setCreateTime(createTime);
            userReltGiftAccountMapperExt.insert(userReltGiftAccount);

            logger.info("创建用户交易账户成功,交易账户为：{}", JSONObject.toJSONString(giftAccount));
            return new RespResult(RespCode.SUCCESS, giftAccount);
        }

        if (accountType.equals(AccountType.OPERATOR)) {
            //检查账户id
            OperatorInfo operatorInfo = operatorInfoMapperExt.selectByPrimaryKey(accountId);
            if (operatorInfo == null) {
                throw new BizException(RespCode.OPERATOR_NOT_FOUND);
            }

            GiftAccount giftAccount = new GiftAccount();
            giftAccount.setCommodityContractId(commodityId);
            giftAccount.setLastOpSeq(0L);
            giftAccount.setAvailableUnitQuantity(BigDecimal.ZERO);
            giftAccount.setFrozenUnitQuantity(BigDecimal.ZERO);
            giftAccount.setUpdateTime(createTime);
            giftAccount.setCreateTime(createTime);
            giftAccount.setType(accountType.getPersistKey());
            giftAccountMapperExt.insert(giftAccount);


            OperatorReltGiftAccount operatorReltGiftAccount = new OperatorReltGiftAccount();
            operatorReltGiftAccount.setOperatorInfoId(accountId);
            operatorReltGiftAccount.setGiftAccountId(giftAccount.getGiftAccountId());
            operatorReltGiftAccount.setCommodityContractId(commodityId);
            operatorReltGiftAccount.setCreateTime(createTime);
            operatorReltGiftAccountMapperExt.insertSelective(operatorReltGiftAccount);

            logger.info("创建运营商交易账户成功,交易账户为：{}", JSONObject.toJSONString(giftAccount));
            return new RespResult(RespCode.SUCCESS, giftAccount);
        }


        return new RespResult(RespCode.FAIL);
    }

    /**
     * 查询交易账户，如果不存在就开户
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult findOrCreateTradeAccount(long commodityId, long accountId, AccountType accountType){
        logger.debug("查询或创建交易账户----参数----commodityId:{}, accountId:{}, accountType: {}", commodityId, accountId, accountType);
        if (accountType.equals(AccountType.USER)) {
            UserReltGiftAccountExample userReltGiftAccountExample = new UserReltGiftAccountExample();
            userReltGiftAccountExample.or().andUserInfoIdEqualTo(accountId).andCommodityContractIdEqualTo(commodityId);
            List<UserReltGiftAccount> userReltGiftAccounts = userReltGiftAccountMapperExt.selectByExample(userReltGiftAccountExample);
            if (userReltGiftAccounts.isEmpty()) {
                logger.info("{}:{}没有关于商品{}的交易账户", accountType.getValue(), accountId, commodityId);
                RespResult createResult = this.createTradeAccount(commodityId, accountId, accountType, null);
                if (createResult.getCode().equals(RespCode.SUCCESS.getCode())) {
                    return new RespResult(RespCode.SUCCESS, createResult.getBody());
                }
            }else {
                GiftAccount giftAccount = this.giftAccountMapperExt.selectByPrimaryKey(userReltGiftAccounts.get(0).getGiftAccountId());
                return new RespResult(RespCode.SUCCESS, giftAccount);
            }
        }
        if (accountType.equals(AccountType.OPERATOR)) {
            OperatorReltGiftAccountExample example = new OperatorReltGiftAccountExample();
            example.or().andCommodityContractIdEqualTo(commodityId).andOperatorInfoIdEqualTo(accountId);
            List<OperatorReltGiftAccount> operatorReltGiftAccountList = operatorReltGiftAccountMapperExt.selectByExample(example);
            if (operatorReltGiftAccountList.isEmpty()) {
                logger.info("{}:{}没有关于商品{}的交易账户", accountType.getValue(), accountId, commodityId);
                RespResult createResult = this.createTradeAccount(commodityId, accountId, accountType, null);
                if (createResult.getCode().equals(RespCode.SUCCESS.getCode())) {
                    return new RespResult(RespCode.SUCCESS, createResult.getBody());
                }
            }else {
                GiftAccount giftAccount = this.giftAccountMapperExt.selectByPrimaryKey(operatorReltGiftAccountList.get(0).getGiftAccountId());
                return new RespResult(RespCode.SUCCESS, giftAccount);
            }
        }
        return new RespResult(RespCode.FAIL);
    }

    /**
     * 查询交易账户
     * @param giftAccountId
     * @return
     */
    @Override
    public GiftAccount findTradeAccountById(long giftAccountId) {
        GiftAccount giftAccount = giftAccountMapperExt.selectByPrimaryKey(giftAccountId);
        logger.info("查询出交易账户信息：{}", giftAccount);
        return giftAccount;
    }

}
