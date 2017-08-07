package cn.datai.gift.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by H.CAAHN on 2016/12/28.
 */
public interface DubboListener {
    /**
     * dubbo服务启动完成后调用
     * @param context
     */
    void started(ClassPathXmlApplicationContext context);
}
