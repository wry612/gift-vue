package cn.datai.gift.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * java后台实现HTTP请求
 *
 */
public class HttpRequestUtil {
	private static final Logger logger = LoggerFactory.getLogger(HttpRequestUtil.class);

	/**
	 * get请求
	 *
	 * @param url
	 *            请求的url 例:http://www.baidu.com?parameter1=xxx&parameter2=xxx...
	 * @return 响应数据
	 */
	public String getRequestUrl(String url) {
		CloseableHttpClient httpclient = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer();
		try {
			httpclient = this.createHttpsClient();
			HttpGet get = new HttpGet(url);
			HttpResponse response = httpclient.execute(get);
			HttpEntity entity = response.getEntity();
			in = entity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					in, "utf-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception ex) {
			System.out.println("异常：" + ex.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (httpclient != null) {
					httpclient.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("异常：" + ex.getMessage());
			}
		}
		return sb.toString();

	}

	/**
	 * HTTP GET 请求
	 * @param url
	 * @param params
	 * @param charset
	 * @return
	 */
	public static String get(String url, Map<String, String> params, String charset) {
		return get(url, null, params, charset);
	}

	public static String get(String url, Map<String, String> headers, Map<String, String> params, String charset) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		StringBuffer buffer = null;

		if (params != null && !params.isEmpty()) {
			buffer = new StringBuffer();
			for (Map.Entry<String, String> entry : params.entrySet()) {
				try {
					buffer.append("&").append(entry.getKey()).append("=")
							.append(entry.getValue());
				}
				catch (Exception e) {
				}
			}
		}
		HttpGet httpGet = null;
		CloseableHttpResponse response = null;
		try {
			if (buffer != null && buffer.length() > 0) {
				httpGet = new HttpGet(url + buffer.toString().replaceFirst("&", "?"));
			}
			else {
				httpGet = new HttpGet(url);
			}
			if (headers != null && !headers.isEmpty()) {
				for (Map.Entry<String, String> e : headers.entrySet()) {
					httpGet.addHeader(e.getKey(), e.getValue());
				}
			}
			response = httpclient.execute(httpGet);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				return EntityUtils.toString(response.getEntity(), charset);
			}
			return response.getStatusLine().getStatusCode() + "";
		}
		catch (Exception e) {
			logger.error("HTTP Client [Get] Error", e);
			return e.getLocalizedMessage();
		}
		finally {
			if (httpGet != null)
				httpGet.abort();
			if (response != null) {
				try {
					response.close();
				}
				catch (IOException e) {
				}
			}
		}
	}

	/**
	 * POST请求
	 *
	 * @param url
	 *            请求的url
	 * @param json
	 *            json参数数据
	 * @return 响应数据
	 */
	public String postRequestUrl(String url, String json,
								 Map<String, String> headerMaps) {
		CloseableHttpClient httpclient = null;
		InputStream in = null;
		StringBuffer sb = new StringBuffer();
		try {
			httpclient = this.createHttpsClient();
			HttpPost post = new HttpPost(url);
			post.addHeader("Content-Type", "application/json;charset=utf-8");
			if (null != headerMaps) {
				Iterator<Entry<String, String>> iterator = headerMaps
						.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<String, String> entry = iterator.next();
					post.addHeader(entry.getKey(), entry.getValue());
				}
			}
			if (!StringUtils.isBlank(json)) {
				post.setEntity(new StringEntity(json, "utf-8"));
			}
			HttpResponse response = httpclient.execute(post);
			StringBuffer hsb = new StringBuffer("");
			for (int i = 0; i < response.getAllHeaders().length; i++) {
				hsb.append(response.getAllHeaders()[i].getName() + "=" + response.getAllHeaders()[i].getValue() + ";");
			}
			System.out.println(hsb.toString());
			HttpEntity entity = response.getEntity();
			in = entity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					in, "utf-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception ex) {
			System.out.println("异常：" + ex.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (httpclient != null) {
					httpclient.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("异常：" + ex.getMessage());
			}
		}
		return sb.toString();
	}

	/**
	 *
	 * 描述: 由此方法创建的CloseableHttpClient可以请求https
	 * HttpClients.createHttpsClient()创建的无法使用https，具体不知道怎么回事。
	 *
	 * @return
	 * @author 俞世贵 date 2014-2-21
	 *         -------------------------------------------------- 修改人 修改日期 修改描述
	 *         俞世贵 2014-2-21 创建
	 *         --------------------------------------------------
	 * @Version Ver1.0
	 */
	public CloseableHttpClient createHttpsClient() {
		X509TrustManager x509mgr = new X509TrustManager() {
			public void checkClientTrusted(
					java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
			}

			public void checkServerTrusted(
					java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
			}

			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};
		SSLContext sslContext = null;
		try {
			sslContext = SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		try {
			sslContext.init(null, new TrustManager[] { x509mgr }, null);
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslContext,
				SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
		return HttpClients.custom().setSSLSocketFactory(sslsf).build();
	}

	public static void main(String[] args) {
		/**
		 * 调用案例
		 */
		// get
		new HttpRequestUtil()
				.getRequestUrl("http://baidu.com/xx.action?p1=&p2=&p3");

		// post
		Map<String, Object> json = new HashMap<String, Object>();
		json.put("param1", "");
		json.put("param2", "");
		json.put("param3", "");
		// new HttpRequestUtil().postRequestUrl("http://baidu.com/xx.action",
		// JSON.toJSONString(json));
	}
}
