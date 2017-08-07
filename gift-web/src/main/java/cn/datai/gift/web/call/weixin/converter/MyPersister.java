package cn.datai.gift.web.call.weixin.converter;

import cn.datai.gift.utils.converter.ConverterUtils;
import cn.datai.gift.wxpay.bean.response.WxPayRefundOrderResponse;
import cn.datai.gift.wxpay.util.WxPayResponseUtils;
import com.alibaba.fastjson.JSON;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.NodeBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static cn.datai.gift.utils.HeaderParam.source;

/**
 * Created by H.CAAHN on 2017/4/21.
 */
public class MyPersister extends Persister {
    private static final Logger logger = LoggerFactory.getLogger(MyPersister.class);

    public <T> T read(Class<? extends T> type, InputNode node, boolean strict) throws Exception {
        if (type == String.class) {
            return (T)node.toString();
        }

        T t = type.newInstance();
        InputNode next = null;
        if (t instanceof Map) {
            Map map = (Map) t;
            while ((next = node.getNext()) != null) {
                map.put(next.getName(), next.getValue());
            }
        }
        else {
            Field[] fields = getFields(type, null);
            while ((next = node.getNext()) != null) {
                for (Field field : fields) {
                    Element ann = field.getAnnotation(Element.class);
                    if (ann != null && ann.name().equalsIgnoreCase(next.getName())) {
                        this.settingValue(field, t, next.getValue());
                    }
                }
            }
        }
        return t;
    }

    private Field[] getFields(Class clazz, Field[] others) {
        Field[] fields = clazz.getDeclaredFields();
        Field[] rfs = null;
        if (others != null) {
            if (fields != null && fields.length > 0) {
                rfs = new Field[fields.length + others.length];
                System.arraycopy(fields, 0, rfs, 0, fields.length);
                System.arraycopy(others, 0, rfs, fields.length, others.length);
            }
            else {
                rfs = others;
            }
        }
        else {
            rfs = fields;
        }

        Class pc = clazz.getSuperclass();
        if (pc != Object.class) {
            rfs = getFields(pc, rfs);
        }
        return rfs;
    }

    private void settingValue(Field field, Object object, String value) {
        try {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                field.set(object, value);
            }
            else {
                field.set(object, ConverterUtils.convert(value, field.getType()));
            }
        }
        catch (Exception ex) {
            logger.warn("Can not setting value " + value + " to field " + field.getName() + ", type is " + field.getType(), ex);
        }
    }

}
