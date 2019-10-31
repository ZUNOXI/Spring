<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>개인정보 조회</title>
</head>
<body>
	<h1>개인정보 조회</h1>
	<table border="1">
		<tr>
			<th>회원 ID</th>
			<th>회원 이름</th>
			<th>회원 이메일</th>
			<th>회원 주소</th>
		</tr>
		<tr>
			<th>${login.id }</th>
			<th>${login.name }</th>
			<th>${login.email }</th>
			<th>${login.addr }</th>
		</tr>
	</table>
	<p><a href="prodlistpage">상품 조회화면</a></p>
	<p><a href="memlistpage">전체 회원조회</a></p>
</body>
</html>