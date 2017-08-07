package cn.datai.gift.utils.converter.impl;

/**
 * @description String型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午11:21:14
 */
public class StringConverter extends AbstractConverter<String> {
    /**
     * 默认的构造方法
     */
    public StringConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public StringConverter(String defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected String converObject(Object obj) {
        String result = null;
        try {
            if (obj != null) {
                if (obj instanceof String) {
                    result = (String) obj;
                }
                else {
                    result = obj.toString();
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected String[] getArray(int length) {
        return new String[length];
    }
}
