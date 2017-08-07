/*
 * 文件名：StrUtil.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述：字符串工具类
 * 创建人：汪涛
 * 创建时间：2015-07-14
 */
package cn.datai.gift.web.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;


/**
 * 字符串工具类.
 * 提供静态函数进行字符串相关操作、类型转换操作、判空操作等
 * @author wangtao
 */
public class StrUtil extends StringUtils {

    /**
     * 当遇到空字符串返回默认字符串.
     * @param s 元字符串
     * @param def 默认字符串
     * @return 元字符串为空时，返回默认字符串，否则返回元字符串。trim()
     */
    public static String nvl(String s, String def) {
        if (isEmpty(s)) {
            return def;
        }
        return s.trim();
    }

    /**
     * 字符串追加后缀.
     * @param from 原字符串
     * @param suffix 后缀字符串
     * @return 如果原字符串以后缀字符串结尾则直接返回原字符串，否则将后缀字符串添加在源字符串后边并返回
     */
    public static String addSuffix(String from, String suffix) {
        if (isBlank(from)) {
            return "";
        }
        String fr = from.trim();
        String suf = isBlank(suffix) ? "" : suffix.trim();
        if (fr.endsWith(suf)) {
            return fr.trim();
        } else {
            return fr + suf;
        }
    }

