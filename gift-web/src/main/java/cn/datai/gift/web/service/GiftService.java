package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.vo.tradeAccount.HoldCommodityInfo;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 收发礼包相关业务
 * Created by Administrator on 2017/3/14.
 */
public interface GiftService {

    /**
     *  通过id和code查询大红包信息
     * @param giftInfoId
     * @param code
     * @return
     */
    CommodityGiftInfo findGiftInfo(long giftInfoId, String code);

    /**
     * 根据主键查询红包信息
     * @param giftInfoId
     * @return
     */
    CommodityGiftInfo findGiftInfoById(long giftInfoId);

    /**
     * 根据主键查询小红包信息
     * @param commodityGiftDonationDetailId
     * @return
     */
    CommodityGiftDonationDetail queryCommodityGiftDonationDetailById(Long commodityGiftDonationDetailId);

    /**
     * 查询某个大红包下所有的转赠明细,如果受赠人id不为空，则查询所有所属的转赠明细
     * @param commodityGiftId 大礼包id
     * @param doneeUserId 受赠人用户id
     * @return
     */
    List<CommodityGiftDonationDetail> findGiftDonationDetail(long commodityGiftId, long doneeUserId);


    /**
     * 抢礼包
     * @param commodityGiftInfoId 礼包id
     * @param userInfoId 抢红包的用户id
     * @return
     */
    CommodityGiftDonationDetail grabGift(long commodityGiftInfoId, long userInfoId) throws IOException;


    BigDecimal grabGiftStrategy(BigDecimal commoditySurplusQuantity, int doneeSurplus, BigDecimal minGrabCommodityQuantity, BigDecimal maxGrabCommodityQuantity);

    /**
     * 通过交易账户id查询用户id
     * @param giftAccountId 交易账户id
     * @return
     */
    UserReltGiftAccount findUserReltGiftAccountByGiftAccountId(long giftAccountId);

    /**
     *用过用户Id查询 用户与礼包账户关系表
     * @param userInfoId
     * @return
     */
    List<UserReltGiftAccount> queryUserReltGiftAccountList(Long userInfoId);

    /**
     *通过礼包账户Id查询礼包相关信息
     * @param giftAccountId
     * @return
     */
    GiftAccount queryGiftAccount(Long giftAccountId);

    /**
     * 通过用户ID查询用户所持有的礼包信息
     * @param userInfoId
     * @return
     */
    List<GiftAccount> queryGiftAccountByUserInfoId(Long userInfoId);

    /**
     * 用户持仓展现
     * @param userInfoId
     * @return
     */
    List<HoldCommodityInfo> queryUserHoldCommodityList(Long userInfoId) throws IOException;

    /**
     * 检查商品合约状态
     * @param commodityContractId
     * @return
     */
    boolean checkCommodityContractStatus(Long commodityContractId);

    /**
     * 是否超过了最大可发数量
     */
    boolean isOverMaxquantity(GiftAccount giftAccount,BigDecimal quantity);

    /**
     * 是否超过最大人数
     * @param count
     * @return
     */
    boolean isOverMaxCount(int count);

    /**
     * 单个用户一个红包最多能够得到的数量
     * @param
     * @return
     */
    int getSinglePeopleAccept();

    /**
     *是否包含可发红包的类型
     * @param type
     * @return
     */
    boolean isContainGiveType(String type);

    /**
     * 通过用户Id和商品ID，查询并锁住礼包账户
     * @param userInfoId
     * @param commodityId
     * @return
     */
    GiftAccount findAndLockGiftAccountByUserIdAndCommodityId(Long userInfoId,Long commodityId);


    /**
     * 通过用户Id和商品ID，查询礼包账户
     * @param userInfoId
     * @param commodityId
     * @return
     */
    GiftAccount queryGiftAccountByUserIdAndCommodityId(Long userInfoId,Long commodityId);

    /**
     * 校验（拼手气红包）
     * @param commodityVo
     * @param giftAccount
     * @param giftCount
     * @param giftNum
     * @param giftType
     * @param commodityId
     * @return
     */
    boolean checkAngrRedBagCondi(CommodityVo commodityVo, GiftAccount giftAccount, int giftCount, BigDecimal giftNum, short giftType, Long commodityId);

    /**
     * 生成商品礼包信息
     * @param giftAccountId
     * @param greeting
     * @param giftType
     * @param giftCount
     * @param giftNum
     * @return
     */
    CommodityGiftInfo assCommodityGiftInfo(Long giftAccountId,String greeting,short giftType,int giftCount,BigDecimal giftNum,Long commodityId) throws NoSuchAlgorithmException;

    /**
     * 插入商品礼包信息
     * @param commodityGiftInfo
     */
    void inserCommodityGiftInfo(CommodityGiftInfo commodityGiftInfo);


    /**
     * 查询过期时间在一定范围内未处理的商品大礼包
     * @return
     */
    List<CommodityGiftInfo> selectExpiredGiftInfo(Date startExpiredTime, Date endExpiredTime);

    /**
     * 查询过期时间在一定范围内未处理的商品大礼包id
     * @return
     */
    List<Long> selectExpiredGiftInfoId(Date startExpiredTime, Date endExpiredTime);


    /**
     * 处理过期的红包，退还给赠与人
     * @return
     */
    boolean handleExpiredGiftInfo(long commodityGiftInfoId);

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
    boolean checkAverageRedBagCondi(CommodityVo commodityVo, GiftAccount giftAccount, int giftCount, BigDecimal giftNum, short giftType, Long commodityId);

    /**
     * 绑定手机号
     * @param userInfoId
     * @param mobile
     * @param code
     * @return
     */
    RespResult bindMobile(Long userInfoId,String mobile,String code,HttpServletRequest request) throws NoSuchAlgorithmException, IllegalAccessException, NoSuchMethodException, InvocationTargetException;


}
