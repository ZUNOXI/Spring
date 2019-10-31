<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
    
<html>
<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>">
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.4.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>" async></script>
</head>
<body>
	<form action="login" class="login-form" method="post">
		<h1>Login</h1>
		<div class="txtb">
			<input type="text" name="id">
			<span data-placeholder="Username"></span>
		</div>	
		<div class="txtb">
			<input type="password" name="pw">
			<span data-placeholder="Password"></span>
		</div>
		<input type="submit" class="logbtn" value="Login">
		
		<div class="bottom-text">Don't have account?
			<a href="signupPage">Sign Up</a>
		</div>
	</form>
</body>
</html>
