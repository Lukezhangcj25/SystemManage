<%--
  Created by IntelliJ IDEA.
  User: ceshi
  Date: 2020/3/17
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="UTF-8">
    <!-- 使用Edge最新浏览器渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配， 浏览器内部虚拟一个容器，容器的宽度与设备的宽度相同
    width：默认宽度与设备宽度相同
    initial-scale：初始化缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!-- 上述3个meta标签必须放在最前面 -->
    <title>用户信息管理系统</title>

    <!-- 导入CSS全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery导入，建议使用1.9以上版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>

    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td,th{
            text-align:center;
        }
    </style>
</head>
<body>
<div class="containe">
    <h3 style="...">用户信息列表</h3>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>生日</th>
            <th>居住地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${residentAccounts}" var="residentAccount" varStatus="s">
            <tr>
                <td>${s.count}</td>
                <td>${s.Name}</td>
                <td>${s.Gender}</td>
                <td>${s.Birthday}</td>
                <td>${s.IdentityCard}</td>
                <td>${s.OfficialAddres}</td>
                <td><a class="btn btn-default btn-sm" href="update.html">修改</a><a class="btn btn-default btn-sm" href="">删除</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.html">新增</a></td>
        </tr>
    </table>
</div>

</body>
</html>
