package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.po.ConvertObjOrder;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.web.service.BaseInfoService;
import cn.datai.gift.web.service.ConversionService;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by zhangyutao on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class ConversionServiceImplTest {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    BaseInfoService baseInfoService;


    @Test
    public void testDrawStrategy() throws Exception {
        int orderSize = 100;//订单数量
        int drawTimes = 100;//抽奖次数

        for (int i = 0; i < 1; i++) {
            ArrayList<ConvertObjOrder> convertObjOrders = new ArrayList<>();
            for (int j = 0; j < orderSize; j++) {
                ConvertObjOrder convertObjOrder = new ConvertObjOrder();
                convertObjOrder.setConvertObjId(j + 1L);
                convertObjOrder.setSignSeq(j+1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis() + (long)(Math.random()*1000));
                convertObjOrder.setOrderTime(calendar.getTime());
                convertObjOrders.add(convertObjOrder);
            }

            List<Integer> winnerList;
            long start = System.currentTimeMillis();
            winnerList = this.conversionService.drawStrategy(convertObjOrders, drawTimes, 0);
            System.out.println("抽奖耗时：" + (System.currentTimeMillis() - start));
            System.out.println(JSONObject.toJSONString("中奖订单幸运号" + winnerList));
            if (winnerList.get(0) < 1 || winnerList.get(0) > orderSize) {
                throw new Exception("中奖幸运号不正确");
            }

            Iterator<Integer> iterator = winnerList.iterator();
            HashSet<Integer> set = new HashSet<>();
            while (iterator.hasNext()) {
                Integer winnerSeq = iterator.next();
                set.add(winnerSeq);
            }
            if (set.size() != drawTimes) {
                throw new Exception("中奖结果数量错误或值有重复");
            }
        }

    }

    @Test
    public void testQueryObj(){
      Long userInfoId = 19L;
        UserInfo userInfo = baseInfoService.queryUserInfo(userInfoId);
        userInfo.setMobilePhone("15996366464");
        UserInfo userInfo1 = null;
        userInfo1 = baseInfoService.queryUserInfo(userInfoId);
        System.out.println("===="+userInfo1.getMobilePhone());
    }

}