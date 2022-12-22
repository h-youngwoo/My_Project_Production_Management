<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산 관리 조회 & 수정 화면</title>
</head>
<body>
<fieldset>
<h1>생산 관리 조회 & 수정 화면</h1>
<legend>생산 관리 조회 화면</legend>
    <form action="/searchProcess"  method= "post">
	        제품 코드 <input type="text" name="product_code"> <br>
	   <input type="submit" value="제품 조회">	   
    </form>
</fieldset>
</body>
</html>