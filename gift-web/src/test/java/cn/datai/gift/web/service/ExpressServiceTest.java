package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.ExpressInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangyutao on 2017/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class ExpressServiceTest {

    @Autowired
    private ExpressService expressService;

    @Test
    public void selectById() throws Exception {
        ExpressInfo expressInfo = this.expressService.selectByExpressInfoId(1L, 1L);
        System.out.println(expressInfo);

    }

}