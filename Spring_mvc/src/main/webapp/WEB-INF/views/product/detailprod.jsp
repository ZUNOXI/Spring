<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>상품 상세페이지</title>
</head>
<body>
	<h1>상품 상세 리스트</h1>
	<table border="1">
		<tr>
			<th>상품번호</th>
			<th>상품이름</th>
			<th>상품가격</th>
			<th>제조회사</th>
		</tr>
			<tr>
				<th>${product.num }</th>
				<th>${product.name }</th>
				<th>${product.price }</th>
				<th>${product.com }</th>
			</tr>
	</table>
	<p><a href="prodlistpage">전체 상품 조회</a></p>
	<p><a href="memberpage">개인 정보조회</a></p>
</body>
</html>