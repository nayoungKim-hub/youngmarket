<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nyoung
  Date: 2020-09-17
  Time: 오후 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 가입</title>
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <style>
        table {
            table-layout: fixed;
            word-break: break-all;
        }
    </style>
</head>
<body>
    <%@include file="header.jsp"%>
    <div class = "container">
        <table style="margin: 20px";>
            <tr>
                <td style="width: 85%;">
                    <h1>회원 가입</h1>
                    <form:form method="get">
                        <div class="form-group">
                            <label for ="id">아이디: </label>
                            <form:input path="id" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="password" >비밀번호: </label>
                            <form:input path="password" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>비밀번호 확인: </label>
                            <form:input path="password2" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="address">주소: </label>
                            <form:input path="address" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="phone">핸드폰 번호: </label>
                            <form:input path="phone" class="form-control"/>
                        </div>
                    </form:form>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>
