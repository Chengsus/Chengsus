<%--
  Created by IntelliJ IDEA.
  User: 孙立源
  Date: 2024/12/26
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>教师注册信息</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-repeat:no-repeat;
            background-size:auto;
            background-position:center -33px;
            margin: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
        tr:hover {
            background-color: #f5f5f5;
        }

        .register-container {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 20px;

        }
        .register-container h2 {
            margin-bottom: 20px;
            text-align: center;
            font-size: 40px;
        }
    </style>
</head>
<body>
<div class="register-container">
    <h2>注册教师信息</h2>
    <table>
        <tr>
            <th>姓名</th>
            <td>${teacher.name}</td>
        </tr>
        <tr>
            <th>年龄</th>
            <td>${teacher.age}</td>
        </tr>
        <tr>
            <th>性别</th>
            <td>${teacher.sex?"男":"女"}</td>
        </tr>
        <tr>
            <th>职称</th>
            <td>${teacher.title}</td>
        </tr>
        <tr>
            <th>院系</th>
            <td>${teacher.department}</td>
        </tr>
        <tr>
            <th>党员</th>
            <td>${teacher.partyMember?"是":"否"}</td>
        </tr>
        <tr>
            <th>所授课程</th>
            <td>
                <c:forEach var="course" items="${teacher.courses}">
                    ${course} &nbsp;
                </c:forEach>
            </td>
        </tr>

    </table>
</div>
</body>
</html>


