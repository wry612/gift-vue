package cn.datai.gift.utils.converter.impl;

/**
 * @description Integer型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:46:46
 */
public class IntegerConverter extends AbstractConverter<Integer> {
    /**
     * 默认的构造方法
     */
    public IntegerConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public IntegerConverter(Integer defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Integer converObject(Object obj) {
        Integer result = null;
        try {
            if (obj != null) {
                if (obj instanceof Integer) {
                    result = (Integer) obj;
                }
                else {
                    result = Integer.parseInt(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Integer[] getArray(int length) {
        return new Integer[length];
    }
}
