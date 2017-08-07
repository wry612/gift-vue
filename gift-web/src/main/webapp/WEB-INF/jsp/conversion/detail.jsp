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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/swiper-3.4.0.min.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/conversion/detail.css?v=${jsVersion}"/>
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
<div id="detail" v-cloak>
    <div class="banner-wrap">
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide" v-for="item in imgList">
                    <img v-bind:src="item.src+'?v=${jsVersion}'" width="100%">
                </div>
            </div>
            <!-- Add Pagination -->
            <div class="swiper-pagination"></div>
        </div>
        <div class="overdue-tip clearfix" v-show="isDraw">
            <i class="icon-clock float-left"></i><span class="float-left tip" v-if="isStart&&!waitDraw">距离活动结束</span><span class="float-left tip" v-if="!isStart">距离活动开始</span><span class="float-left tip" v-if="isStart&&waitDraw">距离活动开奖</span>
            <div class="float-left time">
                <span class="red">{{countdown.day}}</span><span>天</span><span class="red">{{countdown.hour}}</span><span>时</span><span class="red">{{countdown.minute}}</span><span>分</span><span class="red">{{countdown.second}}</span><span>秒</span>
            </div>
            <div class="over-tip" v-bind:class="{notStart:!isStart,waitDraw:waitDraw,isQualified:!isQualified}" v-if="isOver"></div>
        </div>
    </div>
    <div v-if="!isDraw" class="bg-white">
        <div class="conversion-title">
            <div class="relative">
                <div class="title conversion">{{commodity.fullName}}</div>
                <div class="over-tip" v-bind:class="{notStart:!isStart,waitDraw:waitDraw,isQualified:isQualified}" v-if="isOver"></div>
            </div>
            <div class="relative">
                <div class="left" v-if="!isDraw">
                    <span class="name">市场价</span><span class="value">￥{{commodity.marketPrice}}</span>
                </div>
                <div class="small-process" v-bind:class="{disabled:isOver}">
                    <div class="float-right text">限量{{commodity.totalQuantity}}份</div>
                    <div class="process-outer float-right">
                        <div class="process-inner" v-bind:style="{width:processPercent}"></div>
                        <span>剩余{{commodity.availableQuantity}}份</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="conversion-desc" v-if="commodity.remark!=''">
            <template v-for="item in commodity.remark">
                <div class="title">{{item.key}}</div>
                <div class="desc">{{item.value}}</div>
            </template>
        </div>
        <div class="conversion-type clearfix" v-on:click="selectShow" v-if="!isOver">
            <label class="float-left">活动参加方式</label>
            <i class="icon-right"></i>
            <input class="float-right" type="text" placeholder="请选择活动参加方式" v-bind:class="{highlight:isCheck&&!isOver}" v-model="conversionTypeText" disabled v-on:input="checkNumber"/>
        </div>
        <div class="conversion-type clearfix" v-if="!isOver">
            <label class="float-left">兑换数量</label>
            <input class="float-right" type="tel" placeholder="请输入兑换数量" v-bind:class="{highlight:!isOver}" v-model="conversionNumber" v-bind:disabled="isOver" v-on:input="checkNumber" />
        </div>
    </div>
    <div v-if="isDraw" class="bg-white">
        <div class="conversion-title">
            <div class="title">{{commodity.fullName}}</div>
            <div class="relative">
                <div class="left">
                    <span class="name">市场价</span><span class="value">￥{{commodity.marketPrice}}</span>
                </div>
            </div>
            <div class="process-wrap" >
                <div class="process-box"><div class="process-outer"><div class="process-inner" v-bind:style="{width:processPercent}"></div></div></div>
                <div class="process-text clearfix">
                    <div class="float-right"><a v-bind:href="'${basePath}conversion/recordPage?convertObjId='+commodity.convertObjId">{{commodity.signQuantity}}人已参加</a></div>
                    <div class="float-left">目标人次:<span class="red">{{commodity.signQuantityMax}}</span></div>
                    <div class="float-left">&nbsp;剩余人次:<span class="red">{{commodity.surplusNum}}</span></div>
                </div>
            </div>
            <div class="cal"><a href="${basePath}conversion/computeDetail">计算详情</a></div>
        </div>
        <div v-if="commodity.drawed=='TRUE'" class="drawed-wrap">
            <div class="clearfix">
                <div class="float-left drawed-head"><img v-bind:src="commodity.headImg"></div>
                <div class="float-left">
                    <div class="draw-name">{{commodity.nickName}}</div>
                    <div class="draw-commodity">夺宝{{commodity.fullName}}成功</div>
                </div>
            </div>
            <div class="doller"><i class="icon-doller"></i><span class="label">劵码：</span><span class="code">{{commodity.quanCode}}</span></div>
            <div class=draw-time>开奖时间：{{commodity.drawTime}}</div>
            <div class="icon-drawed"><a v-bind:href="'${basePath}conversion/drawedDetail?convertObjId='+commodity.convertObjId">更多中奖信息</a></div>
        </div>
        <div class="conversion-desc" v-if="commodity.remark!=''">
            <template v-for="item in commodity.remark">
                <div class="title">{{item.key}}</div>
                <div class="desc">{{item.value}}</div>
            </template>
        </div>
        <%--<div class="conversion-desc">--%>
            <%--<div class="title">活动流程</div>--%>
            <%--<div class="process"><img src="${staticPath}/static/images/activity-process.png?v=${jsVersion}"></div>--%>
        <%--</div>--%>
        <div class="conversion-type clearfix" v-on:click="selectShow" v-if="!isOver">
            <label class="float-left">活动参加方式</label>
            <i class="icon-right"></i>
            <input class="float-right" type="text" placeholder="请选择活动参加方式" v-bind:class="{highlight:isCheck&&!isOver}" v-model="conversionTypeText" disabled  v-on:input="checkNumber"/>
        </div>
        <div class="conversion-type clearfix" v-if="!isOver">
            <label class="float-left">参加次数</label>
            <input class="float-right" type="tel" placeholder="请输入参加次数" v-bind:class="{highlight:!isOver}" v-model="conversionNumber" v-bind:disabled="isOver" v-on:input="checkNumber" />
        </div>
    </div>
    <div class="detail-wrap">
        <div class="detail-title">商品详情</div>
        <div v-for="item in commodity.imgList">
            <img v-bind:src="item.src+'?v=${jsVersion}'" alt="">
        </div>
    </div>
    <div class="footer-wrap" v-if="!isDraw" v-bind:class="{disabled:isDisabled}">
        <a href="javascript:void(0);" class="footer-item" v-on:click="goOrder">{{btnText}}</a>
    </div>
    <div class="footer-wrap" v-if="isDraw" v-bind:class="{disabled:isDisabled}">
        <a href="javascript:void(0);" class="footer-item" v-on:click="goOrder">{{btnText}}</a>
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

<!--dialog component start-->
<jsp:include page="../component/selectList.jsp"/>
<!--dialog component end-->

<!--component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script>
    var convertObjId = '${convertObjId}';
</script>
<script type="text/javascript" src="${staticPath}/static/js/conversion/detail.js?v=${jsVersion}"></script>
</body>
</html>