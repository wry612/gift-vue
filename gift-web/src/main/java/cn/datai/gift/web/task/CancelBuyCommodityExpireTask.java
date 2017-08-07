package cn.datai.gift.web.task;

import cn.datai.gift.web.service.BuyCommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 检查购买订单超时（未付款）
 * Created by Administrator on 2017/5/13.
 */
@Component
public class CancelBuyCommodityExpireTask {

    private static final Logger logger = LoggerFactory.getLogger(CancelBuyCommodityExpireTask.class);

    @Autowired
    private BuyCommodityService buyCommodityService;

    public void cancelTradeOrder(){
        try {
            buyCommodityService.cancelExpireTradeOrderList();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("执行定时检查取消购买订单超时时发生异常,错误信息：{}",e);
        }
    }
}
