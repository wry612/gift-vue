package cn.datai.gift.utils;

import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangyutao on 2017/4/1.
 */
public class WebUtil extends WebUtils {


    /**
     * 判断是否是ajax请求
     * @param request
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        if (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString())) {
            return true;
        }else
            return false;
    }

}
