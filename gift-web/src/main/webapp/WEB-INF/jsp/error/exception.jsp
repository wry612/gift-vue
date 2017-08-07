<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误提示</title>
    <style>.error {
        color: red;
    }</style>
</head>
<body>

<div class="error">错误提示:[${exception.message}]</div>
</body>
</html>