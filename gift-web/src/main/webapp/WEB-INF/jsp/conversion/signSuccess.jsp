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
    <jsp:include page="../include/weixinDefaultShare.jsp"/>
    <!--weixin end-->
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/conversion/signSuccess.css?v=${jsVersion}"/>
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
<div id="signSuccess" class="list-container" v-cloak>
    <div class="tip-wrap">
        <div class="tip red" v-if="isDraw">您已参加，请耐心等待开奖</div>
        <div class="tip red" v-if="!isDraw">兑换成功，请注意查收消息</div>
    </div>
    <div class="info-wrap clearfix">
        <div class="float-left img">
            <img v-bind:src="commodity.headImgs+'?v=${jsVersion}'">
        </div>
        <div class="float-left">
            <div class="name">{{commodity.fullName}}</div>
            <%--<div class="info"><label>市场价</label><span>￥{{commodity.marketPrice}}</span></div>--%>
            <div class="info" v-if="!isDraw"><label>结束时间</label><span class="end-time">{{commodity.endTime}}</span></div>
            <div class="info" v-if="isDraw"><label>开奖时间</label><span class="end-time">{{commodity.drawTime}}</span></div>
        </div>
    </div>
    <div v-if="isDraw" class="quan-wrap">
        <div class="quan-outer">
            <div class="clearfix quan-inner">
                <div class="float-right left">
                    <span v-bind:class="{toggle:isQuanShow}">券码</span>
                </div>
                <div class="float-left right">
                    报名<span class="red">{{commodity.doller.length}}</span>人次
                </div>
            </div>
            <div class="doller-wrap clearfix" v-bind:class="{center:commodity.doller.length<4}">
                <template v-for="(item,index) in commodity.doller">
                    <span v-if="index<commodity.doller.length-1" class="doller-item">{{item}}，</span>
                    <span v-else class="doller-item">{{item}}</span>
                </template>
            </div>
        </div>
    </div>
    <div class="back-wrap">
        <a v-bind:href="url">查看订单</a><a href="${basePath}gift/index">返回首页</a>
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
<script type="text/javascript" src="${staticPath}/static/js/conversion/signSuccess.js?v=${jsVersion}"></script>
</body>
</html>