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
    <jsp:include page="../include/forbiddenWeixinDefaultShare.jsp"/>
    <!--weixin end-->
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/getPacket.css?v=${jsVersion}"/>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->

<input id="giftInfoId" value="${giftInfoId}" type="hidden"/><%--礼包id--%>
<input id="giftInfoCode" value="${giftInfoCode}" type="hidden"/><%--礼包code--%>
<div id="getPacket" class="get-packet" v-cloak>
    <div class="packet-wrap" v-show="!isOpen">
        <div v-if="packetFlag==1">
            <div class="packet-text">
                <div class="packet-img"><img v-bind:src="packet.img+'&v=${jsVersion}'"></div>
                <div class="packet-name">{{packet.name}}</div>
                <div class="packet-diviling"><img src="${staticPath}/static/images/packet-img1.png?v=${jsVersion}"></div>
                <div v-show="!canOpen" class="tip">
                    {{tip}}
                </div>
                <div v-show="canOpen">
                    <div class="packet-tip">发了一个礼包</div>
                    <div class="packet-desc">{{packet.desc}}</div>
                </div>
            </div>
            <div class="packet-border"></div>
            <div class="packet-btn" v-show="canOpen">
                <button v-on:click="openPacket" class="circle-btn">開</button>
            </div>
            <div v-show="!canOpen" class="packet-detail">
                <a href="${basePath}gift/index" v-show="overDate">礼包账户></a>
                <a href="javascript:void(0)" v-on:click="queryPacket" v-show="getOver">查看详情></a>
            </div>
        </div>
        <%--<div v-if="packetFlag==2">--%>
        <%--<div class="packet-img"><img v-bind:src="packet.img"></div>--%>
        <%--<div class="packet-name">{{packet.name}}的“{{packet.commodityName}}”红包</div>--%>
        <%--<div class="packet-diviling"><img src="${staticPath}/static/images/packet-img1.png"></div>--%>
        <%--<div class="packet-desc-small">{{packet.desc}}</div>--%>
        <%--<div class="packet-number"><span class="number">{{packet.number}}</span>克</div>--%>
        <%--<div class="packet-money">价值约 {{packet.money}}元</div>--%>
        <%--<div class="btn-wrap"><button class="btn-default" v-on:click="setAccount">存入礼尚账户</button></div>--%>
        <%--</div>--%>
    </div>
    <div v-show="isOpen" class="open-wrap">
        <div v-if="packetFlag==3">
            <div v-bind:class="bgClass">
                <div class="packet-img-new"><img v-bind:src="packet.img+'&v=${jsVersion}'"></div>
                <div class="packet-name">{{packet.name}}的礼包</div>
                <div class="packet-diviling"><img src="${staticPath}/static/images/packet-img1.png?v=${jsVersion}"></div>
                <div class="packet-desc-small">{{packet.desc}}</div>
                <div v-show="isGetPacket">
                <div class="packet-number"><span class="number">{{packet.number}}</span>{{packet.commodityUnitName}}
                </div>
                </div>
                <div v-show="!isGetPacket" class="zhanwei"></div>
                <div class="packet-product"><a v-bind:href="detailUrl+packet.commodityId">[{{packet.typeName}}]{{packet.commodityName}}</a></div>
                <div v-show="isGetPacket">
                <div class="packet-money">价值约 {{packet.money}}元</div>
                <div class="packet-account"><a href="${basePath}gift/index">（已存入礼尚账户，可点击查看）</a></div>
                </div>
                <div v-show="!isGetPacket" class="zhanwei"></div>
                <div class="packet-header">
                    已领取{{packet.receive}}/{{packet.doneeQuota}}个,{{packet.receiveNumber}}/{{packet.commodityTotalQuantity}}{{packet.commodityUnitName}}
                </div>
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
            <div class="btn-wrap">
                <%--<a v-bind:href="'${basePath}gift/setPacket?commodityId='+packet.commodityId" class="btn-default" v-show="isGetPacket">发礼包</a>--%>
                    <a href="${basePath}gift/index" class="btn-default" v-show="isGetPacket">去礼尚看看</a>
                <a href="${basePath}gift/index" class="btn-default" v-show="!isGetPacket">去礼尚看看</a></div>
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
<script type="text/javascript" src="${staticPath}/static/js/views/getPacket.js?v=${jsVersion}"></script>
</body>
</html>