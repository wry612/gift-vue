package cn.datai.gift.utils.converter.impl;

/**
 * @description Double型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:52:38
 */
public class DoubleConverter extends AbstractConverter<Double> {
    /**
     * 默认的构造方法
     */
    public DoubleConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public DoubleConverter(Double defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Double converObject(Object obj) {
        Double result = null;
        try {
            if (obj != null) {
                if (obj instanceof Double) {
                    result = (Double) obj;
                }
                else {
                    result = Double.parseDouble(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Double[] getArray(int length) {
        return new Double[length];
    }
}
