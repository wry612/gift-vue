package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.TradeOrderMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.enums.*;
import cn.datai.gift.web.service.*;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/19.
 */
@Service
public class BuyCommodityServiceImpl implements BuyCommodityService {

    private static final Logger logger = LoggerFactory.getLogger(BuyCommodityServiceImpl.class);


    @Autowired
    private TradeService tradeService;

    @Autowired
    private PayService payService;

    @Autowired
    private TradeOrderMapperExt tradeOrderMapperExt;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private TradeDetailService tradeDetailService;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    @Autowired
    private CommodityService commodityService;

    /**
     * 购买商商品
     *
     * @param userInfoId   用户ID
     * @param commodityId  商品Id
     * @param quantity     购买数量
     * @param quantityType 购买的类型（毫升、瓶、克、饼）
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public PayInfo buyCommodity(long userInfoId, long commodityId, BigDecimal quantity, BigDecimal quantityType) throws IOException {
        boolean checkResult = this.checkParams(quantity,quantityType);
        if(!checkResult){
            throw new BizException(RespCode.PARAMS_IS_NOT_ERROR);
        }

        //检查提货有效日期
        CommodityVo commodityVo = this.commodityService.findById(commodityId);
        if(commodityVo.getExpireTime().getTime() <System.currentTimeMillis()){
            throw new BizException(RespCode.OVER_EXPIRE_TIME);
        }

        String[] conStr = new String[]{};//目前默认没有优惠券
        RespResult respResult = tradeService.order(userInfoId, PayBizType.BUY_COMMODITY,commodityId,quantity,conStr,quantityType,PayBizType.BUY_COMMODITY.getName());
        //创建支付订单
        TradeOrder tradeOrder = (TradeOrder)respResult.getBody();
        long amount = tradeOrder.getActualPrice();//支付金额
        if(amount <= 0){
            this.updateBuyCommodityInfoNoPay(tradeOrder, commodityVo);
            return null;
        }else{
            PayInfo payInfo = payService.createPayOrder(userInfoId, 1L, amount, PayBizType.BUY_COMMODITY, tradeOrder.getTradeOrderId().toString(), tradeOrder.getExpireTime(), "test");
            //更新收支信息
            tradeOrder.setIncomePayInfo(payInfo.getPayInfoId().toString());
            tradeOrderMapperExt.updateByPrimaryKeySelective(tradeOrder);
            return payInfo;
        }
    }

    /**
     * 购买商品支付成功之后的操作(需要检查订单状态是否正常)
     *
     * @param payInfoId
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    public void paidBuyCommodity(Long payInfoId) throws WxPayNetException, IOException {
        TradeOrderExample example = new TradeOrderExample();
        example.or().andIncomePayInfoEqualTo(payInfoId.toString());
        List<TradeOrder> tradeOrders = tradeOrderMapperExt.selectByExample(example);
        if (tradeOrders == null || tradeOrders.isEmpty() || tradeOrders.size() > 1) {
            throw new BizException(RespCode.SERVER_ERROR);
        }
        TradeOrder tradeOrder = tradeOrders.get(0);
        if (TradeOrderStatus.valueOf(tradeOrder.getStatus()).equals(TradeOrderStatus.CANCELLED)) {
            //支付成功以后，发现订单已取消， 发起退款流程
            payService.refund(payInfoId);
        }else {
            //支付完成，且订单没有取消
            //上锁基本支付信息，重新判断是否已处理关联的业务订单
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfoId);
            if ("true".equals(payInfo.getBizProcessed())) {
                throw new BizException(RespCode.PAY_BIZ_PROCEESSED);
            }
            payInfo.setBizProcessed("true");
            payInfoMapperExt.updateByPrimaryKeySelective(payInfo);

            //成功购买商品
            this.successBuyCommodity(tradeOrder);
        }
    }


    /**
     * 订单未取消而且支付成功以后执行的操作
     * @param tradeOrder
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void successBuyCommodity(TradeOrder tradeOrder) throws IOException {
        TradeOrder tradeOrder1 = tradeOrderMapperExt.selectByPrimaryKeyAndLock(tradeOrder.getTradeOrderId());
        if (!tradeOrder.equals(tradeOrder1)) {
            throw new BizException(RespCode.SERVER_BUSY);
        }
        tradeOrder.setStatus(TradeOrderStatus.SUCCESS.getPersistKey());
        tradeOrder.setSuccessTime(new Date());
        tradeOrderMapperExt.updateByPrimaryKeySelective(tradeOrder);

        BigDecimal unitQuantity = convertToUnitQuantity(tradeOrder);
        this.tradeAccountService.baseUnfreeze(tradeOrder.getCommodityId(),tradeOrder.getOpponentAccountId(), AccountType.OPERATOR,tradeOrder.getAccountId(),AccountType.USER,unitQuantity, CommodityFlowType.BUY,"买商品付款后的解冻","买商品付款后的解冻");

        //更新交易明细列表
        UserBizBriefExample example = new UserBizBriefExample();
        example.or().andBizIdEqualTo(tradeOrder1.getTradeOrderId().toString()).andBizTypeEqualTo(PayBizType.BUY_COMMODITY.getPersistKey());
        List<UserBizBrief> userBizBriefs = this.userBizBriefMapperExt.selectByExample(example);

        if (userBizBriefs == null || userBizBriefs.isEmpty() || userBizBriefs.size() > 1) {
            throw new BizException(RespCode.SERVER_ERROR);
        }else{
            UserBizBrief userBizBrief = new UserBizBrief();
            userBizBrief.setUserlBizBriefId(userBizBriefs.get(0).getUserlBizBriefId());
            userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
            this.userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
        }
    }


    /**
     * 取消购买操作(下单完成，但是没有付款)
     * @param tradeOrderId
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void cancelBuyCommodityInfo(Long tradeOrderId,Long userInfoId) throws WxPayNetException, IOException {
        TradeOrder tradeOrder = tradeOrderMapperExt.selectByPrimaryKeyAndLock(tradeOrderId);
        if(!tradeOrder.getAccountId().equals(userInfoId)){
            throw new BizException(RespCode.NOT_FIND_RECORD);
        }

        if(tradeOrder.getStatus().equals(TradeOrderStatus.NOPAY.getPersistKey())){

            //检查支付状态，先判断是否支付完成，如果已支付，就不能取消
            String payInfoId = tradeOrder.getIncomePayInfo();
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(Long.valueOf(payInfoId));
            if (payInfo.getStatus().equals(PayInfoStatus.SUCCESS.getPersistKey())) {
                //如果已支付，就走支付完成逻辑
                payService.afterPayBizHandlerSimple(payInfo);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(tradeOrderId, PayBizType.BUY_COMMODITY.getPersistKey());
                if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1 ||!userBizBriefList.get(0).getUserInfoId().equals(userInfoId)){
                    throw new BizException(RespCode.NOT_FIND_RECORD);
                }
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }
            else {
                //如果未支付，就可以取消
                BigDecimal unitQuantity = convertToUnitQuantity(tradeOrder);
                tradeAccountService.baseUnfreeze(tradeOrder.getCommodityId(),tradeOrder.getOpponentAccountId(),AccountType.OPERATOR,tradeOrder.getOpponentAccountId(),AccountType.OPERATOR, unitQuantity,CommodityFlowType.BUY_CANCEL,"购买退还商品","购买退还商品");
                tradeOrder.setStatus(TradeOrderStatus.CANCELLED.getPersistKey());
                tradeOrderMapperExt.updateByPrimaryKeySelective(tradeOrder);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(tradeOrderId, PayBizType.BUY_COMMODITY.getPersistKey());
                if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1 ||!userBizBriefList.get(0).getUserInfoId().equals(userInfoId)){
                    throw new BizException(RespCode.NOT_FIND_RECORD);
                }
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(TradeOrderStatus.CANCELLED.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }
        }else {
            throw new BizException(RespCode.SERVER_BUSY);
        }
    }

    private BigDecimal convertToUnitQuantity(TradeOrder tradeOrder) throws IOException {
        BigDecimal unitQuantity;
        BigDecimal commodityUnitQuantity = tradeOrder.getCommodityUnitQuantity();
        BigDecimal commodityStandardQuantity = tradeOrder.getCommodityStandardQuantity();
        if (commodityUnitQuantity != null) {
            unitQuantity = commodityUnitQuantity;
        } else if (commodityStandardQuantity != null) {
            CommodityVo commodityVo = commodityService.findById(tradeOrder.getCommodityId());
            unitQuantity = commodityStandardQuantity.multiply(commodityVo.getStandardUnitMultiple());
        }else {
            throw new BizException(RespCode.SERVER_ERROR);
        }
        return unitQuantity;
    }

    /**
     * 定时任务超时 取消购买操作(下单完成，但是没有付款，不需要验证用户信息)
     * @param tradeOrderId
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void cancelExpireBuyCommodityInfo(Long tradeOrderId) throws WxPayNetException, IOException {
        TradeOrder tradeOrder = tradeOrderMapperExt.selectByPrimaryKeyAndLock(tradeOrderId);
        if(tradeOrder.getStatus().equals(TradeOrderStatus.NOPAY.getPersistKey())){
            //检查支付状态，先判断是否支付完成，如果已支付，就不能取消
            String payInfoId = tradeOrder.getIncomePayInfo();
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(Long.valueOf(payInfoId));
            if (payInfo.getStatus().equals(PayInfoStatus.SUCCESS)) {
                //如果已支付，就走支付完成逻辑
                payService.afterPayBizHandlerSimple(payInfo);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(tradeOrderId, PayBizType.BUY_COMMODITY.getPersistKey());
                if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
                    throw new BizException(RespCode.NOT_FIND_RECORD);
                }
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }else {
                //如果未支付，就可以取消
                BigDecimal unitQuantity = this.convertToUnitQuantity(tradeOrder);
                tradeAccountService.baseUnfreeze(tradeOrder.getCommodityId(),tradeOrder.getOpponentAccountId(),AccountType.OPERATOR,tradeOrder.getOpponentAccountId(),AccountType.OPERATOR,unitQuantity,CommodityFlowType.BUY_CANCEL,"购买退还商品","购买退还商品");
                tradeOrder.setStatus(TradeOrderStatus.CANCELLED.getPersistKey());
                tradeOrderMapperExt.updateByPrimaryKeySelective(tradeOrder);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(tradeOrderId, PayBizType.BUY_COMMODITY.getPersistKey());

                if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
                    throw new BizException(RespCode.NOT_FIND_RECORD);
                }
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(TradeOrderStatus.CANCELLED.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }
        }else {
            throw new BizException(RespCode.SERVER_BUSY);
        }
    }

    /**
     * 购买商品在不需要付款的情况下直接完成订单
     * @param tradeOrder
     * @param commodityVo
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void updateBuyCommodityInfoNoPay(TradeOrder tradeOrder, CommodityVo commodityVo) throws IOException {
        tradeOrder.setStatus(TradeOrderStatus.SUCCESS.getPersistKey());
        tradeOrder.setSuccessTime(new Date());
        tradeOrderMapperExt.updateByPrimaryKeySelective(tradeOrder);

        BigDecimal unitQuantity = this.convertToUnitQuantity(tradeOrder);
        this.tradeAccountService.baseUnfreeze(tradeOrder.getCommodityId(),tradeOrder.getOpponentAccountId(), AccountType.OPERATOR,tradeOrder.getAccountId(),AccountType.USER,unitQuantity,CommodityFlowType.BUY,"买商品付款后的解冻","买商品付款后的解冻");

        List<UserBizBrief> userBizBriefs =tradeDetailService.queryUserBizBriefList(tradeOrder.getTradeOrderId(),PayBizType.BUY_COMMODITY.getPersistKey());

        if (userBizBriefs == null || userBizBriefs.isEmpty() || userBizBriefs.size() > 1) {
            throw new BizException(RespCode.SERVER_ERROR);
        }else{
            UserBizBrief userBizBrief = userBizBriefs.get(0);
            userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
            this.userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
        }
    }

    /**
     * 查询所有的过期订单（尚未付款）
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void cancelExpireTradeOrderList() throws IOException {
        TradeOrderExample tradeOrderExample = new TradeOrderExample();
        tradeOrderExample.createCriteria().andStatusEqualTo(TradeOrderStatus.NOPAY.getPersistKey());
        List<TradeOrder> tradeOrderList = tradeOrderMapperExt.selectByExample(tradeOrderExample);
        Long dateTime = System.currentTimeMillis();//当前时间
        for(TradeOrder tradeOrder : tradeOrderList){
            CommodityVo commodityVo = commodityService.findById(tradeOrder.getCommodityId());
            if(commodityVo.getExpireTime().getTime()<dateTime || tradeOrder.getExpireTime().getTime() <dateTime){
                //过期了或者订单超过2小时
                try {
                    this.cancelExpireBuyCommodityInfo(tradeOrder.getTradeOrderId());
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("定时任务检查到这一购买订单超时更新操作发生异常，错误信息：{}",e);
                }
            }
        }
    }

    private static boolean checkParams(BigDecimal quantity, BigDecimal quantityType){
       if(!Pattern.matches("\\d+", quantity+"")){
           return false;
       }
        if(quantity.compareTo(new BigDecimal(1))==-1){
            return false;
        }
       if(quantityType.compareTo(new BigDecimal(1))!=0 && quantityType.compareTo(new BigDecimal(2))!=0){
           return false;
       }
        return true;
    }

}
