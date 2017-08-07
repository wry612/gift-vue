package cn.datai.gift.utils.converter.impl;


import cn.datai.gift.utils.converter.Converter;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

/**
 * @description 抽象的数据转换器
 * @author Rimy
 * @createtime 2012-10-30 上午8:32:38
 */
public abstract class AbstractConverter<T> implements Converter<T> {
    /** 实体Class类型 */
    protected Class<T> entityClass;
    
    /** 默认返回值，当转换后值为null则默认返回该值 */
    protected T        defvalue;
    
    @SuppressWarnings("unchecked")
    public AbstractConverter() {
        try {
            ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
            entityClass = (Class<T>) type.getActualTypeArguments()[0];
        }
        catch (Exception ex) {
        }
    }
    
    public T convert(Object obj) {
        T result = null;
        if (obj != null) {
            Object _obj = this.array2Object(obj);
            result = this.transform(_obj);
        }
        
        if (result == null) {
            result = this.defvalue;
        }
        return result;
    }
    
    public T convert(Object obj, T defvalue) {
        T result = null;
        if (obj != null) {
            Object _obj = this.array2Object(obj);
            result = this.transform(_obj);
        }
        if (result == null) {
            result = defvalue;
        }
        return result;
    }
    
    public T[] convertArray(Object obj) {
        T[] result = null;
        if (obj != null) {
            if (obj.getClass().isArray()) {
                Object[] _array = (Object[]) obj;
                result = getArray(_array.length);
                for (int i = 0; i < _array.length; i++) {
                    result[i] = this.transform(_array[i]);
                }
            }
            else {
                result = getArray(1);
                result[0] = this.transform(obj);
            }
        }
        return result;
    }
    
    public Class<T> getEntityClass() {
        return entityClass;
    }
    
    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public T getDefvalue() {
        return defvalue;
    }
    
    public void setDefvalue(T defvalue) {
        this.defvalue = defvalue;
    }
    
    /**
     * 在进行数据转换时，可能传入的是一个数组，这时在转换成JavaBean对象时，就需要把数组转换成对象<br>
     * 目前的处理方式是获取数组的第一个值
     * @param obj
     * @return
     */
    protected Object array2Object(Object obj) {
        if (obj.getClass().isArray()) {
            if (((Object[]) obj).length > 0) {
                obj = ((Object[]) obj)[0];
            }
            else {
                obj = null;
            }
        }
        else if (obj instanceof Collection) {
            if (!((Collection<?>) obj).isEmpty()) {
                obj = ((Collection<?>) obj).iterator().next();
            }
            else {
                obj = null;
            }
        }
        
        return obj;
    }
    
    /**
     * 将Object类型转换成指定的数据类型
     * @param obj
     * @return
     */
    protected T transform(Object obj) {
//        if (obj instanceof Element) {
//            String value = "";
//            Element valueE = ((Element) obj).element("value");
//            if (valueE != null) {
//                value = valueE.getText();
//            }
//            else {
//                value = ((Element) obj).getText();
//            }
//            return converObject(value);
//        }
//        else {
            return converObject(obj);
//        }
    }
    
    /**
     * 将Object类型数据转换成指定类型值
     * @param obj
     * @return
     */
    protected abstract T converObject(Object obj);
    
    /**
     * 由于T类型不可new，且不能使用Class.newInstance()方式创建对象，所以需要每一个实现类各自new一个T类型的数组
     * @param length
     * @return
     */
    protected abstract T[] getArray(int length);
}
