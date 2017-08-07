/*
 * 文件名：ConverterUtils.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： 类型转换工具类
 * 创建人：汪涛
 * 创建时间：2015-07-14
 */
package cn.datai.gift.utils;

/**
 * 类型转换工具类。
 * @author wangtao
 *
 */
public class ConverterUtils {

    /**
     * 字符串转成整型.
     * @param str 待转换字符串
     * @param defInt 默认整型
     * @return 转换后的整型
     */
	public static int parseInt(String str, int defInt) {
		if (MyStringUtil.isNumeric(str)) {
			return Integer.valueOf(str);
		}
		return defInt;
	}
	
	/**
     * 字符串转成应用版本号,版本号从第一个是数字开始截取.
     * @param str 待转换字符串
     * @return 转换后的应用版本号
     */
	public static String getAppVer(String str) {
		if(MyStringUtil.isEmpty(str)){
			return "";
		}
		char[] charArray = str.toCharArray();
		int i = 0;
		for (; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				break;
			}
		}
		return str.substring(i);
	}
	
	public static void main(String[] args) {
		System.out.println(getAppVer("ios1.3"));
		System.out.println(new Double(getAppVer("ios1.3")) < new Double(getAppVer("ios1.4"))); 
		System.out.println(getAppVer("2.1.0").compareTo(getAppVer("v2.1")));
		System.out.println(getAppVer("2.2").compareTo(getAppVer("v2.1.0"))); 
		System.out.println(getAppVer("v2.1"));
		System.out.println(getAppVer("2.1.0"));
		System.out.println("--"+getAppVer("ios"));
	}
}
