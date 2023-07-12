<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
</head>
<body>
	<h1>JOIN</h1>
	<form action="joinForm/join" method="post">
		<span>ID : </span><input type="text" name="email"><br>
		<span>PW : </span><input type="password" name="password"><br>
		<span>NICKNAME : </span><input type="text" name="nickname"><br>
		<br>
		<button type="submit">JOIN !</button>
	</form>
<!-- 	<a href="/boardList">BOARD LIST</a> -->
</body>
</html>