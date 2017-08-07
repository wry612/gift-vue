package cn.datai.gift.utils.converter.impl;

/**
 * @description Short型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:49:55
 */
public class ShortConverter extends AbstractConverter<Short> {
    /**
     * 默认的构造方法
     */
    public ShortConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public ShortConverter(Short defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Short converObject(Object obj) {
        Short result = null;
        try {
            if (obj != null) {
                if (obj instanceof Short) {
                    result = (Short) obj;
                }
                else {
                    result = Short.parseShort(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Short[] getArray(int length) {
        return new Short[length];
    }
}
