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
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/getPacket.css?v=${jsVersion}"/>
</head>
<body class="bg-white">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->

<input id="giftInfoId" value="${giftInfoId}" type="hidden"/><%--礼包id--%>
<input id="giftInfoCode" value="${giftInfoCode}" type="hidden"/><%--礼包code--%>
<div id="setPacketDetails" class="get-packet open-self" v-cloak>
    <div class="open-wrap">
        <div v-bind:class="bgClass">
            <div class="packet-img-new"><img v-bind:src="packet.img+'&v=${jsVersion}'"></div>
            <div class="packet-name">{{packet.name}}的礼包</div>
            <div class="packet-diviling"><img src="${staticPath}/static/images/packet-img1.png?v=${jsVersion}"></div>
            <div class="packet-desc-small">{{packet.desc}}</div>
            <div v-show="isGetPacket">
                <div class="packet-number"><span class="number">{{packet.number}}</span>{{packet.commodityUnitName}}</div>
            </div>
            <div v-show="!isGetPacket" class="zhanwei"></div>
            <div class="packet-product"><a v-bind:href="detailUrl+packet.commodityContractId">[{{packet.typeName}}]{{packet.commodityName}}</a></div>
            <div v-show="isGetPacket">
                <div class="packet-money">价值约 {{packet.money}}元</div>
                <%--<div class="packet-account"><a href="${basePath}gift/index">（已存入礼尚账户，可点击查看）</a></div>--%>
            </div>
            <div v-show="!isGetPacket" class="zhanwei"></div>
            <div class="packet-header">已领取{{packet.receive}}/{{packet.doneeQuota}}个,{{packet.receiveNumber}}/{{packet.commodityTotalQuantity}}{{packet.commodityUnitName}}
                <span class="float-right" style="margin-top:0.12rem;color:#8d120f;" v-on:click="sendContinue" v-show="hasReceive">继续发送</span>
            </div>
            <div v-show="isExprired" class="exprire-time"></div>
        </div>
        <ul class="list-wrap">
            <template v-for="(item,index) in packet.packetList" >
                <li class="clearfix">
                    <div class="float-left">
                        <img v-bind:src="item.img+'&v=${jsVersion}'" class="item-img">
                    </div>
                    <div class="item-user float-left">
                        <p class="item-name">{{item.name}}</p>
                        <p class="item-time">{{item.time}}</p>
                    </div>
                    <div class="item-info float-right">
                        <p class="item-number">{{item.number}}</p>
                        <%--<p class="item-product">{{item.commodityName}}</p>--%>
                    </div>
                </li>
                <li v-if="index==0 && isGetPacket && packet.packetList.length>1" class="bg-gray"></li>
            </template>
        </ul>
        <div class="btn-wrap"><a v-bind:href="'${basePath}gift/setPacket?commodityId='+packet.commodityContractId" class="btn-default">再发一个礼包</a></div>
    </div>
    <div v-show="isSend" class="page-cover" v-on:click.self="hide"><img src="${staticPath}/static/images/share.png?v=${jsVersion}"></div>
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
<script type="text/javascript" src="${staticPath}/static/js/views/setPacketDetails.js?v=${jsVersion}"></script>
<script>

    function share(shareTitle,code,nickName) {
        var commodityGiftInfoId =  $('#giftInfoId').val();
        if(isWeixin()) {
            var url=basePath + "gift/getPacket/" + commodityGiftInfoId + "/" + code;

            //获取用户
            $.ajax({
                url: basePath+'gift/getUserInfo',
                type: "GET",
                dataType: "json",
                success: function (rsp) {
                    if (rsp.code == 0) {
                        var userInfoId = rsp.body.userInfoId;
                        url = url + "?userInfoId=" + userInfoId;
                    }else{
                        alert("查询用户信息失败");
                        return;
                    }
                }

            });

            wx.ready(function () {
                wx.hideMenuItems({
                    menuList: [
                        "menuItem:share:facebook",
                        "menuItem:copyUrl",
                        "menuItem:originPage",
                        "menuItem:readMode",
                        "menuItem:share:email",
                       /* "menuItem:share:appMessage",*/
                        "menuItem:share:timeline",
                        "menuItem:share:qq",
                        "menuItem:share:weiboApp",
                        "menuItem:openWithSafari",
                        "menuItem:favorite",
                        "menuItem:share:QZone"
                    ] // 要隐藏的菜单项，只能隐藏“传播类”和“保护类”按钮，所有menu项见附录3
                });

                wx.onMenuShareAppMessage({
                    <%--title: '${applicationScope['shareTitle']}', // 分享标题--%>
                    <%--desc: '${applicationScope['weixinDefaultShareDesc']}', // 分享描述--%>
                    title: shareTitle, // 分享标题
                    <%--desc: '${applicationScope['weixinDefaultShareDesc']}', // 分享描述--%>
                    desc: '[有人送礼]领取'+nickName+'的礼包', // 分享描述
                    link: url,//分享当前url
                    imgUrl: basePath +'${applicationScope['weixinGiveGiftShareIcon']}', // 分享图标
                    type: 'link', // 分享类型,music、video或link，不填默认为link
                    dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
                    success: function () {
                        // 用户确认分享后执行的回调函数
//                                wx.closeWindow();
                        window.location.href =basePath +"gift/index";
                    },
                    cancel: function () {
                        // 用户取消分享后执行的回调函数
                    }
                });
            })
        }
    }

    function forbidden(){
        if(isWeixin()) {
            wx.ready(function () {
                wx.hideMenuItems({
                    menuList: [
                        "menuItem:share:facebook",
                        "menuItem:copyUrl",
                        "menuItem:originPage",
                        "menuItem:readMode",
                        "menuItem:share:email",
                        "menuItem:share:appMessage",
                        "menuItem:share:timeline",
                        "menuItem:share:qq",
                        "menuItem:share:weiboApp",
                        "menuItem:openWithSafari",
                        "menuItem:favorite",
                        "menuItem:share:QZone"
                    ] // 要隐藏的菜单项，只能隐藏“传播类”和“保护类”按钮，所有menu项见附录3
                });
            });
        }
    }
</script>
</body>
</html>