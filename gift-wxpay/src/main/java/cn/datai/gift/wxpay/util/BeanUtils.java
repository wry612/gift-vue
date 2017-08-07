package cn.datai.gift.wxpay.util;

import com.google.common.collect.Maps;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * 微信支付bean操作的一些工具类
 * </pre>
 */
public class BeanUtils {
  private static Logger log = LoggerFactory.getLogger(BeanUtils.class);


  /**
   * 将bean按照@Element的name属性的xml标识的字符串内容生成以之为key的map对象
   *
   * @param bean 包含@Element的xml bean对象
   * @return map对象
   */
  public static Map<String, String> xmlBean2Map(Object bean) {
    Map<String, String> result = Maps.newHashMap();
    List<Field> fields = new ArrayList<>(Arrays.asList(bean.getClass().getDeclaredFields()));
    fields.addAll(Arrays.asList(bean.getClass().getSuperclass().getDeclaredFields()));
    for (Field field : fields) {
      try {
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        if (field.get(bean) == null) {
          field.setAccessible(isAccessible);
          continue;
        }

        if (field.isAnnotationPresent(Element.class)) {
          result.put(field.getAnnotation(Element.class).name(), field.get(bean).toString());
        }

        field.setAccessible(isAccessible);
      } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }

    return result;
  }
}
