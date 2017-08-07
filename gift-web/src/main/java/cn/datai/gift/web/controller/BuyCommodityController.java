package cn.datai.gift.web.controller;


import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.enums.PayChannel;
import cn.datai.gift.web.contants.enums.WxTradeType;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.BuyCommodityService;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.PayService;
import cn.datai.gift.web.utils.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 买商品
 * Created by Administrator on 2017/4/19.
 *
 */

@RequestMapping("buyCommodity")
@Controller
public class BuyCommodityController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BuyCommodityController.class);

    @Autowired
    private CommodityService commodityService;

    /**
     * 查询单个商品信息
     * @param commodityId
     * @return
     */
    @RequestMapping(value = "queryCommodityDetail",method = RequestMethod.POST)
    @ResponseBody
    @Auth(needLogin = true,weixinJsAuth = true)
    public  RespResult queryCommodityDetail(Long commodityId){
        RespResult respResult = new RespResult();
        try {
            CommodityVo commodityVo = commodityService.findById(commodityId);
            respResult.setCode(RespCode.SUCCESS.getCode());
            respResult.setBody(commodityVo);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("查询Id为{}的商品详情发生异常",commodityId);
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询商品详情失败");
        }
        return respResult;
    }

}
