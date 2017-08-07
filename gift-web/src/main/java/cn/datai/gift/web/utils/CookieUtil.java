package cn.datai.gift.web.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 此类实现了cookie的添加、删除、查找功能
 *
 */
public class CookieUtil {
    //方便设置cookie的路径
    private static String appName = "/dev";

    /**
     * 添加cookie方法
     * @param name  --cookie的名字
     * @param value  --cookie的值
     * @param age    --cookie的生存时间
     * @param response  --响应对象
     */
    public static void addCookie(String name,String value,int age,HttpServletResponse response){
        try {
            //URLEncoder.encode --处理中文编码问题
            Cookie c = new Cookie(name, URLEncoder.encode(value,"utf-8"));
            c.setMaxAge(age); //设置cookie的生存时间
//            c.setPath(appName); //设置cookie的路径
            response.addCookie(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 根据cookie的名字删除cookie
     * @param name  --要删除的cookie的名字
     * @param request  --请求对象
     * @param response --响应对象
     */
    public static void deleteCookie(String name, HttpServletRequest request, HttpServletResponse response){
        Cookie c1 = new Cookie(name,"");
        c1.setMaxAge(0);
//        c1.setPath(appName);
        response.addCookie(c1);
    }

    /**
     * 根据cookie的名字查找cookie的值
     * @param name    --cookie的名字
     * @param request --请求对象
     * @return   返回对应的value，没有返回null
     */
    public static String findCookie(String name,HttpServletRequest request){
        String value = null;
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(int i=0;i<cookies.length;i++){
                Cookie c = cookies[i];
                if(c.getName().equals(name)){
                    try {
                        //URLDecoder.decode --解码 将ascii码转换成相应的中文
                        value = URLDecoder.decode(c.getValue(),"utf-8");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return value;
    }

}