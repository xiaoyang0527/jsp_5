<%@page language="java" pageEncoding="utf-8"
        isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

    <center>

        <h1>用户列表</h1>
        <table border="1" width="80%">
            <tr>
                <th>用户编号</th>
                <th>用户名称</th>
                <th>用户年龄</th>
                <th>用户性别</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${pageinfo.list}" var="u">
                <tr>
                    <td>${u.userId}</td>
                    <td>${u.userName}</td>
                    <td>${u.userAge}</td>
                    <td>${u.userSex}</td>
                    <td></td>
                </tr>
            </c:forEach>

            <tr style="text-align: center">
                <td colspan="5">
                    <a href="selectpage.do?pagenumber=${pageinfo.navigateFirstPage}">首页</a>
                    <a href="selectpage.do?pagenumber=${pageinfo.prePage}">上一页</a>
                    <a href="selectpage.do?pagenumber=${pageinfo.nextPage}">下一页</a>
                    <a href="selectpage.do?pagenumber=${pageinfo.navigateLastPage}">尾页</a>
                    当前${pageinfo.pageNum}/${pageinfo.pages}页，共${pageinfo.total}条
                </td>
            </tr>
        </table>

    </center>

</body>
</html>
