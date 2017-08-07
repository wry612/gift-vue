package cn.datai.gift.web.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.StringTokenizer;

/**
 * Created by Administrator on 2017/4/25.
 */
public class IpUtil {

    /**
     * 获得请求发起端IP.
     *
     * @param request 请求
     * @return 请求发起端IP
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ipStr = request.getHeader("X-Real-IP");
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("X-Forwarded-For");
        }
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("Proxy-Client-IP");
        }
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("WL-Proxy-Client-IP");
        }
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("HTTP_CLIENT_IP");
        }
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (MyStringUtil.isBlank(ipStr) || "unknown".equalsIgnoreCase(ipStr)) {
            ipStr = request.getHeader("Host");
            if (StrUtil.isNotBlank(ipStr)) {
                ipStr = ipStr.substring(0, ipStr.indexOf(":"));
            }
        }
        // 多级反向代理
        if (MyStringUtil.isNotBlank(ipStr) && MyStringUtil.isNotBlank(ipStr.trim())) {
            StringTokenizer st = new StringTokenizer(ipStr, ",");
            if (st.countTokens() > 1) {
                return st.nextToken();
            }
        }
        return MyStringUtil.nvl(ipStr, "");
    }

}
