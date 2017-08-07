package cn.datai.gift.utils;


/**
 * 请求头参数线程变量类
 */
public class HeaderParam {
	/**
	 * 当前openAccountSid请求头线程变量
	 */
	public static ThreadLocal<String> openAccountSid = new ThreadLocal<String>();
	/**
	 * 当前sid请求头线程变量
	 */
	public static ThreadLocal<String> sid = new ThreadLocal<String>();
	/**
	 * 当前source请求头线程变量
	 */
	public static ThreadLocal<String> source = new ThreadLocal<String>();
	/**
	 * 当前userId请求头线程变量
	 */
	public static ThreadLocal<String> userId = new ThreadLocal<String>();
	/**
	 * 当前forwarded请求头线程变量
	 */
	public static ThreadLocal<String> forwarded = new ThreadLocal<String>();
}
