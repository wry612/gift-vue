package cn.datai.gift.utils.converter.impl;

/**
 * @description Float型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:51:24
 */
public class FloatConverter extends AbstractConverter<Float> {
    /**
     * 默认的构造方法
     */
    public FloatConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public FloatConverter(Float defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Float converObject(Object obj) {
        Float result = null;
        try {
            if (obj != null) {
                if (obj instanceof Float) {
                    result = (Float) obj;
                }
                else {
                    result = Float.parseFloat(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Float[] getArray(int length) {
        return new Float[length];
    }
}
