package cn.datai.gift.web.taskdyn;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.web.service.ConversionService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.commons.httpclient.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 定期抽奖定时任务<br/>
 * 注意，本程序在集群部署的情况下会产生问题，集群时，请无比修改
 * Created by H.CAAHN on 2017/6/29.
 */
public class ConvertObjDrawTask {
    @Autowired
    private DynamicTask dynamicTask;

    @Autowired
    private ConversionService conversionService;

    public static final Map<Long, Long> runnedMap = new ConcurrentHashMap<>();

    private boolean running;

    public static final String triggerName = "convertObjDrawTrigger";

    private static final Logger logger = LoggerFactory.getLogger(ConvertObjDrawTask.class);

    public void doTask() {
        if (running) {
            logger.warn("抽奖定时检查任务执行重复，拒绝此次执行");
            return;
        }

        synchronized (this) {
            running = true;
            try {
                this.checkTaskAndRun();
            }
            catch (Exception ex) {
                logger.error("抽奖定时检查任务执行失败", ex);
            }
        }
        running = false;
    }

    public void checkTaskAndRun() {
        logger.info("=========>>开始执行抽奖定时检查任务...");

        Calendar calendar = Calendar.getInstance();
        // 程序执行延迟补偿
        calendar.add(Calendar.SECOND, 5);
        List<Long> idList = null;
        List<ConvertObj> dataList = this.conversionService.findDrawList(calendar.getTime());
        if (dataList != null && !dataList.isEmpty()) {
            idList = new ArrayList<>(dataList.size());

            for (ConvertObj record : dataList) {
                idList.add(record.getConvertObjId());
                Long exists = runnedMap.get(record.getConvertObjId());
                if (exists != null && exists > 0) {
                    logger.info("定时抽奖执行中止，该抽奖程序在执行中，ID号: {}", record.getConvertObjId());
                    continue;
                }

                logger.info("定时抽奖执行开始，ID号: {}", record.getConvertObjId());
                runnedMap.put(record.getConvertObjId(), new Date().getTime());

                // 启动线程执行抽象任务
                Thread thread = new ConvertObjDrawThread(record, conversionService);
                thread.setDaemon(true);
                thread.start();
            }
        }
        else {
            logger.info("未查询到当前需执行的抽奖任务...");
        }

        // 查询距离最近的一次抽奖
        String expression;
        ConvertObj record = this.conversionService.findNearestDraw(idList);
        if (record != null && record.getDrawTime() != null) {
            expression = this.transDataToExpression(record.getDrawTime());
            logger.info("最近的一次抽奖时间：{}，定时任务表达式：{}", formatDate(record.getDrawTime(), "yyyy-MM-dd HH:mm:ss"), expression);

            // 设置下一次任务执行时间
            boolean result = dynamicTask.updateCronExpression(triggerName, expression);
            if (result) {
                return;
            }
            logger.error("定时任务更新失败，表达式：{}", expression);
        }
        else {
            logger.info("未查询到待抽奖任务");
        }

        calendar.add(Calendar.HOUR_OF_DAY, 1);
        expression = this.transDataToExpression(calendar.getTime());
        logger.info("更新定时任务表达式：{}", expression);
        dynamicTask.updateCronExpression(triggerName, expression);
    }

    /**
     * 将日期转化成定时任务的表达式
     * @param date
     */
    public static String transDataToExpression(Date date) {
        String pattern = "ss mm HH dd MM ? yyyy";
        return formatDate(date, pattern);
    }

    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        System.out.println(formatDate(new Date(), pattern));
    }
}