    /**
     * 判断字符串是否是整数（非数字字符串或超出Integer范围均为失败）.
     * @param num 整数字符串
     * @return true:整数字符串;false:正整数字符串
     */
    public static boolean isInt(String num) {
        if (isBlank(num)) {
            return false;
        }
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            return false;
        }
        return true;
//        String numPatten = "^(-)?(\\d)+$";
//        if (num.matches(numPatten)) {
//            return true;
//        }
//        return false;
    }

    /**
     * 判断字符串是否是正整数.
     * @param num 正整数字符串
     * @return true:正整数字符串;false:非正整数字符串
     */
    public static boolean isPInt(String num) {
        if (isBlank(num)) {
            return false;
        }
        String numPatten = "^\\d+$";
        if (num.matches(numPatten)) {
            return true;
        }
        return false;
    }

    /**
     * 将数字字符串转换成整数，转换失败返回null.
     * @param num 整数字符串
     * @return 整数对象
     */
    public static Integer parseInt(String num) {
        try {
            return new Integer(num);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 将数字字符串转换成BigDecimal，转换失败返回null.
     * @param num BigDecimal字符串
     * @return BigDecimal对象
     */
    public static BigDecimal parseBigDecimal(String num) {
        try {
            return new BigDecimal(num);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 判断字符串是否是Boolean值.
     * @param bool Boolean字符串
     * @return true:是Boolean字符串;false:非Boolean字符串
     */
    public static boolean isBoolean(String bool) {
        if (isBlank(bool)) {
            return false;
        }
        if ("true".equalsIgnoreCase(bool)
                || "false".equalsIgnoreCase(bool)) {
            return true;
        }
        return false;
    }

    /*
     * 各类型与16进制字符串的相互转换
     */
    /** char数组. */
    public final static char[] digits = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
            'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '_', '-', '~', '!', '#', '$', '%', '^', '&', '*', '(', ')', '=', '+',
            '/', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\"', '<', '>', ',', '.', '?'};

    /**
     * 将普通的文本字符串转换成16进制字符串.
     * @param str 文本字符串
     * @param splitStr 分割字符串
     * @return 16进制字符串
     */
    public static String parse16(String str, String splitStr) {
        return parse16(str.getBytes(), null, splitStr, 0);
    }

    /**
     * 将byte数组转换成16进制字符串.
     * @param data byte数组
     * @return 16进制字符串
     */
    public static String parse16(byte[] data) {
        return parse16(data, null, null, -1);
    }

    /**
     * 将byte数组转换成16进制字符串.
     * @param data byte数组
     * @param prefix 前缀
     * @return 16进制字符串
     */
    public static String parse16(byte[] data, String prefix) {
        return parse16(data, prefix, null, -1);
    }

    /**
     * 将byte数组转换成16进制字符串.
     * @param data byte数组
     * @param prefix 前缀
     * @param splitStr 分隔符
     * @return 16进制字符串
     */
    public static String parse16(byte[] data, String prefix, String splitStr) {
        return parse16(data, prefix, splitStr, -1);
    }

    /**
     * 将byte数组转换成16进制字符串，如数组{0x78, 0x2A, 0x5C}将转换成字符串"78 2A 5C"。
     * @param data byte数组
     * @param prefix 前缀
     * @param splitStr 分隔符
     * @param lineNum 一行显示条数
     * @return 16进制字符串
     */
    public static String parse16(byte[] data, String prefix, String splitStr, int lineNum) {
        if (data == null || data.length == 0) {
            return null;
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0, n = data.length; i < n;) {
            byte b = data[i];
            if (splitStr != null && i > 0) {
                buf.append(splitStr);
            }
            if (prefix != null) {
                buf.append(prefix);
            }
            buf.append(digits[(b >>> 4) & 0x0f]);
            buf.append(digits[b & 0x0f]);
            i++;
            if (lineNum > 0 && i % lineNum == 0) {
                buf.append("\r\n");
            }
        }
        return buf.toString();
    }

    /**
     * 将16进制文本字符串转换成普通字符串.
     * @param hex 16进制字符串
     * @return 原字符串
     */
    public static String hex2String(String hex) {
        Pattern pattern = Pattern.compile("^0(x|X)");
        boolean find = pattern.matcher(hex).find();
        if (find) {
            hex = hex.substring(2);
        }
        hex = hex.replaceAll("\\s", "");

        char[] chs = hex.toCharArray();
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (char2byte(chs[i * 2]) << 4 | char2byte(chs[i * 2 + 1]));
        }
        return new String(bytes);
    }

    /**
     * 将long型转换成16进制表现形式.
     * @param num 数字
     * @param pix 是否带0x前缀
     * @return 16进制字符串
     */
    public static String parse16(long num, boolean pix) {
        return parse16(num, 16, pix);
    }

    /**
     * 将int型转换成16进制表现形式.
     * @param num 数字
     * @param pix 是否带0x前缀
     * @return 16进制字符串
     */
    public static String parse16(int num, boolean pix) {
        return parse16(num, 8, pix);
    }

    /**
     * 将short型转换成16进制表现形式.
     * @param num 数字
     * @param pix 是否带0x前缀
     * @return 16进制字符串
     */
    public static String parse16(short num, boolean pix) {
        return parse16(num, 4, pix);
    }

    /**
     * 将byte型转换成16进制表现形式.
     * @param num 数字
     * @param pix 是否带0x前缀
     * @return 16进制字符串
     */
    public static String parse16(byte num, boolean pix) {
        return parse16(num, 2, pix);
    }

    /**
     * 将数值转换成指定长度的16进制表现形式.
     * @param num 数字
     * @param index 开始位置
     * @param pix 是否带0x前缀
     * @return 16进制字符串
     */
    public static String parse16(long num, int index, boolean pix) {
        char[] chs;
        if (pix) {
            chs = new char[index + 2];
            chs[0] = '0';
            chs[1] = 'x';
            for (int i = index - 1; i >= 0; i--) {
                int _t = (int) (num >>> (i * 4) & 0x0f);
                chs[index + 1 - i] = digits[_t];
            }
        } else {
            chs = new char[index];
            for (int i = index - 1; i >= 0; i--) {
                int _t = (int) (num >>> (i * 4) & 0x0f);
                chs[index - 1 - i] = digits[_t];
            }
        }
        return new String(chs);
    }


    /**
     * 将微信的下划线keyname转换为驼峰类型 如：head_img_url-->headImgUrl
     * @param jsonObj
     * @return
     */
    public static JSONObject convertToCamelKey(JSONObject jsonObj) {
        Set<String> keys = jsonObj.keySet();
        Iterator<String> it = keys.iterator();
        JSONObject camelJsonObj = new JSONObject();
        while (it.hasNext()) {
            String key = it.next();
            String camelKey = toCamelStr(key);
            camelJsonObj.put(camelKey, jsonObj.get(key));
        }
        return camelJsonObj;
    }


    /**
     * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。</br> 例如：HELLO_WORLD->HelloWorld
     * @param name 转换前的下划线大写方式命名的字符串
     * @return 转换后的驼峰式命名的字符串
     */
    public static String toCamelStr(String name) {
        StringBuilder result = new StringBuilder();
        // 快速检查
        if (name == null || name.isEmpty()) {
            // 没必要转换
            return "";
        } else if (!name.contains("_")) {
            // 不含下划线，仅将首字母小写
            return name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        // 用下划线将原始字符串分割
        String camels[] = name.split("_");
        for (String camel : camels) {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty()) {
                continue;
            }
            // 处理真正的驼峰片段
            if (result.length() == 0) {
                // 第一个驼峰片段，全部字母都小写
                result.append(camel.toLowerCase());
            } else {
                // 其他的驼峰片段，首字母大写
                result.append(camel.substring(0, 1).toUpperCase());
                result.append(camel.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }




    /**
     * 将16进制的char字符转换成byte.
     * @param ch 字符
     * @return byte
     */
    private static byte char2byte(char ch) {
        int result = "0123456789ABCDEF".indexOf(Character.toUpperCase(ch));
        if (result == -1) {
            throw new RuntimeException("不能将字符:  \"" + ch + "\"转换成16进制数");
        }
        return (byte) result;
    }
}
