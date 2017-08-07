package cn.datai.gift.web.call;

import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * Created by js on 2016/9/26 checkdown.
 */
@Configuration
public class RetrofitConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(RetrofitConfiguration.class);


    private boolean skipVerify = true;

    @Value("${weixin.pay.keypath}")
    private String WX_KEY_PATH;

    @Value("${weixin.pay.key_store_type}")
    private String WX_KEY_STORE_TYPE;

    @Value("${weixin.pay.key_store_pwd}")
    private String WX_KEY_STORE_PASSWORD;


    @Bean
    public OkHttpClient okHttpClient() {
        Logger logger = LoggerFactory.getLogger("OkHttpLogging");

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(25, TimeUnit.SECONDS)
                .writeTimeout(25, TimeUnit.SECONDS);

        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        client.addInterceptor(loggingInterceptor);
        if (skipVerify) {
            client.sslSocketFactory(getUnSafeSSLContext().getSocketFactory(),getUnSafeX509TrustManager());
            client.hostnameVerifier((s, sslSession) -> true);
        }

        return client.build();
    }

    /**
     * xml类型请求client
     * @return
     */
    @Bean
    public OkHttpClient xmlOkHttpClient() throws FileNotFoundException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException {
        Logger logger = LoggerFactory.getLogger("OkHttpLogging");

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false);

        client.networkInterceptors().add(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            requestBuilder.header("Content-Type", "application/xml; charset=UTF-8")
                    .header("Connection","close");
            return chain.proceed(requestBuilder.build());
        });

        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();

        client.addInterceptor(loggingInterceptor);
        if (false) {
            client.sslSocketFactory(getUnSafeSSLContext().getSocketFactory(),getUnSafeX509TrustManager());
            client.hostnameVerifier((s, sslSession) -> true);
        }
        return client.build();
    }


    /**
     * xml类型请求client, 微信自签双向认证
     * @return
     */
    @Bean
    public OkHttpClient xmlSSLOkHttpClient() throws CertificateException, NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException, NoSuchProviderException, KeyManagementException {
        Logger logger = LoggerFactory.getLogger("OkHttpLogging");

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false);

        client.networkInterceptors().add(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            requestBuilder.header("Content-Type", "application/xml; charset=UTF-8")
                    .header("Connection","close");
            return chain.proceed(requestBuilder.build());
        });

        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();

        client.addInterceptor(loggingInterceptor);

        if (StringUtils.isNotBlank(WX_KEY_PATH)) {
            // 实例化密钥库
            KeyStore ks = KeyStore.getInstance(WX_KEY_STORE_TYPE);
            // 获得密钥库文件流
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(new File(WX_KEY_PATH));
                // 加载密钥库
                ks.load(fis, WX_KEY_STORE_PASSWORD.toCharArray());
            } catch (IOException e) {
                logger.error("读取秘钥库失败", e);
            } finally {
                if (fis != null) {
                    try {
                        // 关闭密钥库文件流
                        fis.close();
                    } catch (IOException e) {
                        logger.error("关闭秘钥库文件流失败", e);
                    }
                }
            }

            // 实例化密钥库
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            // 初始化密钥工厂
            kmf.init(ks, WX_KEY_STORE_PASSWORD.toCharArray());

            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(kmf.getKeyManagers(), null, new SecureRandom());
            // 获取SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            client.sslSocketFactory(ssf);
        }else {
            logger.error("创建双向认证客户端异常， 证书路径未填，客户端使用的是普通连接");
        }
        return client.build();
    }


    @Bean
    public OkHttpClient expressHttpClient() {
        Logger logger = LoggerFactory.getLogger("expressHttpClient");

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(25, TimeUnit.SECONDS)
                .writeTimeout(25, TimeUnit.SECONDS);

        client.networkInterceptors().add(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            requestBuilder.header("Authorization","APPCODE " + "69bedf87828c4de0a870166531988527");
            return chain.proceed(requestBuilder.build());
        });



        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(logger::debug);
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.addInterceptor(loggingInterceptor);
        if (skipVerify) {
            client.sslSocketFactory(getUnSafeSSLContext().getSocketFactory(),getUnSafeX509TrustManager());
            client.hostnameVerifier((s, sslSession) -> true);
        }


        return client.build();
    }


    private SSLContext getUnSafeSSLContext() {
        final TrustManager[] trustAllCerts = new TrustManager[]{getUnSafeX509TrustManager()};
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, null);
            return sslContext;
        } catch (GeneralSecurityException e) {
            throw new AssertionError();
        }
    }

    private X509TrustManager getUnSafeX509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {

                return new X509Certificate[0];
            }
        };
    }



    public class LoggingInterceptor implements Interceptor {

        private static final String F_BREAK = " %n";
        private static final String F_URL = " %s";
        private static final String F_TIME = " in %.1fms";
        private static final String F_HEADERS = "%s";
        private static final String F_RESPONSE = F_BREAK + "Response: %d";
        private static final String F_BODY = "body: %s";

        private static final String F_BREAKER = F_BREAK + "-------------------------------------------" + F_BREAK;
        private static final String F_REQUEST_WITHOUT_BODY = F_URL + F_TIME + F_BREAK + F_HEADERS;
        private static final String F_RESPONSE_WITHOUT_BODY = F_RESPONSE + F_BREAK + F_HEADERS + F_BREAKER;
        private static final String F_REQUEST_WITH_BODY = F_URL + F_TIME + F_BREAK + F_HEADERS + F_BODY + F_BREAK;
        private static final String F_RESPONSE_WITH_BODY = F_RESPONSE + F_BREAK + F_HEADERS + F_BODY + F_BREAK + F_BREAKER;


        @Override
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();

            long t1 = System.nanoTime();
            Response response = chain.proceed(request);
            long t2 = System.nanoTime();

            MediaType contentType = null;
            String bodyString = null;
            if (response.body() != null) {
                contentType = response.body().contentType();
                bodyString = response.body().string();
            }

            double time = (t2 - t1) / 1e6d;

            if (request.method().equals("GET")) {
                logger.info(String.format("GET " + F_REQUEST_WITHOUT_BODY + F_RESPONSE_WITH_BODY, request.url(), time, request.headers(), response.code(), response.headers(), stringifyResponseBody(bodyString)));
            } else if (request.method().equals("POST")) {
                logger.info(String.format("POST " + F_REQUEST_WITH_BODY + F_RESPONSE_WITH_BODY, request.url(), time, request.headers(), stringifyRequestBody(request), response.code(), response.headers(), stringifyResponseBody(bodyString)));
            } else if (request.method().equals("PUT")) {
                logger.info(String.format("PUT " + F_REQUEST_WITH_BODY + F_RESPONSE_WITH_BODY, request.url(), time, request.headers(), request.body().toString(), response.code(), response.headers(), stringifyResponseBody(bodyString)));
            } else if (request.method().equals("DELETE")) {
                logger.info(String.format("DELETE " + F_REQUEST_WITHOUT_BODY + F_RESPONSE_WITHOUT_BODY, request.url(), time, request.headers(), response.code(), response.headers()));
            }

            if (response.body() != null) {
                ResponseBody body = ResponseBody.create(contentType, bodyString);
                return response.newBuilder().body(body).build();
            } else {
                return response;
            }
        }


        private  String stringifyRequestBody(Request request) {
            try {
                final Request copy = request.newBuilder().build();
                final Buffer buffer = new Buffer();
                copy.body().writeTo(buffer);
                return buffer.readUtf8();
            } catch (final IOException e) {
                return "did not work";
            }
        }


        public String stringifyResponseBody(String responseBody) {
            return responseBody;
        }

    }
}
