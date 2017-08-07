/*
 * 文件名：SecurityUtils.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： 数学工具集
 * 创建人：H.CAAHN
 * 创建时间：2012-08-06
 */
package cn.datai.gift.utils;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 数学工具集.
 *
 * @author H.CAAHN
 */
public final class MathUtils {

    //    @desc 2016/12/15
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("######0"); //四色五入转换成整数


    /**
     * double类型四舍五入返回int类型
     *
     * @since 2016/12/15
     */
    public static int rounding(double b) {
        return Integer.valueOf(DECIMAL_FORMAT.format(b));
    }

    /**
     * 获取一个随机范围在0（包含）到num（不包含）之间的随机数.
     *
     * @param num 截止数
     * @return 随机整数
     */
    public static int getRandomNum(int num) {
        return new Random().nextInt(num);
    }

    /**
     * 获取一个随机范围在min（包含）到max（不包含）之间的随机数.
     *
     * @param min 最小值（包含）
     * @param max 最大值（不包含）
     * @return 随机整数
     */
    public static int getRandomNum(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    /**
     * 获取一个Long型随机值.
     *
     * @return 随机Long值
     */
    public static long getRandomLong() {
        return new Random().nextLong();
    }

    /**
     * 判断输入的字符串是否是number型.
     *
     * @return true：是；false：不是
     */
    public static boolean isNumber(String str) {
        if (MyStringUtil.isBlank(str)) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断输入的字符串是否是number型，且具有指定的length长度.
     *
     * @param str    数字字符串
     * @param length 指定长度
     * @return true：符合；false：不符合
     */
    public static boolean isNumber(String str, int length) {
        if (MyStringUtil.isBlank(str) || str.length() != length) {
            return false;
        }
        return isNumber(str);
    }

    /**
     * 判断输入的字符串是否是number型，且长度在min到max之间.
     *
     * @param str 数字字符串
     * @param min 长度最小值
     * @param max 长度最大值
     * @return true:符合长度的number;false:不符合长度或不是number
     */
    public static boolean isNumber(String str, int min, int max) {
        if (MyStringUtil.isBlank(str) || str.length() < min || str.length() > max) {
            return false;
        }
        return isNumber(str);
    }

    /**
     * 将byte数组转换成long值.
     *
     * @param data byte数组
     * @return long值
     */
    public static long parse16(byte[] data) {
        return parse16(data, 0, data.length);
    }

    /**
     * 将byte数组转换成long值.
     *
     * @param data   byte数组
     * @param index  起始位置
     * @param length byte数组长度
     * @return long值
     */
    public static long parse16(byte[] data, int index, int length) {
        long result = 0;
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("不能将一个空的byte数组转换成long型");
        } else if (data.length < index + length) {
            throw new IllegalArgumentException("byte数组长度过短, 必须等于或大于 \"index\" + \"length\"的值: " + (index + length));
        } else if (length > 8) {
            throw new IllegalArgumentException("长度必须小于8");
        } else {
            int _index = 0;
            for (int i = (index + length - 1); i >= index; i--) {
                if (_index < length) {
                    result = result | (((long) (data[i] & 0xff)) << (_index * 8));
                    _index++;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 私有构造方法.
     */
    private MathUtils() {
    }
}