package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.persist.vo.conversion.ConvertRuleVO;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.Conversion.ConvertInfoVo;
import cn.datai.gift.web.vo.Conversion.ConvertObjExt;
import cn.datai.gift.web.vo.Conversion.ConvertObjOrderVo;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 以物换物
 * Created by zhangyutao on 2017/6/13.
 */
@Controller
@RequestMapping(value = "conversion")
public class ConversionController extends BaseController{

    public static final Logger logger = LoggerFactory.getLogger(ConversionController.class);

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private GiftService tradeService;

    @Autowired
    private BaseInfoService baseInfoService;

    /**
     * 以物换物列表页
     * @return
     */
    @GetMapping("listPage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String listPage() {
        return "conversion/list";
    }

    /**
     * 查询所有有效的物品信息
     * @return
     */
    @GetMapping("list")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public List<ConvertObj> list() {
        List<ConvertObj> allValidConvertObj = this.conversionService.findAllValidConvertObj();
        return allValidConvertObj;
    }

    /**
     * 以物换物详情页面
     * @return
     */
    @GetMapping("detailPage/{convertObjId}")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String detailPage(@PathVariable(name = "convertObjId") long convertObjId,Model model) {
        model.addAttribute("convertObjId",convertObjId);
        return "conversion/detail";
    }

    /**
     * 以物换物活动参与记录
     * @return
     */
    @GetMapping("recordPage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String recordPage(Model model) {
        return "conversion/activityRecord";
    }

    /**
     * 以物换物计算详情
     * @return
     */
    @GetMapping("computeDetail")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String computeDetail(Model model) {
        return "conversion/computeDetail";
    }

    /**
     * 更多中奖信息
     * @return
     */
    @GetMapping("drawedDetail")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String drawedDetail(Model model) {
        return "conversion/drawedDetail";
    }

    /**
     * 物品明细
     * @return
     */
    @GetMapping("detail/{convertObjId}")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult detail(@ModelAttribute("userInfoId") Long userInfoId,@PathVariable(name = "convertObjId") long convertObjId) {
        try {
            ConvertObj convertObj = this.conversionService.findDetailById(convertObjId);
            ConvertObjExt convertObjExt = new ConvertObjExt();
            PropertyUtils.copyProperties(convertObjExt, convertObj);
            long currentTimeMillis = System.currentTimeMillis();
            convertObjExt.setTimeSlotEnd(convertObj.getEndTime().getTime() - currentTimeMillis);//活动的截止时间
            convertObjExt.setTimeSlotBegin(currentTimeMillis - convertObj.getStartTime().getTime());//活动的开始时间
            if(convertObj.getRuleType().equals("DRAW")){
                convertObjExt.setTimeSlotDraw(convertObj.getDrawTime().getTime() - currentTimeMillis);//活动的抽奖时间
            }

            String systemParamsValue = baseInfoService.getSystemParamsValue(StatusConstants.MAX_CONVERSION_DRAW);
            if(MyStringUtil.isBlank(systemParamsValue)){
                return new RespResult(RespCode.FAIL,"配置参数发生错误");
            }
            convertObjExt.setMaxConversionDraw(Integer.valueOf(systemParamsValue));//每一次抽奖和兑换的份数限制

            return new RespResult(RespCode.SUCCESS,convertObjExt);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询可兑换的物品详细发生异常，物品：{}，错误信息：{}",convertObjId,e);
            return new RespResult(RespCode.FAIL,"查询物品详情失败");
        }
    }

