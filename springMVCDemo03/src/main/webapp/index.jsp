<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/9
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>hello springmvc</p>

<h3><a href="student/hello">RequestMapping注在类上</a></h3>

<h3><a href="hello">RequestMapping注在方法上</a></h3>

<h3><a href="anno/requestParam?name=aaa">RequestParam注解</a></h3>

<h3><a href="anno/PathVariable/发生">PathVariable注解</a></h3>

<h3><a href="anno/PathVariable/ada">PathVariable注解</a></h3>

<h3><a href="anno/sessionAttributes">sessionAttributes注解</a></h3>

<h3><a href="anno/getSessionAttributes">sessionAttributes注解</a></h3>

<h3><a href="anno/delSessionAttributes">sessionAttributes注解</a></h3>

<label>Test paramsBind/account</label><br>
<form action="paramsBind/account" method="post">
    用户名：<input type="text" name="name">
    余额：<input type="text" name="balance">
    姓名：<input type="text" name="user.uName">
    年龄：<input type="text" name="user.age">
    <input type="submit">
    <br>
</form>

<label>Test paramsBind/listAndMap</label><br>
<form action="paramsBind/listAndMap" method="post">
    <label>list:</label>
    姓名：<input type="text" name="list[0].uName">
    年龄：<input type="text" name="list[0].age">
    姓名：<input type="text" name="list[1].uName">
    年龄：<input type="text" name="list[1].age">
    <br>
    <label>map:</label>
    姓名：<input type="text" name="map['one'].uName">
    年龄：<input type="text" name="map['one'].age">
    姓名：<input type="text" name="map['two'].uName">
    年龄：<input type="text" name="map['two'].age">
    <input type="submit">
</form>

<label>Test paramsBind/user</label><br>
<form action="paramsBind/user" method="post">
    姓名：<input type="text" name="uName">
    年龄：<input type="text" name="age">
    生日：<input type="text" name="birthday">
    <input type="submit">
    <br>
</form>

<label>Test anno/requestBody</label><br>
<form action="anno/requestBody" method="post">
    姓名：<input type="text" name="uName">
    年龄：<input type="text" name="age">
    生日：<input type="text" name="birthday">
    <input type="submit">
    <br>
</form>

<label>Test anno/ModelAttribute</label><br>
<form action="anno/modelAttribute" method="post">
    姓名：<input type="text" name="uName">
    年龄：<input type="text" name="age">
    <input type="submit">
    <br>
</form>


<label>Test anno/modelAttributeParam</label><br>
<form action="anno/modelAttributeParam" method="post">
    姓名：<input type="text" name="uName">
    年龄：<input type="text" name="age">
    <input type="submit">
    <br>
</form>
</body>
</html>
