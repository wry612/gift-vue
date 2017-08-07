package cn.datai.gift.web.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import java.io.*;
import java.util.*;

public class ResourcesCache {
    /** 默认资源包 */
    protected ResourceBundle              defaultResource;
    
    /** 资源包集合 */
    protected Map<String, ResourceBundle> resourceMap;

    /** 日志对象 */
    private static final Logger logger      = LoggerFactory.getLogger(ResourcesCache.class);

    protected ResourcesCache(String defaultResourceName) {
        try {
            defaultResource = ResourceBundle.getBundle(defaultResourceName);
        }
        catch (Exception ex) {
            logger.warn("Resources文件不存在：" + defaultResourceName);
        }
        resourceMap = new HashMap<>();
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
