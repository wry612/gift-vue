package cn.datai.gift.web.task;

import cn.datai.gift.persist.po.RefundOrderWx;
import cn.datai.gift.web.service.PayService;
import cn.datai.gift.web.service.RefundOrderWxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 微信退款查询
 * Created by H.CAAHN on 2017/4/20.
 */
@Component
public class WeixinRefundQueryTask {
    private static final Logger logger = LoggerFactory.getLogger(WeixinRefundQueryTask.class);

    private int size = 300;

    @Autowired
    private RefundOrderWxService refundOrderWxService;

    @Autowired
    private PayService payService;

    public void refundQuery() {
        try {
            Date nowtime = new Date();
            int total = this.refundOrderWxService.countProcessingWxRefund(nowtime);
            if (total <= 0) {
                logger.info("微信查询退款状态[未查询到待处理信息]");
                return;
            }

            int totalPage = total / size + (total % size == 0 ? 0 : 1);
            logger.info("微信查询退款状态[待处理总数:{}, 每批处理数量:{}, 总批数:{}]", total, size, totalPage);
            if (totalPage == 1) {
                List<RefundOrderWx> refundList = this.refundOrderWxService.pageProcessingWxRefund(nowtime, 1, size, total);
                this.doTask(refundList);
                return;
            }
            for (int i = 1; i <= totalPage; i++) {
                logger.info("微信查询退款状态[开始处理第{}批，总批数:{}]", i, totalPage);
                List<RefundOrderWx> refundList = this.refundOrderWxService.pageProcessingWxRefund(nowtime, i, size, total);
                this.doTask(refundList);
            }
        }
        catch (Exception ex) {
            logger.error("微信查询退款状态[查询失败]", ex);
        }
    }

    private void doTask(List<RefundOrderWx> refundList) {
        if (refundList == null || refundList.isEmpty()) {
            logger.info("微信查询退款状态[待处理列表为空]");
            return;
        }
        for (RefundOrderWx refund : refundList) {
            try {
                this.payService.payRefundQuery(refund);
            }
            catch (Exception ex) {
                logger.error("微信查询退款状态[处理失败, 商户退款单号:" + refund.getOutRefundNo() + "]", ex);
            }
        }
    }
}
