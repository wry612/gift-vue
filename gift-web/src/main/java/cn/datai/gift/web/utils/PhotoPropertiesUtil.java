package cn.datai.gift.web.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PhotoPropertiesUtil {
	private static String PROCESS_PROPERTIES = "config/global.properties";

	static private String value = null;

	private static Logger logger = LoggerFactory.getLogger(PhotoPropertiesUtil.class);

	synchronized static public void loads(String key){
		InputStream in = PhotoPropertiesUtil.class.getClassLoader().getResourceAsStream(PROCESS_PROPERTIES);

		Properties properties = new Properties();
		try {
			properties.load(in);
			value = properties.getProperty(key);

		} catch (IOException e) {
			logger.error("错误信息：{}",e);
		}
	}
	public static String getValue(String key) {
		loads(key);
		return value;
	}

}
