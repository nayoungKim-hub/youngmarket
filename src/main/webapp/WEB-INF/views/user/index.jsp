<%--
  Created by IntelliJ IDEA.
  User: nyoung
  Date: 2020-09-03
  Time: 오후 3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <link rel="stylesheet" >
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <title>young2 market</title>
</head>
<body>

    <div id="root">
        <header id="header">
            <div id = header_box">
                <%@include file="header.jsp"%>
            </div>
        </header>

        <nav id="nav">
            <div id = nav_box">
                <%@include file="nav.jsp"%>
            </div>
        </nav>

        <section id = "container">
            <div id="container_box">
                본문~~~
            </div>
        </section>

        <footer id = "footer">
            <div id = footer_box">
                <%@include file="footer.jsp"%>
            </div>
        </footer>
    </div>
</body>
</html>
