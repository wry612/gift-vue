
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<html>
<head>
  <meta charset="UTF-8">
  <meta content="width=device-width,user-scalable=no" name="viewport" />
  <title>gift礼包送不停</title>
  <script src="${staticPath}/static/js/jquery-1.11.3.min.js"></script>
  <script>
    var basePath = '<%=basePath%>';
  </script>
  <jsp:include page="../include/weixinShareConfig.jsp"/>
    <%--加入微信签名及分享功能--%>
    <script>
      function isWeixin(){
        var ua = navigator.userAgent.toLowerCase();
        if(ua.match(/MicroMessenger/i)=="micromessenger") {
          return true;
        } else {
          return false;
        }
      }

      if(isWeixin()){
        wx.ready(function () {
          wx.onMenuShareTimeline({
            title: "xxxx" + '魔方大厦', // 分享标题
            link: window.location.href,//分享当前url
            imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
            success: function () {
              // 用户确认分享后执行的回调函数
            },
            cancel: function () {
              // 用户取消分享后执行的回调函数
            }
          });
          wx.onMenuShareAppMessage({
            title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
            desc: "xxxx"+'魔方大厦', // 分享描述
            link: window.location.href,//分享当前url
            imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
            type: 'link', // 分享类型,music、video或link，不填默认为link
            dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
            success: function () {
              // 用户确认分享后执行的回调函数
            },
            cancel: function () {
              // 用户取消分享后执行的回调函数
            }
          });

          wx.onMenuShareQQ({
            title: '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
            desc: "xxxx"+'魔方大厦', // 分享描述
            link: window.location.href,//分享当前url
            imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
            success: function () {
              // 用户确认分享后执行的回调函数
            },
            cancel: function () {
              // 用户取消分享后执行的回调函数
            }
          });

          wx.onMenuShareWeibo({
            title:  '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
            desc: "xxxx"+'；魔方大厦', // 分享描述
            link: window.location.href,//分享当前url
            imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
            success: function () {
              // 用户确认分享后执行的回调函数
            },
            cancel: function () {
              // 用户取消分享后执行的回调函数
            }
          });

          wx.onMenuShareQZone({
            title:  '${applicationScope['weixinDefaultShareTitle']}', // 分享标题
            desc: "xxxx"+'魔方大厦', // 分享描述
            link: window.location.href,//分享当前url
            imgUrl: '${staticPath}${applicationScope['weixinDefaultShareIcon']}', // 分享图标
            success: function () {
              // 用户确认分享后执行的回调函数
            },
            cancel: function () {
              // 用户取消分享后执行的回调函数
            }
          });
        });
      }
    </script>

</head>

<body>
<h2>接入微信:用户授权获取用户信息，使用微信基本的分享等功能！</h2>


目前取的是微信头像（可变，用户头像以第一次为准，目前没有获取）：<img src="${userWxInfo.headimgurl}" style="height: 50px;width: 50px;"/>
 <div style="font-size: 28px;"> 微信昵称：${userWxInfo.nickname}</div>

<div style="height: 50px;"></div>
<div style="font-size: 28px;">
  <c:if test="${not empty giftList}">

    用户所持有的礼包信息：
    <c:forEach items="${giftList}" var="giftAccount">
      <div>礼包账户ID：${giftAccount.giftAccountId}</div>
      <div>商品合约Id:${giftAccount.commodityContractId}</div>
      <div>可用单位数量：${giftAccount.availableUnitQuantity}</div>
      <div>冻结单位数量：${giftAccount.frozenUnitQuantity}</div>
      <div>账户类型：${giftAccount.type}</div>
    </c:forEach>
  </c:if>
<c:if test="${empty giftList}">目前什么礼包都没有！！！</c:if>

</div>


<div style="height: 50px;"></div>
 <div style="font-size: 28px;">
   <form>
     <a onclick="giveGift();">发礼包按钮</a>
   </form>
 </div>

<script>
  function giveGift(){
    window.location.href = basePath+"gift/index";
  }
</script>
</body>

</html>
