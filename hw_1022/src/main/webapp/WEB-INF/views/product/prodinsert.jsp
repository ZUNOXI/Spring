<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
</head>
<body>
	<form action="prodinsert" method="post">
		<fieldset>
			<table>
				<h1>Register</h1>
				<tr>
					<td>상품번호: </td>
					<td><input type="text" name="num" placeholder="Enter the num"></td>		
				</tr>
				<tr>
					<td>상품이름: </td>
					<td><input type="text" name="name" placeholder="Enter the name"></td>		
				</tr>
				<tr>
					<td>상품가격: </td>
					<td><input type="text" name="price" placeholder="Enter the price"></td>		
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td>		
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>