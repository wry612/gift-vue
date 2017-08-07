package cn.datai.gift.web.common;



import java.io.File;

public final class Resources {


    /** 公共资源包路径 */
    private static final String   BUNDLE_NAME    = "global";
    
    /** 资源包缓存 */
    private static ResourcesCache RESOURCESCACHE = new ResourcesCache(BUNDLE_NAME);
    
    /**
     * 根据指定的文件对象，添加资源包文件
     * @param file
     */
    public static void addResources(File file) {
        RESOURCESCACHE.addResources(file);
    }

}
