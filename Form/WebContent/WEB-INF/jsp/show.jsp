<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<title>Form Show</title>
</head>
<body>
	<table>
		<tr><td>id:</td><td>${id}</td></tr>
		<tr><td>userName:</td><td>${userName}</td></tr>
		<tr><td>password:</td><td>${password}</td></tr>
		<tr><td>gender:</td><td>${(gender==0?'男':'女')}</td></tr>
		<tr><td>hoppies:</td><td>
			<% 
				String[] hoppies=(String[])request.getAttribute("hoppies");
				for(String hoppy:hoppies){
					out.println(hoppies);
				}
			%>>
		</td></tr>
		<tr><td>country:</td><td>${country}</td></tr>
		<tr><td>remark:</td><td>${remark}</td></tr>
	</table>
</body>
</html>