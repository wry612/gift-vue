/*
 * 文件名：SecurityUtils.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： 加密解密工具类
 * 创建人：H.CAAHN
 * 创建时间：2012-08-06
 * 修改人：汪涛
 * 修改时间：2016-02-03
 */
package cn.datai.gift.utils;

import com.alibaba.druid.util.Base64;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * 加解密工具集。
 * @author H.CAAHN
 */
public final class SecurityUtils {

    /** 默认的字符串编码方式 */
    public static String DEFAULT_ENCODING = "utf-8";

    /** 日志对象 */
    private static final Logger logger = LoggerFactory.getLogger(SecurityUtils.class);

    /*
     * Base64加解密
     */
    /**
     * 将指定的byte数据转换成Base64编码字符串.
     * @param byteArr byte数组
     * @return Base64编码字符串，转换失败返回空字符串
     */
    public static final String byteArrToBase64(byte[] byteArr) {
        String result = "";
        if (null != byteArr) {
            try {
                result = Base64.byteArrayToBase64(byteArr);
            } catch (Exception ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("byte[]转换为Base64编码失败.", ex);
                }
                return "";
            }
        }
        return result;
    }

    /**
     * 将指定的字符串转换成Base64编码字符串.
     * @param str 原字符串
     * @param encoding 字符编码
     * @return Base64编码字符串，转换失败返回空字符串
     */
    public static final String stringToBase64(String str, String encoding) {
        String result = "";
        String usedEncoding = encoding;
        if (MyStringUtil.isBlank(encoding)) {
            usedEncoding = DEFAULT_ENCODING;
        }
        if (null != str) {
            try {
                result = Base64.byteArrayToBase64(str.getBytes(usedEncoding));
            } catch (Exception ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("String转换为Base64编码失败.", ex);
                }
                return "";
            }
        }
        return result;
    }
    
    /**
     * 将指定的Base64编码字符串转换成byte数组.
     * @param base64 Base64编码字符串
     * @return byte[]，转换失败返回null
     */
    public static final byte[] base64ToByteArr(String base64) {
        byte[] result = null;
        if (null != base64) {
            try {
                result = Base64.base64ToByteArray(base64);
            } catch (Exception ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("Base64字符串转换为byte[]失败.", ex);
                }
                return null;
            }
        }
        return result;
    }

    /**
     * 将指定的Base64编码字符串转换成原字符串.
     * @param base64 Base64编码字符串
     * @param encoding 字符编码
     * @return 原字符串，转换失败返回空字符串
     */
    public static final String base64ToString(String base64, String encoding) {
        String result = "";
        String usedEncoding = encoding;
        if (MyStringUtil.isBlank(encoding)) {
            usedEncoding = DEFAULT_ENCODING;
        }
        if (null != base64) {
            try {
                byte[] tmpByteArr = base64ToByteArr(base64);
                result = new String(tmpByteArr, usedEncoding);
            } catch (Exception ex) {
                if (logger.isErrorEnabled()) {
                    logger.error("Base64字符串转换为String失败.", ex);
                }
                return "";
            }
        }
        return result;
    }

    /*
     * Hex加解密
     */
    /** Hex加密工具. */
    private static final Hex hex = new Hex(DEFAULT_ENCODING);

    /**
     * hex解密.
     * @param key 待解密字符串
     * @param charset 字符编码
     * @return 解密后字符串，如果解密失败则返回空字符串
     */
    public static String decryptHexString(String key, String charset) {
        try {
            if (MyStringUtil.isBlank(charset)) {
                byte[] bytes = hex.decode(key.getBytes("UTF-8"));
                return new String(bytes, "UTF-8");
            } else {
                byte[] bytes = hex.decode(key.getBytes(charset));
                return new String(bytes, charset);
            }
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("hex解密失败.", ex);
            }
            return "";
        }
    }

    /**
     * hex加密.
     * @param key 待加密字符串
     * @param charset 字符编码
     * @return 加密后字符串，如果加密失败则返回空字符串
     */
    public static String encryptHex(String key, String charset) {
        try {
            if (MyStringUtil.isBlank(key)) {
                return "";
            }
            if (MyStringUtil.isBlank(charset)) {
                return Hex.encodeHexString(key.getBytes("UTF-8"));
            } else {
                return Hex.encodeHexString(key.getBytes(charset));
            }
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("hex加密失败.", ex);
            }
            return "";
        }
    }

    /*
     * RSA加解密.
     */
    /**
     * 获取RSA的KeyPair，其中包含了一对公钥/密钥.
     * @return RSA的KeyPair，返回null表示获取失败
     */
    public static final KeyPair getKeyPair(int length) {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(length);
            return keyGen.generateKeyPair();
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("获取RSA公钥/密钥失败.", ex);
            }
            return null;
        }
    }

    /**
     * RSA加密.
     * @param value 需要加密的数据
     * @param encode 加密密钥
     * @return 加密后byte数组，返回null说明加密失败
     */
    public static final byte[] encryptRSA(byte[] value, byte[] encode) {
        byte[] result = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keyspec = new X509EncodedKeySpec(encode);
            PublicKey key = keyFactory.generatePublic(keyspec);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result = cipher.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("RSA数据加密失败.", ex);
            }
            return null;
        }
        return result;
    }
    
    /**
     * RSA解密.
     * @param value 需要解密的数据
     * @param encode 解密密钥
     * @return 解密后byte数组，返回null说明解密失败
     */
    public static final byte[] decryptRSA(byte[] value, byte[] encode) {
        byte[] result = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec keyspec = new PKCS8EncodedKeySpec(encode);
            PrivateKey key = keyFactory.generatePrivate(keyspec);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            result = cipher.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("RSA数据解密失败.", ex);
            }
            return null;
        }
        return result;
    }

    /*
     * DES加解密
     */
    /**
     * DES加密.
     * @param value 需要加密的byte数组
     * @return encode 加密密钥
     * @return 加密后byte数组，返回null说明加密失败
     */
    public static final byte[] encryptDES(byte[] value, byte[] encode) {
        byte[] result = null;
        try {
            DESKeySpec keyspec = new DESKeySpec(encode);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(keyspec);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            result = cipher.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("DES数据加密失败.", ex);
            }
            return null;
        }
        return result;
    }

    /**
     * DES解密.
     * @param value 需要解密的byte数组
     * @param encode 解密密钥
     * @return 解密后byte数组，返回null说明解密失败
     */
    public static final byte[] decryptDES(byte[] value, byte[] encode) {
        byte[] result = null;
        try {
            DESKeySpec keyspec = new DESKeySpec(encode);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(keyspec);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            result = cipher.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("DES数据解密失败.", ex);
            }
            return null;
        }
        return result;
    }

    /*
     * MD5
     */
    /** 十六进制数字字符 大写. */
    private static char hexdigitsUpperCase[] = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    /** 十六进制数字字符 小写. */
    private static char hexdigitsLowerCase[] = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    /**
     * 获得MD5后字符串.
     * @param str 待MD5加密字符串
     * @param isUpperCase 加密后字符串是否是大写(true:大写 false:小写)
     * @return MD5加密后字符串，返回null则表示加密失败
     */
    public static String getMD5(String str, boolean isUpperCase) {
        // 如果_str为空，则返回null表示加密失败
        if (MyStringUtil.isEmpty(str)) {
            return null;
        }
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            byte[] buffer = str.getBytes();
            md.update(buffer);
            byte[] md5Str = md.digest();
            // 返回MD5加密后16进制字符串
            return byteToHexString(md5Str, isUpperCase);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("MD5数据加密失败.", ex);
            }
        }
        // MD5加密失败
        return null;
    }

    /**
     * 把byte[]数组转换成十六进制字符串表示形式.
     * @param tmp 要转换的byte[]
     * @param isOpperCase 加密后字符串是否是大写(true:大写 false:小写)
     * @return 十六进制字符串表示形式
     */
    private static String byteToHexString(byte[] tmp, boolean isOpperCase) {
        // 采用的字符集
        char hexdigits[] = null;
        // 判断需要返回的是大写字符串还是小写字符串
        if (isOpperCase) {
            hexdigits = hexdigitsUpperCase;
        } else {
            hexdigits = hexdigitsLowerCase;
        }
        // 存储MD5加密后16进制字符串数组
        char str[] = new char[tmp.length * 2];
        // 把密文转换成十六进制的字符串形式
        int k = 0;
        for (int i = 0; i < 16; i++) {
            byte byte0 = tmp[i];
            str[k++] = hexdigits[byte0 >>> 4 & 0xf];
            str[k++] = hexdigits[byte0 & 0xf];
        }
        return new String(str);
    }

    /*
     * SHA-256加密
     */
    /**
     * 根据SHA-256加密算法加密字节数组.
     * @param value 待加密byte数组
     * @return SHA-256加密后数组，返回null表示加密失败
     */
    public static final byte[] encryptSHA256(byte[] value) {
        byte[] result = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            result = messageDigest.digest(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("SHA256数据加密失败.", ex);
            }
            return null;
        }
        return result;
    }

    /**
     * 根据SHA-256加密算法加密字符串，并返回加密后字符串的16位字符串表示形式.
     * @param value 待加密字符串
     * @return SHA-256加密后字符串，加密失败返回空字符串
     */
    public static final String encryptSHA256String(String value) {
        byte[] result = encryptSHA256(value.getBytes());
        if (null != result) {
            return MyStringUtil.parse16(result);
        }
        return "";
    }

    /*
     * AES加解密
     */
    /**
     * 根据密钥对指定的byte数组按AES加密算法进行加密
     * @param key 密钥
     * @param value 待加密byte数组
     * @return 返回加密后的byte数组，返回null表示加密失败
     */
    public static byte[] encryptAES(SecretKey key, byte[] value) {
        if (null == key) {
            if (logger.isErrorEnabled()) {
                logger.error("AES加密密钥不存在,无法加密指定内容.");
            }
            return null;
        }
        // 定义 加密算法,可用 AES
        String Algorithm = "AES";
        // 加密随机数生成器 (RNG),(可以不写)
        SecureRandom sr = new SecureRandom();
        // 定义要生成的密文
        byte[] cipherByte = null;
        try {
            // 得到加密/解密器
            Cipher c1 = Cipher.getInstance(Algorithm);
            // 用指定的密钥和模式初始化Cipher对象
            // 参数:(ENCRYPT_MODE, DECRYPT_MODE, WRAP_MODE,UNWRAP_MODE)
            c1.init(Cipher.ENCRYPT_MODE, key, sr);
            // 对要加密的内容进行编码处理,
            cipherByte = c1.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("AES数据加密失败.", ex);
            }
            return null;
        }
        return cipherByte;
    }

    /**
     * 根据密钥对指定的byte数组按AES加密算法进行解密.
     * @param key 密钥
     * @param value 加密byte数组
     * @return 返回解密后的byte数组，返回null表示解密失败
     */
    public static byte[] decryptAES(SecretKey key, byte[] value) {
        if (key == null) {
            if (logger.isErrorEnabled()) {
                logger.error("AES解密密钥不存在, 无法解密指定内容");
            }
            return null;
        }
        // 定义 加密算法,
        String Algorithm = "AES";
        // 加密随机数生成器 (RNG)
        SecureRandom sr = new SecureRandom();
        byte[] cipherByte = null;
        try {
            // 得到加密/解密器
            Cipher c1 = Cipher.getInstance(Algorithm);
            // 用指定的密钥和模式初始化Cipher对象
            c1.init(Cipher.DECRYPT_MODE, key, sr);
            // 对要解密的内容进行编码处理
            cipherByte = c1.doFinal(value);
        } catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("AES数据解密失败.", ex);
            }
            return null;
        }
        return cipherByte;
    }

    /**
     * 根据MD5加密算法加密自己数组.
     * @param value 需要加密的数据
     * @return 返回加密后的byte数组，返回null表示加密失败
     */
    public static final byte[] encryptMD5(byte[] value) {
        byte[] result = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            result = messageDigest.digest(value);
        }
        catch (Exception ex) {
            if (logger.isErrorEnabled()) {
                logger.error("MD5编码[{}]失败.", MyStringUtil.parse16(value), ex);
            }
            return null;
        }
        return result;
    }

    /**
     * 私有构造方法.
     */
    private SecurityUtils() {
    }
}
