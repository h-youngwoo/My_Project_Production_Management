package edu.mit.c301.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mit.c301.service.ProductManageService;
import edu.mit.c301.vo.ProductVO;

@Controller
public class ProductManagementController {
	
	private ProductManageService productManageService;
	
	public ProductManagementController(ProductManageService productManageService) {
		super();
		this.productManageService = productManageService;
	}

	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/backmain")
	public String backmain() {
		return "main";
	}
	
	@GetMapping("/productRegist")
	public void productRegist() {
		
	}
	
	@PostMapping("/registProcess")
	public String registProcess(ProductVO productVO) {
		return productManageService.registProuduct(productVO)?"successregist":"failregist";
	}
	
	@GetMapping("/productSearch")
	public void productSearch() {
		
	}
	
	@PostMapping("/searchProcess")
	public String searchProcess(Model model, String product_code) {
		model.addAttribute("resultinquiry",productManageService.inquiryProduct(product_code));
		return "resultsearch";
	}
	
//	@PostMapping("/modifyProduct")
//	public String modifyProduct(@RequestParam(value = "productCode") String productCode, ProductVO productVO) {
//		productManageService.deleteProduct(productCode);		
//		return productManageService.registProuduct(productVO)?"successmodify":"failmodify";
//	}
	
	@PostMapping("/modifyProduct")
	public String modifyProduct(ProductVO productVO, @RequestParam(value = "productCode") String productCode) {
		return productManageService.modifyProduct(productVO,productCode)?"successmodify":"failmodify";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam(value = "productCode") String productCode) {
		return productManageService.deleteProduct(productCode)?"successdelete":"faildelete";
	}
	
	
	@GetMapping("/priorityOfProduct")
	public void priorityOfProduct(Model model) {		
		model.addAttribute("priorityList", productManageService.priorityList());		
	}
	
	@GetMapping("/rankOfProfit")
	public void rankOfProfit(Model model) {
		model.addAttribute("ranklist", productManageService.rankOfProfit());
	}
	
	@GetMapping("/stockOfGroup")
	public void stockOfGroup(Model model) {
		model.addAttribute("stocklist", productManageService.stockOfGroup());
	}

}
