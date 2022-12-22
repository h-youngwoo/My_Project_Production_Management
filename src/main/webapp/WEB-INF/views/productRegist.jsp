<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산 관리 등록 화면</title>
</head>
<body>
<fieldset>
<h1>생산 관리 등록 화면</h1>
<legend>생산 관리 등록 화면</legend>
    <form action="/registProcess"  method= "post">
	        제품 코드 <input type="text" name="product_code"> <br>
	        제품 이름 <input type="text" name="product_name"> <br>
	        제품 원가 <input type="number" name="manufacturing_cost"> <br>
	        목표 수량 <input type="number" name="goal_quantity"> <br>
	        재고 수량 <input type="text" name="stock"> <br>
	        출고가 <input type="text" name="selling_cost"> <br>
	        그룹 이름 <select name="group_code">
	        	<option value="A">컴퓨터</option>
	        	<option value="B">모바일</option>
	        	<option value="C">냉장고</option>
	        </select><br>
	   <input type="submit" value="등록">	   
    </form>
    <a href="/backmain"><button>메인 화면</button></a>
    </fieldset>
</body>
</html>