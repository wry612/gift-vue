package cn.datai.gift.utils.baidu.ocr.idcard.free;

import cn.datai.gift.utils.MyStringUtil;
import cn.datai.gift.utils.exception.BizException;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.*;

public class BceV1Signer {
    private static final Logger logger = LoggerFactory.getLogger(BceV1Signer.class);

    private static final String DEF_AK = "";
    private static final String DEF_SK = "";
    private static final String BCE_AUTH_VERSION = "bce-auth-v1";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Charset UTF8 = Charset.forName(DEFAULT_ENCODING);

    // Default headers to sign with the BCE signing protocol.
    private static final Set<String> defaultHeadersToSign = Sets.newHashSet();
    private static final Joiner headerJoiner = Joiner.on('\n');
    private static final Joiner signedHeaderStringJoiner = Joiner.on(';');

    static {
        BceV1Signer.defaultHeadersToSign.add(Headers.HOST.toLowerCase());
        BceV1Signer.defaultHeadersToSign.add(Headers.CONTENT_TYPE.toLowerCase());
        BceV1Signer.defaultHeadersToSign.add(Headers.BCE_DATE.toLowerCase());
    }

    /**
     * Sign the given request with the given set of credentials. Modifies the passed-in request to apply the signature.
     *
     * @param request     the request to sign.
     * @param credentials the credentials to sign the request with.
     * @param options     the options for signing.
     */
    public void sign(HttpPost request, String ak, String sk) {
        if (null == request) {
            if (logger.isErrorEnabled()) {
                logger.error("签名参数错误");
            }
            return;
        }
        // 参数准备
        String accessKeyId = DEF_AK;
        if (MyStringUtil.isNotBlank(ak)) {
            accessKeyId = ak;
        }
        String secretAccessKey = DEF_SK;
        if (MyStringUtil.isNotBlank(sk)) {
            secretAccessKey = sk;
        }
        SignOptions options = SignOptions.DEFAULT;
        options.setHeadersToSign(defaultHeadersToSign);
        Date timestamp = options.getTimestamp();
        if (timestamp == null) {
            timestamp = new Date();
        }
        // Header中增加HOST
        request.addHeader(Headers.HOST, HttpUtils.generateHostHeader(request.getURI()));
        // 验证字符串
        String authString =
                BceV1Signer.BCE_AUTH_VERSION + "/" + accessKeyId + "/"
                        + DateUtils.formatAlternateIso8601Date(timestamp) + "/" + options.getExpirationInSeconds();
        String signingKey = this.sha256Hex(secretAccessKey, authString);
        // Formatting the URL with signing protocol.
        String canonicalURI = this.getCanonicalURIPath(request.getURI().getPath());
        // Formatting the query string with signing protocol.
        Map<String, String> reqParams = new HashMap<String, String>();
        String qs = request.getURI().getQuery();
        if (MyStringUtil.isNotBlank(qs)) {
            String[] qsArr = qs.split("&");
            String[] kvArr = null;
            for (String kvStr : qsArr) {
                if (MyStringUtil.isNotBlank(kvStr)) {
                    kvArr = kvStr.split("=");
                    if (2 == kvArr.length
                            && MyStringUtil.isNotBlank(kvArr[0])
                            && MyStringUtil.isNotBlank(kvArr[1])) {
                        reqParams.put(kvArr[0], kvArr[1]);
                    }
                }
            }
        }
        String canonicalQueryString = HttpUtils.getCanonicalQueryString(reqParams, true);
        // Sorted the headers should be signed from the request.
        SortedMap<String, String> headersToSign =
                this.getHeadersToSign(request.getAllHeaders(), options.getHeadersToSign());
        // Formatting the headers from the request based on signing protocol.
        String canonicalHeader = this.getCanonicalHeaders(headersToSign);
        String signedHeaders = "";
        if (options.getHeadersToSign() != null) {
            signedHeaders = BceV1Signer.signedHeaderStringJoiner.join(headersToSign.keySet());
            signedHeaders = signedHeaders.trim().toLowerCase();
        }
        String canonicalRequest =
                request.getMethod() + "\n" + canonicalURI + "\n" + canonicalQueryString + "\n" + canonicalHeader;
        // Signing the canonical request using key with sha-256 algorithm.
        String signature = this.sha256Hex(signingKey, canonicalRequest);
        String authorizationHeader = authString + "/" + signedHeaders + "/" + signature;

        if (logger.isDebugEnabled()) {
            logger.debug("CanonicalRequest:{}\tAuthorization:{}", canonicalRequest.replace("\n", "[\\n]"),
                    authorizationHeader);
        }
        request.addHeader(Headers.AUTHORIZATION, authorizationHeader);
    }

    private String getCanonicalURIPath(String path) {
        if (path == null) {
            return "/";
        } else if (path.startsWith("/")) {
            return HttpUtils.normalizePath(path);
        } else {
            return "/" + HttpUtils.normalizePath(path);
        }
    }

    private String getCanonicalHeaders(SortedMap<String, String> headers) {
        if (headers.isEmpty()) {
            return "";
        }

        List<String> headerStrings = Lists.newArrayList();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                continue;
            }
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            headerStrings.add(HttpUtils.normalize(key.trim().toLowerCase()) + ':' + HttpUtils.normalize(value.trim()));
        }
        Collections.sort(headerStrings);

        return headerJoiner.join(headerStrings);
    }

    private SortedMap<String, String> getHeadersToSign(Header[] headers, Set<String> headersToSign) {
        SortedMap<String, String> ret = Maps.newTreeMap();
        if (headersToSign != null) {
            Set<String> tempSet = Sets.newHashSet();
            for (String header : headersToSign) {
                tempSet.add(header.trim().toLowerCase());
            }
            headersToSign = tempSet;
        }
        for (Header h : headers) {
            if (MyStringUtil.isNotBlank(h.getValue())) {
                if ((null == headersToSign && this.isDefaultHeaderToSign(h.getName()))
                        || (null != headersToSign && headersToSign.contains(h.getName().toLowerCase())
                                && !Headers.AUTHORIZATION.equalsIgnoreCase(h.getName()))) {
                    ret.put(h.getName(),  h.getValue());
                }
            }
        }
        return ret;
    }

    private boolean isDefaultHeaderToSign(String header) {
        header = header.trim().toLowerCase();
        return header.startsWith(Headers.BCE_PREFIX) || defaultHeadersToSign.contains(header);
    }

    private String sha256Hex(String signingKey, String stringToSign) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(signingKey.getBytes(UTF8), "HmacSHA256"));
            return new String(Hex.encodeHex(mac.doFinal(stringToSign.getBytes(UTF8))));
        } catch (Exception e) {
            throw new BizException("Fail to generate the signature", e);
        }
    }
}
