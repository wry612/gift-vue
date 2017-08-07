package cn.datai.gift.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.squareup.okhttp.*;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 关于HTTP请求的Utils
 *
 * @author star.thirteen
 * @since 16-4-28
 */
public class HttpUtils {

    /**
     * 简单请求
     *
     * @author star.thirteen
     * @since 16-4-28
     */
    public static HttpResult request(String url) {
        return request(url, null, null);
    }


    /**
     * 带有 header 参数的请求
     *
     * @author star.thirteen
     * @since 16-4-29
     */
    public static HttpResult request(String url, RequestHeader requestHeaders) {
        return request(url, requestHeaders, null);
    }


    /**
     * 带有header参数,request参数的请求
     *
     * @author star.thirteen
     * @since 16-9-18
     */
    public static HttpResult request(String url,
                                     Map<String, Object> requestHeaders,
                                     Map<String, Object> requestParams) {
        return request(url, requestHeaders, requestParams, false);
    }


    /**
     * 带有request参数的请求
     *
     * @author star.thirteen
     * @since 16-4-29
     */
    public static HttpResult request(String url, RequestParam requestParams) {
        return request(url, null, requestParams);
    }

    /**
     * 带有request参数的请求
     *
     * @desc 16-12-1 @param bodyJson {@link #setParam}
     * @author star.thirteen
     * @since 16-11-17
     */
    public static HttpResult request(String url,
                                     Map<String, Object> requestParams, boolean bodyJson) {

        return request(url, null, requestParams, bodyJson);
    }


