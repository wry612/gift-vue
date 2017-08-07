package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.TradeOrderMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.CommodityFlowRecord;
import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.contants.enums.TradeOrderStatus;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.TradeAccountService;
import cn.datai.gift.web.service.TradeService;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * Created by zhangyutao on 2017/4/5.
 */
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeOrderMapperExt tradeOrderMapperExt;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;


    /**
     * 下单（买卖整合在一起）
     *
     * @param userInfoId        用户信息id
     * @param payBizType         @see {@link PayBizType}
     * @param commodityId       商品合约id
     * @param commodityQuantity 商品数量
     * @param couponDetailIds   优惠券id
     * @param  quantityType 类型（瓶、毫升、饼、克）
     * @param remark            注释
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public RespResult order(long userInfoId, PayBizType payBizType, long commodityId, BigDecimal commodityQuantity, String[] couponDetailIds, BigDecimal quantityType, String remark) throws IOException {
        // 查询商品信息
        CommodityVo commodityContract = commodityService.findById(commodityId);

        if(quantityType.compareTo(BigDecimal.ONE) == 0){
            //最小商品单位
            BigDecimal multiply = commodityContract.getStandardUnitMultiple().multiply(new BigDecimal(100));//规则规定的最大可买数量
            if(multiply.compareTo(commodityQuantity)==-1){
                throw new BizException(RespCode.OVER_BUY_NUM);
            }
        }
        if(quantityType.compareTo(new BigDecimal(2)) == 0){
            //最小规格单位
            if(new BigDecimal(100).compareTo(commodityQuantity)==-1){
                throw new BizException(RespCode.OVER_BUY_NUM);
            }
        }

        //查询用户交易账户
        RespResult userTradeAccountRsp = tradeAccountService.findOrCreateTradeAccount(commodityId, userInfoId, AccountType.USER);
        if (!userTradeAccountRsp.getCode().equals(RespCode.SUCCESS.getCode())) {
            return userTradeAccountRsp;
        }


        //查询运营商交易账户
        RespResult operatorTradeAccountRsp = tradeAccountService.findOrCreateTradeAccount(commodityId, commodityContract.getOperatorInfoId(), AccountType.OPERATOR);
        if (!operatorTradeAccountRsp.getCode().equals(RespCode.SUCCESS.getCode())) {
            return operatorTradeAccountRsp;
        }

        // 拼凑订单信息
        TradeOrder tradeOrder = new TradeOrder();
        tradeOrder.setAccountId(userInfoId);//当前交易账户id
        tradeOrder.setAccountType(AccountType.USER.getPersistKey());//当前主账户类型
        tradeOrder.setOpponentAccountId(commodityContract.getOperatorInfoId());//对方交易账户id
        tradeOrder.setOpponentAccountType(AccountType.OPERATOR.getPersistKey());//对方主账户类型
        tradeOrder.setBuyOrSell(payBizType.getPersistKey());//买或卖
        tradeOrder.setCommodityId(commodityId);//商品ID

        BigDecimal totalPrice;//总价
        BigDecimal unitQuantity;//基本单位数量
        if(BigDecimal.ONE.compareTo(quantityType)==0){
            //按照毫升（克）提取
            unitQuantity = commodityQuantity;
            tradeOrder.setCommodityUnitQuantity(commodityQuantity);//买卖的数量commodityContract
            tradeOrder.setCommodityUnitPrice(commodityContract.getUnitPrice());//商品单位价格
            totalPrice = commodityQuantity.multiply(new BigDecimal(commodityContract.getUnitPrice()));
        } else if(new BigDecimal(2).compareTo(quantityType)==0){
            //按瓶(饼)提取
            unitQuantity = commodityQuantity.multiply(commodityContract.getStandardUnitMultiple());
            tradeOrder.setCommodityStandardQuantity(commodityQuantity);
            tradeOrder.setCommodityStandardPrice(commodityContract.getStandardPrice());
            totalPrice = commodityQuantity.multiply(new BigDecimal(commodityContract.getStandardPrice()));
        }else {
            throw new BizException(RespCode.PARAMS_ERROR);
        }
        tradeOrder.setFeePercent(BigDecimal.ZERO);//目前手续费比例默认为0
        tradeOrder.setFeePrice(0L);//目前手续费默认为0
        tradeOrder.setCouponInfo("目前没有使用优惠券");//优惠券折扣信息
        tradeOrder.setCouponPrice(0L);//目前默认没有折扣金额
        tradeOrder.setActualPrice(totalPrice.longValue());//目前在没有优惠券等情况下，总金额就是实际金额
        tradeOrder.setCreateTime(new Date());//下单时间


        String tradeOrderExpireTime = this.getSystemParamsValue(StatusConstants.TRADE_ORDER_EXPIRE_TIME);
        Date expireTime = DateUtil.afterNMin(new Date(), (Integer.valueOf(tradeOrderExpireTime) / 60));
        tradeOrder.setExpireTime(expireTime);//订单超时
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(expireTime);
        calendar.set(Calendar.MILLISECOND, 0);
        expireTime = calendar.getTime();
        tradeOrder.setExpireTime(expireTime);//订单超时时间


        tradeOrder.setStatus(TradeOrderStatus.NOPAY.getPersistKey());//订单状态
        tradeOrder.setRemark(payBizType.getName());//备注

        RespResult respResult = tradeAccountService.baseFreeze(commodityId,commodityContract.getOperatorInfoId(),AccountType.OPERATOR, unitQuantity, CommodityFlowType.BUY,"用户购买商品","用户购买商品");
        Map<String,Object> map = (Map<String,Object>)respResult.getBody();
        CommodityFlowRecord commodityFlowRecord = (CommodityFlowRecord)map.get("outFlow");

        tradeOrder.setCommodityFlowRecordIds(commodityFlowRecord.getCommodityFlowRecordId().toString());
        tradeOrderMapperExt.insertSelective(tradeOrder);


        //添加买商品交易明细记录
        UserBizBrief userBizBrief = new UserBizBrief();
        userBizBrief.setUserInfoId(userInfoId);//用户Id
        userBizBrief.setCommodityContractId(commodityId);//商品合约Id
        userBizBrief.setBizType(PayBizType.BUY_COMMODITY.getPersistKey());//业务类型Code
        userBizBrief.setBizStatus(TradeOrderStatus.NOPAY.getPersistKey());
        userBizBrief.setBizId(tradeOrder.getTradeOrderId().toString());//业务Id
        userBizBrief.setCreateTime(new Date());//创建时间

        userBizBrief.setCommodityTypeId(commodityContract.getCommodityTypeId());//商品类型ID
        userBizBrief.setCommodityName(commodityContract.getCommodityName());//商品名称
        userBizBrief.setOpCommodityUnitQuantity(commodityQuantity);//操作商品数量
        AttachVo attachVo = new AttachVo();
        attachVo.setPayStatus("买的状态");
        attachVo.setRemark("买商品");
        attachVo.setQuantityType(quantityType.shortValue());
        userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//附加数据

        userBizBriefMapperExt.insertSelective(userBizBrief);

        return new RespResult(RespCode.SUCCESS,tradeOrder);
    }

    /**
     * 支付成功以后的动作
     * @param tradeOrderId 买卖订单号
     */
    public void afterPaySuccess(long tradeOrderId) {

    }

    private String getSystemParamsValue(String key){
        try {
            return redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get(key).toString();
        } catch (Exception e) {
            throw new BizException(RespCode.REDIS_NOT_FUND);
        }
    }

}
