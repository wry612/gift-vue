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
<body class="bg-white">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="deliveryRules">
    <div class="page-title">
        提货规则
    </div>
    <div class="rule-body">
        <h4>1、提货规格</h4>
        <p>酒类：瓶（750毫升）、桶（1.5升）</p>
        <p> 茶类：饼（357克）、盒（50克）</p>
        <p> 具体提货规则视提货礼品而定</p>
        <h4>2、提货形式</h4>
        <p>优先消耗礼包账户持有量。如持有量足够提货，则用持有量全额抵扣；如持有量不足提货，可用现金补足差价后提货</p>
        <h4>3、提货数量</h4>
        <p> 最小提货数量：1（饼/瓶/桶/盒）</p>
        <p> 最大提货数量：100（饼/瓶/桶/盒）</p>
        <h4>4、物流查询</h4>
        <p>提交提货申请后，用户可在1~3个工作日内查询到该笔订单物流单号。（【交易明细】内找到该订单，点击查看详情后查看物流单号）</p>
    </div>
</div>
<!--page end-->
<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
</body>
</html>