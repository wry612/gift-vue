package cn.datai.gift.utils.converter.impl;

/**
 * @description Long型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:54:09
 */
public class LongConverter extends AbstractConverter<Long> {
    /**
     * 默认的构造方法
     */
    public LongConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public LongConverter(Long defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Long converObject(Object obj) {
        Long result = null;
        try {
            if (obj != null) {
                if (obj instanceof Long) {
                    result = (Long) obj;
                }
                else {
                    result = Long.parseLong(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Long[] getArray(int length) {
        return new Long[length];
    }
}
