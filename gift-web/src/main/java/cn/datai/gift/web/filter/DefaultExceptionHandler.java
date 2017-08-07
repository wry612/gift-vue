package cn.datai.gift.web.filter;

import cn.datai.gift.utils.DataGrid;
import cn.datai.gift.utils.MyStringUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.utils.exception.DbException;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * 统一异常处理类
 */
//@ControllerAdvice
public class DefaultExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 基础父类异常处理
     */
//    @ExceptionHandler({Exception.class})
    public ModelAndView processBaseException(HttpServletRequest request, HttpServletResponse response, Exception e) {
        if (!((request.getHeader("accept") != null && request.getHeader("accept").indexOf("application/json") > -1)
                || (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1)
                || request.getRequestURI().lastIndexOf(".json") > 0
                || request.getRequestURI().indexOf("/m/") > -1)) {
            doLog(e, request);
            // 如果不是异步请求
            ModelAndView mv = new ModelAndView();
            mv.addObject("exception", e);
            mv.setViewName("error/error");
            return mv;
        } else {
            if (!MyStringUtil.isEmpty(request.getRequestURI()) &&
                    request.getRequestURI().lastIndexOf(".grid") > 0) {
                doLog(e, request);
                writeJson(new DataGrid(0, new ArrayList<Object>()), response);
                return null;
            }

            if (e instanceof BizException) {
                log.error("业务异常：" + ((BizException) e).getErrorCode() + "," + e.getMessage());
                BizException bize = (BizException) e;
                writeJson(RespResult.getInstance(bize.getErrorCode(), bize.getMessage()), response);
            } else if (e instanceof DbException) {
                log.error("操作数据库异常", e);
                DbException dbe = (DbException) e;
                writeJson(RespResult.getInstance(dbe.getErrorCode(), dbe.getMessage()), response);
            } else {
                log.error("系统错误，未知异常", e);
                writeJson(RespResult.getInstance(RespCode.SERVER_ERROR), response);
            }
            return null;
        }
    }

    private void writeJson(Object obj, HttpServletResponse response) {
        try {
            String json = JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 按异常类似打印日志
     */
    private void doLog(Exception e, HttpServletRequest request) {
        if (e instanceof BizException) {
            BizException bize = (BizException) e;
            if (log.isErrorEnabled()) {
                log.error("业务异常，结果码：" + bize.getErrorCode() + ", 异常信息：" + bize.getMessage()
                        + ", 请求地址：" + request.getRequestURI());
            }
        } else if (e instanceof DbException) {
            log.error("操作数据库异常", e);
        } else {
            log.error("系统错误，未知异常", e);
        }
    }
}
