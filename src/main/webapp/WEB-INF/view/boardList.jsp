<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD LIST</title>

<style>

</style>
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
        <c:forEach items="${boardList}" var="u">
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
    
    <!-- pagination -->
	<div id="paginationBox">
		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Prev</a></li>
			</c:if>	
			<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
				<li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> ">
					<a class="page-link" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')"> ${idx} </a>
				</li>
			</c:forEach>	
			<c:if test="${pagination.next}">
				<li class="page-item">
					<a class="page-link" href="#" onClick="fn_next('${pagination.range}', '${pagination.range}', '${pagination.rangeSize}')" >Next</a>
				</li>
			</c:if>
		</ul>
	</div>
    
    <script>
	    // 이전 버튼 이벤트	
		function fn_prev(page, range, rangeSize) {
			var page = ((range - 2) * rangeSize) + 1;
			var range = range - 1;
			
			var url = "${pageContext.request.contextPath}/boardList";
			url = url + "?page=" + page;
			url = url + "&range=" + range;
	
			location.href = url;
		}
	
	
	    // 페이지 번호 클릭
		function fn_pagination(page, range, rangeSize, searchType, keyword) {
			var url = "${pageContext.request.contextPath}/boardList";
			url = url + "?page=" + page;
			url = url + "&range=" + range;
	
			location.href = url;	
	
		}
	
	
		// 다음 버튼 이벤트
		function fn_next(page, range, rangeSize) {
			var page = parseInt((range * rangeSize)) + 1;
			var range = parseInt(range) + 1;
			
			var url = "${pageContext.request.contextPath}/boardList";
			url = url + "?page=" + page;
			url = url + "&range=" + range;
	
			location.href = url;
		}
    </script>
</body>
</html>