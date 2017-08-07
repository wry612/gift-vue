package cn.datai.gift.web.task;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.utils.exception.PayingException;
import cn.datai.gift.web.contants.enums.PayChannel;
import cn.datai.gift.web.contants.enums.PayInfoStatus;
import cn.datai.gift.web.service.PayInfoService;
import cn.datai.gift.web.service.PayOrderService;
import cn.datai.gift.web.service.PayService;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * 微信查询订单处理状态Task
 * Created by H.CAAHN on 2017/4/19.
 */
@Component
public class WeixinOrderQueryTask {
    private static final Logger logger = LoggerFactory.getLogger(WeixinOrderQueryTask.class);

    private int size = 300;

    @Resource
    private PayInfoService payInfoService;

    @Resource
    private PayOrderService payOrderService;

    @Resource
    private PayService payService;

    public void orderQuery() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.MILLISECOND, 0);
            Date nowtime = calendar.getTime();
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("channel", PayChannel.WX.getPersistKey());
            params.put("status", PayInfoStatus.UNPAYING.getPersistKey());
            params.put("nowtime", nowtime);

            int total = payInfoService.countUnPayInfo(params);
            if (total <= 0) {
                logger.info("微信查询待支付订单状态[未查询到待支付订单]");
                return;
            }

            int totalPage = total / size + (total % size == 0 ? 0 : 1);
            logger.info("微信查询待支付订单状态[待处理总数:{}, 每批处理数量:{}, 总批数:{}]", total, size, totalPage);

            // 如果只有一页的情况下，直接执行，而不需要进行分页
            if (totalPage == 1) {
                List<PayInfo> payList = this.payInfoService.pageUnPayInfo(params, 1, size, total);
                this.doTask(payList, nowtime);
                return;
            }

            // 分页处理微信订单状态查询功能
            for (int i = 1; i <= totalPage; i++) {
                logger.info("微信查询待支付订单状态[开始处理第{}批，总批数:{}]", i, totalPage);
                List<PayInfo> payList = this.payInfoService.pageUnPayInfo(params, i, size, total);
                this.doTask(payList, nowtime);
            }
        }
        catch (Exception ex) {
            logger.error("微信查询待支付订单状态[查询失败]", ex);
        }
    }

    private void doTask(List<PayInfo> payList, Date nowtime) {
        if (payList == null || payList.isEmpty()) {
            logger.info("微信查询待支付订单状态[待处理列表为空]");
            return;
        }
        for (PayInfo pay : payList) {
            try {
                //从微信服务器查询支付订单并更新支付结果，包括更新payInfo表中的querytime
                boolean payResult = false;
                try {
                    payResult = this.payService.payOrderQueryAndUpdate(pay);
                } catch (WxPayNetException e) {
                    logger.error("微信订单查询通信异常:", e);
                    this.payInfoService.updatePayInfoQueryTime(pay.getPayInfoId(), nowtime);
                    return;
                } catch (PayingException e) {
                    logger.info("用户还未支付成功，后续用户依然可以继续支付");
                    this.payInfoService.updatePayInfoQueryTime(pay.getPayInfoId(), nowtime);
                    return;
                } catch (BizException e) {
                    if (e.getErrorCode().equals(RespCode.WX_PAY_ALREADY_SUCCESS.getCode())) {
                        logger.info("已处理支付结果，不需要重复处理");
                    } else {
                        logger.error("处理微信支付结果回调异常", e);
                        this.payInfoService.updatePayInfoQueryTime(pay.getPayInfoId(), nowtime);
                    }
                    return;
                }

                if (payResult) {
                    //支付完成
                    try {
                        //异步执行 不保证操作业务能正确完成 新开事务处理支付成功后的业务操作，必须捕获异常，不能影响正常的像微信服务器反馈消息，如果发生异常，后续会有定时任务检查支付状态和业务状态
                        payService.afterPayBizHandler(pay);
                    } catch (Exception e) {
                        //由于是异步执行，无法捕获异常
                        logger.error("调用支付成功方法异常：", e);
                    }
                } else {
                    //支付取消（过期，失败。。。）
                    //TODO 支付取消后的业务操作, 现在业务超时自动取消，暂时不需要通过支付取消触发业务操作
                }

            }
            catch (BizException ex) {
                if (ex.getErrorCode().equals(RespCode.WX_PAY_ALREADY_SUCCESS.getCode())) {
                    //重复处理，但需要回复微信服务器成功处理,让微信服务器别再发了
                    logger.info("已处理支付结果，不需要重复处理");
                } else {
                    logger.error("处理微信支付结果回调异常", ex);
                }
            }
            catch (Exception ex) {
                logger.error("微信查询待支付订单状态[处理失败, id:" + pay.getPayDetailId() + "]", ex);
            }
        }
    }
}
