<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>전체 회원조회</title>
</head>
<body>
	<h1>상품 리스트</h1>
	<p>${login.id} 님 환영합니다.</p>
	<h1>전체 회원조회</h1>
	<table border="1">
		<tr>
			<th>회원 ID</th>
			<th>회원 이름</th>
			<th>회원 이메일</th>
			<th>회원 주소</th>
			<th></th>
		</tr>
		<c:forEach items="${memlist}" var="mem">
		<tr>
			<th>${mem.id }</th>
			<th>${mem.name }</th>
			<th>${mem.email }</th>
			<th>${mem.addr }</th>
			<th><a href="updatemem?id=${mem.id }">수정</a></th>
			<th><a href="deletemem?id=${mem.id }">삭제</a></th>
		</tr>
		</c:forEach>
	</table>
</body>
</html>