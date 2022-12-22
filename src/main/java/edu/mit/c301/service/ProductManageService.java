package edu.mit.c301.service;

import java.util.List;

import edu.mit.c301.vo.ProductVO;

public interface ProductManageService {
	
	//1. 제품 등록
	boolean registProuduct(ProductVO productVO);
	//true: 등록 성공, false: 등록 실패
	
	//2. 제품 조회
	ProductVO inquiryProduct(String productCode);
	
	//2-1. 제품 수정
	boolean modifyProduct(ProductVO productVO,String productCode);
	//true: 수정 성공, false: 수정 실패
	
	//2-2. 제품 삭제
	boolean deleteProduct(String productCode);
	//true: 수정 성공, false: 수정 실패
	
	//3. 우선 생산 제품
	List<ProductVO> priorityList();
	
	//4. 이익 순위 제품
	List<ProductVO> rankOfProfit();
	
	//5. 그룹별 재고 수량
	List<ProductVO> stockOfGroup();

}
