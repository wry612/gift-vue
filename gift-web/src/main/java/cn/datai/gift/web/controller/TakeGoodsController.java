package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.DeliveryOrder;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.TakeGoodsService;
import cn.datai.gift.web.service.TradeDetailService;
import cn.datai.gift.web.vo.tradeDetail.TakeGoodsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 提货
 * Created by Administrator on 2017/4/11.
 */
@RequestMapping("/pickUp")
@Controller
public class TakeGoodsController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TakeGoodsController.class);

    @Autowired
    private TakeGoodsService takeGoodsService;

    @Autowired
    private TradeDetailService tradeDetailService;

    @Autowired
    private CommodityService commodityService;

    /**
     * 跳转提货
     * @return
     */
    @RequestMapping(value ="/takeGoods")
    @Auth(needLogin = true,weixinJsAuth = true,needBind = false)
    public String takeGoods(){
        return "gift/takeGoods";
    }

    /**
     * 提货规则
     * @return
     */
    @RequestMapping(value ="/deliveryRules",method = RequestMethod.GET)
    @Auth(needLogin = true,weixinJsAuth = true)
    public String deliveryRules(){
        return "gift/deliveryRules";
    }

    /**
     *查询提货详细信息
     * @param userInfoId
     * @param deliveryDetailsId
     * @return
     */
    @RequestMapping(value = "/queryDeliveryDetailInfo",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult queryDeliveryDetailInfo(@ModelAttribute("userInfoId") Long userInfoId,@RequestParam("deliveryDetailsId") Long deliveryDetailsId){
        try {
            List<UserBizBrief> userBizBriefList = this.tradeDetailService.queryUserBizBriefList(deliveryDetailsId, PayBizType.DELIVERY.getPersistKey());
            if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
                LOGGER.error("没有查询到相关的买入详情，订单ID：{}",deliveryDetailsId);
                return new RespResult(RespCode.FAIL,null);
            }
            if(!userBizBriefList.get(0).getUserInfoId().equals(userInfoId)){
                LOGGER.error("没有查询到相关的买入详情，订单ID：{}",deliveryDetailsId);
                return new RespResult(RespCode.FAIL,null);
            }
            DeliveryOrder deliveryOrder = takeGoodsService.queryDeliveryOrderById(deliveryDetailsId);
            CommodityVo commodityVo = commodityService.findById(deliveryOrder.getCommodityContractId());

            Long timeOut = deliveryOrder.getExpireTime().getTime() - System.currentTimeMillis();
            return new RespResult(RespCode.SUCCESS,new TakeGoodsVo(commodityVo,deliveryOrder,timeOut));
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("查询提货明细发生异常，提货单号：{},错误信息：{}",deliveryDetailsId,e);
            return new RespResult(RespCode.FAIL,null);
        }
    }

    /**
     *在未付款的情况下取消提货申请
     * @return
     */
    @RequestMapping(value = "cancelTakeGoods",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult cancelTakeGoods(@RequestParam("deliveryOrderId") Long deliveryOrderId,@ModelAttribute("userInfoId") Long userInfoId){
        try {
            this.takeGoodsService.cancelTakeGoods(deliveryOrderId,userInfoId);
            return new RespResult(RespCode.SUCCESS,null);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("取消商品提货发生异常：{}",e);
            return new RespResult(RespCode.FAIL,null);
        }
    }

}
