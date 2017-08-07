<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<c:set var="basePath" value="<%=basePath %>"></c:set>

<script src="<%=request.getScheme()%>://res.wx.qq.com/open/js/jweixin-1.1.0.js"></script>
<script>

    wx.config({
        debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
        appId: '${applicationScope['weixinAppID']}', // 必填，公众号的唯一标识
        timestamp: '${weixinJsSign.timestamp}', // 必填，生成签名的时间戳
        nonceStr: '${weixinJsSign.nonceStr}', // 必填，生成签名的随机串
        signature: '${weixinJsSign.signature}',// 必填，签名，见附录1
        jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage','hideMenuItems','closeWindow'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
    });


    wx.ready(function(){
        // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，
        // config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。
        // 对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。

        //隐藏菜单
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

        //检查手机是否支持api
//        wx.checkJsApi({
//            jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage'],
//            success: function (res) {
//                console.debug(res);
//            }
//        });

        wx.error(function (res) {
            // config信息验证失败会执行error函数，如签名过期导致验证失败，
            // 具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
            console.debug(res);
        });



    });


</script>

