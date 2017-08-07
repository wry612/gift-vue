<%--
  Created by IntelliJ IDEA.
  User: zhangyutao
  Date: 2017/6/20
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>以物换物首页</title>
    <script src="${staticPath}/static/js/jquery-1.11.3.min.js"></script>
</head>
<body>
    <div id="listData" style="font-size: 5em">查询以物换物活动列表数据</div>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <input id="convertObjId" type="text"  placeholder="请输入活动id" style="font-size: 5em"/>
    <input type="button" id="oneData" style="font-size: 5em" value="查询单条活动信息"/>
    <input type="button" id="oneRule" style="font-size: 5em" value="查询单条活动兑换条件"/>
</body>
<script>
    $("#listData").on("click", function () {
        $.ajax({
            url: "${basePath}/conversion/list",
            dataType: "json",
            type : "GET",
            success : function(resp) {
                console.log(resp);
            }
        });

    });


    $("#oneData").on("click", function () {
        $.ajax({
            url: "${basePath}/conversion/detail/" + $("#convertObjId").val(),
            dataType: "json",
            type : "GET",
            success : function(resp) {
                console.log(resp);
            }
        });
    })

    $("#oneRule").on("click", function () {
        $.ajax({
            url: "${basePath}/conversion/ruleDetail/" + $("#convertObjId").val(),
            dataType: "json",
            type : "GET",
            success : function(resp) {
                console.log(resp);
            }
        });
    })
</script>
</html>
