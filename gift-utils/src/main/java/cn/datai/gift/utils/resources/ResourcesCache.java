package cn.datai.gift.utils.resources;

import cn.datai.gift.utils.MyStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

/**
 * @description 资源包工具
 * @author XiaLongxiang
 * @createtime 2013-7-31 下午11:30:14
 */
public class ResourcesCache {
    /** 默认资源包 */
    protected ResourceBundle              defaultResource;
    
    /** 资源包集合 */
    protected Map<String, ResourceBundle> resourceMap;
    
    /** I18N资源包集合 */
    protected Map<String, ResourceBundle> i18nMap;
    
    /** 语言包 */
    protected static Vector<String>       LOCALE_LIST = new Vector<String>();
    
    /** 日志对象 */
    private static final Logger           logger      = LoggerFactory.getLogger(ResourcesCache.class);
    
    static {
        LOCALE_LIST.add("zh_CN");
    }
    
    protected ResourcesCache(String defaultResourceName) {
        try {
            defaultResource = ResourceBundle.getBundle(defaultResourceName);
        }
        catch (Exception ex) {
            logger.warn("Resources文件不存在：" + defaultResourceName);
        }
        resourceMap = new HashMap<String, ResourceBundle>();
        i18nMap = new HashMap<String, ResourceBundle>();
    }
    
    /**
     * 根据指定的资源包的key添加一个资源包，若该资源包已添加，则不会重复添加
     * @param key
     */
    protected void addResources(String key) {
        if (MyStringUtil.isNotBlank(key) && !resourceMap.containsKey(key)) {
            try {
                ResourceBundle resource = ResourceBundle.getBundle(key);
                resourceMap.put(key, resource);
            }
            catch (MissingResourceException e) {
                logger.error("未查找到资源文件", e);
            }
        }
        else {
            logger.warn("Add a duplicate resource:　{}", key);
        }
    }
    
    /**
     * 根据指定的文件对象，将其配置的信息添加到资源包中
     * @param file
     */
    protected void addResources(File file) {
        try {
            Reader reader = new FileReader(file);
            ResourceBundle resource = new PropertyResourceBundle(reader);
            resourceMap.put(file.getName(), resource);
        }
        catch (FileNotFoundException e) {
            logger.error("资源缺失：文件未找到", e);
        }
        catch (IOException e) {
            logger.error("资源缺失：IO异常", e);
        }
    }
    
    /**
     * 根据I18N文件夹，加载该文件夹下面所有的I18N资源数据
     * @param folderName
     */
    protected void addI18nResources(String folderName) {
        if (MyStringUtil.isNotBlank(folderName)) {
            for (String locale : LOCALE_LIST) {
                try {
                    ResourceBundle resource = ResourceBundle.getBundle(folderName + "." + locale);
                    i18nMap.put(locale, resource);
                }
                catch (Exception ex) {
                    logger.warn("Missing files in i18n directory: {}", locale);
                }
            }
        }
    }
    
    /**
     * 根据key获取I18N中设置的数据，若指定的key在DEFAULT_LOCALE的资源包中不存在，则返回空串
     * @param key
     * @return
     */
    protected String getI18nString(String key) {
        try {
            ResourceBundle resource = i18nMap.get(Resources.DEFAULT_LOCALE);
            if (resource != null) {
                return resource.getString(key);
            }
        }
        catch (MissingResourceException e) {
            logger.warn("Missing properties key: {}", key);
        }
        
        return "";
    }
    
    /**
     * 根据指定的key获取资源包中的数据
     * @param key
     * @return
     */
    protected String getString(String key) {
        if (defaultResource != null) {
            try {
                return defaultResource.getString(key);
            }
            catch (MissingResourceException e) {
                
            }
        }
        
        String result = null;
        for (ResourceBundle resource : resourceMap.values()) {
            try {
                result = resource.getString(key);
                break;
            }
            catch (MissingResourceException e1) {
            }
        }
        
        if (result != null) {
            return result;
        }
        return "";
    }
}
