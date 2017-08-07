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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/address.css?v=${jsVersion}"/>
</head>
<body class="bg-white">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="createAddress" v-cloak>
    <div class="page-title">
        {{title}}
    </div>
    <div class="input-box mt56">
        <input type="text" placeholder="请输入收件人" maxlength="15" v-model="userDeliveryInfo.username" class="float-right">
        <label class="label">收件人</label>
    </div>
    <div class="input-box mt56">
        <input type="tel" placeholder="请输入手机号码" maxlength="11" v-model="userDeliveryInfo.telNumber" class="float-right">
        <label class="label">手机号码</label>
    </div>
    <div id="distpicker" class="select-wrap">
        <select v-model="userDeliveryInfo.proviceFirstStageName" v-on:change="proviceChange"></select>
        <select v-model="userDeliveryInfo.addressCitySecondStageName"></select>
        <select v-model="userDeliveryInfo.addressCountiesThirdStageName" id="countiesThirdStageName"></select>
    </div>
    <div class="input-box textarea">
        <textarea v-model="userDeliveryInfo.addressDetailInfo" class="float-right" maxlength="60"></textarea>
        <label class="label">详细地址</label>
    </div>
    <div class="address-operation set-default">
        <input type="checkbox" id="checkbox" v-model="userDeliveryInfo.isDefault">
        <label for="checkbox">设为默认</label>
    </div>
    <div class="bottom-btn submit-btn">
        <button v-on:click="save">保存地址</button>
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
<script type="text/javascript" src="${staticPath}/static/js/distpicker.min.js?v=${jsVersion}"></script>
<script type="text/javascript" src="${staticPath}/static/js/views/createAddress.js?v=${jsVersion}"></script>
</body>
</html>