package edu.mit.c301.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.mit.c301.vo.ProductVO;

public interface ProductDAO {
	//1. 제품  입력
	int registProduct(ProductVO productVO);
	
	//2-1. 제품 조회
	ProductVO inquiryProduct(String productCode);
	
	//2-2. 제품 수정
	int modifyProduct(@Param(value="ProductVO")ProductVO productVO,@Param(value="productCode")String productCode);
	
	//2-3. 제품 삭제
	int deleteProduct(String productCode);
	
	//3. 우선 생산 제품
	List<ProductVO> priorityList();
	
	//4. 이익 순위 제품
	List<ProductVO> rankOfProfit();
	
	//5. 그룹별 재고 수량
	List<ProductVO> stockOfGroup();
}
