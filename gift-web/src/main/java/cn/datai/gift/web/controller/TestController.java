package cn.datai.gift.web.controller;

import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.BuyCommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/26.
 */
@RequestMapping("test")
@Controller
public class TestController extends BaseController {

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);


    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private BuyCommodityService buyCommodityService;

    /**
     * 模拟创建用户
     *
     * @return
     */
//    @RequestMapping(value = "/init",produces = {MediaType.APPLICATION_JSON_VALUE},method = RequestMethod.POST)
//    @ResponseBody
//    public RespResult init() {
//        UserInfo userInfo = null;
//        for (int i = 20000; i < 21000; i++) {
//            userInfo = new UserInfo();
//            userInfo.setCountry("国家-" + (i + 1));
//            userInfo.setProvince("省份-" + (i + 1));
//            userInfo.setCity("城市-" + (i + 1));
//            userInfo.setNickname("昵称" + (i + 1));
//            userInfo.setSex("男");
//            userInfo.setHeadImgPath("头像路径-" + (i + 1));//只保存用户头像名称（unionId.jpg）
//            userInfo.setRegisterTime(new Date());
//            baseInfoService.insertUserInfo(userInfo);
//
//        }
//        return new RespResult(RespCode.SUCCESS,"初始化测试数据成功");
//    }


    /**
     * 模拟测试购买商品
     * @param userInfoId
     * @param commodityId
     * @param quantity
     * @param quantityType
     * @return
     */
//    @RequestMapping(value = "/testBuy",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
//    @ResponseBody
//    public RespResult buyCommodity(long userInfoId, long commodityId, BigDecimal quantity, BigDecimal quantityType){
//        PayInfo payInfo = null;
//        try {
//            payInfo = buyCommodityService.buyCommodity(userInfoId, commodityId, quantity, quantityType);
//            if (null == payInfo) {
//                return new RespResult(RespCode.SUCCESS, null);
//            }
//        } catch (BizException produceOrderBizException) {
//            if ("2015".equals(produceOrderBizException.getErrorCode())) {
//                return new RespResult(RespCode.OVER_BUY_NUM, "超出最大购买数量");
//            } else if ("2013".equals(produceOrderBizException.getErrorCode())) {
//                return new RespResult(RespCode.OVER_EXPIRE_TIME, "商品过期，不能购买");
//            } else {
//                logger.error("购买商品生成订单失败{}", produceOrderBizException);
//                return new RespResult(RespCode.BIZCODE,"购买商品生成订单失败");
//            }
//        } catch (Exception produceOrderException){
//            logger.error("购买商品生成订单失败,{}", produceOrderException);
//            return new RespResult(RespCode.BIZCODE,"购买商品生成订单失败");
//        }
//        return new RespResult(RespCode.FAIL, "测试购买商品失败");
//    }


    /**
     * 以物换物主页
     * @return
     */
    @GetMapping("conversionIndex")
    @Auth
    public String conversionIndex() {
        return "test/conversionIndex";
    }

}
