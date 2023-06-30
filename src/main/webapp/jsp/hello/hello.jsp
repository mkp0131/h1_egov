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
    		<li>
    			<a href="helloDetail.do?id=${result.regionId}">
	    			${status.index}| ${result.regionId} | <c:out value="${result.regionId}"/> | <c:out value="${result.regionName}"/>
    			</a>
    			<button onclick="deleteItem('${result.regionId}')">삭제</button>
    		</li>
    	</c:forEach>
    	

    <script>
    	function deleteItem(id) {
    		location.href = "helloDelete.do?id=" + id;
    	}
    </script>
</body>
</html>