package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.CommodityGiftInfo;
import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;

/**
 * 交易账户相关接口
 * Created by zhangyutao on 2017/3/15.
 */
public interface TradeAccountService {

    /**
     * 发红包业务的商品流通
     * @param giftCount 人数
     * @param giftNum 数量
     * @param giftType 类型
     * @param commodityId 商品Id
     * @param greeting 祝福语
     * @param userLoginInfo session信息
     * @return
     */
    CommodityGiftInfo giveGift(int giftCount, BigDecimal giftNum, short giftType, Long commodityId, String greeting, UserLoginInfo userLoginInfo) throws NoSuchAlgorithmException, IOException;

    /**
     * 抢红包业务的商品流通
     * @param donatorAccountId 赠与人基本账户id
     * @param donatorType 赠与人基本账户类型， @see {@link AccountType}
     * @param doneeAccountId 受赠人基本账户id
     * @param doneeType 受赠人基本账户类型 @see {@link AccountType}
     * @param commodityContractId 商品合约id
     * @param commodityUnitQuantity 商品单位数量   @return         */
    RespResult grabGiftFlow(long donatorAccountId, AccountType donatorType, long doneeAccountId, AccountType doneeType, long commodityContractId, BigDecimal commodityUnitQuantity);


    /**
     * 转账（可用区转至可用区）
     * 扣除转出方主账户对应交易账户可用区相应的商品数量
     * 新增转出方主账户对应交易账户商品转出流通记录
     * 增加转入方主账户交易账户可用区相应的商品数量
     * 新增转入方主账户对应交易账户商品转入流通记录
     * @param CommodityId           商品合约id
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
    RespResult baseTransfer(long CommodityId, long outAccountId, AccountType outAccountType, long inAccountId, AccountType inAccountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark);

    /**
     * 冻结(可用区转至冻结区)
     * 扣除当前主账户对应交易账户可用区相应的商品数量
     * 新增当前主账户对应交易账户商品转出流通记录
     * 新增当前主账户对应交易账户冻结区相应的商品数量
     * 新增当前主账户对应交易账户商品冻结流通记录
     * @param commodityId           商品合约id
     * @param accountId             用户id或运营商id
     * @param accountType           主账户类型 @see {@link AccountType}
     * @param commodityUnitQuantity 冻结的商品单位数量
     * @param commodityFlowType     流通业务类型 @see {@link CommodityFlowType}
     * @param extendInfo            附加信息
     * @param remark                描述
     * @return
     */
    RespResult baseFreeze(long commodityId, long accountId, AccountType accountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark);

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
    RespResult baseUnfreeze(long commodityId, long unfreezeAccountId, AccountType unfreezeAccountType,  long inAccountId, AccountType inAccountType, BigDecimal commodityUnitQuantity, CommodityFlowType commodityFlowType, String extendInfo, String remark);

    /**
     * 初始化交易账户
     * @param commodityId
     * @param accountId
     * @param accountType
     * @param remark
     * @return
     */
    RespResult createTradeAccount(long commodityId, long accountId, AccountType accountType, String remark);

    /**
     * 查询交易账户，如果不存在就开户
     * @return
     */
    RespResult findOrCreateTradeAccount(long commodityId, long accountId, AccountType accountType);

    /**
     * 查询交易账户
     * @param giftAccountId
     * @return
     */
    GiftAccount findTradeAccountById(long giftAccountId);

    /**
     * 商品调拨
     * @param giftAccountId 礼包账户id
     * @param availableOrFreezeAccount 操作可用账户还是冻结账户
     * @param commodityFlowType 操作业务类型
     * @param quantity 操作数量， 正数为增加当前操作账户的商品数量，负数为减少当前操作账户的商品数量
     * @param extendInfo 附加信息
     * @param remark 注释
     */
    void allot(long giftAccountId, String availableOrFreezeAccount, CommodityFlowType commodityFlowType, BigDecimal quantity, String extendInfo, String remark);
}
