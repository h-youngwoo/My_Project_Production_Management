<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>>이익 순위 제품 화면</title>
</head>
<body>
<h1>이익 순위 제품 화면</h1>
	<table>
		<tr><th>제품이름</th><th>총이익 금액</th></tr>
    <c:forEach items="${ranklist}" var="rank">
        <tr><td>${rank.product_name}</td><td>${rank.total_profit}</td></tr>
    </c:forEach>
	</table>
<a href="/backmain"><button>메인 화면</button></a>
</body>
</html>