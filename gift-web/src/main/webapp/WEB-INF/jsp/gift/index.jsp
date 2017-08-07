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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/index.css?v=${jsVersion}"/>
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/swiper.min.js?v=${jsVersion}"></script>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="index" v-cloak>
    <div class="banner-wrap">
        <div class="swiper-container" id="banner">
            <div class="swiper-wrapper">
                <div class="swiper-slide" v-for="item in bannerList">
                    <a v-bind:href="item.href">
                        <img v-bind:src="item.src+'?v=${jsVersion}'">
                    </a>
                </div>
            </div>
            <div class="swiper-pagination"></div>
        </div>
    </div>
    <ul class="index-table clearfix">
        <li>
            <a href="${basePath}gift/sellIn">
                <p><i class="icon-base icon-index0"></i></p>
                <p class="name">买礼品</p>
            </a>
        </li>
        <li>
            <a href="javascript:void(0);" v-on:click="goUrl('${basePath}pickUp/takeGoods?commodityId='+urlId)">
                <p><i class="icon-base icon-index3"></i></p>
                <p class="name">提货</p>
            </a>
        </li>
        <li>
            <a href="javascript:void(0);" v-on:click="goUrl('${basePath}gift/setPacket?commodityId='+urlId)">
                <p><i class="icon-base icon-index2"></i></p>
                <p class="name">发礼包</p>
            </a>
        </li>
        <li>
            <a href="${basePath}tradeDetail/transactionDetails">
                <p><i class="icon-base icon-index1"></i></p>
                <p class="name">明细</p>
            </a>
        </li>
        <li>
            <a href="${basePath}gift/packetRules">
                <p><i class="icon-base icon-index4"></i></p>
                <p class="name">礼包规则</p>
            </a>
        </li>
    </ul>
    <a href="JavaScript:void(0);" class="activity-wrap" v-on:click="showQrcode">
        <img src="${staticPath}/static/images/activity-bg.jpg?v=${jsVersion}">
    </a>
    <div class="gift-title">
        <a href="${basePath}gift/userSettings" class="float-left">设置</a>
        <span>我的礼包</span>
        <a href="${basePath}gift/accountDetails" class="float-right">账户详情</a>
    </div>
    <div class="account-wrap">
        <div class="null-wrap" v-show="noGift">
            <div class="up">
                <div class="icon-null"></div>
                <div class="tip">您的账户暂时没有可用礼品</div>
                <a href="${basePath}gift/sellIn" class="down">
                    去买礼品
                </a>
            </div>
        </div>
        <div class="swiper-container" id="gift" v-show="!noGift">
            <div class="swiper-wrapper">
                <div class="swiper-slide" v-for="item in giftList">
                    <a v-bind:href="url+item.commodityId">
                    <div class="clearfix">
                        <div class="float-left">
                            <i class="icon-tea"><img v-bind:src="item.icon+'?v=${jsVersion}'"></i>
                        </div>
                        <div class="float-left right">
                            <p class="name">[{{item.typeName}}] {{item.name}}</p>
                            <p class="number clearfix"><span class="num">{{item.number}}</span><span>{{item.unit}}</span></p>
                            <p class="money">价值约 {{item.money}}{{item.moneyUnit}}</p>
                        </div>
                    </div>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <!--二维码提示框-->
    <div class="page-cover" v-show="isFirst" v-on:click.self="closeQrcode">
        <div class="code-wrap">
            <div class="close" v-on:click="closeQrcode">x</div>
            <div class="code-img">
                <img src="${staticPath}/static/images/qrcode.png?v=${jsVersion}">
            </div>
            <div class="code-desc">长按二维码关注礼尚公众号，便于您随时查看礼包账户</div>
        </div>
    </div>
    <%--<div class="qrcode-small" v-on:click="showQrcode"></div>--%>
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
<script type="text/javascript" src="${staticPath}/static/js/views/index.js?v=${jsVersion}"></script>
<script>
//    if(isWeixin()) {
//        var url = basePath +"gift/index";
//
//        //获取用户
//        $.ajax({
//            url: basePath+'gift/getUserInfo',
//            type: "GET",
//            dataType: "json",
//            success: function (rsp) {
//                if (rsp.code == 0) {
//                    var userInfoId = rsp.body.userInfoId;
//                    url = url + "?userInfoId=" + userInfoId;
//                }else{
//                    alert("查询用户信息失败");
//                    return;
//                }
//            }
//
//        });
        <%--wx.ready(function () {--%>
            <%--wx.onMenuShareTimeline({--%>
                <%--title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题--%>
                <%--link: url ,//分享当前url--%>
                <%--imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标--%>
                <%--success: function () {--%>
                    <%--// 用户确认分享后执行的回调函数--%>
                <%--},--%>
                <%--cancel: function () {--%>
                    <%--// 用户取消分享后执行的回调函数--%>
                <%--}--%>
            <%--});--%>
            <%--wx.onMenuShareAppMessage({--%>
                <%--title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题--%>
                <%--desc: '${applicationScope['weixinDefaultShareDesc']}', // 分享描述--%>
                <%--link:url,//分享当前url--%>
                <%--imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标--%>
                <%--type: 'link', // 分享类型,music、video或link，不填默认为link--%>
                <%--dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空--%>
                <%--success: function () {--%>
                    <%--// 用户确认分享后执行的回调函数--%>
                <%--},--%>
                <%--cancel: function () {--%>
                    <%--// 用户取消分享后执行的回调函数--%>
                <%--}--%>
            <%--});--%>


        <%--});--%>
//    }
</script>
</body>
</html>