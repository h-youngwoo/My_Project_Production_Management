package edu.mit.c301.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mit.c301.dao.ProductDAO;
import edu.mit.c301.vo.ProductVO;

@Service
public class ProductManageServiceImpl implements ProductManageService {

	private ProductDAO dao;

	@Autowired
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean registProuduct(ProductVO productVO) {
		return dao.registProduct(productVO)==1?true:false;
	}

	@Override
	public ProductVO inquiryProduct(String productCode) {
		return dao.inquiryProduct(productCode);
	}

	@Override
	public boolean modifyProduct(ProductVO productVO, String productCode) {
		return dao.modifyProduct(productVO, productCode)==1?true:false;
	}

	@Override
	public boolean deleteProduct(String productCode) {
		return dao.deleteProduct(productCode)==1?true:false;
	}

	@Override
	public List<ProductVO> priorityList() {
		return dao.priorityList();
	}

	@Override
	public List<ProductVO> rankOfProfit() {
		return dao.rankOfProfit();
	}

	@Override
	public List<ProductVO> stockOfGroup() {
		return dao.stockOfGroup();
	}

}
