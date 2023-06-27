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
	        <c:forEach items="${list}" var="u">
	        	<c:set var="id" value="${u.id}"></c:set>
		        <tr>
		            <td>${u.title}</td>
		            <td>${u.writer}</td>
		            <td>${u.content}</td>
		            <td>${u.regDate}</td>
		            <td>${u.updateDate}</td>
		        </tr>
			    <input type="hidden" name="id" value="${u.id}">
	        </c:forEach>
	    </table>
	    <input type="button" value="수정" onclick="location.href='/update/${id}'">
	    <input type="button" value="삭제" onclick="location.href='/delete/${id}'">
	</form>
</body>
</html>