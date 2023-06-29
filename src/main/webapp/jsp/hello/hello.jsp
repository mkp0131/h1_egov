<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    <h1>Hello</h1>
    <form action="helloPost.do">
    	<input name="regionId" placeholder="regionId" />
    	<input name="regionName" placeholder="regionName" />
    	<button type="submit">실행</button>
    </form>

    	<c:forEach var="result" items="${regionList}" varStatus="status">
    		<li>${status.index}| ${result.regionId} | <c:out value="${result.regionId}"/> | <c:out value="${result.regionName}"/></li>
    	</c:forEach>
    	

    
</body>
</html>