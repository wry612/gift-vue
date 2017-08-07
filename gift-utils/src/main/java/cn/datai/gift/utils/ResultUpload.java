package cn.datai.gift.utils;

import java.util.ArrayList;

public class ResultUpload {
	/**
	* 表示图片是否已上传成功。
	*/
	public Boolean success;
	public String userid;
	public String username;
	/**
	* 自定义的附加消息。
	*/
	public String msg;
	/**
	* 表示原始图片的保存地址。
	*/
	public String sourceUrl;
	/**
	* 表示所有头像图片的保存地址，该变量为一个数组。
	*/
	@SuppressWarnings("rawtypes")
	public ArrayList avatarUrls;
	
	/**
	 * 图片服务器路径
	 */
	public String imgUrl;
}
