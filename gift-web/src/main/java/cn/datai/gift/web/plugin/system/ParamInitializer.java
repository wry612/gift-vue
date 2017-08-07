package cn.datai.gift.web.plugin.system;

import cn.datai.gift.web.service.impl.SystemParamsServiceImpl;
import cn.datai.gift.web.utils.MyStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by zhangyutao on 2016/8/24.
 */
@Component
public class ParamInitializer {

    private Logger logger = LoggerFactory.getLogger(ParamInitializer.class);

    @Resource(name = "initProperties")
    private Properties properties;

    @Autowired
    private SystemParamsServiceImpl systemParamsService;

    @PostConstruct
    public void init(){
        //读取数据库系统配置，放入redis中
        systemParamsService.querySystemParams();

        //将商品信息和价格信息（扩展信息和历史价格尚未放入）放入redis
        systemParamsService.setCommodityContractRedis();

        Thread thread = new Thread() {
            public void run() {
                do {
                    WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
                    if (context == null) {
                        try {
                            Thread.sleep(2500);
                        }
                        catch (Exception ex) {

                        }
                        logger.warn("ServletContext setAttribute waiting...");
                        continue;
                    }

                    logger.warn("ServletContext setAttribute running...");
                    this.init(context);
                    break;
                } while (true);
                logger.warn("ServletContext setAttribute successed");
            }

            public void init(WebApplicationContext context) {
                ServletContext servletContext = context.getServletContext();
                Enumeration<?> propertyNames = properties.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String propertyName = (String)propertyNames.nextElement();
                    String propertyValue = properties.getProperty(propertyName);
                    servletContext.setAttribute(toCamelCase(propertyName, true), propertyValue);
                    logger.info("设置系统参数:{} ------[{}]", toCamelCase(propertyName, true), propertyValue);
                }
                String staticPath = properties.getProperty("static.path");
                if(MyStringUtil.isEmpty(staticPath)){
                    staticPath = servletContext.getContextPath();
                }
                servletContext.setAttribute("staticPath",staticPath);
                logger.info("设置静态资源的路径:{}", staticPath);
            }
        };

        thread.start();
    }

    private String toCamelCase(String value, boolean startWithLowerCase) {
        value = MyStringUtil.replaceEachRepeatedly(value, new String[]{".", "-"}, new String[]{"_", "_"});
        String[] strings = MyStringUtil.split(value, "_");
        for (int i = startWithLowerCase ? 1 : 0; i < strings.length; i++){
            strings[i] = MyStringUtil.capitalize(strings[i]);
        }
        return MyStringUtil.join(strings);
    }

}