    /**
     *兑换物品规则明细
     * @param convertObjId
     * @param userInfoId
     * @return
     */
    @GetMapping("findRuleVOByObjId/{convertObjId}")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult findRuleVOByObjId(@PathVariable(name = "convertObjId") long convertObjId,@ModelAttribute("userInfoId") Long userInfoId){

        try {
            List<ConvertRuleVO> convertRuleVOList = conversionService.findRuleVOByObjId(convertObjId, userInfoId);
            return new RespResult(RespCode.SUCCESS,convertRuleVOList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询以物换物规则发生异常，convertObjId:{},错误信息：{}",convertObjId,e);
            return new RespResult(RespCode.FAIL,"查询以物换物规则详情发生异常");
        }

    }

    /**
     * 以物换物订单确认页面
     * @return
     */
    @GetMapping("orderConfirmPage")
    @Auth(weixinJsAuth = true)
    public String orderConfirmPage() {
        return "conversion/orderConfirm";
    }

    /**
     * 以物换物下单
     * @param userInfoId
     * @param convertObjOrder
     * @return
     */
    @PostMapping("order")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult order(@ModelAttribute("userInfoId") Long userInfoId,ConvertObjOrder convertObjOrder) {

        try {
            convertObjOrder.setUserInfoId(userInfoId);
            List<ConvertObjOrder> convertObjOrderList = this.conversionService.order(convertObjOrder);
            return new RespResult(RespCode.SUCCESS, convertObjOrderList);
        }catch (BizException biz) {
            logger.error("兑换物品发生异常,参数信息：{}，错误信息：{}", JSONObject.toJSONString(convertObjOrder),biz);
            return new RespResult(RespCode.FAIL,biz.getMessage());
        }catch (Exception e) {
            logger.error("兑换物品发生异常,参数信息：{}，错误信息：{}", JSONObject.toJSONString(convertObjOrder),e);
            return new RespResult(RespCode.FAIL,e.getMessage());

        }
    }

    /**
     * 以物换物订单详情页面
     * @return
     */
    @GetMapping("orderDetailPage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String orderDetailPage(Model model) {
        return "conversion/orderDetail";
    }

    /**
     * 以物换物报名成功页面
     * @return
     */
    @GetMapping("signSuccessPage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String signSuccessPage() {
        return "conversion/signSuccess";
    }


    /**
     * 通过Id查询以物换物订单信息
     * @param convertObjOrderId
     * @return
     */
    @PostMapping("queryConvertObjOrderId")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult queryConvertObjOrderId(@RequestParam("convertObjOrderId") Long convertObjOrderId,@ModelAttribute("userInfoId") Long userInfoId){
        try {
            ConvertObjOrder convertObjOrder = this.conversionService.queryConvertObjOrderById(convertObjOrderId);
            if(convertObjOrder == null || !convertObjOrder.getUserInfoId().equals(userInfoId)){
                return new RespResult(RespCode.FAIL,"非本人用户查询");
            }
            ConvertObj convertObj = this.conversionService.findDetailById(convertObjOrder.getConvertObjId());
            ConvertRule convertRule = this.conversionService.queryConvertRuleById(convertObj.getConvertObjId(), convertObjOrder.getCommodityContractId());
            CommodityVo commodityVo = this.commodityService.findById(convertObjOrder.getCommodityContractId());
            return new RespResult(RespCode.SUCCESS,new ConvertInfoVo(convertObj,convertObjOrder, convertRule,commodityVo));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("通过Id查询以物换物订单信息发生异常，Id:{},错误信息：{}",convertObjOrderId,e);
            return new RespResult(RespCode.FAIL,null);
        }
    }

    /**
     * 测试功能抽奖
     * @return
     */
    @PostMapping("drawObj")
    @ResponseBody
    public RespResult drawObj(@RequestParam("convertObjId") Long convertObjId){
        try {
            ConvertObj convertObj = conversionService.findDetailById(convertObjId);
            this.conversionService.drawObj(convertObj);
            return new RespResult(RespCode.SUCCESS,null);
        } catch (Exception e) {
            e.printStackTrace();
            return new RespResult(RespCode.FAIL,null);
        }
    }

    /**
     * 报名抽奖确认页面简单查询用户持仓信息确认是否可以报名
     * @param userInfoId
     * @param commodityContractId 商品Id
     * @param convertObjId 要对黄的物品的Id
     * @return
     */
    @PostMapping("checkCanSignUp")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult checkCanSignUp(@ModelAttribute("userInfoId") Long userInfoId,
                                     @RequestParam("commodityContractId") Long commodityContractId,
                                     @RequestParam("convertObjId") Long convertObjId){
        try {
            GiftAccount giftAccount = this.tradeService.queryGiftAccountByUserIdAndCommodityId(userInfoId, commodityContractId);
            ConvertRule convertRule = this.conversionService.queryConvertRuleById(convertObjId, commodityContractId);
            if(giftAccount == null || convertRule == null){
                return new RespResult(RespCode.FAIL,"用户账户异常");
            }
            if(giftAccount.getAvailableUnitQuantity().compareTo(new BigDecimal(convertRule.getComodityObjRatio())) <0){
                return new RespResult(RespCode.FAIL,"用户持仓不足");
            }
            return new RespResult(RespCode.SUCCESS,null);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询用户持仓信息发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"查询用户信息失败");
        }
    }

