<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
<!DOCTYPE html>
-->
<html>
<head>
<!-- <meta charset="UTF-8"> --> 
<title>第一个Spring MVC实例</title>
</head>
<%
	String str = (String)request.getAttribute("helloWorld");
%>
<body>
	<H1><%=str%></H1>
</body>
</html>