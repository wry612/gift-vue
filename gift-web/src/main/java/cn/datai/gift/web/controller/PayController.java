package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.DeliveryOrder;
import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.crypto.bcrypt.BCryptPasswordEncoder;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.contants.enums.PayChannel;
import cn.datai.gift.web.contants.enums.PayInfoStatus;
import cn.datai.gift.web.contants.enums.WxTradeType;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.plugin.vo.WxPayNotifyResponse;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.task.WeixinOrderQueryTask;
import cn.datai.gift.web.utils.IpUtil;
import cn.datai.gift.web.vo.tradeDetail.TradeOrderVo;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import cn.datai.gift.wxpay.bean.common.WxPayNotifyReceiver;
import cn.datai.gift.wxpay.util.MapEntryConverter;
import cn.datai.gift.wxpay.util.SignUtil;
import cn.datai.gift.wxpay.util.WxPayResponseUtils;
import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支付
 * Created by zhangyutao on 2017/4/7.
 */
@Controller
@RequestMapping("test/pay")
public class PayController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private WeixinOrderQueryTask weixinOrderQueryTask;


    @Autowired
    private PayService payService;

    @Autowired
    private BuyCommodityService buyCommodityService;

    @Value("${weixin.appID}")
    private String wxAppid;

    @Autowired
    private TradeDetailService tradeDetailService;

    @Autowired
    private TakeGoodsService takeGoodsService;

    @Autowired
    private CommodityService commodityService;

    @Value("${wexin.pay.apikey}")
    private String wxSignKey;

    @Value("${weixin.pay.test}")
    private boolean wxPayTest;

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 支付页面
     *
     * @return
     */
    @GetMapping("genOrder")
    @Auth(needLogin = true, weixinJsAuth = true)
    public String genOrderPage() {
        return "pay/genOrder";
    }


    /**
     * 微信服务器通知本系统支付结果的接口
     */
    @PostMapping(value = "/wx/notify/v1", consumes = {MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_XML_VALUE}, produces ={MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public WxPayNotifyResponse wxPayResultNotify(@RequestBody String str){
        if (wxPayTest) {
            String test_wxpay_close_notify_interface = redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).get("TEST_WXPAY_CLOSE_NOTIFY_INTERFACE").toString();
            if (StringUtils.equals(test_wxpay_close_notify_interface, "true")) {
                return WxPayNotifyResponse.SUCCESS;
            }
        }
        //检查签名
        logger.debug("微信回复支付结果：{}", str);
        Map<String, String> map = this.xmlToMap(str, "xml");
        boolean signStatus = SignUtil.checkSign(map, wxSignKey);
        if (signStatus == false) {
            logger.error("微信支付结果通知签名验证失败， 微信通知报文：", str);
            return WxPayNotifyResponse.FAIL.failMsg("签名失败");
        }
        WxPayNotifyReceiver wxPayNotifyReceiver = null;
        try {
            wxPayNotifyReceiver = WxPayResponseUtils.getWxPayNotifyReceiver(map);
        } catch (Exception e) {
            logger.error("微信支付结果通知反序列化失败：", e);
            return WxPayNotifyResponse.FAIL.failMsg("系统异常，反序列化失败");
        }

        //returnCode为SUCCESS，代表微信端已支付成功
        String returnCode = wxPayNotifyReceiver.getReturnCode();
        if ("SUCCESS".equals(returnCode)) {
            //支付成功，存储数据库，更新相关的业务数据。 如果此步出错，返回FAIL
            PayInfo payInfo = null;
            try {
                //只处理支付成功的支付模块逻辑，不含支付成功后的业务操作
                payInfo = payService.wxPayResultNotify(wxPayNotifyReceiver);

                try {
                    //异步执行 新开事务处理支付成功后的业务操作，必须捕获异常，不能影响正常的像微信服务器反馈消息，如果发生异常，后续会有定时任务检查支付状态和业务状态
                    payService.afterPayBizHandler(payInfo);
                } catch (WxPayNetException e) {
                    logger.error("微信通信失败");
                } catch (IOException e) {
                    logger.error("支付成功后发生业务异常");
                }
            } catch (BizException e) {
                if (e.getErrorCode().equals(RespCode.WX_PAY_ALREADY_SUCCESS.getCode())) {
                    //重复处理，但需要回复微信服务器成功处理,让微信服务器别再发了
                    logger.info("已处理支付结果，不需要重复处理");
                    return WxPayNotifyResponse.SUCCESS;
                } else {
                    logger.error("处理微信支付结果回调异常", e);
                    return WxPayNotifyResponse.FAIL.failMsg(e.getErrorMsg());
                }
            }
            if (PayInfoStatus.SUCCESS.getPersistKey().equals(payInfo.getStatus())) {
                //判断是否已处理成功
                return WxPayNotifyResponse.SUCCESS;
            }
        } else if ("FAIL".equals(returnCode)) {
            //正常情况下不会出现这种情况 支付失败，存储数据库，将微信支付订单状态改为失败，给pay_info 绑定一个新的微信支付订单 如果此步出错，返回FAIL
            //处理成功给微信服务器反馈收到消息

            //TODO 记录微信支付记录结果，并将当前记录失效， 后面需要做重新生成支付订单，让用户重新支付
            return WxPayNotifyResponse.SUCCESS;
        }
        throw new BizException(RespCode.SERVER_ERROR);
    }


    /**
     * 购买商品
     * @param userInfoId 用户ID
     * @param commodityId 商品Id
     * @param quantity 购买数量
     * @param quantityType 购买的类型（毫升、瓶、克、饼）(value =1\2)
     * @return
     */
    @RequestMapping(value = "/buyCommodity",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult buyCommodity(@ModelAttribute("userInfoId") long userInfoId,
                                   @ModelAttribute("userLoginInfo")UserLoginInfo userLoginInfo,
                                   @RequestParam("commodityId") long commodityId,
                                   @RequestParam("quantity") BigDecimal quantity,
                                   @RequestParam("quantityType") BigDecimal quantityType,
                                   HttpServletRequest request){
        PayInfo payInfo = null;
        try {
            payInfo = buyCommodityService.buyCommodity(userInfoId, commodityId, quantity, quantityType);
            if (null == payInfo) {
                return new RespResult(RespCode.SUCCESS, null);
            }
        } catch (BizException produceOrderBizException) {
            if ("2015".equals(produceOrderBizException.getErrorCode())) {
                return new RespResult(RespCode.OVER_BUY_NUM, "超出最大购买数量");
            } else if ("2013".equals(produceOrderBizException.getErrorCode())) {
                return new RespResult(RespCode.OVER_EXPIRE_TIME, "商品过期，不能购买");
            } else {
                logger.error("购买商品生成订单失败，错误信息：{}", produceOrderBizException);
                return new RespResult(RespCode.BIZCODE,"购买商品生成订单失败");
            }
        } catch (Exception produceOrderException){
            logger.error("购买商品生成订单失败,错误信息：{}", produceOrderException);
            return new RespResult(RespCode.BIZCODE,"购买商品生成订单失败");
        }

        HashMap<String, String> wxPayParams = new HashMap<>();//微信支付需要的参数
        wxPayParams.put("deviceInfo", null);

        CommodityVo commodityVo = null;
        try {
            commodityVo = commodityService.findById(commodityId);
        } catch (IOException e) {
            return new RespResult(RespCode.FAIL,RespCode.REDIS_NOT_FUND.getMsg());
        }
        wxPayParams.put("body", "礼尚-" + commodityVo.getCommodityName());

        wxPayParams.put("detail", null);
        wxPayParams.put("attach", null);
        wxPayParams.put("feeType", "CNY");
        wxPayParams.put("spbillCreateIp", IpUtil.getIpAddr(request));
        wxPayParams.put("goodsTag", null);
        wxPayParams.put("tradeType", WxTradeType.JSAPI.getPersistKey());
        wxPayParams.put("productId", null);
//        wxPayParams.put("limitPay", "no_credit");//不允许使用信用卡支付
        wxPayParams.put("openid", userLoginInfo.getWeixinOpenId());
        try {
            Map wxFrontParams = payService.payChannelOrder(payInfo, PayChannel.WX, wxPayParams);
            wxFrontParams.put("tradeOrderId", payInfo.getBizId());
            return new RespResult(RespCode.SUCCESS, wxFrontParams);
        } catch (Exception e) {
            logger.error("用户购买商品发生异常：用户Id:{},商品Id:{},购买数量：{},购买的类型：{},错误信息：{}", userInfoId, commodityId, quantity, quantityType, e);
            logger.error("用户购买商品发生异常：错误信息：", e);
            return new RespResult(RespCode.FAIL, payInfo.getBizId());
        }
    }

    /**
     * 买商品详细信息
     * @param tradeOrderId
     * @return
     */
    @RequestMapping(value = "/tradeOrderDetail",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult tradeOrderDetail(@ModelAttribute("userInfoId") Long userInfoId,@RequestParam("tradeOrderId") Long tradeOrderId) throws IOException {
        try {
            List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(tradeOrderId, PayBizType.BUY_COMMODITY.getPersistKey());
            if(null == userBizBriefList || userBizBriefList.isEmpty() ||userBizBriefList.size()>1){
                logger.error("没有查询到相关的买入详情，订单ID：{}",tradeOrderId);
                return new RespResult(RespCode.FAIL,null);
            }
            if(!userBizBriefList.get(0).getUserInfoId().equals(userInfoId)){
                logger.error("没有查询到相关的买入详情，订单ID：{}",tradeOrderId);
                return new RespResult(RespCode.FAIL,null);
            }
            TradeOrder tradeOrder = tradeDetailService.queryTradeOrder(tradeOrderId);
            CommodityVo commodityVo = commodityService.findById(tradeOrder.getCommodityId());

            Long timeOut = tradeOrder.getExpireTime().getTime() - System.currentTimeMillis();

            return new RespResult(RespCode.SUCCESS,new TradeOrderVo(tradeOrder,commodityVo,timeOut));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询购买商品详细信息发生异常,购买商品记录：{},错误信息：{}",tradeOrderId,e);
            return new RespResult(RespCode.FAIL,null);
        }
    }

    /**
     * 取消购买商品操作
     * @param tradeOrderId
     * @param userInfoId
     * @return
     */
    @RequestMapping(value = "/cancelBuyCommodityInfo",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult cancelBuyCommodityInfo(@RequestParam("tradeOrderId") Long tradeOrderId,@ModelAttribute("userInfoId") Long userInfoId){
        try {
            buyCommodityService.cancelBuyCommodityInfo(tradeOrderId,userInfoId);
            return new RespResult(RespCode.SUCCESS,null);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("取消购买商品发生异常,订单号：{},错误信息：{}",tradeOrderId,e);
            return new RespResult(RespCode.FAIL,null);
        }

    }

    /**
     * 交易详情中的付款页--付款
     * @param userLoginInfo
     * @param tradeOrderId
     * @return
     */
    @RequestMapping(value = "/payforBuyCommodity",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult payforBuyCommodity(@ModelAttribute("userLoginInfo")UserLoginInfo userLoginInfo,@RequestParam("tradeOrderId") String tradeOrderId,HttpServletRequest request) {
        try {
           return payService.payforBuyCommodity(userLoginInfo, Long.valueOf(tradeOrderId),request);
        } catch (BizException e) {
            if (e.getErrorCode().equals(RespCode.PAY_ALREADY.getCode())) {
                return new RespResult(RespCode.FAIL,RespCode.PAY_ALREADY);
            }else{
                return new RespResult(RespCode.FAIL,"付款失败");
            }
        } catch (Exception e) {
            logger.error("错误信息：{}",e);
            return new RespResult(RespCode.FAIL);
        }
    }


    public Map<String, String> xmlToMap(String xml, String rootNodeName) {
        XStream xStream = new XStream();
        xStream.registerConverter(new MapEntryConverter());
        xStream.alias(rootNodeName, Map.class);
        return (Map<String, String>) xStream.fromXML(xml);
    }

    /**
     * 提货
     * @param deliveryOrder
     * @return
     */
    @RequestMapping(value = "/produceOrder",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true,needBind = false,needPassword = true)
    @ResponseBody
    public RespResult produceOrder(DeliveryOrder deliveryOrder,
                                   @ModelAttribute("userInfoId") Long userInfoId,
                                   @ModelAttribute("userLoginInfo") UserLoginInfo userLoginInfo,
                                   HttpServletRequest request){
            deliveryOrder.setUserId(userInfoId);
            PayInfo payInfo = null;
            try {
                payInfo = takeGoodsService.produceOrder(deliveryOrder);
                if(null == payInfo){
                    return new RespResult(RespCode.SUCCESS, null);
                }
            } catch (BizException be) {
                logger.error("生成提货订单时发生异常,提货订单信息：{},错误信息：{}", JSONObject.toJSONString(deliveryOrder),JSONObject.toJSONString(be));
                if("2014".equals(be.getErrorCode())){
                    return new RespResult(RespCode.BIZCODE,"超出最大提货数量");
                }else if("2013".equals(be.getErrorCode())){
                    return new RespResult(RespCode.BIZCODE,"超过有效的提货日期");
                }else{
                    return new RespResult(RespCode.BIZCODE,"提货生成订单失败");
                }
            }catch (Exception e) {
                logger.error("生成提货订单时发生异常,提货订单信息：{},错误信息：{}", JSONObject.toJSONString(deliveryOrder),e);
                return new RespResult(RespCode.BIZCODE,"提货生成订单失败");
            }
            HashMap<String, String> wxPayParams = new HashMap<>();//微信支付需要的参数
            wxPayParams.put("deviceInfo", null);

            CommodityVo commodityVo = null;
            try {
                commodityVo = commodityService.findById(deliveryOrder.getCommodityContractId());
            } catch (IOException e) {
                return new RespResult(RespCode.FAIL,RespCode.REDIS_NOT_FUND.getMsg());
            }
            wxPayParams.put("body", "礼尚-" + commodityVo.getCommodityName());

            wxPayParams.put("detail", null);
            wxPayParams.put("attach", null);
            wxPayParams.put("feeType", "CNY");
            wxPayParams.put("spbillCreateIp", IpUtil.getIpAddr(request));
            wxPayParams.put("goodsTag", null);
            wxPayParams.put("tradeType", WxTradeType.JSAPI.getPersistKey());
            wxPayParams.put("productId", null);
//            wxPayParams.put("limitPay", "no_credit");//不允许使用信用卡
            wxPayParams.put("openid", userLoginInfo.getWeixinOpenId());
        try {
            Map wxFrontParams = payService.payChannelOrder(payInfo, PayChannel.WX, wxPayParams);
            wxFrontParams.put("deliveryOrderId",payInfo.getBizId());
            return new RespResult(RespCode.SUCCESS, wxFrontParams);
        } catch (Exception e) {
            logger.error("生成提货订单付款时发生异常,提货订单信息：{},错误信息：{}", JSONObject.toJSONString(deliveryOrder),e);
            return new RespResult(RespCode.FAIL,payInfo.getBizId());
        }
    }

    /**
     * 在交易明细中提货待付款（此时提货订单已产生，但是付款失败，导致交易明细中会出现提货未付款的现象）
     * @return
     */
    @RequestMapping(value = "payForDetailTakeGoods",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult payForDetailTakeGoods(@RequestParam("deliveryOrderId") Long deliveryOrderId,@ModelAttribute("userLoginInfo") UserLoginInfo userLoginInfo,HttpServletRequest request){
        try {
            RespResult respResult = this.takeGoodsService.payForDetailTakeGoods(deliveryOrderId, userLoginInfo, request);
            return respResult;
        } catch (BizException be) {
            logger.error("提货付款发生异常：{}",be);
            return new RespResult(RespCode.FAIL,be);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("提货付款发生异常：{}",e);
            return new RespResult(RespCode.FAIL,"提货付款发生异常");
        }
    }

    /**
     * 跳转提货订单页
     * @return
     */
    @RequestMapping(value ="/deliveryOrder",method = RequestMethod.GET)
    @Auth(needLogin = true,weixinJsAuth = true)
    public String deliveryOrder(){
        return "gift/deliveryOrder";
    }

    /**
     * 跳转买商品付款页面
     * @return
     */
    @RequestMapping(value ="/sellInOrder")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String sellInOrder(){
        return "gift/sellInOrder";
    }
    /**
     * 跳转待付款的订单页
     * @return
     */
    @RequestMapping(value ="/payOrder")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String payOrder(){
        return "gift/payOrder";
    }

    @RequestMapping(value ="/sellInDetails")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String sellInDetails(){
        return "gift/sellInDetails";
    }

    /**
     * 测试执行微信支付批量查询任务
     * @return
     */
    @GetMapping("execWxPayQueryTask")
    public RespResult execWxPayQueryTask() {
        this.weixinOrderQueryTask.orderQuery();
        return new RespResult(RespCode.SUCCESS);
    }

    @RequestMapping(value ="/deliveryDetails")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String deliveryDetails(@RequestParam("deliveryDetailsId") Long deliveryDetailsId,Model model){
        model.addAttribute("deliveryDetailsId",deliveryDetailsId);
        return "gift/deliveryDetails";
    }

}
