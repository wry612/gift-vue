/*
 * 文件名：PropertiesUtil.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： Properties文件工具类
 * 创建人：汪涛
 * 创建时间：2015-07-16
 */
package cn.datai.gift.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Properties文件工具类。
 * @author wangtao
 *
 */
public final class PropertiesUtil {
    /** 日志. */
    private static Logger log = LoggerFactory.getLogger(PropertiesUtil.class);

    /**
     * 读取Properties文件.
     * @param file 文件名
     * @return Properties配置对象
     */
    public static Properties loadProp(String file) {
        Properties prop = new Properties();
        try {
            String path = (null == file ? "" : ("/" + file));
            prop.load(PropertiesUtil.class.getResourceAsStream(path));
            return prop;
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error("读取配置信息异常，请检查 " + file + "配置文件.", e);
            }
            return null;
        }
    }
}
