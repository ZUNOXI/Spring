<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
	
	$(function(){
		
		$("#ajaxbutton").on('click', function(){
		
			$.ajax({
				url: "<c:url value='/restboard'/>",
				type: "GET",
				success: function(res){
					
					var html = "";
					for(var i=0; i<res.length; i++){
						html += JSON.stringify(res[i].num) + "\t" + JSON.stringify(res[i].title) + "\t" + JSON.stringify(res[i].content) + "<br>";
					}
					$("#ajaxresult").html(html);
				}
			});
		});
	});
		
	</script>
</head>
<body>
	<h2>${message }</h2>
	<input type="button" id="ajaxbutton" value="눌러봐">
	
	<p id="ajaxresult"></p>
</body>
</html>

