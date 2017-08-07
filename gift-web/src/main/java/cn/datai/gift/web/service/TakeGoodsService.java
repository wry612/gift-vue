package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.DeliveryOrder;
import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.wxpay.bean.common.WxException;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface TakeGoodsService {
    /**
     * 订单
     * @param deliveryOrder
     * @return
     */
    PayInfo produceOrder(DeliveryOrder deliveryOrder) throws IOException;

    /**
     * 付款完成后操作订单
     * @param payInfoId
     * @return
     */
    void paidPickUp(Long payInfoId) throws WxPayNetException;

    /**
     * 后台确认后完成订单（解冻、更新状态）
     * @param deliveryOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     */
    void expressDeliveryinfo(Long deliveryOrderId,String logisticsOrderId,String logisticsOperator) throws IOException;

    /**
     * 通过主键查询订单信息
     * @param deliveryOrderId
     * @return
     */
    DeliveryOrder queryDeliveryOrderById(Long deliveryOrderId);

    /**
     * 根据payInfoId查询订单记录
     * @param payInfoId
     * @return
     */
    DeliveryOrder findAndLockDeliveryOrderByPayInfoId(Long payInfoId);

    /**
     * 在交易明细中提货代付款（此时提货订单已产生，但是付款失败，导致交易明细中会出现提货未付款的现象）
     * @param bizId
     * @param userLoginInfo
     * @return
     */
    RespResult payForDetailTakeGoods(Long bizId, UserLoginInfo userLoginInfo, HttpServletRequest request) throws IOException, WxPayNetException;

    /**
     * 取消商品提货
     * @param deliveryOrderId
     * @param userInfoId
     */
    void cancelTakeGoods(Long deliveryOrderId,Long userInfoId) throws IOException, WxPayNetException;

    /**
     * 超时自动取消商品提货(定时任务执行)
     * @param deliveryOrderId
     */
    void cancelExpireTakeGoods(Long deliveryOrderId) throws IOException, WxPayNetException;

    /**
     * 付完款后直接更新状态（不能解冻,直到填写完成物流单号方可解冻）
     * @param deliveryOrder
     */
    void updateDeliveryInfoStatusByPaid(DeliveryOrder deliveryOrder);

    /**
     * 取消超时的提货订单（未付款）
     */
    void cancelExpireDeliveryInfoList() throws IOException;


}
