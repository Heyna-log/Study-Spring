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
	            <th>title</th>
	            <th>writer</th>
	            <th>content</th>
	        </tr>
	        <c:forEach items="${list}" var="u">
	        	<input type="hidden" name="id" value="${u.id}">
		        <tr>
		            <th><input type="text" name="title" value="${u.title}"></th>
		            <th><input type="text" name="writer" value="${u.writer}"></th>
		            <th><input type="text" name="content" value="${u.content}"></th>
		        </tr>
	        </c:forEach>
	    </table>
	    <button type="submit">UPDATE !</button>
	    <!-- <input type="button" name="" value="삭제" onclick="location.href='userList/delete/${id}'"> -->
	</form>
</body>
</html>