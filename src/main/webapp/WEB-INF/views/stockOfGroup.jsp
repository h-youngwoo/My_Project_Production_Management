<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우선 생산 제품 화면</title>
</head>
<body>
<h1>우선 생산 제품 화면</h1>
	<table>
		<tr><th>그룹 이름</th><th>재고 수량</th></tr>
    <c:forEach items="${stocklist}" var="stock">
        <tr><td>${stock.group_name}</td><td>${stock.count}</td></tr>
    </c:forEach>
	</table>
</body>
<a href="/backmain"><button>메인 화면</button></a>
</html>