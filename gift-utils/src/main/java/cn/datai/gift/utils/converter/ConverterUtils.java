package cn.datai.gift.utils.converter;

import cn.datai.gift.utils.converter.impl.*;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;


/**
 * @description 转换工具
 * @author H.CAAHN
 */
public class ConverterUtils {
    /** 转换器Map集合 */
    @SuppressWarnings("rawtypes")
    private static Map<Class, Converter> CONVER_MAP        = new ConcurrentHashMap<Class, Converter>();
    
    private static Converter<Object>     DEFAULT_CONVERTER = new DefaultConverter();
    
    /**
     * 静态语句块，设置Class与转换器的映射关系
     */
    static {
        CONVER_MAP.put(boolean.class, new BooleanConverter(false));
        CONVER_MAP.put(Boolean.class, new BooleanConverter());
        CONVER_MAP.put(byte.class, new ByteConverter((byte) 0));
        CONVER_MAP.put(Byte.class, new ByteConverter());
        CONVER_MAP.put(char.class, new CharacterConverter((char) 0));
        CONVER_MAP.put(Character.class, new CharacterConverter());
        CONVER_MAP.put(double.class, new DoubleConverter(0.0));
        CONVER_MAP.put(Double.class, new DoubleConverter());
        CONVER_MAP.put(float.class, new FloatConverter(0f));
        CONVER_MAP.put(Float.class, new FloatConverter());
        CONVER_MAP.put(int.class, new IntegerConverter(0));
        CONVER_MAP.put(Integer.class, new IntegerConverter());
        CONVER_MAP.put(long.class, new LongConverter(0l));
        CONVER_MAP.put(Long.class, new LongConverter());
        CONVER_MAP.put(short.class, new ShortConverter((short) 0));
        CONVER_MAP.put(Short.class, new ShortConverter());
        CONVER_MAP.put(String.class, new StringConverter());
        CONVER_MAP.put(Date.class, new DateConverter());
        CONVER_MAP.put(TimeUnit.class, new TimeUnitConverter());
        CONVER_MAP.put(Object.class, DEFAULT_CONVERTER);
    }
    
    /**
     * 根据Class类型获取相应的类型转换器
     * @param clazz
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> Converter<T> getConverter(Class<T> clazz) {
        Converter<T> converter = CONVER_MAP.get(clazz);
        return converter;
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T convert(Object obj, Class<T> clazz) {
        if (clazz == null) {
            return (T) obj;
        }
        
        if (clazz.isArray()) {
            Converter<T> converter = CONVER_MAP.get(clazz.getComponentType());
            if (converter != null) {
                return (T) converter.convertArray(obj);
            }
            else {
                return (T) DEFAULT_CONVERTER.convertArray(obj);
            }
        } else {
            Converter<T> converter = CONVER_MAP.get(clazz);
            if (converter != null) {
                return converter.convert(obj);
            }
            else {
                return (T) DEFAULT_CONVERTER.convert(obj);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T convert(Object obj, T defvalue) {
        if (obj == null) {
            return defvalue;
        }
        else if (defvalue == null) {
            return (T)obj;
        }
        
        Class<?> clazz = defvalue.getClass();
        if (obj.getClass() == clazz) {
            return (T)obj;
        } else if (clazz.isArray()) {
            Converter<T> converter = CONVER_MAP.get(clazz.getComponentType());
            if (converter != null) {
                return (T) converter.convertArray(obj);
            }
            else {
                return (T) DEFAULT_CONVERTER.convertArray(obj);
            }
        } else {
            Converter<T> converter = CONVER_MAP.get(clazz);
            if (converter != null) {
                return converter.convert(obj, defvalue);
            }
            else {
                return (T) DEFAULT_CONVERTER.convert(obj, defvalue);
            }
        }
    }
}
