package com.example.learnGit.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnGit.model.ProductDetailsPOJO;

@RestController
public class HomeController {

	
	@PostMapping(value = "/insert")
	public String insertOrderDetails(ProductDetailsPOJO productDetailsPOJO) {
		
		
		return "Order Placed Successfull";
		
	}
	
}
