<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD LIST</title>
</head>
<body>
	<h1>BOARD LIST</h1>
    <table>
        <tr>
            <th>Title</th>
            <th>Writer</th>
            <th>Content</th>
            <th>Registration Date</th>
            <th>VIEW</th>
        </tr>
        <c:forEach items="${list}" var="u">
	        <tr>
	            <td>${u.title}</td>
	            <td>${u.writer}</td>
	            <td>${u.content}</td>
	            <td>${u.regDate}</td>
	            <td>
	            	<input type="button" value="VIEW" onclick="location.href='/view?id=${u.id}'">
	            </td>
	        </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/create">CREATE POST</a>
</body>
</html>