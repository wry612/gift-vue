<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
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
    <title>泰易盈</title>
    <link rel="stylesheet" type="text/css" href="${staticPath}/static/css/pay.css?v=${jsVersion}"/>
    <!--- add js --->
    <script type="text/javascript" src="${staticPath}/static/js/flexible_css.debug.js"></script>
    <script type="text/javascript" src="${staticPath}/static/js/flexible.debug.js"></script>
    <script type="text/javascript" src="${staticPath}/static/js/common.js"></script>
</head>
<body>
<div class="pay-wrap failed">
    <div>
        <img src="${staticPath}/static/images/page-error.png">
    </div>
    <h1>ERROR</h1>
    <div class="desc">
        ${exception.message}
    </div>
</div>
<div class="btn-box">
    <input type="button" value="返回行情页" onclick="back()">
</div>
<script>
    function back() {
        window.location.href = '${ctx}/trade/index';
    }
</script>
</body>
</html>
