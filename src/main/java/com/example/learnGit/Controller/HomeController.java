package com.example.learnGit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learnGit.Service.OrderService;
import com.example.learnGit.model.ProductDetailsPOJO;

@RestController
public class HomeController {

	@Autowired
	public OrderService orderService;

	
	@PostMapping(value = "/insert")
	public String insertOrderDetails(ProductDetailsPOJO productDetailsPOJO) {
		
		
		return "Order Placed Successfull";
		
	}
	@GetMapping(value="/getOrderDetails")
	public ProductDetailsPOJO getDetails() {
		
		ProductDetailsPOJO productDetailsPOJO = new ProductDetailsPOJO();
		
		productDetailsPOJO.setProdId("0001");
		productDetailsPOJO.setProdName("Dove");
		productDetailsPOJO.setProdCatagery("Soap");
		productDetailsPOJO.setProdDescription("for Smooth Skin");
		productDetailsPOJO.setOrderbyNo(1);
		
		return productDetailsPOJO;
		
	}
	
	@GetMapping(value = "/getOrderById",params = "id")
 	public ProductDetailsPOJO getOrderDetailsbyId(String id) {
		
		ProductDetailsPOJO productDetailsPOJO = orderService.getOrderDetailsbyId(id);
		
		return productDetailsPOJO;
		
	}
	
	
}
