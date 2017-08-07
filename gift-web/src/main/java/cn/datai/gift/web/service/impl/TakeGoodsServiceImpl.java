package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.DeliveryOrderMapperExt;
import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.*;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.IpUtil;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Administrator on 2017/4/11.
 */
@Service
public class TakeGoodsServiceImpl implements TakeGoodsService {

    @Value("${weixin.appID}")
    private String appid;

    @Autowired
    private GiftService giftService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private DeliveryOrderMapperExt deliveryOrderMapperExt;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private PayService payService;

    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private TradeDetailService tradeDetailService;

    private static final Logger logger = LoggerFactory.getLogger(TakeGoodsServiceImpl.class);

    /**
     * 生成订单
     * @param deliveryOrder
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public PayInfo produceOrder(DeliveryOrder deliveryOrder) throws IOException {

        //检查提货有效日期
        CommodityVo commodityVo = this.commodityService.findById(deliveryOrder.getCommodityContractId());
        if(commodityVo.getExpireTime().getTime() <System.currentTimeMillis()){
            throw new BizException(RespCode.OVER_EXPIRE_TIME);
        }

        if(deliveryOrder.getApplyCommodityStandardUnitQuantity().compareTo(new BigDecimal(100)) ==1){
            throw new BizException(RespCode.OVER_MAX_NUM);
        }

        GiftAccount giftAccount = this.giftService.findAndLockGiftAccountByUserIdAndCommodityId(deliveryOrder.getUserId(),deliveryOrder.getCommodityContractId());
        boolean produceOrder = this.cluOrder(giftAccount,deliveryOrder);
        if(!produceOrder){
            throw new BizException(RespCode.PRODUCE_ORDER_FAIL);
        }
        //创建支付订单
        long amount = deliveryOrder.getAddOnPrice();//支付金额
        if(amount<=0){
            this.updateDeliveryInfoStatusByPaid(deliveryOrder);
            return null;
        }
        PayInfo payOrder = payService.createPayOrder(deliveryOrder.getUserId(), 1L, amount, PayBizType.DELIVERY, deliveryOrder.getDeliveryOrderId().toString(), deliveryOrder.getExpireTime(), "test");

        deliveryOrder.setIncomePayInfo(payOrder.getPayInfoId().toString());
        deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder);

        return payOrder;
    }

    /**
     * 付款完成后操作订单(单纯的修改状态)
     * @param payInfoId
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void paidPickUp(Long payInfoId) throws WxPayNetException {

        DeliveryOrderExample example = new DeliveryOrderExample();
        example.or().andIncomePayInfoEqualTo(payInfoId.toString());
        List<DeliveryOrder> deliveryOrders = deliveryOrderMapperExt.selectByExample(example);
        if (deliveryOrders == null || deliveryOrders.isEmpty() || deliveryOrders.size() > 1) {
            throw new BizException(RespCode.SERVER_ERROR);
        }
        DeliveryOrder deliveryOrder = deliveryOrders.get(0);
        if (DeliveryOrderStatus.valueOf(deliveryOrder.getStatus()).equals(DeliveryOrderStatus.CANCELLED)) {
            //支付成功以后，发现订单已取消， 发起退款流程
            payService.refund(payInfoId);
        }else{
            //支付完成，且订单没有取消
            //上锁基本支付信息，重新判断是否已处理关联的业务订单
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfoId);
            if ("true".equals(payInfo.getBizProcessed())) {
                throw new BizException(RespCode.PAY_BIZ_PROCEESSED);
            }
            payInfo.setBizProcessed("true");
            payInfoMapperExt.updateByPrimaryKeySelective(payInfo);

            //修改订单状态
            DeliveryOrder deliveryOrder1 = this.findAndLockDeliveryOrderByPayInfoId(payInfoId);
            if (!deliveryOrder1.equals(deliveryOrder)) {
                throw new BizException(RespCode.SERVER_BUSY);
            }
            deliveryOrder1.setStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
            deliveryOrder1.setSuccessTime(new Date());

            List<UserBizBrief> userBizBriefList = this.tradeDetailService.queryUserBizBriefList(deliveryOrder1.getDeliveryOrderId(),PayBizType.DELIVERY.getPersistKey());
            UserBizBrief userBizBrief = userBizBriefList.get(0);
            userBizBrief.setBizStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
            this.deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder1);
            this.userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
        }
    }

    /**
     * 后台确认后完成订单（解冻、更新状态）
     * @param deliveryOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void expressDeliveryinfo(Long deliveryOrderId,String logisticsOrderId,String logisticsOperator) throws IOException {

        DeliveryOrder deliveryOrder = this.deliveryOrderMapperExt.findAndLockDeliveryOrderByDeliveryOrderId(deliveryOrderId);
        if(!deliveryOrder.getStatus().equals(DeliveryOrderStatus.NOT_DELIVER.getPersistKey())){
            throw new BizException(RespCode.NOT_PAY);
        }

        this.tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),deliveryOrder.getUserId(),AccountType.USER,0L,AccountType.OPERATOR,deliveryOrder.getActConsumeCommUnitQuantity(),CommodityFlowType.PICK_UP,"提货申请完成","提货申请完成");

        if(new BigDecimal(0).compareTo(deliveryOrder.getAddOnCommodityUnitQuantity()) ==-1){
            OperatorInfo operatorInfo = commodityService.queryOperaterInfo(deliveryOrder.getCommodityContractId());
            this.tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),operatorInfo.getOperatorInfoId(),AccountType.OPERATOR,0L,AccountType.OPERATOR,deliveryOrder.getAddOnCommodityUnitQuantity(),CommodityFlowType.PICK_UP,"提货申请完成","提货申请完成");
        }

        deliveryOrder.setStatus(DeliveryOrderStatus.DELIVERED.getPersistKey());
        deliveryOrder.setLogisticsOrderId(logisticsOrderId);
        deliveryOrder.setLogisticsOperator(logisticsOperator);
        deliveryOrder.setDeliveryTime(new Date());
        this.deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder);

        List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(deliveryOrderId, PayBizType.DELIVERY.getPersistKey());
        if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
            throw new BizException(RespCode.ERROR_USER_BIZ);
        }

        UserBizBrief userBizBrief = userBizBriefList.get(0);
        userBizBrief.setBizStatus(DeliveryOrderStatus.DELIVERED.getPersistKey());
        this.userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);

    }

    /**
     * 通过主键查询订单信息
     * @param deliveryOrderId
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public DeliveryOrder queryDeliveryOrderById(Long deliveryOrderId) {
        return this.deliveryOrderMapperExt.selectByPrimaryKey(deliveryOrderId);
    }

    /**
     * 根据payInfoId查询订单记录
     *
     * @param payInfoId
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public DeliveryOrder findAndLockDeliveryOrderByPayInfoId(Long payInfoId) {
        return this.deliveryOrderMapperExt.findAndLockDeliveryOrderByPayInfoId(payInfoId.toString());
    }

    /**
     * 在交易明细中提货待付款（此时提货订单已产生，但是付款失败，导致交易明细中会出现提货未付款的现象）
     *
     * @param bizId
     * @param userLoginInfo
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public RespResult payForDetailTakeGoods(Long bizId, UserLoginInfo userLoginInfo, HttpServletRequest request) throws IOException, WxPayNetException {

        DeliveryOrder deliveryOrder = this.deliveryOrderMapperExt.findAndLockDeliveryOrderByDeliveryOrderId(bizId);
        if(!deliveryOrder.getUserId().equals(userLoginInfo.getUserInfoId())){
            throw new BizException(RespCode.USER_NOT_FOUND);
        }

        //检查提货有效日期
        CommodityVo commodityVo = this.commodityService.findById(deliveryOrder.getCommodityContractId());
        if(commodityVo.getExpireTime().getTime() <System.currentTimeMillis()){
            throw new BizException(RespCode.OVER_EXPIRE_TIME);
        }

        PayInfo payInfo = payInfoMapperExt.selectByPrimaryKey(Long.valueOf(deliveryOrder.getIncomePayInfo()));

        HashMap<String, String> wxPayParams = new HashMap<>();//微信支付需要的参数
        wxPayParams.put("deviceInfo", null);

        wxPayParams.put("body", "礼尚-" + commodityVo.getCommodityName());
        wxPayParams.put("detail", null);
        wxPayParams.put("attach", null);
        wxPayParams.put("feeType", "CNY");
        wxPayParams.put("spbillCreateIp", IpUtil.getIpAddr(request));
        wxPayParams.put("goodsTag", null);
        wxPayParams.put("tradeType", WxTradeType.JSAPI.getPersistKey());
        wxPayParams.put("productId", null);
//        wxPayParams.put("limitPay", "no_credit");
        wxPayParams.put("openid", userLoginInfo.getWeixinOpenId());
        Map wxFrontParams = payService.payOriginalChannel(payInfo, wxPayParams);
        wxFrontParams.put("deliveryOrderId",bizId);
        return new RespResult(RespCode.SUCCESS, wxFrontParams);
    }

    /**
     * 取消商品提货
     * @param deliveryOrderId
     * @param userInfoId
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void cancelTakeGoods(Long deliveryOrderId, Long userInfoId) throws IOException, WxPayNetException {
        DeliveryOrder deliveryOrder = this.deliveryOrderMapperExt.findAndLockDeliveryOrderByDeliveryOrderId(deliveryOrderId);

        if((deliveryOrder.getStatus()).equals(DeliveryOrderStatus.NOPAY.getPersistKey())){
            //未付款才能取消
            if(!deliveryOrder.getUserId().equals(userInfoId)){
                throw new BizException(RespCode.NOT_FIND_RECORD);
            }
            //检查支付状态，先判断是否支付完成，如果已支付，就不能取消
            String payInfoId = deliveryOrder.getIncomePayInfo();
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(Long.valueOf(payInfoId));
            if (payInfo.getStatus().equals(PayInfoStatus.SUCCESS.getPersistKey())) {
                //如果已支付，就走支付完成逻辑
                payService.afterPayBizHandlerSimple(payInfo);
                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(deliveryOrderId, PayBizType.DELIVERY.getPersistKey());
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }else{
                OperatorInfo operatorInfo = commodityService.queryOperaterInfo(deliveryOrder.getCommodityContractId());
                tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),deliveryOrder.getUserId(),AccountType.USER,deliveryOrder.getUserId(),AccountType.USER,deliveryOrder.getActConsumeCommUnitQuantity(),CommodityFlowType.PICK_UP_CANCEL,"取消提货操作(用户部分)","取消提货操作（用户部分）");
                tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),operatorInfo.getOperatorInfoId(),AccountType.OPERATOR,operatorInfo.getOperatorInfoId(),AccountType.OPERATOR,deliveryOrder.getAddOnCommodityUnitQuantity(),CommodityFlowType.PICK_UP_CANCEL,"取消提货操作（运营商部分）","取消提货操作（运营商部分）");
                deliveryOrder.setStatus(DeliveryOrderStatus.CANCELLED.getPersistKey());
                deliveryOrder.setCloseTime(new Date());
                deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(deliveryOrderId, PayBizType.DELIVERY.getPersistKey());
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(DeliveryOrderStatus.CANCELLED.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }
        }else{
            throw new BizException(RespCode.SERVER_BUSY);
        }
    }

    /**
     * 超时自动取消商品提货(定时任务执行)
     * @param deliveryOrderId
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void cancelExpireTakeGoods(Long deliveryOrderId) throws IOException, WxPayNetException {
        DeliveryOrder deliveryOrder = this.deliveryOrderMapperExt.findAndLockDeliveryOrderByDeliveryOrderId(deliveryOrderId);

        if((deliveryOrder.getStatus()).equals(DeliveryOrderStatus.NOPAY.getPersistKey())){

            //检查支付状态，先判断是否支付完成，如果已支付，就不能取消
            String payInfoId = deliveryOrder.getIncomePayInfo();
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(Long.valueOf(payInfoId));
            if (payInfo.getStatus().equals(PayInfoStatus.SUCCESS.getPersistKey())) {
                //如果已支付，就走支付完成逻辑
                payService.afterPayBizHandlerSimple(payInfo);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(deliveryOrderId, PayBizType.DELIVERY.getPersistKey());
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);

            } else {
                //如果未支付，就可以取消
                OperatorInfo operatorInfo = commodityService.queryOperaterInfo(deliveryOrder.getCommodityContractId());
                tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),deliveryOrder.getUserId(),AccountType.USER,deliveryOrder.getUserId(),AccountType.USER,deliveryOrder.getActConsumeCommUnitQuantity(),CommodityFlowType.PICK_UP_CANCEL,"定时任务自动取消超时提货操作(用户部分)","定时任务自动取消超时取消提货操作（用户部分）");
                tradeAccountService.baseUnfreeze(deliveryOrder.getCommodityContractId(),operatorInfo.getOperatorInfoId(),AccountType.OPERATOR,operatorInfo.getOperatorInfoId(),AccountType.OPERATOR,deliveryOrder.getAddOnCommodityUnitQuantity(),CommodityFlowType.PICK_UP_CANCEL,"定时任务自动取消超时提货操作（运营商部分）","定时任务自动取消超时提货操作（运营商部分）");
                deliveryOrder.setStatus(DeliveryOrderStatus.CANCELLED.getPersistKey());
                deliveryOrder.setCloseTime(new Date());
                deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder);

                List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(deliveryOrderId, PayBizType.DELIVERY.getPersistKey());
                UserBizBrief userBizBrief = userBizBriefList.get(0);
                userBizBrief.setBizStatus(DeliveryOrderStatus.CANCELLED.getPersistKey());
                userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
            }
        }else {
            throw new BizException(RespCode.SERVER_BUSY);
        }
    }

    /**
     * 付完款后直接更新状态（不能解冻,直到填写完成物流单号方可解冻）
     * @param deliveryOrder
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void updateDeliveryInfoStatusByPaid(DeliveryOrder deliveryOrder) {

        deliveryOrder.setStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
        deliveryOrder.setSuccessTime(new Date());
        List<UserBizBrief> userBizBriefList = this.tradeDetailService.queryUserBizBriefList(deliveryOrder.getDeliveryOrderId(),PayBizType.DELIVERY.getPersistKey());
        UserBizBrief userBizBrief = userBizBriefList.get(0);
        userBizBrief.setBizStatus(DeliveryOrderStatus.NOT_DELIVER.getPersistKey());
        this.deliveryOrderMapperExt.updateByPrimaryKeySelective(deliveryOrder);
        this.userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
    }

    /**
     * 定时任务（一小时一次）取消超时的提货订单（未付款）
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void cancelExpireDeliveryInfoList() throws IOException {
        DeliveryOrderExample deliveryOrderExample = new DeliveryOrderExample();
        deliveryOrderExample.createCriteria().andStatusEqualTo(DeliveryOrderStatus.NOPAY.getPersistKey());
        List<DeliveryOrder> deliveryOrderList = this.deliveryOrderMapperExt.selectByExample(deliveryOrderExample);
        Long dateTime = System.currentTimeMillis();
        for(DeliveryOrder deliveryOrder : deliveryOrderList){
            CommodityVo commodityVo = commodityService.findById(deliveryOrder.getCommodityContractId());
            if(commodityVo.getExpireTime().getTime() < dateTime || deliveryOrder.getExpireTime().getTime() < dateTime){
                //商品过期或者订单超时
                try {
                    this.cancelExpireTakeGoods(deliveryOrder.getDeliveryOrderId());
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("定时任务检查到这一提货订单超时更新发生异常，错误信息：{}",e);
                }
            }
        }
    }


    /**
     * 产生订单
     * @param deliveryOrder
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    private boolean cluOrder(GiftAccount giftAccount,DeliveryOrder deliveryOrder) throws IOException {
        BigDecimal aviableNum = giftAccount.getAvailableUnitQuantity();//（为了和想提货的数量比较来决定是否需要冻结运营商的，因为调完baseFeeeze接口用户的持仓会发生改变）
        try {
            if(!checkCondition(deliveryOrder)){
                return false;
            }
            CommodityVo commodityVo = this.commodityService.findById(deliveryOrder.getCommodityContractId());
            BigDecimal wantPickUpQuo = deliveryOrder.getApplyCommodityStandardUnitQuantity().multiply(commodityVo.getStandardUnitMultiple());
            BigDecimal freeze = giftAccount.getAvailableUnitQuantity().compareTo(wantPickUpQuo) == -1 ? giftAccount.getAvailableUnitQuantity() : wantPickUpQuo;

            //防止前台输错，相关的字段值都由商品合约和用户输入的提取数量计算得来
            deliveryOrder.setUserTradeAccountId(giftAccount.getGiftAccountId());//礼包账户Id
            deliveryOrder.setCommodityUnitPrice(commodityVo.getUnitPrice());//商品单位价格
            deliveryOrder.setApplyCommodityUnitQuantity(wantPickUpQuo);//要提取的总的商品单位数量,如：提取2瓶，每瓶单位是750毫升 即2x750=1500
            deliveryOrder.setCouponUnitQuantity(BigDecimal.ZERO);//目前没有添加优惠券
            BigDecimal addOnCommodityUnitQuantity = giftAccount.getAvailableUnitQuantity().compareTo(wantPickUpQuo) == -1 ? wantPickUpQuo.subtract(giftAccount.getAvailableUnitQuantity()) : BigDecimal.ZERO;
            deliveryOrder.setAddOnCommodityUnitQuantity(addOnCommodityUnitQuantity);//凑单购买商品单位数量
            deliveryOrder.setActConsumeCommUnitQuantity(freeze);//实际消耗礼包商品数量
            deliveryOrder.setFeePercent(BigDecimal.ZERO);//目前没有手续费比例
            long addOnPrice = addOnCommodityUnitQuantity.multiply(new BigDecimal(commodityVo.getUnitPrice())).longValue();//凑单补购商品需要额外支付的金额， 单位为分
            deliveryOrder.setAddOnPrice(addOnPrice);//凑单补购商品需要额外支付的金额， 单位为分
            deliveryOrder.setFeePrice((BigDecimal.ZERO).longValue());//目前没有设置手续费
            deliveryOrder.setPostagePrice(0L);//目前没有邮费
            deliveryOrder.setCouponInfo("");//目前没有设置优惠券
            deliveryOrder.setCouponPrice(0L);//目前没有优惠券，所以金额为0
            deliveryOrder.setActualPrice(addOnPrice);//目前没有其他优惠券折扣券等所以这里的实际支付就和额外支付相等
            deliveryOrder.setIncomePayInfo("请在这里填写收支信息");//收支信息


            String deliveryOrderExpireTime = this.getSystemParamsValue(StatusConstants.DELIVERY_ORDER_EXPIRE_TIME);
            Date expireTime = DateUtil.afterNMin(new Date(), (Integer.valueOf(deliveryOrderExpireTime))/60);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(expireTime);
            calendar.set(Calendar.MILLISECOND, 0);
            expireTime = calendar.getTime();
            deliveryOrder.setExpireTime(expireTime);//订单超时时间

            deliveryOrder.setOrderTime(new Date());

            deliveryOrder.setStorageoutMode("1");//默认为邮寄方式
            deliveryOrder.setDateExpect(null);//默认不填
            deliveryOrder.setLogisticsOrderId("");//物流单号
            deliveryOrder.setStatus(DeliveryOrderStatus.NOPAY.getPersistKey());//订单状态

            //调用冻结接口
            RespResult respResult =  tradeAccountService.baseFreeze(deliveryOrder.getCommodityContractId(),deliveryOrder.getUserId(), AccountType.USER,freeze,CommodityFlowType.PICK_UP,"提货申请(用户部分)","提货申请（用户部分）");
            Map<String,Object> map = (Map<String,Object>)respResult.getBody();
            CommodityFlowRecord commodityFlowRecord = (CommodityFlowRecord)map.get("outFlow");
            deliveryOrder.setCommodityFlowRecordIds(commodityFlowRecord.getCommodityFlowRecordId().toString());//商品流通记录信息ids， 多个用逗号隔开

            if(aviableNum.compareTo(wantPickUpQuo) == -1){
                OperatorInfo operatorInfo = commodityService.queryOperaterInfo(deliveryOrder.getCommodityContractId());
                RespResult operator_respResult =  tradeAccountService.baseFreeze(deliveryOrder.getCommodityContractId(),operatorInfo.getOperatorInfoId(), AccountType.OPERATOR,addOnCommodityUnitQuantity,CommodityFlowType.PICK_UP,"提货申请（运营商部分）","提货申请（运营商部分）");
                Map<String,Object> operator_map = (Map<String,Object>)operator_respResult.getBody();
                CommodityFlowRecord operator_commodityFlowRecord = (CommodityFlowRecord)operator_map.get("outFlow");
                deliveryOrder.setCommodityFlowRecordIds(deliveryOrder.getCommodityFlowRecordIds()+","+operator_commodityFlowRecord.getCommodityFlowRecordId().toString());
            }

            deliveryOrderMapperExt.insertSelective(deliveryOrder);


            //添加提货交易明细记录
            UserBizBrief userBizBrief = new UserBizBrief();
            userBizBrief.setUserInfoId(deliveryOrder.getUserId());//用户Id
            userBizBrief.setCommodityContractId(deliveryOrder.getCommodityContractId());//商品合约Id
            userBizBrief.setBizType(PayBizType.DELIVERY.getPersistKey());//业务类型Code
            userBizBrief.setBizStatus(DeliveryOrderStatus.NOPAY.getPersistKey());
            userBizBrief.setBizId(deliveryOrder.getDeliveryOrderId().toString());//业务Id
            userBizBrief.setCreateTime(new Date());//创建时间

            userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());//商品类型ID
            userBizBrief.setCommodityName(commodityVo.getCommodityName());//商品名称
            userBizBrief.setOpCommodityUnitQuantity(wantPickUpQuo);//操作商品数量
            AttachVo attachVo = new AttachVo();
            attachVo.setPickUpStatus(DeliveryOrderStatus.NOPAY.getPersistKey());
            attachVo.setRemark("申请提货");
            userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

            userBizBriefMapperExt.insertSelective(userBizBrief);

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("产生提货订单发生异常，订单参数：{}", JSONObject.toJSONString(deliveryOrder));

        }
        return false;

    }

    private static boolean checkCondition(DeliveryOrder deliveryOrder){
        //必要参数
        if(StringUtils.isEmpty(deliveryOrder.getCommodityContractId()) || StringUtils.isEmpty(deliveryOrder.getAddresseeName()) || StringUtils.isEmpty(deliveryOrder.getAddresseeMobilePhone())||
        StringUtils.isEmpty(deliveryOrder.getAddressDetailInfo()) || deliveryOrder.getApplyCommodityStandardUnitQuantity().compareTo(BigDecimal.ONE) == -1){
            return false;
        }
        
        //验证地址名称手机的正确性（要不要）
        return true;
    }

    private String getSystemParamsValue(String key){
        try {
            return redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get(key).toString();
        } catch (Exception e) {
            throw new BizException(RespCode.REDIS_NOT_FUND);
        }
    }

}
