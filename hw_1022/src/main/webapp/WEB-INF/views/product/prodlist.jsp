<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>상품 리스트</h1>
	<p>${login.id} 님 환영합니다.</p>
	
	<table border="1">
		<tr>
			<th>상품번호</th>
			<th>상품이름</th>
			<th>상품가격</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${prodlist }" var="prod">
			<tr>
				<th><a href="detailprod?num=${prod.num}">${prod.num }</a></th>
				<th>${prod.name }</th>
				<th>${prod.price }</th>
			</tr>
		</c:forEach>
	</table>
	<p><a href="prodinsertpage">상품 등록</a></p>
</body>
</html>