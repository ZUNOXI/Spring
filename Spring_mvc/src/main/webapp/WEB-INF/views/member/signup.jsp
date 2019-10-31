<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign Up</title>
</head>
<body>
	<form action="signup" method="post">
		<fieldset>
			<table>
				<caption>회원 동록</caption>
				<tr>
					<td>ID: </td>
					<td><input type="text" name="id" placeholder="Enter the id"></td>		
				</tr>
				<tr>
					<td>이름: </td>
					<td><input type="text" name="name" placeholder="Enter the name"></td>		
				</tr>
				<tr>
					<td>비밀번호: </td>
					<td><input type="password" name="pw" placeholder="Enter the password"></td>		
				</tr>
				<tr>
					<td>이메일: </td>
					<td><input type="text" name="email" placeholder="Enter the phone email"></td>
				</tr>
				<tr>
					<td>주소: </td>	
					<td><input type="text" name="addr" placeholder="Enter the address"></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td>		
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>