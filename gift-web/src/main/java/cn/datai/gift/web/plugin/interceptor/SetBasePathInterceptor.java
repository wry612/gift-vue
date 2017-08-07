package cn.datai.gift.web.plugin.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在request中设置ctx,方便jsp页面以${ctx}形式获取
 */
public class SetBasePathInterceptor extends HandlerInterceptorAdapter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        setCtx(request);
        return super.preHandle(request, response, handler);
    }

    /**
     * 设置 ctx,staticPath 两个变量,ctx作为ajax url的前缀,staticPath作为页面静态资源url的前缀
     */
    private void setCtx(HttpServletRequest request) {
        WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = context.getServletContext();
        try {
            String path = request.getContextPath();
            String ctx = request.getScheme() + "://" + request.getServerName();
            if (request.getServerPort() != 80 && request.getServerPort() != 443)
                ctx = ctx + ":" + request.getServerPort();
            ctx = ctx + path;

            request.setAttribute("ctx", ctx);
            request.setAttribute("staticPath", servletContext.getAttribute("staticPath"));
            request.setAttribute("jsVersion",servletContext.getAttribute("jsVersion"));

        } catch (Exception e) {
            logger.error("", e);
        }
    }

}
