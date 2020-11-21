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
    <title>我的主页</title>
</head>
<body>

    <!--模拟数据123-->
    <center>
        <h1>我的主页</h1>
        <h2>
            欢迎，
            ${empty sessionScope.nowuser ? "游客":
            sessionScope.nowuser.username}
            ，来到我的主页
        </h2>

        <h3>
            <a href="logout.do" onclick="window.confirm
            ('是否确定退出系统？')">退出登录</a>

        </h3>

        <a href="userinfoctrl/test.do">测试用户登录拦截</a>

        <br>
        <br>
        <form action="userinfoctrl/upload.do" method="post"
              enctype="multipart/form-data">
            图片:<input type="file" name="upload">
            <input type="submit" value="提交">
        </form>

        <br>
        <br>
        <a href="userinfoctrl/selectpage.do">用户列表-分页</a>
    </center>

</body>
</html>
