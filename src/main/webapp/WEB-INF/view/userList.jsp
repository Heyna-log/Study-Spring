<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER LIST</title>
</head>
<body>
	<h1>USER LIST</h1>
    <table>
        <tr>
            <th>id</th>
            <th>password</th>
            <th>name</th>
            <th>phone</th>
            <th>VIEW</th>
        </tr>
        <c:forEach items="${list}" var="u">
	        <tr>
	            <td>${u.id}</td>
	            <td>${u.pw}</td>
	            <td>${u.name}</td>
	            <td>${u.phone}</td>
	            <td>
	            	<input type="button" value="VIEW" onclick="location.href='/view?id=${u.id}'">
	            </td>
	        </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/join">JOIN</a>
</body>
</html>