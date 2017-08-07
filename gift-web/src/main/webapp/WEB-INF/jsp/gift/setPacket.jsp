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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/setPacket.css?v=${jsVersion}"/>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="setPacket" v-cloak class="packet-box">
    <div class="select-tab">
        <div class="text-box"><span>{{selectText}}</span><i class="icon-down"></i></div>
        <select v-model="activeIndex" v-on:change="changeValue">
            <option v-for="option in selectList" v-bind:value="option.commodityContractId">[{{option.typeName}}]{{option.commodityName}}</option>
        </select>
    </div>
    <div class="current-hold">当前持有</div>
    <div class="current-number"><span class="number">{{product.holdCommodityQuantity}}</span><span>{{product.unit}}</span></div>
    <div class="gift-type" v-show="giftType==1">
        <div class="input-box clearfix">
            <span class="float-right unit">{{product.unit}}</span>
            <input type="tel" class="float-right" placeholder="请填写数量" v-on:input="changeInput" maxlength="6" v-model="packetTotal" name="packetTotal">
            <span class="float-left label"><em>拼</em>总量</span>
        </div>
        <div class="gift-tip">当前为拼手气礼包，<span class="red" v-on:click="changeType">改为普通礼包</span></div>
    </div>
    <div class="gift-type" v-show="giftType==2">
        <div class="input-box clearfix">
            <span class="float-right unit">{{product.unit}}</span>
            <input type="tel" class="float-right" placeholder="请填写数量" v-on:input="changeInput" maxlength="6" v-model="singleTotal" name="packetTotal">
            <span class="float-left label">单个数量</span>
        </div>
        <div class="gift-tip">当前为普通礼包，<span class="red" v-on:click="changeType">改为拼手气礼包</span></div>
    </div>
    <div class="input-box clearfix">
        <span class="float-right unit">个</span>
        <input type="tel" class="float-right" placeholder="填写个数" v-on:input="changeInput" maxlength="3" v-model="packetNumber" name="packetNumber">
        <span class="float-left label">礼包个数</span>
    </div>
    <div class="packet-tip" v-show="giftType==1">每人可领一个，数量随机且每人不超过{{product.standardUnitMultiple+product.unit}}</div>
    <div class="packet-tip" v-show="giftType==2">每人可领一个，且不超过{{product.standardUnitMultiple+product.unit}}</div>
    <div class="packet-desc"><textarea v-model="packetDesc" v-bind:placeholder="placeholder" maxlength="20"></textarea></div>

    <div class="total-money"><span>共</span><span class="number">{{totalNumber}}</span><span>{{product.unit}}</span></div>
    <div class="values">价值约<span>{{totalMoney}}</span>元</div>
    <div class="set-packet" v-on:click="sendPacket">塞礼品进礼包</div>
    <div class="packet-info">发送数量从礼包账户中扣除</div>
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

<!--dialog component start-->
<jsp:include page="../component/numericKeypad.jsp"/>
<!--dialog component end-->

<!--dialog component start-->
<jsp:include page="../component/dialog.jsp"/>
<!--dialog component end-->

<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->

<!--component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script type="text/javascript" src="${staticPath}/static/js/views/setPacket.js?v=${jsVersion}"></script>
</body>
</html>