    /**
     * 带有header参数,request参数的请求
     *
     * @param bodyJson boolean 类型,请求的参数是以json的格式方到body中,而不是key=value的格式
     * @desc 16-9-18 此方法默认使用post提交方式
     * @desc 16-12-1 @param bodyJson {{@link #setParam}}
     * @desc 16-12-1
     * #####################################################################
     * 如果 @param requestParams 为空,则是get请求,反之post请求
     * @author star.thirteen
     * @since 16-10-13
     */
    public static HttpResult request(String url,
                                     Map<String, Object> requestHeaders,
                                     Map<String, Object> requestParams, boolean bodyJson) {
        try {

            if (StringUtils.isEmpty(url))
                throw new RuntimeException("url is empty");

            // new builder
            Request.Builder requestBuilder = new Request.Builder();

            // set request url
            setUrl(requestBuilder, url);
            // set request header
            setHeader(requestBuilder, requestHeaders);
            // set request param
            setParam(requestBuilder, requestParams, bodyJson);

            // build request
            Request request = requestBuilder.build();

            // 同步发送请求
            Response response = OK_HTTP_CLIENT.newCall(request).execute();

            // convert response result
            HttpResult result = convertResult(response);

            result.setUrl(url);
            result.setRequestHeader(requestHeaders);
            result.setRequestParam(requestParams);

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");


    ///////////////////////////////////////////////////////////////////////////////////////// 私有方法

    /**
     * 将http的请求结果转换成为 {@link HttpResult} 对象
     *
     * @author star.thirteen
     * @since 16-11-17
     */
    private static HttpResult convertResult(Response response) throws IOException {

        // 获取response的各种参数
        int responseCode = response.code();
        Headers responseHeaders = response.headers();
        String responseBody = response.body().string();

        Map<String, String> responseHeaderMap = convertHeaderToMap(responseHeaders);

        // 设置response的各种参数
        HttpResult result = new HttpResult();


        result.setResponCode(responseCode);
        result.setResponseBody(responseBody);
        result.setResponseHeader(responseHeaderMap);

        return result;
    }


    /**
     * 设置请求url
     *
     * @author star.thirteen
     * @since 16-11-17
     */
    private static void setUrl(Request.Builder builder, String url) {
        // 设置请求url
        builder.url(url);
    }

    /**
     * 设置请求header
     *
     * @author star.thirteen
     * @since 16-11-17
     */
    private static void setHeader(Request.Builder builder, Map<String, Object> requestHeaders) {

        // 设置请求header
        if (MapUtils.isEmpty(requestHeaders))
            return;

        for (Map.Entry<String, Object> entry : requestHeaders.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                builder.header(key, value + "");
            }
        }

    }

    /**
     * 设置请求参数
     *
     * @desc 16-12-1
     * ##############################################################
     * 请求参数有两种形式
     * 1:key1=value1&key2=value2
     * 2:JSON格式
     * 如果 @param bodyJson == true则以第二种参数格式发送请求,否则以第一种
     * @author star.thirteen
     * @since 16-11-17
     */
    private static void setParam(Request.Builder builder,
                                 Map<String, Object> requestParams,
                                 boolean bodyJson) {

        if (MapUtils.isEmpty(requestParams))
            return;

        RequestBody requestBody = null;

        // @desc 16-11-17 如果请求的参数要求是以json的格式放到body中
        if (bodyJson) {
            requestBody = RequestBody.create(MEDIA_TYPE_JSON,
                    JSON.toJSONString(requestParams).toString());
        }
        // 常规的post请求
        else {
            // 设置请求param
            FormEncodingBuilder requestBodyBuilder = new FormEncodingBuilder();
            for (Map.Entry<String, Object> entry : requestParams.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                // @desc 16-11-24
                if (value != null) {
                    requestBodyBuilder.add(key, value + "");
                }
            }

            requestBody = requestBodyBuilder.build();
        }

        builder.post(requestBody);
    }

    /**
     * 将Header对象转换成Map对象
     *
     * @author star.thirteen
     * @since 16-4-29
     */
    private static Map<String, String> convertHeaderToMap(Headers headers) {
        if (headers == null)
            return null;
        Map<String, String> map = new HashMap<String, String>();
        Set<String> names = headers.names();
        for (String name : names) {
            String value = headers.get(name);
            map.put(name, value);
        }
        return map;
    }


    /**
     * 信任所有的服务器端
     *
     * @author star.thirteen
     * @since 16-7-1
     */
    private static void disableSslVerification(OkHttpClient okHttpClient) {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(X509Certificate[] x509Certificates, String s)
                                throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(X509Certificate[] x509Certificates, String s)
                                throws CertificateException {

                        }

                        public X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }
                    }
            };
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

            okHttpClient.setSslSocketFactory(sslContext.getSocketFactory());

            okHttpClient.setHostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private HttpUtils() {
    }

    /**
     * OkHttp官方文档并不建议我们创建多个OkHttpClient，因此全局使用一个
     *
     * @author star.thirteen
     * @since 16-4-28
     */
    private static final OkHttpClient OK_HTTP_CLIENT;

    static {

        OK_HTTP_CLIENT = new OkHttpClient();

        // 信任所有ssl网站
        disableSslVerification(OK_HTTP_CLIENT);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////


    /**
     * 请求header
     *
     * @author star.thirteen
     * @since 16-4-29
     */
    public static final class RequestHeader
            extends HashMap<String, Object> {
    }


    /**
     * 请求参数
     *
     * @author star.thirteen
     * @since 16-4-29
     */
    public static final class RequestParam
            extends HashMap<String, Object> {
    }


    /**
     * Http请求结果的封装
     *
     * @author star.thirteen
     * @since 16-12-1
     */
    public static final class HttpResult {

        public static final int STATUS_OK = 200;

        // 请求的url
        private String url;
        // 请求头
        private Map<String, Object> requestHeader;
        // 请求参数
        private Map<String, Object> requestParam;


        // http 状态码
        private int responCode;
        // response response header
        private Map<String, String> responseHeader;
        // response response body
        // @desc 16-12-1 字符串格式的body
        private String responseBody;

        ////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * 判断此次http请求是否正确,即根据返回结果的http状态码是否==200
         * throw Execption if not success
         *
         * @author star.thirteen
         * @since 16-6-13
         */
        public boolean checkSuccess() {
            if (responCode != STATUS_OK)
                throw new RuntimeException("请求异常,status:" + responCode);
            return true;
        }

        /**
         * 将 http 请求返回的结果 转换成JSON
         *
         * @author star.thirteen
         * @since 16-5-3
         */
        public JSONObject getResponseBodyJson() {
            try {
                if (StringUtils.isBlank(responseBody))
                    return null;
                JSONObject json = (JSONObject) JSON.parse(responseBody);
                return json;
            } catch (Exception e) {
                throw new RuntimeException("http请求结果转换json格式异常", e);
            }
        }


        ///////////////////////////////////////////////////////////////////////////// getter/settter


        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Map<String, Object> getRequestHeader() {
            return requestHeader;
        }

        public void setRequestHeader(Map<String, Object> requestHeader) {
            this.requestHeader = requestHeader;
        }

        public Map<String, Object> getRequestParam() {
            return requestParam;
        }

        public void setRequestParam(Map<String, Object> requestParam) {
            this.requestParam = requestParam;
        }

        public int getResponCode() {
            return responCode;
        }

        public void setResponCode(int responCode) {
            this.responCode = responCode;
        }

        public Map<String, String> getResponseHeader() {
            return responseHeader;
        }

        public void setResponseHeader(Map<String, String> responseHeader) {
            this.responseHeader = responseHeader;
        }

        public String getResponseBody() {
            return responseBody;
        }

        public void setResponseBody(String responseBody) {
            this.responseBody = responseBody;
        }
    }

}


