package cn.datai.gift.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dubbo 工具类
 * Created by shaowei on 2016/11/26.
 */
public class DubboUtils {
    private static Logger logger = LoggerFactory.getLogger(DubboUtils.class);
    private static volatile boolean running = true;

    private static DubboListener listener;

    public static void springStart(String[] springConf){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConf);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    context.stop();
                    context.close();
                    logger.info("Dubbo Service stopped!");
                } catch (Throwable t) {
                    logger.error(t.getMessage(), t);
                }
                synchronized (DubboUtils.class) {
                    running = false;
                    DubboUtils.class.notify();
                }
            }
        });

        context.start();
        logger.info("Dubbo Service start...!!!!!!!!!");

        if (listener != null) {
            listener.started(context);
        }
        synchronized (DubboUtils.class) {
            while (running) {
                try {
                    DubboUtils.class.wait();
                } catch (Throwable e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }

    public static void addListener(DubboListener listener) {
        DubboUtils.listener = listener;
    }
}
