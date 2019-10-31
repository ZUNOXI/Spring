<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>명단</title>
</head>
<body>
	<h1>회원정보</h1>
	<table border="1">
		<tr>
			<th>ID</th><th>NAME</th><th>MAIL</th>
		</tr>
		<c:forEach items="${list }" var="mem">
			<tr>
				<td>${mem.id }</td>
				<td><a href="memselone?uid=${mem.id}">${mem.name }</a></td>
				<td>${mem.email }</td>
			</tr>
		</c:forEach>
	</table>
<a href="home.jsp">home</a>
</body>
</html>