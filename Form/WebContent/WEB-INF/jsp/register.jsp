<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Form Register</title>
</head>
<body>
	<form:form method="post" action="getUserInfo" >
		<table>
			<caption>User Register</caption>
			<tr>
				<td><form:hidden path="id" value="1001" /></td>
			</tr>
			<tr>
				<td><form:label path="userName">用户名</form:label></td>
				<td><form:input path="userName"/></td>
			</tr>
			<tr>
				<td><form:label path="password">密码</form:label></td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td><form:label path="gender">性别</form:label></td>
				<td>
					<form:radiobutton path="gender" label="男" value="0"/>
					<form:radiobutton path="gender" label="女" value="1"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="hoppies">爱好</form:label></td>
				<td><form:checkboxes path="hoppies" items="${hoppiesList}" /></td>
			</tr>
			<tr>
				<td><form:label path="country">国籍</form:label></td>
				<td>
					<form:select path="country"> 
						<form:option label="请选择--" value="none" />
						<form:options items="${countriesList}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td><form:label path="remark">备注</form:label></td>
				<td><form:textarea path="remark" cols="30" rows="3"></form:textarea></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset" /></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>