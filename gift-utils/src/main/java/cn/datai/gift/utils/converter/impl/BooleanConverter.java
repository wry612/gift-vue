package cn.datai.gift.utils.converter.impl;

/**
 * @description Boolean型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:48:36
 */
public class BooleanConverter extends AbstractConverter<Boolean> {
    /**
     * 默认的构造方法
     */
    public BooleanConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public BooleanConverter(Boolean defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Boolean converObject(Object obj) {
        Boolean result = null;
        try {
            if (obj != null) {
                if (obj instanceof Boolean) {
                    result = (Boolean) obj;
                }
                else {
                    result = Boolean.parseBoolean(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Boolean[] getArray(int length) {
        return new Boolean[length];
    }
}
