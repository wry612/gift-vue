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
    <!--- add js --->
    <!--weixin start-->
    <jsp:include page="../include/weixinDefaultShare.jsp"/>
    <!--weixin end-->
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/swiper-3.4.0.min.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/commodityDetails.css?v=${jsVersion}"/>
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/swiper.min.js?v=${jsVersion}"></script>
    <%--<script type="text/javascript" src="${staticPath}/static/js/echarts.js"></script>--%>
</head>
<body class="bg-gray" ontouchstart="">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="commodityDetails" v-cloak>
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide" v-for="item in imgList">
                <img v-bind:src="item.src+'?v=${jsVersion}'" width="100%">
            </div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
    <div class="commodity-wrap">
        <div class="name">[{{commodity.typeName}}]{{commodity.commodityName}}</div>
        <div class="desc">
            {{commodity.desc}}
        </div>
        <div class="unit-money">￥{{commodity.unitPrice}}/{{commodity.unit}}<span>(￥{{commodity.standardPrice}}/{{commodity.standardUnitName}})</span></div>
        <div class="time"><span>提货有效期至：{{commodity.validDate}}</span><a v-bind:href="'${basePath}gift/agreement?commodityContractId='+commodity.commodityContractId" class="float-right">协议</a></div>
    </div>
    <%--<div class="standard-set" v-on:click="setStandard">--%>
        <%--<i class="icon-right float-right"></i>  <span>规格数量选择</span>--%>
    <%--</div>--%>
    <div class="detail-wrap">
        <div class="detail-title">商品详情</div>
        <template v-for="item in properties">
        <div class="detail-item clearfix">
            <span>{{item.key}}</span><span>{{item.value}}</span>
        </div>
        </template>
    </div>
    <div class="detail-wrap detail-img">
        <div v-for="item in commodity.imgList">
            <img v-bind:src="item.src+'?v=${jsVersion}'" alt="">
        </div>
    </div>
    <div class="footer-wrap clearfix">
        <a v-bind:href="'${basePath}gift/setPacket?commodityId='+commodity.commodityContractId" class="footer-item width1" v-show="hasGift">
            <%--<i class="icon-gift"></i>--%><span>发礼包</span>
        </a>
        <a v-bind:href="'${basePath}pickUp/takeGoods?commodityId='+commodity.commodityContractId" class="footer-item width1" v-show="hasGift">
            <%--<i class="icon-car"></i>--%><span>提货</span>
        </a>
        <div class="footer-item width2 width100" v-on:click="sellInPacket" id="sellIn">
            <i class="icon-sell-in"></i><span>立即购买</span>
        </div>
    </div>
    <div class="page-cover" v-bind:class="{show:isShow}" v-on:click.self="hide">
        <div class="choose-wrap">
            <div class="clearfix choose-detail">
                <div class="float-left head-img">
                    <img v-bind:src="commodity.headImg+'?v=${jsVersion}'">
                </div>
                <div class="float-left detail">
                    <p>
                        <span class="label">价格：</span><span class="money">￥{{totalMoney}}</span>
                    </p>
                    <p>
                        <span class="label">已选择：</span><span class="number">{{inputNumber}}{{chooseUnit}}</span><span>({{commodity.standardUnitMultiple}}{{commodity.unit}}/{{commodity.standardUnitName}})</span>
                    </p>
                </div>
            </div>
            <div class="standard">
                <div class="title">规格</div>
                <div class="standard-box clearfix">
                    <span class="active">{{commodity.unit}}</span><span>{{commodity.standardUnitName}}</span>
                </div>
            </div>
            <div class="choose-number">
                <div class="title">数量&nbsp;&nbsp;&nbsp;&nbsp;<span>当前库存(<span class="red">{{stock}}{{chooseUnit}}</span>)</span></div>
                <div class="number-box clearfix">
                    <span v-on:click="minus">-</span><input type="tel" v-model="inputNumber" v-on:input="inputChange" placeholder="1"><span v-on:click="plus">+</span>
                </div>
            </div>
        </div>
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
<script type="text/javascript" src="${staticPath}/static/js/views/commodityDetails.js?v=${jsVersion}"></script>
</body>
</html>