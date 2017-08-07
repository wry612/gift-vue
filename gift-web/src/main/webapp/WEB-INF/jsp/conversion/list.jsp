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
    <title>礼尚活动</title>
    <!--- add js --->
    <!--weixin start-->
    <jsp:include page="../include/forbiddenWeixinDefaultShare.jsp"/>
    <!--weixin end-->
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/conversion/list.css?v=${jsVersion}"/>
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="list" class="list-container" v-cloak>
    <div v-for="(item,index) in activityList" class="list-item">
        <a href="javascript:void(0);" v-on:click="goUrl(item.overdue,item.type,index)" v-bind:class="{overdue:item.overdue}">
            <div class="item-img"><img v-bind:src="item.img+'?v=${jsVersion}'" alt=""><div class="over" v-if="item.overdue == true"><div class="text">活动已结束</div></div></div>
            <div class="item-time">活动时间：{{item.startTime}}—{{item.endTime}}</div>
            <div class="item-view">查看详情<i class="icon-right"></i></div>
        </a>
    </div>
</div>
<!--page end-->

<!------------------------------------------------------------------------------>
<!--component start-->

<!--dialog component start-->
<jsp:include page="../component/dialog.jsp"/>
<!--dialog component end-->

<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->

<!--component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script type="text/javascript" src="${staticPath}/static/js/conversion/list.js?v=${jsVersion}"></script>
</body>
</html>