package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.UserDeliveryInfo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.AddressService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@RequestMapping("/address")
@Controller
public class AddressController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;

    /**
     * 收货地址
     * @param model
     * @param httpSession
     * @param response
     * @return
     */
    @RequestMapping(value ="/address")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String address(Model model, HttpSession httpSession, HttpServletResponse response){

        return "gift/address";
    }
    @RequestMapping(value ="/createAddress")
    @Auth(needLogin = true,weixinJsAuth = true)
    public String createAddress(Model model, HttpSession httpSession, HttpServletResponse response){

        return "gift/createAddress";
    }


    /**
     *新增用户收货地址信息
     * @param userDeliveryInfo
     * @return
     */
    @RequestMapping(value ="/insertAddress",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult insertAddress(UserDeliveryInfo userDeliveryInfo, @ModelAttribute("userInfoId") Long userInfoId){
        RespResult respResult = new RespResult();
        try {
            userDeliveryInfo.setUserInfoId(userInfoId);
            boolean b = this.addressService.insertAddress(userDeliveryInfo);
            if(!b){
                respResult.setCode(RespCode.FAIL.getCode());
                respResult.setBody("最多保持有5个收货地址");
            }else{
                respResult.setCode(RespCode.SUCCESS.getCode());
                respResult.setBody(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("新增用户收货地址发生异常:{}",JSONObject.toJSONString(userDeliveryInfo));
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("新增用户收货地址失败！");
        }
        return respResult;
    }

    /**
     * 更新用户收货地址信息
     * @param userDeliveryInfo
     * @return
     */
    @RequestMapping(value ="/updateAddress",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult updateAddress(UserDeliveryInfo userDeliveryInfo, @ModelAttribute("userInfoId") Long userInfoId){
        RespResult respResult = new RespResult();
        try {
            userDeliveryInfo.setUserInfoId(userInfoId);
            this.addressService.updateAddress(userDeliveryInfo);
            respResult.setCode(RespCode.SUCCESS.getCode());
            respResult.setBody(true);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("更新用户收货地址发生异常：{}", JSONObject.toJSONString(userDeliveryInfo));
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("更新用户收货地址失败！");
        }
        return respResult;
    }

    /**
     * 查询某一用户所有收货地址
     * @param httpSession
     * @return
     */
    @RequestMapping(value ="/queryUserDeliveryInfoList",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult queryUserDeliveryInfoList(HttpSession httpSession, @ModelAttribute("userInfoId") Long userInfoId){
        RespResult respResult = new RespResult();
        try {
            List<UserDeliveryInfo> userDeliveryInfoList = this.addressService.queryUserDeliveryInfoList(userInfoId);
            respResult.setCode(RespCode.SUCCESS.getCode());
            respResult.setBody(userDeliveryInfoList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询用户所有收货地址发生异常，用户Id:{}",userInfoId);
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询用户收货地址失败！");
        }
        return respResult;
    }

    /**
     * 查询用户下某一个具体收货地址
     * @param userDeliveryInfoId
     * @return
     */
    @RequestMapping(value = "/queryUserDeliveryInfo",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult queryUserDeliveryInfo(Long userDeliveryInfoId){
        RespResult respResult = new RespResult();
        try {
            UserDeliveryInfo userDeliveryInfo = this.addressService.queryUserDeliveryInfo(userDeliveryInfoId);
            respResult.setCode(RespCode.SUCCESS.getCode());
            respResult.setBody(userDeliveryInfo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询用户的某一收货地址发生异常，收货地址主键为：{}",userDeliveryInfoId);
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("查询收货地址失败！");
        }
        return respResult;
    }

    /**
     * 删除用户下面某一个收货地址
     * @param userDeliveryInfoId
     * @return
     */
    @RequestMapping(value = "/deleteUserDeliveryInfo",method = RequestMethod.POST)
    @Auth(needLogin = true,weixinJsAuth = true)
    @ResponseBody
    public RespResult deleteUserDeliveryInfo(Long userDeliveryInfoId){
        RespResult respResult = new RespResult();
        boolean result = false;
        try {
            this.addressService.deleteUserDeliveryInfo(userDeliveryInfoId);
            respResult.setBody(true);
            respResult.setCode(RespCode.SUCCESS.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("删除用户某一收货地址发生一异常，收货地址主键为：{}",userDeliveryInfoId);
            respResult.setCode(RespCode.FAIL.getCode());
            respResult.setMsg("删除收货地址失败！");
        }
        return respResult;
    }


}
