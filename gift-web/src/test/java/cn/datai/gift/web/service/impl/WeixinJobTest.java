package cn.datai.gift.web.service.impl;

import cn.datai.gift.web.task.WeixinRefundQueryTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by H.CAAHN on 2017/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class WeixinJobTest {
    @Autowired
    private WeixinRefundQueryTask weixinRefundQueryTask;

    @Test
    public void testOrderQuery() {
        weixinRefundQueryTask.refundQuery();
    }
}
