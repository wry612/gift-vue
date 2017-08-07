package cn.datai.gift.utils.pay;

import cn.datai.gift.utils.exception.BizException;
import com.google.common.base.Joiner;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhangxiang on 2016/11/22 支付签名相关工具.
 */

public class PayUtil {

    private static final Logger logger = LoggerFactory.getLogger("PayUtil");

    private static final String SIGNATURE_ALGORITHM = "SHA1WithRSA";

    public static final  String PUB_KEY_ALGORITHM  ="RSA";

    public static String buildRequestStr(Map<String, String> param){
        Map<String, String> mm = new TreeMap<String, String>();
        mm.putAll(param);
        String plainText = Joiner.on('&')
                .withKeyValueSeparator("=").join(mm);
        logger.debug("Sign plainText {}",plainText);
        return plainText;
    }
    public static String bulidRequestSign(Map<String, String> param, String priKey)  throws BizException {
        String plainText = buildRequestStr(param);
        byte[] signDataBytes = null;
        try {
            signDataBytes = CertificateCoder.sign(
                    plainText.getBytes("UTF-8"), SIGNATURE_ALGORITHM,
                    getPrivateKeyFromBase64(priKey));
        } catch (Exception e) {
            throw new BizException("生成签名异常", e);
        }
        String sign = Base64.encodeBase64URLSafeString(signDataBytes);
        return sign;
    }
    public static boolean  verifySign(String content,String  sign,String pubKeyStr,String inputCharset){
        try
        {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] encodedKey = Base64.decodeBase64(pubKeyStr);
            PublicKey pubKey = keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(pubKey);
            signature.update(content.getBytes(inputCharset) );
            boolean bverify = signature.verify(Base64.decodeBase64(sign));
            return bverify;
        }
        catch (Exception e)
        {
            logger.warn("验证签名错误",e);
        }
        return false;
    }
    private static PrivateKey getPrivateKeyFromBase64(String priKey) throws BizException {
        byte[] decodedByte = Base64.decodeBase64(priKey);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedByte);
        KeyFactory kf;
        PrivateKey merchantPriv = null;
        try {
            kf = KeyFactory.getInstance(PUB_KEY_ALGORITHM);
            merchantPriv = kf.generatePrivate(keySpec);
        } catch (Exception e) {
            throw new BizException("获取签名私钥错误", e);
        }
        return merchantPriv;
    }
    public static String bulidPayFormRequest(String payUrl,Map<String, String> param,boolean autoCommit){
        StringBuilder formBuff = new StringBuilder();
        formBuff.append(String.format("<form action=\"%s\" method=\"GET\" name=\"payRequestForm\" id=\"payRequestForm\" _input_charset=\"utf-8\">",payUrl));
        for(String key:param.keySet()){
            formBuff.append(String.format("<input type=\"hidden\" name=\"%s\" value=\"%s\">\n",key,param.get(key)));
        }
        formBuff.append("</form>");
        if(autoCommit){
            formBuff.append("<script>document.forms['payRequestForm'].submit();</script>");
        }
        return formBuff.toString();
    }
    public static String bulidPayUri(String payUrl,Map<String, String> param){
        StringBuilder urlBuff = new StringBuilder();
        urlBuff.append(payUrl);
        urlBuff.append("?");
        urlBuff.append(Joiner.on('&').useForNull("")
                .withKeyValueSeparator("=").join(param));
        return urlBuff.toString();
    }

}
