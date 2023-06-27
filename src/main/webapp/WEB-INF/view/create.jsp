<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CREATE</title>
</head>
<body>
	<h1>CREATE</h1>
	<form action="" method="POST">
	    <table>
	        <tr>
	            <th>title</th>
	            <th>writer</th>
	            <th>content</th>
	        </tr>
	        
	        <tr>
	            <td><input type="text" name="title"></td>
	            <td><input type="text" name="writer"></td>
	            <td><input type="text" name="content"></td>
	        </tr>
	        
	    </table>
	    <button type="submit">CREATE !</button>
	</form>
</body>
</html>