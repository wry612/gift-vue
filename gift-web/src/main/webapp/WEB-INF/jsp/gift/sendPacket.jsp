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
    <jsp:include page="../include/giftweixinDefaultShare.jsp"/>
    <!--weixin end-->
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/jquery.min.js?v=${jsVersion}"></script>
    <script type="text/javascript" src="${staticPath}/static/js/vue.js?v=${jsVersion}"></script>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/common.css?v=${jsVersion}"/>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/views/sendPacket.css?v=${jsVersion}"/>
</head>
<body>
<script>
    var staticPath = '${staticPath}';
    var basePath = '<%=basePath %>';
</script>
<!--page start-->
<div id="sendPacket" class="send-packet" v-cloak>
    <div class="packet-wrap">
        <div class="packet-text">礼包已经包好</div>
        <div class="packet-border"></div>
        <div class="packet-btn">
            <button v-on:click="sendPacket" class="circle-btn">发礼包</button>
        </div>
        <div class="packet-tip">未领取的礼包将在24小时后退回至礼包账户</div>
    </div>
    <div v-show="isSend" class="page-cover"><img src="${staticPath}/static/images/share.png?v=${jsVersion}"></div>
</div>
<input id="commodityGiftInfoId" value="${commodityGiftInfoId}" type="hidden"/>
<input id="code" value="${code}" type="hidden"/>
<input id="commodityTypeCode" value="${commodityTypeCode}" type="hidden"/>
<input id="greeting" value="${greeting}" type="hidden"/>
<input id="nickName" value="${nickName}" type="hidden"/>
<!--page end-->
<!--dialog component start-->
<jsp:include page="../component/toast.jsp"/>
<!--dialog component end-->
<script type="text/javascript" src="${staticPath}/static/js/common.js?v=${jsVersion}"></script>
<script type="text/javascript">

    var commodityGiftInfoId =  $('#commodityGiftInfoId').val();
    var commodityTypeCode =  $('#commodityTypeCode').val();
    var greeting =  $('#greeting').val();
    var code = $('#code').val();
    var nickName = $("#nickName").val();
    if(isWeixin()) {
        var shareTitle ='';
        console.log(greeting);
        console.log(commodityTypeCode);
        if(null == greeting ||''==greeting){
            if(commodityTypeCode=='red_wine'){
                shareTitle = "窖藏红酒，如幽深时光来的老故事";
            }else if(commodityTypeCode=='tea'){
                shareTitle = "茶香中，一颗心慢慢沉静下来";
            }else if(commodityTypeCode=='wine'){
                shareTitle = "酒醇人美，酒冽情真";
            }else{
                shareTitle = "好东西需与朋友分享";
            }
        }else{
            shareTitle = greeting;
        }

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
            <%--wx.onMenuShareTimeline({--%>
            <%--title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题--%>
            <%--link: url,//分享当前url--%>
            <%--imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标--%>
            <%--success: function () {--%>
            <%--// 用户确认分享后执行的回调函数--%>
            <%--wx.closeWindow();--%>
            <%--},--%>
            <%--cancel: function () {--%>
            <%--// 用户取消分享后执行的回调函数--%>
            <%--}--%>
            <%--});--%>
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

    var sendPacket = new Vue({
        el: '#sendPacket',
        data:{
            isSend:false
        },
        computed:{

        },
        methods:{
            sendPacket:function () {
                this.isSend = true;
            }
        }
    });
</script>
</body>
</html>