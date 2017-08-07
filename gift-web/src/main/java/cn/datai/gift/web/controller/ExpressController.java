package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.ExpressInfo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.call.express.response.expressInfo.Data;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.ExpressService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 物流信息
 * Created by zhangyutao on 2017/7/25.
 */
@Controller
@RequestMapping("express")
public class ExpressController extends BaseController{

    public final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private ExpressService expressService;

    /**
     * 以物换物列表页
     * @return
     */
    @GetMapping("expressPage")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String listPage() {
        return "gift/expressInfo";
    }

    /**
     * 物流跟踪信息
     */
    @Auth
    @GetMapping("expressInfo")
    @ResponseBody
    public RespResult expressInfo(@RequestParam("expressInfoId") long expressInfoId, @ModelAttribute("userInfoId") Long userInfoId) {
        if (expressInfoId == 0L) {
            return new RespResult(RespCode.PARAMS_ERROR);
        }
        try {
            ExpressInfo expressInfo = expressService.selectByExpressInfoId(expressInfoId, userInfoId);
            ExpressInfoV expressInfoV = new ExpressInfoV();
            PropertyUtils.copyProperties(expressInfoV, expressInfo);
            return new RespResult(RespCode.SUCCESS, expressInfoV);
        } catch (Exception e) {
            logger.error("查询物流信息发生异常：", e);
            return new RespResult(RespCode.FAIL, e.getMessage());
        }
    }


    private class ExpressInfoV extends ExpressInfo{
        private List<Data> data;

        public List<Data> getData() {
            return JSONObject.parseArray(super.getDatum(), Data.class);
        }

        public void setData(ArrayList<Data> data) {
            this.data = data;
        }

        public String getDatum(){
            return null;
        }
    }
}

