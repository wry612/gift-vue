/*
 * 文件名：UniqueValUtil.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述：唯一值工具类
 * 创建人：汪涛
 * 创建时间：2014-07-14
 */
package cn.datai.gift.utils;

import cn.datai.gift.utils.exception.BizException;

import java.util.Random;
import java.util.UUID;

/**
 * 唯一值工具类.
 * @author wangtao
 */
public class UniqueValUtil {

    /**
     * 生成并获得UUID.
     * @return UUID字符串
     */
    public synchronized static String makeUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /** 唯一数值种子. */
    private static long NL = System.currentTimeMillis();
    /**
     * 唯一数值生成器.
     * <br>系统保证每次在对此方法调用时都将返回不重复的数字字符串结果.此方法是线程安全的.</br>
     * <br>此方法利用服务器时钟获得13个字符(由纯数字组成)的定长数字字符串.</br>
     * <br>由于算法依赖于服务器时钟信息.</br>
     * <br>因此,请不要频繁的去更改服务器时间及时区(尽管这种因频繁地时钟变更而产生重复值的概率非常非常低).</br>
     * @return 13个数字字符串的定长字符串.
     */
    public synchronized static String newUniqueNum() throws BizException {
        long nl = System.currentTimeMillis();
        while (nl == NL) {
            nl = System.currentTimeMillis();
        }
        NL = nl;
        String rNum = String.valueOf(nl);
        while (13 > rNum.length()) {
            rNum = "0" + rNum;
        }
        if (13 < rNum.length()) {
            rNum = rNum.substring(rNum.length() - 13);
        }
        return rNum;
    }

    /*
     * 唯一值生成器.
     */
    /** 唯一值生成器种子. */
    private static long L = System.currentTimeMillis();
    /**
     * 唯一值生成器.
     * <br>系统保证每次在对此方法调用时都将返回不重复的字符串结果.此方法是线程安全的.</br>
     * <br>此方法利用服务器时钟及数学进位算法,计算出10个字符(由英文字母和数字组成)的定长字符串.</br>
     * <br>由于算法依赖于服务器时钟信息.</br>
     * <br>因此,请不要频繁的去更改服务器时间及时区(尽管这种因频繁地时钟变更而产生重复值的概率非常非常低).</br>
     * @param pre 前缀
     * @return 10个字符串的定长字符串.
     */
    public synchronized static String newUniqueVal(char pre) throws BizException {
        long l = System.currentTimeMillis();
        while (l == L) {
            l = System.currentTimeMillis();
        }
        String ident = encodingId("0123456789abcdefghijklmnopqrstuvwxyz".toCharArray(), L = l);
        switch (ident.length()) {
            case 9:
                return String.valueOf(pre) + ident;
            case 8:
                return String.valueOf(pre) + "0" + ident;
            case 7:
                return String.valueOf(pre) + "00" + ident;
            case 6:
                return String.valueOf(pre) + "000" + ident;
            default:
                throw new BizException("唯一编号生成失败.");
        }
    }

    /**
     * 唯一Id编码.
     * @param jz Id字符串源（Id字符串来源）
     * @param n 计算唯一Id的种子（当前时间）
     * @return 唯一Id
     */
    private static String encodingId(char[] jz, long n) {
        long s = n / 36;
        long y = n % 36;
        int sInt = (int) s;
        int yInt = (int) y;
        if (s < 36) {
            return (sInt == 0 ? "" : String.valueOf(jz[sInt])) + jz[yInt];
        } else {
            return encodingId(jz, s) + jz[yInt];
        }
    }

    /**
     * 生成随机验证码（6位数字）.
     * @return 生成的验证码字符串
     */
    public static String makeCheckCode() {
        Random rd = new Random();
        int val = rd.nextInt(1000000);
        if (99999 < val) {
            return String.valueOf(val);
        } else {
            return String.valueOf((rd.nextInt(9) + 1) * 100000 + val);
        }
    }
}
