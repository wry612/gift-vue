package cn.datai.gift.utils.converter.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

/**
 * @description TimeUnit处理类
 * @author H.CAAHN
 * @createtime 2013-8-30 下午11:22:03
 */
public class TimeUnitConverter extends AbstractConverter<TimeUnit> {
    /** 日志对象 */
    private static final Logger logger = LoggerFactory.getLogger(TimeUnitConverter.class);
    
    protected TimeUnit converObject(Object obj) {
        TimeUnit result = null;
        try {
            String str = obj.toString();
            if (TimeUnit.NANOSECONDS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.NANOSECONDS;
            }
            else if (TimeUnit.MICROSECONDS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.MICROSECONDS;
            }
            else if (TimeUnit.MILLISECONDS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.MILLISECONDS;
            }
            else if (TimeUnit.SECONDS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.SECONDS;
            }
            else if (TimeUnit.MINUTES.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.MINUTES;
            }
            else if (TimeUnit.HOURS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.HOURS;
            }
            else if (TimeUnit.DAYS.toString().equalsIgnoreCase(str)) {
                result = TimeUnit.DAYS;
            }
            else {
                logger.error(MessageFormat.format("Unknown TimeUnit: {0}", str));
            }
        }
        catch (Exception ex) {
            logger.error(obj + "转化TimeUtil失败", ex);
        }
        return result;
    }
    
    protected TimeUnit[] getArray(int length) {
        return new TimeUnit[length];
    }
}
