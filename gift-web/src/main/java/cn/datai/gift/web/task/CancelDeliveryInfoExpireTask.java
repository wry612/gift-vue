package cn.datai.gift.web.task;

import cn.datai.gift.web.service.TakeGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 检查提货订单超时时间
 * Created by Administrator on 2017/5/13.
 */
@Component
public class CancelDeliveryInfoExpireTask {
    private static final Logger logger = LoggerFactory.getLogger(CancelDeliveryInfoExpireTask.class);

    @Autowired
    private TakeGoodsService takeGoodsService;

    public void cancelDeliveryInfo(){
        try {
            takeGoodsService.cancelExpireDeliveryInfoList();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("执行定时检查提货超时订单时发生异常，错误信息：{}",e);
        }
    }
}
