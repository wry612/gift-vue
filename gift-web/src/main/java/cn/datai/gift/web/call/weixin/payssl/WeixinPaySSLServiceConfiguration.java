package cn.datai.gift.web.call.weixin.payssl;

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
public class WeixinPaySSLServiceConfiguration {

    @Value("${weixin.pay.domain}")
    private String weixinPayDomain;

    @Bean(name = "weixinPaySSLRetrofit")
    public Retrofit weixinPaySSLRetrofit(@Qualifier("xmlSSLOkHttpClient") OkHttpClient xmlSSLOkHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(SimpleXmlConverterFactory.create(new MyPersister()))
                .baseUrl(weixinPayDomain)
                .client(xmlSSLOkHttpClient)
                .build();
    }

    @Bean
    public WeixinPaySSLService weixinPaySSLService(@Qualifier("weixinPaySSLRetrofit") Retrofit retrofit) {
        return retrofit.create(WeixinPaySSLService.class);
    }

}
