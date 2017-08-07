
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
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <jsp:include page="../include/weixinShareConfig.jsp"/>
    <%--加入微信签名及分享功能--%>
    <script>
        var url = basePath +"gift/index";
        function isWeixin(){
            //获取用户
            $.ajax({
                url: basePath+'gift/getUserInfo',
                type: "GET",
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var userInfoId = rsp.body.userInfoId;
                        url = url + "?userInfoId=" + userInfoId;
                    }else{
                        alert("查询用户信息失败");
                        return;
                    }
                }

            });
            var ua = navigator.userAgent.toLowerCase();
            if(ua.match(/MicroMessenger/i)=="micromessenger") {
                return true;
            } else {
                return false;
            }
        }

        if(isWeixin()){
            wx.ready(function () {
                wx.onMenuShareTimeline({
                    title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
//                    title: '像发礼包一样送礼', // 分享标题
                    link: url ,//分享当前url
                    imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
                    success: function () {
                        // 用户确认分享后执行的回调函数
                    },
                    cancel: function () {
                        // 用户取消分享后执行的回调函数
                    }
                });
                wx.onMenuShareAppMessage({
                    title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
//                    title: '像发礼包一样送礼', // 分享标题
                    desc: '${applicationScope['weixinDefaultShareDesc']}', // 分享描述
//                    desc: '礼包新体验', // 分享描述
                    link:url,//分享当前url
                    imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
                    type: 'link', // 分享类型,music、video或link，不填默认为link
                    dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
                    success: function () {
                        // 用户确认分享后执行的回调函数
                    },
                    cancel: function () {
                        // 用户取消分享后执行的回调函数
                    }
                });


            });
        }
    </script>

</head>

<body>
</body>

</html>
