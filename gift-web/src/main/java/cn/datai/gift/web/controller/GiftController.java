package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.BaseUtil;
import cn.datai.gift.web.utils.PhotoUtil;
import cn.datai.gift.web.vo.gift.BigGiftBrief;
import cn.datai.gift.web.vo.gift.BigGiftDetail;
import cn.datai.gift.web.vo.gift.GiftGrabInfo;
import cn.datai.gift.web.vo.tradeAccount.HoldCommodityInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 收发红包
 * Created by Administrator on 2017/3/14.
 */
@Controller
@RequestMapping(value = "/gift")
public class GiftController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(GiftController.class);

    @Autowired
    private GiftService giftService;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private TradeDetailService tradeDetailService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MessageQueueService messageQueueService;

    @Value("${ali.mq.topic.register}")
    private String aliMqTopicRegister;

    @Value("${ali.mq.private.key}")
    private String aliMqPrivateKey;

    @Value("${ali.mq.tag}")
    private String aliMqTag;

    @RequestMapping(value ="/index")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String index(@ModelAttribute("userInfoId") Long userInfoId,HttpServletRequest request){
        return "gift/index";
    }

    /**
     * 红包入口页面
     * @return
     */

    @RequestMapping(value ="/getPacket/{giftInfoId}/{giftInfoCode}")
    @Auth(weixinJsAuth = true)
    public String getPacket(ModelMap model, @PathVariable("giftInfoId") long giftInfoId, @PathVariable("giftInfoCode") String giftInfoCode){
        model.addAttribute(giftInfoId);
        model.addAttribute(giftInfoCode);
        return "gift/getPacket";
    }
    @RequestMapping(value ="/getPacketDetails/{giftInfoId}/{giftInfoCode}")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String getPacketDetails(Model model, @PathVariable("giftInfoId") long giftInfoId, @PathVariable("giftInfoCode") String giftInfoCode){
        model.addAttribute(giftInfoId);
        model.addAttribute(giftInfoCode);
        return "gift/getPacketDetails";
    }
    @RequestMapping(value ="/getSecurities")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String getSecurities(){
        return "gift/getSecurities";
    }


    /**
     * 跳转发礼包页面
     * @return
     */
    @RequestMapping(value ="/setPacket")
    @Auth(needLogin = true,weixinJsAuth = true,needBind = false)
    public String setPacket(){
        return "gift/setPacket";
    }

    @RequestMapping(value ="/setPacketDetails/{giftInfoId}/{giftInfoCode}")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String setPacketDetails(Model model, @PathVariable("giftInfoId") long giftInfoId, @PathVariable("giftInfoCode") String giftInfoCode){
        model.addAttribute(giftInfoId);
        model.addAttribute(giftInfoCode);
        return "gift/setPacketDetails";
    }

    /**
     * 个人设置
     * @return
     */
    @RequestMapping(value ="/userSettings")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String userSettings(){
        return "gift/userSettings";
    }

    @RequestMapping(value ="/packetRules")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String packetRules(){
        return "gift/packetRules";
    }

    @RequestMapping(value ="/agreement")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String agreement(){
        return "gift/agreement";
    }

    @RequestMapping(value ="/mySecurities")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String mySecurities(){
        return "gift/mySecurities";
    }
    @RequestMapping(value ="/donation")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String donation(){
        return "gift/donation";
    }


    /**
     * 跳转买商品页面
     * @return
     */
    @RequestMapping(value ="/sellIn")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String sellIn(){
        return "gift/sellIn";
    }


    @RequestMapping(value ="/setSecurities")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String setSecurities(){
        return "gift/setSecurities";
    }

    /**
     * 查询单个商品详情页面
     * @return
     */
    @RequestMapping(value ="/commodityDetails")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String commodityDetails(@RequestParam("commodityId") Long commodityId,Model model){
        model.addAttribute("commodityId",commodityId);
        return "gift/commodityDetails";
    }

    /**
     * 绑定手机号页面
     * @return
     */
    @RequestMapping(value ="/bindMobile")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String bindMobile(@RequestParam(value = "redirecturl",required = false) String redirecturl,
                             @ModelAttribute("userInfoId") Long userInfoId,
                             Model model){

        model.addAttribute("redirecturl",redirecturl);
        //检查是不是已经发过短信，从而判断发送按钮的状态
        Boolean hasCountKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_TIME + userInfoId);
        if(hasCountKey){
            Long  lastTime= Long.valueOf(redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_TIME + userInfoId).toString());
            Long currentTime = System.currentTimeMillis();
            model.addAttribute("countDown",120-(currentTime - lastTime)/1000);
        }

        return "gift/bindMobile";
    }

    /**
     * 验证手机号
     * @return
     */
    @RequestMapping(value ="/checkMobile")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String checkMobile(@ModelAttribute("userInfoId") Long userInfoId,Model model){
        //检查是不是已经发过短信，从而判断发送按钮的状态
        Boolean hasCountKey = redisTemplate.hasKey(RedisConstants.USER_MOBILE_TIME + userInfoId);
        if(hasCountKey){
            Long  lastTime= Long.valueOf(redisTemplate.opsForValue().get(RedisConstants.USER_MOBILE_TIME + userInfoId).toString());
            Long currentTime = System.currentTimeMillis();
            model.addAttribute("countDown",120-(currentTime - lastTime)/1000);
        }
        return "gift/checkMobile";
    }

    @RequestMapping(value ="/sellOut")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String sellOut(){
        return "gift/sellOut";
    }

    @RequestMapping(value ="/accountDetails")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String accountDetails(){
        return "gift/accountDetails";
    }
    /**
     * 发红包
     * @param giftCount 红包个数
     * @param giftNum 商品数量
     * @param giftType 红包类型 （0：拼手气，1：平均）
     * @param commodityId 商品合约Id
     * @param greeting 祝福语
     * @param httpSession
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true,needPassword = true)
    @RequestMapping(value = "/donateGift",method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> donateGift(@RequestParam("giftCount") int giftCount,
                                  @RequestParam("giftNum") BigDecimal giftNum,
                                  @RequestParam("giftType") short giftType,
                                  @RequestParam("commodityId") Long commodityId ,
                                  String greeting,@RequestParam("commodityTypeCode")  String commodityTypeCode, HttpSession httpSession){

        //验证祝福语只能含有中文数字和字母

        Map<String,Object> result = new HashMap<>();
        if(!BaseUtil.checkSpecialCode(greeting)){
            result.put("errorMsg","祝福语只能包含中文数字和字母");
            result.put("msgCode",false);
            return result;
        }
        UserLoginInfo userLoginInfo = getUserLoginInfo(httpSession);
        try {
            CommodityGiftInfo commodityGiftInfo = tradeAccountService.giveGift(giftCount,giftNum,giftType,commodityId,greeting,userLoginInfo);
            result.put("commodityGiftInfoId",commodityGiftInfo.getCommodityGiftInfoId());//生成的红包的Id
            result.put("code",commodityGiftInfo.getCode());//唯一标识，防止用户篡改
            result.put("commodityTypeCode",commodityTypeCode);//唯一标识，防止用户篡改
            result.put("greeting",greeting);//唯一标识，防止用户篡改
            result.put("msgCode",true);
        }catch (BizException bx){
            result.put("errorMsg",bx.getMessage());
            result.put("msgCode",false);
            logger.error("发红包发生异常，错误信息：", bx);
        } catch (Exception e) {
            result.put("errorMsg","发红包操作发生异常");
            result.put("msgCode",false);
            logger.error("发红包发生异常，错误信息：{}",e);
        }

        return result;
    }

    /**
     * 礼包打包完成以后展示的页面
     * @param commodityGiftInfoId 商品礼包id
     * @param code 商品礼包code
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping("sendPacket/{commodityGiftInfoId}/{code}")
    public String sendPacket(@PathVariable("commodityGiftInfoId") long commodityGiftInfoId, @PathVariable("code") String code, ModelMap modelMap) throws IOException {
        CommodityGiftInfo giftInfo = giftService.findGiftInfo(commodityGiftInfoId, code);
        UserInfo userInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
        if (giftInfo == null || userInfo == null) {
            throw new BizException(RespCode.GIFT_NOT_FOUND);
        }
        modelMap.addAttribute(commodityGiftInfoId);
        modelMap.addAttribute(code);
        modelMap.addAttribute("nickName", URLDecoder.decode(userInfo.getNickname(),"utf-8"));

        modelMap.addAttribute("greeting",giftInfo.getGreeting());
        CommodityVo commodityVo = commodityService.findById(giftInfo.getCommodityContractId());
        List<CommodityType> commodityTypeList = commodityService.queryCommodityTypeList();

        modelMap.addAttribute("commodityTypeCode","");
        for(CommodityType commodityType : commodityTypeList){
            if(commodityType.getCommodityTypeId().equals(commodityVo.getCommodityTypeId())){
                modelMap.addAttribute("commodityTypeCode",commodityType.getCode());
                break;
            }
        }

        return "gift/sendPacket";
    }

    /**
     * 展示红包状态：
     * 1.红包不存在
     * 2.红包已过期，展示红包过期
     * 3.红包已抢完，展示红包已抢完
     * 4.红包已拆，展示抢了多少，并且展示别人抢了多少列表
     * 5.红包可拆，用户未拆，展示“拆”按钮
     * @param currentUserInfo 当前用户信息
     * @param id 红包id
     * @param code 红包code
     *
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping("/status/{id}/{code}")
    @ResponseBody
    public RespResult giftStatus(@ModelAttribute("userInfo")UserInfo currentUserInfo,
                                 @PathVariable("id") long id,
                                 @PathVariable("code") String code) throws IOException {
        try {
            Long userInfoId = currentUserInfo.getUserInfoId();
            //查询红包信息（不锁）
            CommodityGiftInfo giftInfo = giftService.findGiftInfo(id, code);
            //红包不存在
            if (giftInfo == null) {
                return new RespResult(RespCode.GIFT_NOT_FOUND);

            }

            //红包已过期
            if (giftInfo.getExpiredTime().before(new Date())) {
                UserInfo giveGiftUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
                giveGiftUserInfo.setNickname(URLDecoder.decode(giveGiftUserInfo.getNickname(),"utf-8"));
                return new RespResult(RespCode.GIFT_EXPIRED,giveGiftUserInfo);
            }
            //查询所有此大礼包下所有拆包明细
            List<CommodityGiftDonationDetail> giftDonationDetailList = giftService.findGiftDonationDetail(id, 0L);

            //当前用户拆包信息
            List<CommodityGiftDonationDetail> selfGiftDonationDetailList = new ArrayList<>();

            //其他用户拆包信息的集合:剔除当前用户拆包明细，剩下的拆包明细按时间升序排序,之后转换成GiftGrabInfo对象。
            List<GiftGrabInfo> othersGiftGrabInfoList = handleGiftGrabInfoList(userInfoId, giftDonationDetailList, selfGiftDonationDetailList);


            //当前用户已拆此红包,消息附带大礼包明细
            if (!selfGiftDonationDetailList.isEmpty()) {
                CommodityGiftDonationDetail selfCommodityGiftDonationDetail = selfGiftDonationDetailList.get(0);

                //准备 BigGiftDetail信息
                BigGiftDetail bigGiftDetail = new BigGiftDetail();
                bigGiftDetail.setId(giftInfo.getCommodityGiftInfoId());
                bigGiftDetail.setType(giftInfo.getType());
                bigGiftDetail.setGreeting(giftInfo.getGreeting());
                UserInfo donatorUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
                bigGiftDetail.setHeadImg(donatorUserInfo.getHeadImgPath());
                bigGiftDetail.setNickname(URLDecoder.decode(donatorUserInfo.getNickname(),"utf-8"));
                GiftAccount donatorTradeAccount = giftService.queryGiftAccount(giftInfo.getDonatorGiftAccountId());
                Long commodityContractId = donatorTradeAccount.getCommodityContractId();
                CommodityVo commodityContract = null;
                try {
                    commodityContract = commodityService.findById(commodityContractId);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                bigGiftDetail.setCommodityId(commodityContractId);
                bigGiftDetail.setCommodityName(commodityContract.getCommodityName());
                bigGiftDetail.setDoneeSurplus(giftInfo.getDoneeSurplus());
                bigGiftDetail.setDoneeQuota(giftInfo.getDoneeQuota());
                bigGiftDetail.setCommoditySurplusQuantity(giftInfo.getCommoditySurplusQuantity());
                bigGiftDetail.setCommodityTotalQuantity(giftInfo.getCommodityTotalQuantity());
                bigGiftDetail.setUnit(commodityContract.getUnit());
                bigGiftDetail.setCommodityPrice(commodityContract.getUnitPrice().toString());
                bigGiftDetail.setCommodityMatter(commodityContract.getSubjectMatter());
                GiftGrabInfo selfGrabInfo = new GiftGrabInfo();
                selfGrabInfo.setHeadImg(currentUserInfo.getHeadImgPath());
                selfGrabInfo.setNickname(URLDecoder.decode(currentUserInfo.getNickname(),"utf-8"));
                selfGrabInfo.setGrabTime(selfCommodityGiftDonationDetail.getAdoptTime());
                selfGrabInfo.setGrabQtn(selfCommodityGiftDonationDetail.getCommodityUnitQuantity());
                bigGiftDetail.setSelfGrabInfo(selfGrabInfo);
                bigGiftDetail.setOthersGrabInfoList(othersGiftGrabInfoList);
                bigGiftDetail.setTypeName(commodityContract.getTypeName());
                return new RespResult(RespCode.GIFT_HAS_GRAB, bigGiftDetail);
            }
            //但钱用户未拆红包，但红包已抢完,返回状态，不返回明细，提供另一个查询明细的接口
            if (giftInfo.getDoneeSurplus() == 0) {
                UserInfo giveGiftUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
                giveGiftUserInfo.setNickname(URLDecoder.decode(giveGiftUserInfo.getNickname(),"utf-8"));
                return new RespResult(RespCode.GIFT_EMPTY,giveGiftUserInfo);
            }
            //当前用户未拆此红包，且红包还有剩余, 返回红包简要信息
            //准备BigGiftBrief数据
            BigGiftBrief bigGiftBrief = new BigGiftBrief();
            bigGiftBrief.setId(giftInfo.getCommodityGiftInfoId());
            UserInfo donatorUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
            bigGiftBrief.setDonatorNickname(URLDecoder.decode(donatorUserInfo.getNickname(),"utf-8"));
            bigGiftBrief.setDonatorHeadImg(donatorUserInfo.getHeadImgPath());
            GiftAccount donatorTradeAccount = giftService.queryGiftAccount(giftInfo.getDonatorGiftAccountId());
            CommodityVo commodityContract = null;
            try {
                commodityContract = commodityService.findById(donatorTradeAccount.getCommodityContractId());
            } catch (IOException e) {
                e.printStackTrace();
            }
            bigGiftBrief.setCommodityId(commodityContract.getCommodityContractId());
            bigGiftBrief.setCommodityName(commodityContract.getCommodityName());
            bigGiftBrief.setGreeting(giftInfo.getGreeting());
            bigGiftBrief.setUnit(commodityContract.getUnit());
            bigGiftBrief.setCommodityPrice(commodityContract.getUnitPrice().toString());
            bigGiftBrief.setCommodityMatter(commodityContract.getSubjectMatter());
            return new RespResult(RespCode.GIFT_AVAILABLE, bigGiftBrief);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("展示红包状态发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,RespCode.SERVER_BIZ_ERROR);
        }

    }

    /**
     * 查询大礼包明细
     * @param currentUserInfo 当前用户信息
     * @param id 礼包id
     * @param code 礼包code
     * @return RespResult(String, BigGiftDetail)
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value = "detail/{id}/{code}",method = RequestMethod.POST)
    @ResponseBody
    public RespResult giftDetail(@ModelAttribute("userInfo")UserInfo currentUserInfo,
                                 @PathVariable("id") Long id,
                                 @PathVariable("code") String code,String bizType){

        try {
            Long currentUserInfoId = currentUserInfo.getUserInfoId();
            CommodityGiftInfo giftInfo = null;

            //交易明细使用同样的接口，没有传红包唯一code，所以这里需要验证此红包是不是本人的（防止他人篡改）
            if("undefined".equals(code)){
                List<UserBizBrief> list = tradeDetailService.queryUserBizBriefList(id,bizType);
                if(null == list || list.isEmpty() || list.size()>1){
                    return new RespResult(RespCode.FAIL,RespCode.GIFT_NOT_FOUND);
                }
                if(!currentUserInfoId.equals(list.get(0).getUserInfoId())){
                    return new RespResult(RespCode.FAIL,RespCode.GIFT_NOT_FOUND);
                }

                //当是收红包类型时查看明细，是通过小红包Id,查询到大红包Id(因为下面查询大红包时需要)
                if(bizType.equals(PayBizType.ACCEPT_GIFT.getPersistKey())){
                    CommodityGiftDonationDetail commodityGiftDonationDetail = giftService.queryCommodityGiftDonationDetailById(id);
                    giftInfo = giftService.findGiftInfoById(commodityGiftDonationDetail.getCommodityGiftId());
                    id=giftInfo.getCommodityGiftInfoId();
                }else{
                    giftInfo = giftService.findGiftInfoById(id);
                }

            }else{
                //查询红包信息（不锁）
                giftInfo = giftService.findGiftInfo(id, code);
                //红包不存在
                if (giftInfo == null) {
                    return new RespResult(RespCode.GIFT_NOT_FOUND);
                }
            }

            //查询所有此大礼包下所有拆包明细
            List<CommodityGiftDonationDetail> giftDonationDetailList = giftService.findGiftDonationDetail(id, 0L);

            //当前用户拆包信息
            List<CommodityGiftDonationDetail> selfGiftDonationDetailList = new ArrayList<>();

            //其他用户拆包信息的集合:剔除当前用户拆包明细，剩下的拆包明细按时间升序排序,之后转换成GiftGrabInfo对象。
            List<GiftGrabInfo> othersGiftGrabInfoList = handleGiftGrabInfoList(currentUserInfoId, giftDonationDetailList, selfGiftDonationDetailList);

            //准备 BigGiftDetail信息
            BigGiftDetail bigGiftDetail = new BigGiftDetail();
            bigGiftDetail.setId(giftInfo.getCommodityGiftInfoId());
            bigGiftDetail.setType(giftInfo.getType());
            bigGiftDetail.setGreeting(giftInfo.getGreeting());
            UserInfo donatorUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
            bigGiftDetail.setHeadImg(donatorUserInfo.getHeadImgPath());//图片名字
            bigGiftDetail.setNickname(URLDecoder.decode(donatorUserInfo.getNickname(),"utf-8"));
            bigGiftDetail.setExpiredTime(giftInfo.getExpiredTime());
            GiftAccount donatorTradeAccount = giftService.queryGiftAccount(giftInfo.getDonatorGiftAccountId());
            Long commodityContractId = donatorTradeAccount.getCommodityContractId();
            CommodityVo commodityContract = null;
            try {
                commodityContract = commodityService.findById(commodityContractId);
            } catch (IOException e) {
                e.printStackTrace();
            }
            bigGiftDetail.setCommodityId(commodityContractId);
            bigGiftDetail.setCommodityName(commodityContract.getCommodityName());
            bigGiftDetail.setDoneeSurplus(giftInfo.getDoneeSurplus());
            bigGiftDetail.setDoneeQuota(giftInfo.getDoneeQuota());
            bigGiftDetail.setCommoditySurplusQuantity(giftInfo.getCommoditySurplusQuantity());
            bigGiftDetail.setCommodityTotalQuantity(giftInfo.getCommodityTotalQuantity());
            bigGiftDetail.setUnit(commodityContract.getUnit());
            bigGiftDetail.setCommodityPrice(commodityContract.getUnitPrice().toString());
            bigGiftDetail.setCommodityMatter(commodityContract.getSubjectMatter());
            bigGiftDetail.setTypeName(commodityContract.getTypeName());
            bigGiftDetail.setCode(giftInfo.getCode());
            if (!selfGiftDonationDetailList.isEmpty()) {
                CommodityGiftDonationDetail selfGiftDonationDetail = selfGiftDonationDetailList.get(0);
                GiftGrabInfo selfGrabInfo = new GiftGrabInfo();
                selfGrabInfo.setHeadImg(baseInfoService.queryUserInfo(selfGiftDonationDetail.getDoneeUserId()).getHeadImgPath());
                selfGrabInfo.setNickname(URLDecoder.decode(currentUserInfo.getNickname(),"utf-8"));
                selfGrabInfo.setGrabTime(selfGiftDonationDetail.getAdoptTime());
                selfGrabInfo.setGrabQtn(selfGiftDonationDetail.getCommodityUnitQuantity());
                bigGiftDetail.setSelfGrabInfo(selfGrabInfo);
            }
            bigGiftDetail.setOthersGrabInfoList(othersGiftGrabInfoList);
            return new RespResult(RespCode.SUCCESS, bigGiftDetail);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询大礼包明细发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"查询大礼包明细发生异常");
        }

    }

    /**
     * 拆红包异步请求
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping("/open/{id}/{code}")
    @ResponseBody
    public RespResult giftOpen(@ModelAttribute("userInfo")UserInfo currentUserInfo,
                               @PathVariable("id") long id,
                               @PathVariable("code") String code){
        try {
            Long currentUserInfoId = currentUserInfo.getUserInfoId();
            //查询红包，防止用户恶意破解
            CommodityGiftInfo giftInfo = giftService.findGiftInfo(id, code);

            if (giftInfo == null) {
                return new RespResult(RespCode.GIFT_NOT_FOUND);
            }

            //抢礼包服务返回的结果
            CommodityGiftDonationDetail selfGrabGiftDetail = null;
            try {
                selfGrabGiftDetail = giftService.grabGift(id, currentUserInfoId);
            } catch (BizException e) {
                //礼包抢光了，当前用户没抢到
                if (e.getErrorCode().equals(RespCode.GIFT_EMPTY.getCode())) {
                    return new RespResult(RespCode.GIFT_EMPTY);
                }
                //礼包已抢过，不能再抢
                if (e.getErrorCode().equals(RespCode.GIFT_HAS_GRAB.getCode())) {
                    return new RespResult(RespCode.GIFT_HAS_GRAB);
                }
                //礼包已过期
                if (e.getErrorCode().equals(RespCode.GIFT_EXPIRED.getCode())) {
                    return new RespResult(RespCode.GIFT_EXPIRED);
                }
                //当前用户无权限抢此礼包
                if (e.getErrorCode().equals(RespCode.GIFT_SPECIFIED_NO_AUTH.getCode())) {
                    return new RespResult(RespCode.GIFT_SPECIFIED_NO_AUTH);
                }
                //不支持的礼包类型
                if (e.getErrorCode().equals(RespCode.GIFT_TYPE_NOT_SUPPORT.getCode())) {
                    return new RespResult(RespCode.GIFT_TYPE_NOT_SUPPORT);
                }
            }catch (Exception e1){
                return new RespResult(RespCode.SERVER_ERROR);
            }
            if (selfGrabGiftDetail == null) {
                return new RespResult(RespCode.FAIL);
            }

            //查询所有此大礼包下所有拆包明细
            List<CommodityGiftDonationDetail> giftDonationDetailList = giftService.findGiftDonationDetail(id, 0L);

            //其他用户拆包信息的集合:剔除当前用户拆包明细，剩下的拆包明细按时间升序排序,之后转换成GiftGrabInfo对象。
            List<GiftGrabInfo> othersGiftGrabInfoList = handleGiftGrabInfoList(currentUserInfoId, giftDonationDetailList, new ArrayList<>());

            giftInfo = giftService.findGiftInfo(id, code);//查询更新后的值
            BigGiftDetail bigGiftDetail = new BigGiftDetail();
            bigGiftDetail.setId(giftInfo.getCommodityGiftInfoId());
            bigGiftDetail.setType(giftInfo.getType());
            bigGiftDetail.setGreeting(giftInfo.getGreeting());
            UserInfo donatorUserInfo = baseInfoService.queryUserInfoByTradeAccount(giftInfo.getDonatorGiftAccountId());
            bigGiftDetail.setHeadImg(donatorUserInfo.getHeadImgPath());
            bigGiftDetail.setNickname(URLDecoder.decode(donatorUserInfo.getNickname(),"utf-8"));
            GiftAccount donatorTradeAccount = giftService.queryGiftAccount(giftInfo.getDonatorGiftAccountId());
            Long commodityContractId = donatorTradeAccount.getCommodityContractId();
            CommodityVo commodityContract = null;
            try {
                commodityContract = commodityService.findById(commodityContractId);
            } catch (IOException e) {
                e.printStackTrace();
            }
            bigGiftDetail.setCommodityId(commodityContractId);
            bigGiftDetail.setCommodityName(commodityContract.getCommodityName());
            bigGiftDetail.setDoneeSurplus(giftInfo.getDoneeSurplus());
            bigGiftDetail.setDoneeQuota(giftInfo.getDoneeQuota());
            bigGiftDetail.setCommoditySurplusQuantity(giftInfo.getCommoditySurplusQuantity());
            bigGiftDetail.setCommodityTotalQuantity(giftInfo.getCommodityTotalQuantity());
            bigGiftDetail.setUnit(commodityContract.getUnit());
            bigGiftDetail.setCommodityPrice(commodityContract.getUnitPrice().toString());
            bigGiftDetail.setCommodityMatter(commodityContract.getSubjectMatter());
            GiftGrabInfo selfGrabInfo = new GiftGrabInfo();
            selfGrabInfo.setHeadImg(currentUserInfo.getHeadImgPath());
            selfGrabInfo.setNickname(URLDecoder.decode(currentUserInfo.getNickname(),"utf-8"));
            selfGrabInfo.setGrabTime(selfGrabGiftDetail.getAdoptTime());
            selfGrabInfo.setGrabQtn(selfGrabGiftDetail.getCommodityUnitQuantity());
            bigGiftDetail.setSelfGrabInfo(selfGrabInfo);
            bigGiftDetail.setOthersGrabInfoList(othersGiftGrabInfoList);
            bigGiftDetail.setTypeName(commodityContract.getTypeName());
            return new RespResult(RespCode.SUCCESS, bigGiftDetail);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("拆红包操作发生异常,错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"拆红包流程发生异常");
        }
    }

    /**
     * 将CommodityGiftDonationDetail类型转换为GiftGrabInfo
     * @param commodityGiftDonationDetail
     * @return
     */
    private GiftGrabInfo toGiftGrabInfo(CommodityGiftDonationDetail commodityGiftDonationDetail) throws UnsupportedEncodingException {
        commodityGiftDonationDetail.getDoneeUserId();
        UserInfo doneeUserInfo = baseInfoService.queryUserInfo(commodityGiftDonationDetail.getDoneeUserId());
        GiftGrabInfo giftGrabInfo = new GiftGrabInfo();
        giftGrabInfo.setHeadImg(doneeUserInfo.getHeadImgPath());
        giftGrabInfo.setNickname(URLDecoder.decode(doneeUserInfo.getNickname(),"utf-8"));
        giftGrabInfo.setGrabTime(commodityGiftDonationDetail.getAdoptTime());
        giftGrabInfo.setGrabQtn(commodityGiftDonationDetail.getCommodityUnitQuantity());
        return giftGrabInfo;
    }

    /**
     * 将当前用户拆包明细放入selfGiftDonationDetailList，剩下的拆包明细按时间升序排序,之后转换成GiftGrabInfo对象，最后返回其他用户拆包信息列表。
     * @param currentUserInfoId 当前用户id
     * @param giftDonationDetailList 大礼包下所有的拆包明细
     * @param selfGiftDonationDetailList 当前用户拆包明细
     * @return 其他用户拆包信息列表
     */
    private List<GiftGrabInfo> handleGiftGrabInfoList(Long currentUserInfoId, List<CommodityGiftDonationDetail> giftDonationDetailList, List<CommodityGiftDonationDetail> selfGiftDonationDetailList) {
        return giftDonationDetailList.parallelStream()
                .filter(e -> {
                    if (e.getDoneeUserId().equals(currentUserInfoId)) {
                        selfGiftDonationDetailList.add(e);//当前用户拆包信息
                        return false;
                    } else {
                        return true;
                    }
                })
                .sorted((a, b) -> a.getAdoptTime().before(b.getAdoptTime()) ? 1 : -1)
                .map(e -> {
                    try {
                        return toGiftGrabInfo(e);
                    } catch (UnsupportedEncodingException e1) {
                        e1.printStackTrace();
                        return null;
                    }
                })
                .collect(Collectors.toList());
    }


    /**
     * 获取用户的所有的礼包账户信息
     * @param httpSession
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value ="/getGiftAccountData",method = RequestMethod.GET)
    @ResponseBody
    public RespResult getGiftAccountData(HttpSession httpSession){
        RespResult respResult = new RespResult();

        UserLoginInfo userLoginInfo = getUserLoginInfo(httpSession);

        //获取所有用户持有的礼包账户信息
        try {
            respResult.setCode(RespCode.SUCCESS.getCode());
            List<HoldCommodityInfo> list = giftService.queryUserHoldCommodityList(userLoginInfo.getUserInfoId());
            respResult.setBody(list);
        } catch (Exception e) {
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询用户所属礼包账户发生异常!");
            logger.error("查询用户所属礼包账户发生异常！{}", e);
        }
        return respResult;
    }

    /**
     *根据商品类型查询所有商品类型（0：查询全部）
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value ="/queryCommodityContract",method = RequestMethod.POST)
    @ResponseBody
    public RespResult queryCommodityContract(Long commodityTypeId){
        RespResult respResult = new RespResult();
        try {
            respResult.setCode(RespCode.SUCCESS.getCode());
            respResult.setBody(commodityService.queryCommodityContract(commodityTypeId));
        } catch (Exception e) {
            e.printStackTrace();
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询所有商品合约信息发生异常！");
            logger.error("查询所有商品合约信息发生异常！,错误信息：{}",e);
        }
        return respResult;
    }

    /**
     *查询所有商品类型信息
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value ="/queryCommodityTypeList",method = RequestMethod.GET)
    @ResponseBody
    public RespResult queryCommodityTypeList(){
        RespResult respResult = new RespResult();
        try {
            return new RespResult(RespCode.SUCCESS,commodityService.queryCommodityTypeList());
        } catch (Exception e) {
            e.printStackTrace();
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询所有商品类型发生异常！");
            logger.error("查询所有商品类型发生异常！错误信息：{}",e);
        }
        return respResult;
    }

    /**
     * 根据条件查询业务概要记录
     * @param bizId 业务类型ID
     * @param commodityId 商品类型ID
     * @param date 产生记录的时间
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value ="/queryUserBizBrief",method = RequestMethod.POST)
    @ResponseBody
    public RespResult queryUserBizBrief(Long bizId,Long commodityId,Date date){
        RespResult respResult = new RespResult();
        try {
            return new RespResult(RespCode.SUCCESS,commodityService.queryqueryUserBizBriefList(bizId,commodityId,date));
        } catch (Exception e) {
            e.printStackTrace();
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询业务概要记录发生异常！");
            logger.error("查询业务概要记录发生异常！,错误信息：{}",e);
        }
        return respResult;
    }


    /**
     * 展示用户头像
     * @param response 返回响应
     */
    @RequestMapping(value = "/downloadFile")
    public void downloadFile(@ModelAttribute("fileName") String fileName,HttpServletResponse response) {
        PhotoUtil.downloadFile(fileName,response);
    }

    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value = "/getCommodityTypeList")
    @ResponseBody
    public RespResult getCommodityTypeList(){
        try {
            List<CommodityType> commodityTypeList = commodityService.queryCommodityTypeList();
            return new RespResult(RespCode.SUCCESS,commodityTypeList);
        } catch (Exception e) {
            logger.error("通过redis缓存拿去所有商品类型信息发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,null);
        }
    }

    /**
     * 通过商品Id查询运营商礼包账户
     * @param commodityId
     * @return
     */
    @RequestMapping(value = "/queryOperaterInfo",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult queryOperaterInfo(@RequestParam("commodityId") Long commodityId){
        try {
            GiftAccount giftAccount = this.commodityService.queryOperaterGiftAccout(commodityId);
            return new RespResult(RespCode.SUCCESS,giftAccount);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询运营商品持有信息发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"查询运营商持有信息失败");
        }
    }

    /**
     * 绑定手机号
     * @param userInfoId
     * @param mobile 手机号码
     * @param code 手机验证码
     * @return
     */
    @RequestMapping(value = "/bindMobile",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public RespResult bindMobile(@ModelAttribute("userInfoId") Long userInfoId,
                                 @RequestParam("mobile") String mobile,
                                 @RequestParam("code") String code,
                                 HttpServletRequest request){
        try {
            RespResult respResult = giftService.bindMobile(userInfoId, mobile, code, request);//单独事务
            if(respResult.getCode().equals(RespCode.SUCCESS.getCode())){
                //查询是否推荐成功和经纪人策略，将消息放入阿里云（单独事务）
                List<ActivityPresent> list = (List<ActivityPresent>)respResult.getBody();
                list.forEach(item ->{
                    messageQueueService.send(aliMqPrivateKey,aliMqTopicRegister,aliMqTag, (aliMqTag+"_"+item.getActivityPresentId()).getBytes());
                });
            }
            return respResult;
        }catch (BizException biz) {
            biz.printStackTrace();
            logger.error("绑定手机号失败，错误信息：{}",biz);
            return new RespResult(RespCode.FAIL,biz.getErrorMsg());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("绑定手机号失败，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"绑定失败");
        }
    }

    /**
     * 查询用户信息
     * @param userInfoId
     * @return
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public RespResult getUserInfo(@ModelAttribute("userInfoId") Long userInfoId){
        try {
            UserInfo userInfo = baseInfoService.queryUserInfo(userInfoId);
            return new RespResult(RespCode.SUCCESS,userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询用户：{}信息发生异常，错误信息：{}",userInfoId,e);
            return new RespResult(RespCode.USER_NOT_FOUND);
        }
    }
}
