package cn.datai.gift.utils.converter;

/**
 * @description 公共转换工具接口，即从Object型转换成其他类型的对象
 * @author H.CAAHN
 * @createtime 2012-10-29 下午9:46:30
 */
public interface Converter<T> {
    /**
     * 将Object转换成对象，且转换过程中不会抛出异常
     * @param obj
     * @return
     */
    public T convert(Object obj);
    
    /**
     * 将Object转换成对象，若该对象为null或转换过程中出现异常，则使用默认值
     * @param obj
     * @param defvalue
     * @return
     */
    public T convert(Object obj, T defvalue);
    
    /**
     * 将Object对象转换成数组
     * @param obj
     * @return
     */
    public T[] convertArray(Object obj);

    /**
     * 获取泛型的实体Class类型
     * @return
     */
    public Class<T> getEntityClass();

    /**
     * 设置泛型的实体Class类型
     * @param entityClass
     */
    public void setEntityClass(Class<T> entityClass);
    
    /**
     * 获取默认返回值，当转换后值为null则默认返回该值
     * @return
     */
    public T getDefvalue();
    
    /**
     * 设置默认返回值，当转换后值为null则默认返回该值
     * @param defvalue
     */
    public void setDefvalue(T defvalue);
}
