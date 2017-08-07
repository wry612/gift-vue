package cn.datai.gift.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class MyDateFormatUtil extends DateFormatUtils{

	public static String format1(Date date){
		if(date == null){
			return "";
		}
		return format(date, "yyyy-MM-dd");
	}
	public static String format2(Date date){
		if(date == null){
			return "";
		}
		return format(date, "yyyy-MM-dd HH:mm");
	}
	public static String formatToTimeStamp(Date date){
		if(date == null){
			return "";
		}
		return Long.toString(date.getTime());
	}
}
