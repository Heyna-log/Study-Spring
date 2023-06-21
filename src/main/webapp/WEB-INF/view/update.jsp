<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE</title>
</head>
<body>
	<h1>UPDATE</h1>
	<form action="/update" method="POST">
	    <table>
	        <tr>
	            <th>id</th>
	            <th>password</th>
	            <th>name</th>
	            <th>phone</th>
	        </tr>
	        <c:forEach items="${list}" var="u">
		        <tr>
		            <th><input type="text" name="id" value="${u.id}"></th>
		            <th><input type="password" name="pw" value="${u.pw}"></th>
		            <th><input type="text" name="name" value="${u.name}"></th>
		            <th><input type="text" name="phone" value="${u.phone}"></th>
		        </tr>
	        </c:forEach>
	    </table>
	    <button type="submit">Update !</button>
	    <!-- <input type="button" name="" value="삭제" onclick="location.href='userList/delete/${id}'"> -->
	</form>
</body>
</html>