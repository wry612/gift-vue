package cn.datai.gift.web.utils.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import java.io.Writer;
import java.lang.reflect.Field;

/**
 * 微信xml序列化驱动
 * 序列化xml时，不转换默认的下划线为双下划线，同时对CDATA标签进行处理
 * Created by zhangyutao on 2017/4/18.
 */
public class WxXppDriver extends XppDriver {




    /**
     * {@inheritDoc}
     *
     * @param out
     */
    @Override
    public HierarchicalStreamWriter createWriter(Writer out) {

        return new PrettyPrintWriter(out) {
            boolean cdata = false;
            Class<?> targetClass = null;


            @Override
            public void startNode(String name, Class clazz) {
                super.startNode(name, clazz);
                //业务处理，对于用XStreamCDATA标记的Field，需要加上CDATA标签
                if(!name.equals("xml")){//代表当前处理节点是class，用XstreamAlias把class的别名改成xml，下面的代码片段有提到
                    cdata = needCDATA(targetClass, name);
                }else{
                    targetClass = clazz;
                }
            }

            /**
             * 原样返回xml节点名称，不使用父类的编码转义, 避免出现双下划线的问题
             * Encode the node name into the name of the target format.
             *
             * @param name the original name
             * @return the name in the target format
             * @since 1.4
             */
            @Override
            public String encodeNode(String name) {
                return name;
            }

            @Override
            protected void writeText(QuickWriter writer, String text) {
                if (cdata && !text.isEmpty()) {
                    writer.write("<![CDATA[");
                    writer.write(text);
                    writer.write("]]>");
                } else {
                    super.writeText(writer, text);
                }
            }
        };
    }


    private static boolean needCDATA(Class<?> targetClass, String fieldAlias){
        boolean cdata = false;
        //first, scan self
        cdata = existsCDATA(targetClass, fieldAlias);
        if(cdata) return cdata;
        //if cdata is false, scan supperClass until java.lang.Object
        Class<?> superClass = targetClass.getSuperclass();
        while(!superClass.equals(Object.class)){
            cdata = existsCDATA(superClass, fieldAlias);
            if(cdata) return cdata;
            superClass = superClass.getSuperclass();
        }
        return false;
    }

    private static boolean existsCDATA(Class<?> clazz, String fieldAlias){
        //scan fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //1. exists XStreamCDATA
            if(field.getAnnotation(XStreamCDATA.class) != null ){
                XStreamAlias xStreamAlias = field.getAnnotation(XStreamAlias.class);
                //2. exists XStreamAlias
                if(null != xStreamAlias){
                    if(fieldAlias.equals(xStreamAlias.value()))//matched
                        return true;
                }else{// not exists XStreamAlias
                    if(fieldAlias.equals(field.getName()))
                        return true;
                }
            }
        }
        return false;
    }

}
