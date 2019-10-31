<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보 수정</title>
</head>
<body>
	<form action="memupdate" method="post">
		<fieldset>
			<table>
				<caption>회원 정보 수정</caption>
				<tr>
					<td>회원아이디: </td>
					<td><input type="text" name="id" value="${memid }" readonly></td>
				</tr>
				<tr>
					<td>회원비밀번호: </td>
					<td><input type="text" name="pw" placeholder="Enter the name"></td>		
				</tr>
				<tr>
					<td>회원이름: </td>
					<td><input type="text" name="name" placeholder="Enter the price"></td>		
				</tr>
				<tr>
					<td>회원이메일: </td>
					<td><input type="text" name="email" placeholder="Enter the phone company"></td>
				</tr>
				<tr>
					<td>회원주소: </td>
					<td><input type="text" name="addr" placeholder="Enter the phone company"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="수정"><input type="reset" value="취소"></td>		
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>