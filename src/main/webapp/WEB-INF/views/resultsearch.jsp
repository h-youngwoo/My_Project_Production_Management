<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산 관리 조회  수정 화면</title>
</head>
<body>
<fieldset>
<h1>생산 관리 조회  & 수정 화면</h1>
<legend>생산 관리 조회 화면</legend>

<form action="/modifyProduct" method="post">
제품 코드 ${resultinquiry.product_code} <input type="text" name="product_code"><br>
제품 이름 ${resultinquiry.product_name} <input type="text" name="product_name"><br>
제품 원가 ${resultinquiry.manufacturing_cost} <input type="number" name="manufacturing_cost"><br>
목표 수량 ${resultinquiry.goal_quantity}  <input type="number" name="goal_quantity"><br>
재고 수량 ${resultinquiry.stock} <input type="text" name="stock"><br>
출고가 ${resultinquiry.selling_cost} <input type="text" name="selling_cost"><br>
그룹이름 ${resultinquiry.group_name} <select name="group_code">
								      <option value="A">컴퓨터</option>
								      <option value="B">모바일</option>
								      <option value="C">냉장고</option>
							      </select><br><br>

<input type="hidden" name="productCode" value= "${resultinquiry.product_code}">
<br>

<input type="submit" value="수정">
</form>
<a href="/delete?productCode=${resultinquiry.product_code}"><button>삭제</button></a>
<a href="/productSearch"><button>다른 제품 검색</button></a>
<a href="/backmain"><button>메인 화면</button></a>
</fieldset>
</body>
</html>