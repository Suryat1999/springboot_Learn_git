package com.example.learnGit.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learnGit.Service.ProductService;
import com.example.learnGit.model.ProductDetailsPOJO;

@RestController
public class ProductController {

	@Autowired
	public ProductService prodService;
	
	@GetMapping(value = "/getProductList")
	public List<ProductDetailsPOJO>  getProductList(ProductDetailsPOJO productDetailsPOJO) {	
		
		List<ProductDetailsPOJO> ProductDetailsLst = prodService.getProductDetails(); 
		
		return ProductDetailsLst;
		
	}
	
}
