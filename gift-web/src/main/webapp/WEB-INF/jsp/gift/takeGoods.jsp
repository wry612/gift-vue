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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/takeGoods.css?v=${jsVersion}"/>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="takeGoods" v-cloak>
    <div class="page-title">
        提货
    </div>
    <div class="bg-white">
        <div class="select-tab">
            <div class="text-box"><span>{{selectText}}</span><i class="icon-down"></i></div>
            <select v-model="activeIndex" v-on:change="changeValue">
                <option v-for="option in selectList" v-bind:value="option.commodityContractId">[{{option.typeName}}]{{option.commodityName}}</option>
            </select>
        </div>
        <div class="current-hold">当前持有</div>
        <div class="number"><span>{{product.holdCommodityQuantity}}</span>{{product.unit}}</div>
        <div class="input-box clearfix">
            <span class="float-right unit">{{product.standardUnitName}}</span>
            <div class="float-right input-inner">
                <%--<div class="max-tip" id="sellMax">最大可提货饼数</div>--%>
                <input type="tel" v-model="inputNumber" maxlength="3">
            </div>
            <span class="float-left label">提货{{product.standardUnitName}}数</span>
        </div>
        <div class="tip">满{{product.standardUnitMultiple}}{{product.unit}}可提一{{product.standardUnitName}}，持仓量不足可买入补足</div>
        <div class="tip">用户最多可提<span class="red">100{{product.standardUnitName}}</span></div>
        <div class="rules"><a href="${basePath}pickUp/deliveryRules" class="red">提货规则</a></div>
        <div class="total clearfix" v-show="!needMore">

        </div>
        <div class="total clearfix" v-show="needMore">
            需补{{moreNumber}}{{product.unit}}，约{{moreMoney}}元
        </div>
    </div>
    <div class="submit-btn">
        <button v-on:click="sellPacket">确认提货</button>
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
<script type="text/javascript" src="${staticPath}/static/js/views/takeGoods.js?v=${jsVersion}"></script>
</body>
</html>