package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.ActivityPresent;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.RecommoenderAndBrokerService;
import cn.datai.gift.web.vo.Conversion.RecommenderVo;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * 推荐人相关、经纪人相关
 * Created by Administrator on 2017/7/27.
 */
@Controller
@RequestMapping("recommender")
public class RecommenderController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(RecommenderController.class);

    @Autowired
    private RecommoenderAndBrokerService recommoenderAndBrokerService;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private BaseInfoService baseInfoService;

    /**
     * 跳转推荐详情页
     * @return
     */
    @RequestMapping(value ="/recommenderDetail")
    @Auth(needLogin = true,weixinJsAuth = true,needBind = false)
    public String setPacket(){
        return "recommender/recommenderDetail";
    }


    /**
     * 根据Id查询用户赠礼详情
     * @param userInfoId
     * @param activityPresentId
     * @return
     */
    @PostMapping("getActivityPresent")
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true,needBind = false)
    public RespResult getActivityPresent(@ModelAttribute("userInfoId") Long userInfoId,Long activityPresentId){

        try {
            ActivityPresent activityPresent = recommoenderAndBrokerService.queryActivityPresentById(activityPresentId);
            CommodityVo commodityVo = commodityService.findById(activityPresent.getCommodityId());
            UserInfo userInfo = baseInfoService.queryUserInfo(activityPresent.getPresentUserId());
            userInfo.setNickname(URLDecoder.decode(userInfo.getNickname(),"utf-8"));
            RecommenderVo recommenderVo = new RecommenderVo(activityPresent, commodityVo, userInfo);
            return new RespResult(RespCode.SUCCESS, recommenderVo);
        }catch (BizException biz) {
            biz.printStackTrace();
            logger.error("查询用户赠礼详情异常");
            return new RespResult(RespCode.FAIL,biz.getErrorMsg());
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("查询用户赠礼详情异常");
            return new RespResult(RespCode.FAIL,"查询用户赠礼详情异常");
        }


    }


}
