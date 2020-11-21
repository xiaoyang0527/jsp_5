<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/17
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <center>
        <h1>用户登录</h1>
        <h2 style="color: red">
            ${param.isfail=="unknown" ? "账号不存在" : ""}
            ${param.isfail=="error" ? "账号密码错误" : ""}
            ${param.isfail=="codeerror" ? "验证码错误" : ""}
            ${param.isfail=="other" ? "其他错误" : ""}
        </h2>
        <form action="loginctrl/login.do" method="post">
            用户名:
            <input type="text" name="username" placeholder="请输入用户名">
            <br><br>
            密码:
            <input type="password" name="userpassword" placeholder="请输入密码">
            <br><br>
            <input type="submit" value="登录">
        </form>

    </center>

</body>
</html>
