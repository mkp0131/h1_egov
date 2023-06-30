<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloDetail</title>
</head>
<body>
	<h1>HelloDetail</h1>	
	<form action="helloModi.do" method="POST">
		<input name="regionId" value="${data.regionId}"/>
		<input name="regionName" value="${data.regionName}"/>
		<button type="submit">modify</button>
	</form>
	
</body>
</html>