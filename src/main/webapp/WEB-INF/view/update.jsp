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
	        <tr>
	            <th><input type="text" name="title" value="${post.title}"></th>
	            <th><input type="text" name="writer" value="${post.writer}"></th>
	            <th><input type="text" name="content" value="${post.content}"></th>
	        </tr>
	    </table>
       	<input type="hidden" name="id" value="${post.id}">
	    <button type="submit">UPDATE !</button>
	</form>
</body>
</html>