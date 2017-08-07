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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/deliveryOrder.css?v=${jsVersion}"/>
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
</head>
<body class="bg-white mb136">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="orderDetail" v-cloak>
    <div class="page-title" v-if="conversionType > 1">
        兑换详情
    </div>
    <div class="page-title" v-if="conversionType == 1">
        夺宝详情
    </div>
    <div v-if="conversionType == 1">
        <div class="tip-wrap" v-if="isDraw=='true'">
            <div class="tip red">恭喜您中奖！</div>
            <div class="tip">开奖时间：{{convertObjOrderDetailInfo.drawTime}}<a v-bind:href="'${basePath}conversion/detailPage/'+convertObjOrderDetailInfo.convertObjId">活动详情</a></div>
        </div>
        <div class="tip-wrap" v-if="isDraw=='false'">
            <div class="tip red">很遗憾，您未中奖</div>
            <div class="tip">开奖时间：{{convertObjOrderDetailInfo.drawTime}}<a v-bind:href="'${basePath}conversion/detailPage/'+convertObjOrderDetailInfo.convertObjId">活动详情</a></div>
        </div>
        <div class="tip-wrap" v-if="isDraw=='not_draw'">
            <div class="tip red">参加人数未达开奖条件</div>
        </div>
        <div class="tip-wrap" v-if="isDraw==null || isDraw==''">
            <div class="tip red">参加成功，等待开奖</div>
            <div class="tip">开奖时间：{{convertObjOrderDetailInfo.drawTime}}<a v-bind:href="'${basePath}conversion/detailPage/'+convertObjOrderDetailInfo.convertObjId">活动详情</a></div>
        </div>
        <ul class="drawed-wrap" v-if="isDraw=='true'">
            <li v-for="(item,index) in convertObjOrderDetailInfo.drawedDetail">
                <div class="clearfix">
                    <span class="float-left" v-if="item.isFirst">{{item.prizeLevel}}</span><img class="float-left" v-if="item.isFirst" src="${staticPath}/static/images/icon-jp.png?v=${jsVersion}">
                    <span>券码：{{item.signSeq}}</span>
                </div>
                <div>
                    价值￥{{item.price}}
                </div>
                <div>
                    {{item.prizeName}}
                </div>
                <div v-if="item.step==2&&item.vrtualOrActual=='ACTUAL'" class="express">
                    <a v-bind:href="'${basePath}express/expressPage?expressInfoId='+item.expressInfoId">查看物流</a>
                </div>
            </li>
        </ul>
        <div class="quan-wrap">
            <div class="quan-outer">
                <div class="clearfix quan-inner">
                    <div class="float-right left" v-on:click="toggleQuan">
                        <span v-bind:class="{toggle:isQuanShow}">券码<em></em></span>
                    </div>
                    <div class="float-left right">
                        报名<span class="red">{{convertObjOrderDetailInfo.doller.length}}</span>人次
                    </div>
                </div>
                <div class="doller-wrap clearfix" v-bind:class="{center:convertObjOrderDetailInfo.doller.length<4}" v-show="isQuanShow">
                    <template v-for="(item,index) in convertObjOrderDetailInfo.doller">
                        <span v-if="index<convertObjOrderDetailInfo.doller.length-1" class="doller-item">{{item}}，</span>
                        <span v-else class="doller-item">{{item}}</span>
                    </template>
                </div>
            </div>
        </div>
    </div>
    <div class="order-process" v-if="conversionType > 1">
        <div class="process-line clearfix">
            <div class="process-item active float-left">
                <div class="circle"><div class="high-light"></div></div>
                <div class="line right-line"></div>
            </div>
            <div class="process-item float-left ml24" v-bind:class="{active:convertObjOrderDetailInfo.step>=1}">
                <div class="circle"><div class="high-light"></div></div>
                <div class="line right-line"></div>
            </div>
            <div class="process-item float-right" v-bind:class="{active:convertObjOrderDetailInfo.step==2}">
                <div class="circle"><div class="high-light"></div></div>
            </div>
            <div class="line-bg"></div>
        </div>
        <div class="process-text clearfix">
            <div class="text-item float-left">
                <div class="title">提交订单</div>
                <div>{{convertObjOrderDetailInfo.timeStart}}</div>
            </div>
            <div class="text-item float-left">
                <div class="title">待发货</div>
                <div v-if="convertObjOrderDetailInfo.step<=2">{{convertObjOrderDetailInfo.timeMid}}</div>
            </div>
            <div class="text-item float-right">
                <div class="title">已发货</div>
                <div v-if="convertObjOrderDetailInfo.step==2">{{convertObjOrderDetailInfo.timeEnd}}</div>
            </div>
        </div>
    </div>
    <div class="order-process" v-if="conversionType == 1">
        <div class="process-line clearfix" v-bind:class="{two:isDraw=='false' || isDraw=='not_draw'}">
            <div class="process-item active float-left">
                <div class="circle"><div class="high-light"></div></div>
                <div class="line right-line"></div>
            </div>
            <div class="process-item float-left ml24" v-bind:class="{active:convertObjOrderDetailInfo.step>=1}" v-if="isDraw=='' || isDraw==null">
                <div class="circle"><div class="high-light"></div></div>
                <div class="line right-line"></div>
            </div>
            <div class="process-item float-right ml24" v-bind:class="{active:convertObjOrderDetailInfo.step>=1}" v-if="isDraw=='false'">
                <div class="circle"><div class="high-light"></div></div>
            </div>
            <div class="process-item float-right ml24" v-bind:class="{active:convertObjOrderDetailInfo.step>=1}" v-if="isDraw=='not_draw'">
                <div class="circle"><div class="high-light"></div></div>
            </div>
            <div class="process-item float-left ml24" v-bind:class="{active:convertObjOrderDetailInfo.step>=1}" v-if="isDraw=='true'">
                <div class="circle"><div class="high-light"></div></div>
                <div class="line right-line"></div>
            </div>
            <div class="process-item float-right" v-bind:class="{active:convertObjOrderDetailInfo.step==2}" v-if="isDraw=='true' || isDraw=='' ||isDraw==null">
                <div class="circle"><div class="high-light"></div></div>
            </div>
            <div class="line-bg"></div>
        </div>
        <div class="process-text clearfix" v-bind:class="{two:isDraw=='false' || isDraw=='not_draw'}">
            <div class="text-item float-left">
                <div class="title">参加成功</div>
                <div>{{convertObjOrderDetailInfo.timeStart}}</div>
            </div>
            <div class="text-item float-left" v-if="isDraw==''|| isDraw==null">
                <div class="title">等待开奖</div>
                <div v-if="convertObjOrderDetailInfo.step<=1">{{convertObjOrderDetailInfo.drawTime}}</div>
            </div>
            <div class="text-item float-right" v-if="isDraw=='false'">
                <div class="title">未中奖</div>
                <div v-if="convertObjOrderDetailInfo.step<=1">{{convertObjOrderDetailInfo.drawTime}}</div>
            </div>
            <div class="text-item float-right" v-if="isDraw=='not_draw'">
                <div class="title">不予开奖</div>
                <div v-if="convertObjOrderDetailInfo.step<=1"></div>
            </div>
            <div class="text-item float-left" v-if="isDraw=='true'">
                <div class="title">已中奖</div>
                <div v-if="convertObjOrderDetailInfo.step<=2">{{convertObjOrderDetailInfo.drawTime}}</div>
            </div>
            <div class="text-item float-right" v-if="isDraw=='true' || isDraw=='' ||isDraw==null">
                <div class="title" v-if="expressAll">已发货</div>
                <div class="title" v-if="!expressAll">部分发货</div>
                <div v-if="convertObjOrderDetailInfo.step==2">{{convertObjOrderDetailInfo.timeEnd}}</div>
            </div>
        </div>
    </div>
    <%--<ul class="list-user border-top" v-if="conversionType == 1">--%>
        <%--<li class="nav-item more">--%>
            <%--<label>奖品及价值</label>--%>
            <%--<table class="prize-table">--%>
                <%--<thead>--%>
                <%--<tr>--%>
                    <%--<th width="20%">奖次</th>--%>
                    <%--<th>奖品</th>--%>
                    <%--<th class="text-right" width="15%">价值</th>--%>
                <%--</tr>--%>
                <%--</thead>--%>
                <%--<tbody>--%>
                <%--<tr v-for="item in convertObjOrderDetailInfo.multiObjDetail">--%>
                    <%--<td width="20%">{{item.prizeLevel}}</td>--%>
                    <%--<td>{{item.prizeName}}</td>--%>
                    <%--<td class="text-right" width="15%">￥{{(item.price/100).toFixed(2)}}</td>--%>
                <%--</tr>--%>
                <%--</tbody>--%>
            <%--</table>--%>
        <%--</li>--%>
    <%--</ul>--%>
    <ul class="list-user border-top" v-if="conversionType != 1">
        <li class="nav-item">
            <label>商品名</label><span>{{convertObjOrderDetailInfo.commodityName}}</span>
        </li>
        <li class="nav-item">
            <label>市场价</label><span>{{convertObjOrderDetailInfo.unitPrice}}元</span>
        </li>
    </ul>
    <ul class="list-user border-top pt24">
        <li class="nav-item" v-if="conversionType == 1">
            <label>活动名称</label><span>{{convertObjOrderDetailInfo.commodityName}}</span>
        </li>
        <li class="nav-item">
            <label>当前状态</label><span>{{convertObjOrderDetailInfo.state}}</span>
        </li>
        <li class="nav-item">
            <label>交易单号</label><span>{{convertObjOrderDetailInfo.convertObjOrderId}}</span>
        </li>
        <li class="nav-item">
            <label>活动参加方式</label><span>{{convertObjOrderDetailInfo.conversionTypeName}}</span>
        </li>
        <li class="nav-item" v-if="conversionType!=1">
            <label>兑换数量</label><span>{{convertObjOrderDetailInfo.conversionNumber}}份</span>
        </li>
        <li class="nav-item" v-if="conversionType!=1">
            <label>礼品价值</label><span>{{convertObjOrderDetailInfo.commodityTotalPrice}}元</span>
        </li>
        <li class="nav-item" v-if="conversionType!=1">
            <label>商品价值</label><span>{{convertObjOrderDetailInfo.money}}元</span>
        </li>
    </ul>
    <ul class="list-user border-top pt24">
        <li class="nav-item">
            <label>收货人</label><span>{{username}}</span>
        </li>
        <li class="nav-item">
            <label>联系方式</label><span>{{telNumber}}</span>
        </li>
        <li class="nav-item more clearfix">
            <label>收货地址</label><span>{{address}}</span>
        </li>
    </ul>
    <%--<ul class="list-user border-top pt24" v-if="convertObjOrderDetailInfo.step==2 && convertObjOrderDetailInfo.vrtualOrActual!='VRTUAL'">--%>
        <%--<li class="nav-item">--%>
            <%--<label>物流公司</label><span>{{convertObjOrderDetailInfo.company}}</span>--%>
        <%--</li>--%>
        <%--<li class="nav-item">--%>
            <%--<label>物流单号</label><span>{{convertObjOrderDetailInfo.logisticsId}}</span>--%>
        <%--</li>--%>
    <%--</ul>--%>
    <ul class="list-user border-top pt24">
        <li class="nav-item more clearfix">
            <label>留言</label><span>{{convertObjOrderDetailInfo.remark}}</span>
        </li>
    </ul>
    <ul class="list-user border-top pt24" v-if="sellerInfo!=null">
        <li class="nav-item more clearfix" v-for="item in sellerInfo">
            <label>{{item.key}}</label><span>{{item.value}}</span>
        </li>
    </ul>
    <div class="bottom-fixed clearfix" v-bind:class="{half:convertObjOrderDetailInfo.step==2}" v-if="conversionType!=1">
        <a href="${basePath}gift/index" class="float-left">
            去首页看看</a>
        <a v-if="convertObjOrderDetailInfo.step==2" v-bind:href="'${basePath}express/expressPage?expressInfoId='+convertObjOrderDetailInfo.expressInfoId" class="float-left">查看物流</a>
    </div>
    <div class="bottom-fixed clearfix" v-if="conversionType==1">
        <a href="${basePath}gift/index" class="float-left">
            去首页看看</a>
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
<script type="text/javascript" src="${staticPath}/static/js/conversion/orderDetail.js?v=${jsVersion}"></script>
</body>
</html>