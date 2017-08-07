package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.call.ExpressAPI;
import cn.datai.gift.web.call.express.response.expressList.ExpressList;
import cn.datai.gift.web.contants.enums.AccountType;
import cn.datai.gift.web.contants.enums.CommodityFlowType;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.taskdyn.ConvertObjDrawTask;
import cn.datai.gift.web.taskdyn.DynamicTask;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 管理后台需要的接口
 * Created by zhangyutao on 2017/5/15.
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    /**
     * 平台账户id
     */
    @Value("${sys.center_user_id}")
    private long centerUserId;

    @Autowired
    private ExpressAPI expressAPI;

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private GiftService giftService;

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private TakeGoodsService takeGoodsService;

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private DynamicTask dynamicTask;

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 修改库存
     * @param giftAccountId 礼包账户id
     * @param commodityQtn  库存改动数量， 正值为增加库存量， 负值为减少库存量
     * @return
     */
    @PostMapping("modifyInventory")
    @ResponseBody
    public RespResult modifyInventory(long giftAccountId, long commodityQtn) {
        logger.info("收到修改商品库存的请求 giftAccountId:{}, commodityQtn;{}", giftAccountId, commodityQtn);

        if (commodityQtn == 0) {
            return new RespResult(RespCode.PARAMS_ERROR);
        }

        if (commodityQtn < 0) {
            //减库存
            GiftAccount giftAccount = tradeAccountService.findTradeAccountById(giftAccountId);
            BigDecimal availableUnitQuantity = giftAccount.getAvailableUnitQuantity();
            if (availableUnitQuantity.compareTo(new BigDecimal(-1 * commodityQtn)) == -1) {
                //库存不够减的
                return new RespResult(RespCode.TRADE_AVAILABLE_NOT_ENOUGH);
            }
            try {
                //调用商品调拨服务
                tradeAccountService.allot(giftAccountId, "available", CommodityFlowType.OTHER_SYS_TRANSFER_OUT, new BigDecimal(commodityQtn), null, "管理后台减少商品库存");
            } catch (BizException e) {
                logger.error("商品调拨异常：", e);
                return new RespResult(e.getErrorCode(), e.getErrorMsg());
            }
        }

        if (commodityQtn > 0) {
            try {
                //调用商品调拨服务
                tradeAccountService.allot(giftAccountId, "available", CommodityFlowType.OTHER_SYS_TRANSFER_IN, new BigDecimal(commodityQtn), null, "管理后台增加商品库存");
            } catch (BizException e) {
                return new RespResult(e.getErrorCode(), e.getErrorMsg());
            } catch (Exception e) {
                return new RespResult(RespCode.SERVER_ERROR);
            }
        }
        return new RespResult(RespCode.SUCCESS);
    }


    /**
     * 初始化运营商交易账户
     * @param operatorId 运营商id
     * @param commodityId 商品id
     * @return
     */
    @PostMapping("initOperatorGiftAccount")
    @ResponseBody
    public RespResult initOperatorGiftAccount(long operatorId, long commodityId) {
        try {
            RespResult respResult = tradeAccountService.createTradeAccount(commodityId, operatorId, AccountType.OPERATOR, null);
            return respResult;
        } catch (Exception e) {
            logger.error("初始化运营商交易账户失败：", e);
            return new RespResult(RespCode.SERVER_ERROR);
        }
    }

    /**
     *保存快递单号(后台管理调用)，后台确认后完成订单（解冻、更新状态）
     * @param deliveryOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     * @return
     */
    @RequestMapping(value = "/expressDeliveryinfo",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public RespResult expressDeliveryinfo(@RequestParam("deliveryOrderId") Long deliveryOrderId,
                                          @RequestParam("logisticsOrderId")String logisticsOrderId,
                                          @RequestParam("logisticsOperator") String logisticsOperator){
        try {
            this.takeGoodsService.expressDeliveryinfo(deliveryOrderId,logisticsOrderId,logisticsOperator);
            return new RespResult(RespCode.SUCCESS,"操作成功");
        } catch (BizException be) {
            logger.error("保存快递单号，操作更新解冻订单发生异常，错误信息：{}",be);
            if("2017".equals(be.getErrorCode())){
                return new RespResult(RespCode.FAIL,"订单已支付或尚未支付，不能执行该操作");
            }else if("2018".equals(be.getErrorCode())){
                return new RespResult(RespCode.FAIL,"查询业务概况时发生异常");
            }else{
                return new RespResult(RespCode.FAIL,"保存快递单号、操作更新解冻订单失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("保存快递单号，操作更新解冻订单发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"保存快递单号、操作更新解冻订单失败");
        }
    }

    /**
     *以物换物(后台管理调用)，后台确认后完成订单（解冻、更新状态）
     * @param convertObjOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     * @return
     */
    @RequestMapping(value = "/completeConvertObjOrder",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public RespResult completeConvertObjOrder(@RequestParam("convertObjOrderId") Long convertObjOrderId,
                                          String logisticsOrderId,
                                          String logisticsOperator){
        try {
            this.conversionService.completeConvertObjOrder(convertObjOrderId,logisticsOrderId,logisticsOperator);
            return new RespResult(RespCode.SUCCESS,"操作成功");
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("以物换物，操作更新解冻订单发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"以物换物，操作更新解冻订单失败");
        }
    }


    /**
     * 特别账户转账接口，暂时只开放平台账户转用户，不允许用户转平台账户
     * @param centerUserId        平台用户id
     * @param receiveUserId       接收人id，可以是任意用户
     * @param commodityContractId 商品合约id
     * @param commodityQuantity   转账数量
     * @return
     */
    @PostMapping("centerUserTransferCommodity")
    @ResponseBody
    public RespResult centerUserTransferCommodity(@RequestParam("centerUserId") long centerUserId,
                                                  @RequestParam("receiveUserId") long receiveUserId,
                                                  @RequestParam("commodityContractId") long commodityContractId,
                                                  @RequestParam("commodityQuantity")BigDecimal commodityQuantity) {
        //检查商品数量
        if (BigDecimal.ZERO.compareTo(commodityQuantity) >= 0) {
            logger.warn("平台账户转账给其他用户，商品数量必须大于0");
            return new RespResult(RespCode.PARAMS_ERROR);
        }

        try {
            commodityQuantity.toBigIntegerExact();
        } catch (Exception e) {
            logger.warn("转账数量不正确,commodityQuantity:{}", commodityQuantity);
            return new RespResult(RespCode.PARAMS_ERROR);
        }

        //检查平台用户信息
        UserInfo centerUserInfo = this.baseInfoService.queryUserInfo(centerUserId);
        if (!StringUtils.equalsIgnoreCase(centerUserInfo.getUserType(), "CENTER")) {
            logger.warn("centerUserId:{}, 不是平台账户", centerUserId);
            return new RespResult(RespCode.PARAMS_ERROR);
        }

        //转账
        RespResult respResult = this.tradeAccountService.baseTransfer(commodityContractId, centerUserId, AccountType.USER, receiveUserId, AccountType.USER, commodityQuantity, CommodityFlowType.TRANSFER_CENTER_TO_USER, null, null);
        return respResult;
    }

    /**
     * 刷新活动抽奖定时任务
     * @return
     */
    @PostMapping("updateDrawConvert")
    @ResponseBody
    public RespResult updateDrawConvert(@RequestParam("convertObjId") Long convertObjId) {
        try {
            Calendar calendar = Calendar.getInstance();
            Long time = ConvertObjDrawTask.runnedMap.get(convertObjId);
            if (time != null) {
                // 如果上次执行时间已超过5分钟，则允许重复执行
                if (calendar.getTimeInMillis() - time > 5 * 60 * 1000) {
                    ConvertObjDrawTask.runnedMap.remove(convertObjId);
                }
            }

            calendar.add(Calendar.SECOND, 5);
            String expression = ConvertObjDrawTask.transDataToExpression(calendar.getTime());
            logger.info("，更新抽奖定时任务时间表达式：{}", expression);
            boolean result = this.dynamicTask.updateCronExpression(ConvertObjDrawTask.triggerName, expression);
            if (result) {
                logger.info("更新抽奖定时任务时间表达式成功：{}", expression);
                return new RespResult(RespCode.SUCCESS);
            }

            logger.warn("更新抽奖定时任务时间表达式失败：{}", expression);
            return new RespResult(RespCode.SERVER_BIZ_ERROR);
        }
        catch (Exception ex) {
            logger.warn("更新抽奖定时任务时间表达式失败", ex);
            return new RespResult(RespCode.SERVER_BIZ_ERROR);
        }
    }

    /**
     * 测试：执行退还过期红包
     */
    @GetMapping("immediateRefundGift")
    @ResponseBody
    public String immediateRefundGift(@RequestParam(defaultValue = "-1") int dayAfter) {
        Date endExpiredTime = new Date();
        Date startExpiredTime = DateUtil.afterNDays(endExpiredTime, dayAfter);
        //查询10天内过期未处理的红包
        List<Long> expiredGiftInfoIds = giftService.selectExpiredGiftInfoId(startExpiredTime, endExpiredTime);
        expiredGiftInfoIds.parallelStream().forEach(expiredGiftInfoId -> {
            try {
                giftService.handleExpiredGiftInfo(expiredGiftInfoId);
            } catch (Exception e) {
                logger.error("退还过期红包失败， 红包id：{}", expiredGiftInfoId);
            }
        });
        return "ok";
    }

    /**
     * 查询快递公司信息
     * @return
     * @param expressName 物流公司名称
     * @param maxSize     单页数量
     * @param page        页数
     */
    @GetMapping("queryExpressList")
    @ResponseBody
    public RespResult queryExpressList(@RequestParam(name = "expressName", required = false) String expressName,
                                       @RequestParam(name = "maxSize", defaultValue = "20")Integer maxSize,
                                       @RequestParam(name = "page", defaultValue = "1")Integer page) {
        try {
            //查询缓存, 如果有，直接返回缓存  没有就直接查数据接口,并缓存,ttl设为1天
            BoundValueOperations boundValueOperations = this.redisTemplate.boundValueOps("cache:expressList:" + expressName + "_" + maxSize + "_" + page );
            Object cacheObj = boundValueOperations.get();
            if (cacheObj != null) {
                ExpressList expressList = JSONObject.parseObject(cacheObj.toString(), ExpressList.class);
                return new RespResult(RespCode.SUCCESS, expressList);
            }

            ExpressList expressList = this.expressAPI.expressList(expressName, maxSize, page);
            boundValueOperations.set(JSONObject.toJSONString(expressList), 1, TimeUnit.DAYS);
            return new RespResult(RespCode.SUCCESS, expressList);
        } catch (Exception e) {
            logger.error("查询快递公司信息失败:", e);
            return new RespResult(RespCode.FAIL, e.getMessage());
        }
    }
}
