<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>
</head>
<body>
	<h1>INDEX</h1>
	<h2><c:out value="${data}"></c:out></h2>
	<form action="/result" method="post">
		<span>Enter a value1 : </span><input type="text" name="value1"><br>
		<span>Enter a value2 : </span><input type="text" name="value2"><br>
		<br>
		<button type="submit">Check Parameters !</button>
	</form>
	<a href="/boardList">BOARD LIST</a>
</body>
</html>