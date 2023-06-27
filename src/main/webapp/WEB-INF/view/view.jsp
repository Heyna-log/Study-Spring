<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW</title>
</head>
<body>
	<h1>VIEW</h1>
	<form action="" method="get">
	    <table>
	        <tr>
	            <th>title</th>
	            <th>writer</th>
	            <th>content</th>
	            <th>Registration Date</th>
	            <th>Update Date</th>
	        </tr>
        	<c:set var="id" value="${post.id}"></c:set>
	        <tr>
	            <td>${post.title}</td>
	            <td>${post.writer}</td>
	            <td>${post.content}</td>
	            <td>${post.regDate}</td>
	            <td>${post.updateDate}</td>
	        </tr>
	    </table>
	    <input type="hidden" name="id" value="${post.id}">
	    <input type="button" value="수정" onclick="location.href='/update/${id}'">
	    <input type="button" value="삭제" onclick="location.href='/delete/${id}'">
	</form>
</body>
</html>