    /**
     * 通过物品Id查询按照活动序列号排序的后10条和第一条
     * @param convertObjId
     * @return
     */
    @PostMapping("queryConvertObjOrderList")
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult queryConvertObjOrderList(@RequestParam("convertObjId") Long convertObjId){
        List<ConvertObjOrderVo> convertObjOrderVoList = new ArrayList<>();
        try {
            List<ConvertObjOrder> convertObjOrderList = this.conversionService.queryConvertObjOrderListById(convertObjId);
            if(convertObjOrderList == null  || convertObjOrderList.isEmpty()){
                return new RespResult(RespCode.SUCCESS,null);
            }
            ConvertObjOrderVo convertObjOrderVo = null;
            for(ConvertObjOrder convertObjOrder :convertObjOrderList){
                convertObjOrderVo = new ConvertObjOrderVo();

                PropertyUtils.copyProperties(convertObjOrderVo,convertObjOrder);
                UserInfo userInfo = baseInfoService.queryUserInfo(convertObjOrder.getUserInfoId());
                convertObjOrderVo.setNickName(URLDecoder.decode(userInfo.getNickname(),"utf-8"));
                convertObjOrderVoList.add(convertObjOrderVo);
            }
            return new RespResult(RespCode.SUCCESS,convertObjOrderVoList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询报名参加的用户订单信息发生异常：物品ID：{},错误信息：{}",convertObjId,e);
            return new RespResult(RespCode.FAIL,"查询参加报名订单发生异常");
        }

    }

    /**
     * 查询某个物品的中奖信息(type：false,查询该活动的所有的中奖订单,true,查询该用户该活动的所有中奖订单)
     * @param convertObjId
     * @return
     */
    @PostMapping("queryDrawPeople")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult queryDrawPeople(@RequestParam("convertObjId") Long convertObjId,@ModelAttribute("userInfoId") Long userInfoId,Boolean type){
        try {
            List<ConvertObjOrder> convertObjOrderList = conversionService.querydrawPeopleList(convertObjId,userInfoId,type);
            List<ConvertObjOrderVo> list  = new ArrayList<>();

            if(convertObjOrderList != null && convertObjOrderList.size()>0){
                convertObjOrderList.forEach(convertObjOrder ->{
                    ConvertObjOrderVo convertObjOrderVo = new ConvertObjOrderVo();
                    try {
                        PropertyUtils.copyProperties(convertObjOrderVo,convertObjOrder);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                    UserInfo userInfo = baseInfoService.queryUserInfo(convertObjOrderVo.getUserInfoId());
                    try {
                        convertObjOrderVo.setNickName(URLDecoder.decode(userInfo.getNickname(),"UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    convertObjOrderVo.setHeadImgPath(userInfo.getHeadImgPath());
                    convertObjOrderVo.setConvertObj(conversionService.findDetailById(convertObjOrder.getConvertObjId()));
                    list.add(convertObjOrderVo);
                });
            }
            return new RespResult(RespCode.SUCCESS,list);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询物品Id为：{}的中奖者列表发生异常，错误信息：{}",convertObjId,e);
            return new RespResult(RespCode.FAIL,"查询中奖者列表失败");
        }
    }

    /**
     * 通过分组Id查询用户某一组订单
     * @param orderGroupId
     * @param userInfoId
     * @return
     */
    @PostMapping("queryAllConvertOrderListByOrderGroupId")
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult queryAllConvertOrderListByOrderGroupId(@RequestParam("orderGroupId") String orderGroupId,@ModelAttribute("userInfoId") Long userInfoId){
        try {
            List<ConvertInfoVo> list = new ArrayList<>();
            List<ConvertObjOrder> orderList = this.conversionService.queryAllConvertOrderListByOrderGroupId(orderGroupId, userInfoId);

            orderList.forEach(convertObjOrder ->{
                if(!convertObjOrder.getUserInfoId().equals(userInfoId)){
                    throw new BizException(RespCode.USER_NOT_FOUND);
                }
                ConvertObj convertObj = this.conversionService.findDetailById(convertObjOrder.getConvertObjId());
                ConvertRule convertRule = this.conversionService.queryConvertRuleById(convertObj.getConvertObjId(), convertObjOrder.getCommodityContractId());
                CommodityVo commodityVo = null;
                try {
                    commodityVo = this.commodityService.findById(convertObjOrder.getCommodityContractId());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list.add(new ConvertInfoVo(convertObj,convertObjOrder, convertRule,commodityVo));
            });

            return new RespResult(RespCode.SUCCESS,list);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询某一组订单失败：{}",e);
            return new RespResult(RespCode.SUCCESS,"查询订单组失败");
        }

    }

}
