package cn.datai.gift.utils.converter.impl;

/**
 * @description Character型数据转换器
 * @author H.CAAHN
 * @createtime 2012-10-30 上午10:55:47
 */
public class CharacterConverter extends AbstractConverter<Character> {
    /**
     * 默认的构造方法
     */
    public CharacterConverter() {
        
    }
    
    /**
     * 具有指定默认值的构造方法
     * @param defvalue
     */
    public CharacterConverter(Character defvalue) {
        super.setDefvalue(defvalue);
    }
    
    protected Character converObject(Object obj) {
        Character result = null;
        try {
            if (obj != null) {
                if (obj instanceof Character) {
                    result = (Character) obj;
                }
                else {
                    result = obj.toString().charAt(0);
                }
            }
        }
        catch (Exception ex) {
            
        }
        return result;
    }
    
    protected Character[] getArray(int length) {
        return new Character[length];
    }
}
