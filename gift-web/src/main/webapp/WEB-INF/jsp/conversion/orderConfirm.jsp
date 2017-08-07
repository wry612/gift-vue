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
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/password.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/deliveryOrder.css?v=${jsVersion}"/>
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
</head>
<body class="bg-white">
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="orderConfirm" v-cloak>
    <div class="page-title" v-if="!isDraw">
        兑换申请
    </div>
    <div class="page-title" v-if="isDraw">
        夺宝申请
    </div>
    <div class="user-info">
        <a href="${basePath}address/address">
            <div class="clearfix">
                <label>收件人</label><span class="name">{{username}}</span>
                <div class="float-right mobile">{{telNumber}}</div>
            </div>
            <div class="address">
                {{address}}
            </div>
            <div class="address-wrap clearfix">
                <div class="float-right">
                    <i class="icon-right"></i>
                </div>
                <div class="address-operation" v-if="hasDefault">
                    <input type="radio" checked> <label>默认</label>
                </div>

            </div>
        </a>
    </div>
    <div class="gift-info">
        <div class="clearfix">
            <div class="float-right gift-package" v-if="!isDraw">
                ×{{conversionNumber}}
            </div>
            <div class="float-left product-img">
                <img v-bind:src="product.headImgs+'?v=${jsVersion}'">
            </div>
            <div class="float-left">
                <p class="gift-name">{{product.fullName}}</p>
                <p class="gift-infor" v-if="!isDraw">
                <span class="gift-number">市场价</span><span class="gift-money">￥{{product.marketPrice}}</span>
                </p>
            </div>
            <span class="view-prize" v-on:click="viewPrize" v-if="!prizeShow&&isDraw">查看活动奖品<i></i></span>
        </div>
        <table v-if="prizeShow" class="prize-table">
            <thead>
                <tr>
                    <th width="20%">奖次</th>
                    <th>奖品</th>
                    <th class="text-right" width="15%">价值</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in product.multiObjDetail">
                    <td width="20%">{{item.prizeLevel}}</td>
                    <td>{{item.prizeName}}</td>
                    <td class="text-right" width="15%">￥{{(item.price/100).toFixed(2)}}</td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="gift-control">
        <label>活动参加方式</label><span>{{conversionTypeText}}</span>
    </div>
    <div class="gift-control" v-if="isDraw">
        <label>参加次数</label><span>{{conversionNumber}}</span>
    </div>
    <div class="gift-control">
        <label>留言(选填)</label><input type="text" class="float-right" v-model="inputText" placeholder="请填写留言">
    </div>
    <div v-if="isDraw" class="gift-tip"><span><em></em>确认参加后,礼尚将冻结您礼包账户中{{conversionText}}。开奖后，如您中奖，我们将把活动商品寄到您的收件地址，如您未中奖，我们将及时退还您被冻结的礼品。</span></div>
    <div v-if="!isDraw" class="gift-tip"><span><em></em>确认兑换后,将扣除礼包账户{{conversionText}}</span></div>
    <div class="footer-wrap">
        <a href="javascript:void(0);" class="footer-item" v-on:click="pay">{{btnText}}
        </a>
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
<script type="text/javascript" src="${staticPath}/static/js/conversion/orderConfirm.js?v=${jsVersion}"></script>
</body>
</html>