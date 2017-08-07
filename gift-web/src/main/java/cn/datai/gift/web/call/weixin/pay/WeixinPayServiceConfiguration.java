package cn.datai.gift.web.call.weixin.pay;

import cn.datai.gift.web.call.weixin.converter.MyPersister;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by js on 2016/9/26 checkdown.
 */
@Configuration
public class WeixinPayServiceConfiguration {

    @Value("${weixin.pay.domain}")
    private String weixinPayDomain;

    @Bean(name = "weixinPayRetrofit")
    public Retrofit weixinPayRetrofit(@Qualifier("xmlOkHttpClient") OkHttpClient xmlOkHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(SimpleXmlConverterFactory.create(new MyPersister()))
                .baseUrl(weixinPayDomain)
                .client(xmlOkHttpClient)
                .build();
    }

    @Bean
    public WeixinPayService weixinPayService(@Qualifier("weixinPayRetrofit") Retrofit retrofit) {
        return retrofit.create(WeixinPayService.class);
    }

}
