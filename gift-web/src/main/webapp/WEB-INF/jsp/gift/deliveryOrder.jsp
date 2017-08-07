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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/password.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/deliveryOrder.css?v=${jsVersion}"/>
</head>
<body class="bg-white">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="deliveryOrder" v-cloak>
    <div class="page-title">
        提货申请
    </div>
    <div class="user-info">
        <a href="${basePath}address/address">
        <div class="clearfix">
            <label>收件人</label><span class="name">{{username}}</span>
            <div class="float-right mobile">{{telNumber}}</div>
        </div>
        <div class="address-wrap clearfix">

                <div class="float-right">
                    <i class="icon-right"></i>
                </div>
                <div class="float-left">
                    <i class="icon-address"></i>
                </div>
                <div class="float-left address">
                    {{address}}
                </div>

        </div>
        </a>
    </div>
    <div class="gift-info clearfix">
        <div class="float-right gift-package">
            ×{{product.package}}
        </div>
        <div class="float-left product-img">
            <img v-bind:src="product.img+'?v=${jsVersion}'">
        </div>
        <div class="float-left">
            <p class="gift-name">[{{product.typeName}}]{{product.name}}</p>
            <p class="gift-number">1{{product.standardUnitName}}（{{product.number}}{{product.unit}}/{{product.standardUnitName}}）</p>
            <p class="gift-money">{{product.lastUnitPrice}}元/{{product.unit}}</p>
        </div>
    </div>
    <div class="gift-control">
        <label>抵扣</label><span>￥{{product.deduction}}</span>
    </div>
    <div class="gift-control" v-if="product.cash>0">
        <label>现金</label><span>￥{{product.cash}}</span>
    </div>
    <div class="gift-control">
        <label>运费</label><span>￥{{product.expressFee}}</span>
    </div>
    <div class="gift-tip"><span><em></em>确认提货后,将扣除礼包账户{{product.number}}{{product.unit}}{{product.name}}</span></div>
    <div class="bottom-wrap">
        <div>
            <span class="label">实付约</span><span class="total-money">￥{{totalMoney}}</span>
        </div>
        <button class="payment" v-on:click="pay">去付款</button>
    </div>
    <div class="page-cover" v-show="passwordShow">
        <div class="password-fixed">
            <div class="icon-close" v-on:click="hidePassword">×</div>
            <div class="password-tip">{{passwordTip}}
                <div class="error-tip" v-show="errorShow">{{errorText}}</div>
            </div>
            <ul class="password-wrap">
                <li>{{passwordValue.value1}}</li><li>{{passwordValue.value2}}</li><li>{{passwordValue.value3}}</li>
                <li>{{passwordValue.value4}}</li><li>{{passwordValue.value5}}</li><li>{{passwordValue.value6}}</li>
            </ul>
            <div v-show="forgetPassword" class="forget-password"><a href="${basePath}gift/checkMobile">忘记密码</a></div>
        </div>
    </div>
</div>
<!--page end-->

<!------------------------------------------------------------------------------>
<!--component start-->

<!--numericKeypad component start-->
<jsp:include page="../component/numericKeypad.jsp"/>
<!--numericKeypad component end-->

<!--dialog component start-->
<jsp:include page="../component/dialog.jsp"/>
<!--dialog component end-->

<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->

<!--component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script type="text/javascript" src="${staticPath}/static/js/views/deliveryOrder.js?v=${jsVersion}"></script>
</body>
</html>