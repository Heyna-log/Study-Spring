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
	<form action="" method="POST">
	    <table>
	        <tr>
	            <th>id</th>
	            <th>password</th>
	            <th>name</th>
	            <th>phone</th>
	        </tr>
	        
	        <tr>
	            <td><input type="text" name="id"></td>
	            <td><input type="password" name="pw"></td>
	            <td><input type="text" name="name"></td>
	            <td><input type="text" name="phone"></td>
	        </tr>
	        
	    </table>
	    <button type="submit">Join !</button>
	</form>
</body>
</html>