package cn.datai.gift.web.call.express;

import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class ExpressCallerConfiguration {

    private static final String apiDomain = "https://ali-deliver.showapi.com";


    @Bean(name = "expressRetrofit")
    public Retrofit expressRetrofit(@Qualifier("expressHttpClient") OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl(apiDomain)
                .client(okHttpClient)
                .build();
    }

    @Bean
    public ExpressCaller expressCaller(@Qualifier("expressRetrofit") Retrofit retrofit) {
        return retrofit.create(ExpressCaller.class);
    }

}
