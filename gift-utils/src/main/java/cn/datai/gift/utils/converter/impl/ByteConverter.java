package cn.datai.gift.utils.converter.impl;

/**
 * @description Byte型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:44:47
 */
public class ByteConverter extends AbstractConverter<Byte> {
    /**
     * 默认的构造方法
     */
    public ByteConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public ByteConverter(Byte defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Byte converObject(Object obj) {
        Byte result = null;
        try {
            if (obj != null) {
                if (obj instanceof Byte) {
                    result = (Byte) obj;
                }
                else {
                    result = Byte.parseByte(obj.toString());
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Byte[] getArray(int length) {
        return new Byte[length];
    }
}
