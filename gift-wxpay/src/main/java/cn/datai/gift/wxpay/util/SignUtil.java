package cn.datai.gift.wxpay.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * <pre>
 * 签名相关工具类
 * Created by Binary Wang on 2017-3-23.
 * @author <a href="https://github.com/binarywang">binarywang(Binary Wang)</a>
 * </pre>
 */
public class SignUtil {

    private static Logger logger = LoggerFactory.getLogger(SignUtil.class);

    /**
     * 微信公众号支付签名算法(详见:https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=4_3)
     *
     * @param xmlBean Bean需要标记有XML注解
     * @param signKey 签名Key
     * @return 签名字符串
     */
    public static String createSign(Object xmlBean, String signKey) {
        return createSign(BeanUtils.xmlBean2Map(xmlBean), signKey);
    }

    /**
     * 微信公众号支付签名算法(详见:https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=4_3)
     *
     * @param params  参数信息
     * @param signKey 签名Key
     * @return 签名字符串
     */
    public static String createSign(Map<String, String> params, String signKey) {
        SortedMap<String, String> sortedMap = new TreeMap<>(params);

        StringBuilder toSign = new StringBuilder();
        for (String key : sortedMap.keySet()) {
            String value = params.get(key);
            if (StringUtils.isNotEmpty(value) && !"sign".equals(key) && !"key".equals(key)) {
                toSign.append(key + "=" + value + "&");
            }
        }

        toSign.append("key=" + signKey);
        return DigestUtils.md5Hex(toSign.toString()).toUpperCase();
    }

    /**
     * 校验签名是否正确
     *
     * @param xmlBean Bean需要标记有XML注解
     * @param signKey 校验的签名Key
     * @return true - 签名校验成功，false - 签名校验失败
     * @see #checkSign(Map, String)
     */
    public static boolean checkSign(Object xmlBean, String signKey) {
        Map<String, String> params = BeanUtils.xmlBean2Map(xmlBean);
        return checkSign(params, signKey);
    }

    /**
     * 校验签名是否正确
     *
     * @param params  需要校验的参数Map
     * @param signKey 校验的签名Key
     * @return true - 签名校验成功，false - 签名校验失败
     * @see #checkSign(Map, String)
     */
    public static boolean checkSign(Map<String, String> params, String signKey) {
        String sign = createSign(params, signKey);
        boolean result = sign.equals(params.get("sign"));
        logger.info("微信支付接口调用结果验签{}", ( result ? "成功" : "失败" ));
        return result;
    }
}
