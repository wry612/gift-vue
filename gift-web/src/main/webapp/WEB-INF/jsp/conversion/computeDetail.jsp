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
    <jsp:include page="../include/forbiddenWeixinDefaultShare.jsp"/>
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
<div id="packetRequest">
    <div class="page-title">
        计算详情
    </div>
    <div class="rule-body">
        <h3>计算公式</h3>
        <h4>第一名中奖者</h4>
        <p class="red bg-red">[(数值A+数值B) ÷ 数值w] 取余数+100001</p>
    </div>
    <hr>
    <div class="rule-body">
        <h3>数值W</h3>
        <p>活动总参与份数，如有1000人 参与，则W为1000（用户每买一份，即分配给用户一个号码，假定号码从50000001开始，依次往下排）</p>
    </div>
    <hr>
    <div class="rule-body">
        <h3>数值A</h3>
        <p>抽奖队列的最后10个参与时间，将这个10个时间的数值求和作为数值A（每个时间按时，分，秒，毫秒顺序组合：如20：15：25：123，那么值是：201525123）</p>
    </div>
    <hr>
    <div class="rule-body">
        <h3>数值B</h3>
        <p>根据活动结束时，最近一次的交易日的上证及深证收盘时指数之和*100，作为数值B（例如:上证指数为3214.32，深证指数为10234.45，则B值为 （3214.32+10234.45）*100 = 1344877）</p>
    </div>
    <hr>
    <div class="rule-body">
        <h4>第二名及后续中奖者</h4>
        <p class="red bg-red text-left">第一名中奖号码往后找Y个号码作为第二个中奖号码；再从第二个中奖号码往后找第Y个号码作为第三个中奖号码；依次类推，如果队列到头，则循环队列从头数（每一个号码中奖后，会从队列中剔除，直到把奖品份数全部抽出来为止）</p>
    </div>
    <hr>
    <div class="rule-body">
        <h3>数值Y</h3>
        <p>假定参与活动人次为W；获得以抽奖队列的最后5个参与时间，将这个5个时间的数值求和作为数值A；根据活动结束时，最近一次的交易日的上证及深证指数之和*100，作为数值B；根据公式：数值A+数值B之和除以W得到的余数</p>
        <p>（Y值计算方式与第一名中奖号码算法类似，区别在于前者是以最后10个时间戳为样本，后者是以最后5个时间戳为样本）</p>
    </div>
</div>
<!--page end-->
<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
</body>
</html>