package cn.datai.gift.web.task;

import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.web.service.GiftService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 发出的商品礼包过期退回定时任务, 每半小时执行一次，所以商品红包到期后，可能会有半小时左右的延迟
 * 对于半小时内过期的红包，可用懒查询的方式检查是否过期，降低定时任务的压力。 一个过期的红包在没有被每半个小时的定时任务扫描到时，在有用户触发了操作红包的动作时，顺便检查是否过期，调用过期退回接口
 * Created by zhangyutao on 2017/4/28.
 */
@Component
public class GiftRefundTask {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GiftService giftService;


    public void inOneHour() {
        Date endExpiredTime = new Date();
        Date startExpiredTime = DateUtil.afterNMin(endExpiredTime, -60);
        //查询一小时内过期未处理的红包
        List<Long> expiredGiftInfoIds = giftService.selectExpiredGiftInfoId(startExpiredTime, endExpiredTime);
        expiredGiftInfoIds.parallelStream().forEach(expiredGiftInfoId -> {
            try {
                giftService.handleExpiredGiftInfo(expiredGiftInfoId);
            } catch (Exception e) {
                logger.error("退还过期红包失败， 红包id：{}", expiredGiftInfoId);
            }
        });
    }

    public void inOneDay() {
        Date date = new Date();
        Date endExpiredTime = DateUtil.afterNMin(date, -60);
        Date startExpiredTime = DateUtil.afterNDays(endExpiredTime, -1);
        //查询一小时内过期未处理的红包
        List<Long> expiredGiftInfoIds = giftService.selectExpiredGiftInfoId(startExpiredTime, endExpiredTime);
        expiredGiftInfoIds.parallelStream().forEach(expiredGiftInfoId -> {
            try {
                giftService.handleExpiredGiftInfo(expiredGiftInfoId);
            } catch (Exception e) {
                logger.error("退还过期红包失败， 红包id：{}", expiredGiftInfoId);
            }
        });
    }


}
