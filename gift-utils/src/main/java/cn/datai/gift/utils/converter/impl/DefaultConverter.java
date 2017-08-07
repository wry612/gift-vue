package cn.datai.gift.utils.converter.impl;

import java.lang.reflect.Array;


/**
 * @description 默认的数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-31 上午9:03:16
 */
public class DefaultConverter extends AbstractConverter<Object> {
    /**
     * 默认的构造方法
     */
    public DefaultConverter() {
        
    }
    
    public Object convert(Object obj) {
        if(obj == null) {
            return defvalue;
        }
        return obj;
    }
    
    public Object convert(Object obj, Object defvalue) {
        if (obj == null) {
            return defvalue;
        }
        return obj;
    }
    
    public Object[] convertArray(Object obj) {
        if (obj == null) {
            return getArray(0);
        }
        else if (obj.getClass().isArray()) {
            return (Object[])obj;
        }
        else {
            Object[] objs = getArray(1);
            objs[0] = obj;
            return objs;
        }
    }
    
    protected Object converObject(Object obj) {
        return obj;
    }
    
    protected Object[] getArray(int length) {
        return (Object[])Array.newInstance(entityClass, length);
    }
}
