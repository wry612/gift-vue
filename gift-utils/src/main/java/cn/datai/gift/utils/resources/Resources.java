package cn.datai.gift.utils.resources;

import cn.datai.gift.utils.MyStringUtil;

import java.io.File;
import java.text.MessageFormat;

/**
 * @description 资源数据
 * @author XiaLongxiang
 * @createtime 2013-8-30 上午12:15:45
 */
public final class Resources {
    /** 默认语言 */
    public static String          DEFAULT_LOCALE = "zh_CN";
    
    /** 公共资源包路径 */
    private static final String   BUNDLE_NAME    = "global";
    
    /** 资源包缓存 */
    private static ResourcesCache RESOURCESCACHE = new ResourcesCache(BUNDLE_NAME);
    
    public static void addResources(String key) {
        RESOURCESCACHE.addResources(key);
    }
    
    /**
     * 根据指定的文件对象，添加资源包文件
     * @param file
     */
    public static void addResources(File file) {
        RESOURCESCACHE.addResources(file);
    }
    
    public static void addI18nResources(String folderName) {
        RESOURCESCACHE.addI18nResources(folderName);
    }
    
    public static String getI18nString(String key) {
        return RESOURCESCACHE.getI18nString(key);
    }
    
    public static String getI18nString(String key, Object... params) {
        String value = RESOURCESCACHE.getI18nString(key);
        return MessageFormat.format(value, params);
    }
    
    public static String getDefaultI18n(String key, String defvalue) {
        String value = RESOURCESCACHE.getI18nString(key);
        return MyStringUtil.isNotBlank(value) ? value : defvalue;
    }
    
    public static String getDefaultI18n(String key, String defvalue, Object... params) {
        String value = RESOURCESCACHE.getI18nString(key);
        if (MyStringUtil.isBlank(value)) {
            value = defvalue;
        }
        return MessageFormat.format(value, params);
    }
    
    public static String getString(String key) {
        return RESOURCESCACHE.getString(key);
    }
    
    public static String getDefault(String key, String dfv) {
        String value = getString(key);
        if (MyStringUtil.isBlank(value)) {
            value = dfv;
        }
        return value;
    }
    
    public static String getString(String key, Object... params) {
        String value = getString(key);
        return MessageFormat.format(value, params);
    }
    
    public static String getDefault(String key, String dfv, Object... params) {
        String value = getDefault(key, dfv);
        return MessageFormat.format(value, params);
    }
}
