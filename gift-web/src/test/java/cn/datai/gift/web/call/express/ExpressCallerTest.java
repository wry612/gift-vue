package cn.datai.gift.web.call.express;

import cn.datai.gift.web.call.express.response.expressInfo.ExpressInfo;
import cn.datai.gift.web.call.express.response.expressList.ExpressList;
import cn.datai.gift.web.controller.AddressController;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import retrofit2.Call;

import java.io.IOException;

/**
 * Created by zhangyutao on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class ExpressCallerTest {

    private static final Logger logger = LoggerFactory.getLogger(ExpressCallerTest.class);

    @Autowired
    private ExpressCaller expressCaller;

    @Test
    public void testExpressInfo() throws IOException {

        //查询公司简称
//        Call<ResponseBody> responseBodyCall = this.expressCaller.fetchCompanyName("70513011286288");
//        String string = responseBodyCall.execute().body().string();
//        System.out.println(string);

//        Call<ExpressInfo> caller = this.expressCaller.expressInfo("shunfeng", "883420070249072469");
        Call<ExpressInfo> caller = this.expressCaller.expressInfo("jingdong", "VB35551890286");
        ExpressInfo expressInfo = caller.execute().body();

        System.out.println("json str:" + JSONObject.toJSONString(expressInfo));



    }

    @Test
    public void testExpressList() throws IOException {
        Call<ExpressList> call = this.expressCaller.expressList(null, 500, 0);
        ExpressList body = call.execute().body();
        logger.info("查询物流公司信息：{}", body);
    }


}
