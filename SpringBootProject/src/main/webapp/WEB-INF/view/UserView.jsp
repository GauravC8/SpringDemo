<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User List</h1>
	<div>
		<table border=1>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
			</tr>
			<tr>
				<c:forEach items="${users}" var="user">
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
				</c:forEach>
			</tr>
		</table>
	</div>
</body>
</html>