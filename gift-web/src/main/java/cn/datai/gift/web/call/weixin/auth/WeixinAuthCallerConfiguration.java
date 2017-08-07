package cn.datai.gift.web.call.weixin.auth;

import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by js on 2016/9/26 checkdown.
 */
@Configuration
public class WeixinAuthCallerConfiguration {

    @Value("${weixin.apiDomain}")
    private String weixinApiDomain;

    @Bean(name = "weixinAuthRetrofit")
    public Retrofit weixinAuthRetrofit(@Qualifier("okHttpClient") OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl(weixinApiDomain)
                .client(okHttpClient)
                .build();
    }

    @Bean
    public WeixinAuthCaller weixinAuthCreator(@Qualifier("weixinAuthRetrofit") Retrofit retrofit) {
        return retrofit.create(WeixinAuthCaller.class);
    }

}
