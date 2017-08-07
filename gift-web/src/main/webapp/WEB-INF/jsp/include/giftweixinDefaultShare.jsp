
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
//    String basePath = request.getScheme() + "://"
//            + request.getServerName() + ":" + request.getServerPort()
//            + path + "/";
    String basePath = request.getScheme() + "://" + request.getServerName();
    if (request.getServerPort() != 80 && request.getServerPort() != 443) {
        basePath = basePath + ":" + request.getServerPort();
    }
    basePath = basePath + path + "/";
%>
<c:set var="basePath" value="<%=basePath %>"></c:set>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>礼尚</title>
    <script>
        var basePath = '<%=basePath%>';
    </script>
    <jsp:include page="../include/giftweixinShareConfig.jsp"/>
    <%--加入微信签名及分享功能--%>
    <script>
        function isWeixin(){
            var ua = navigator.userAgent.toLowerCase();
            if(ua.match(/MicroMessenger/i)=="micromessenger") {
                return true;
            } else {
                return false;
            }
        }

        <%--if(isWeixin()){--%>
            <%--wx.ready(function () {--%>
                <%--&lt;%&ndash;wx.onMenuShareTimeline({&ndash;%&gt;--%>
                    <%--&lt;%&ndash;title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题&ndash;%&gt;--%>
                    <%--&lt;%&ndash;link: window.location.href,//分享当前url&ndash;%&gt;--%>
                    <%--&lt;%&ndash;imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标&ndash;%&gt;--%>
                    <%--&lt;%&ndash;success: function () {&ndash;%&gt;--%>
                        <%--&lt;%&ndash;// 用户确认分享后执行的回调函数&ndash;%&gt;--%>
                    <%--&lt;%&ndash;},&ndash;%&gt;--%>
                    <%--&lt;%&ndash;cancel: function () {&ndash;%&gt;--%>
                        <%--&lt;%&ndash;// 用户取消分享后执行的回调函数&ndash;%&gt;--%>
                    <%--&lt;%&ndash;}&ndash;%&gt;--%>
                <%--&lt;%&ndash;});&ndash;%&gt;--%>
                <%--&lt;%&ndash;wx.onMenuShareAppMessage({&ndash;%&gt;--%>
                    <%--&lt;%&ndash;title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题&ndash;%&gt;--%>
                    <%--&lt;%&ndash;desc: '${applicationScope['weixinDefaultShareDesc']}', // 分享描述&ndash;%&gt;--%>
                    <%--&lt;%&ndash;link: window.location.href,//分享当前url&ndash;%&gt;--%>
                    <%--&lt;%&ndash;imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标&ndash;%&gt;--%>
                    <%--&lt;%&ndash;type: 'link', // 分享类型,music、video或link，不填默认为link&ndash;%&gt;--%>
                    <%--&lt;%&ndash;dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空&ndash;%&gt;--%>
                    <%--&lt;%&ndash;success: function () {&ndash;%&gt;--%>
                        <%--&lt;%&ndash;// 用户确认分享后执行的回调函数&ndash;%&gt;--%>
                    <%--&lt;%&ndash;},&ndash;%&gt;--%>
                    <%--&lt;%&ndash;cancel: function () {&ndash;%&gt;--%>
                        <%--&lt;%&ndash;// 用户取消分享后执行的回调函数&ndash;%&gt;--%>
                    <%--&lt;%&ndash;}&ndash;%&gt;--%>
                <%--&lt;%&ndash;});&ndash;%&gt;--%>


            <%--});--%>
        <%--}--%>
    </script>

</head>

<body>
</body>

</html>
