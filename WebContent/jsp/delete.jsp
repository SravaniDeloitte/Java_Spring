<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
<form:form id="deleteForm" modelAttribute="login" action="delete"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="username">Email ID</form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td align="left"><form:button id="delete" name="delete">Delete</form:button></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>