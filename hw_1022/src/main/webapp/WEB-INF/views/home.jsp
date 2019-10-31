<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<!-- <h1><a href ="login">로그인하기</a></h1> -->

<form action="login" method="post" class="login-form">
	<h1>Login</h1>
	<div>
		<span>ID : </span>
		<input type="text" name="id">
		<span data-placeholder="username"></span>
	</div>
	<div>
		<span>PW : </span>
		<input type="text" name="pw">
		<span data-placeholder="passward"></span>
	</div>
	<button type="submit" value="로그인">login</button>
	<button type="reset" value="초기화">reset</button>
	<div >
		<a href="signupPage">Sign Up</a>
	</div>
</form>
</body>
</html>
