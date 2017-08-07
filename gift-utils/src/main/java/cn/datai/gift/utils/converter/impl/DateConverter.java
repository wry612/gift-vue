package cn.datai.gift.utils.converter.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description Date型转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午11:30:42
 */
public class DateConverter extends AbstractConverter<Date> {
    private static String[] PATTERNS;

    static {
        PATTERNS = new String[8];
        PATTERNS[0] = "yyyy-MM-dd";
        PATTERNS[1] = "yyyyMMdd";
        PATTERNS[2] = "yyyy-MM-dd HH:mm:ss";
        PATTERNS[3] = "HH:mm:ss";
        PATTERNS[4] = "yyyy-MM-dd HH:mm";
        PATTERNS[5] = "yyyy-MM-dd HH:mm:ss.SSS";
        PATTERNS[6] = "yyyyMMddHHmmss";
        PATTERNS[7] = "yyyyMMddHHmmssSSS";
    }

    /**
     * 默认的构造方法
     */
    public DateConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public DateConverter(Date defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Date converObject(Object obj) {
        Date result = null;
        if (obj != null) {
            if (obj instanceof Date) {
                result = (Date) obj;
            }
            else {
                result = this.getTime(obj.toString());
            }
        }
        return result;
    }

    protected Date[] getArray(int length) {
        return new Date[length];
    }

    protected Date getTime(String datetime) {
        SimpleDateFormat format = new SimpleDateFormat();
        for (int i = 0; i < PATTERNS.length; i++) {
            if (PATTERNS[i].length() == datetime.length()) {
                try {
                    format.applyPattern(PATTERNS[i]);
                    return format.parse(datetime);
                }
                catch (Exception ex) {

                }
            }
        }
        return null;
    }
}
