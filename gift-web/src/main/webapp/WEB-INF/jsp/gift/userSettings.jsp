<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="apple-mobile-web-app-title" content="大泰信息技术有限公司"/>
    <meta name="apple-mobile-web-app-capable" content="no"/>
    <meta name="msapplication-tap-highlight" content="no">
    <meta content="yes" name="apple-touch-fullscreen"/>
    <meta content="telephone=no,email=no" name="format-detection"/>
    <meta name="format-detection" content="telephone=no,email=no"/>
    <meta name="keywords" content="大泰信息技术有限公司"/>
    <meta name="description" content="大泰信息技术有限公司"/>
    <title>礼尚</title>
    <!--weixin start-->
    <jsp:include page="../include/weixinDefaultShare.jsp"/>
    <!--weixin end-->
    <!--- add js --->
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
</head>
<body class="bg-gray">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="userSettings">
    <div class="page-title">
        个人设置
    </div>
    <div class="bg-white list-nav">
        <div class="nav-item">
            <a href="${basePath}address/address"><span>地址管理</span><i class="icon-right"></i></a>
        </div>
        <div class="nav-item">
            <a href="javascript:void(0)" v-if="isBind"><span>绑定手机号</span><span class="float-right" style="color:#999">{{mobile}}</span></a>
            <a href="${basePath}gift/bindMobile" v-if="!isBind"><span>绑定手机号</span><i class="icon-right"></i></a>
        </div>
      <%--  <div class="nav-item">
            <a href="${basePath}password/paymentPassword"><span>修改支付密码</span><i class="icon-right"></i></a>
        </div>
        <div class="nav-item">
            <a href="${basePath}gift/checkMobile"><span>忘记支付密码</span><i class="icon-right"></i></a>
        </div>
        <div class="nav-item">
            <a href="${basePath}gift/userInfo"><span>账号信息</span><i class="icon-right"></i></a>
        </div>--%>
    </div>
</div>
<!--page end-->

<!--dialog component start-->

<jsp:include page="../component/dialog.jsp"/>

<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script type="text/javascript" src="${staticPath}/static/js/views/userSettings.js?v=${jsVersion}"></script>
</body>
</html>