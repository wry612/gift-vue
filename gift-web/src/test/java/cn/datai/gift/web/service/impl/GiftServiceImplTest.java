package cn.datai.gift.web.service.impl;

import cn.datai.gift.web.service.GiftService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by zhangyutao on 2017/3/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class GiftServiceImplTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GiftServiceImpl giftService;

    @Test
    public void testGrabGiftStrategy(){
//        GiftServiceImpl giftService = new GiftServiceImpl();
        BigDecimal commoditySurplusQuantity = new BigDecimal(100);
        logger.info("商品总数量：{}", commoditySurplusQuantity);
        int doneeSurplus = 10;
        logger.info("红包总份数：{}", doneeSurplus);
        BigDecimal minGrabCommodityQuantity = BigDecimal.ONE;
        logger.info("最小能够抢得：{}", minGrabCommodityQuantity);
        BigDecimal maxGrabCommodityQuantity = new BigDecimal(200);
        logger.info("最大能够抢得：{}", maxGrabCommodityQuantity);
        for (; doneeSurplus > 0; doneeSurplus--) {
            BigDecimal grabCommodityQuantity = giftService.grabGiftStrategy(commoditySurplusQuantity, doneeSurplus, minGrabCommodityQuantity, maxGrabCommodityQuantity);
            logger.info("抢得商品数量：{}", grabCommodityQuantity);
            commoditySurplusQuantity = commoditySurplusQuantity.subtract(grabCommodityQuantity);
        }
    }
}