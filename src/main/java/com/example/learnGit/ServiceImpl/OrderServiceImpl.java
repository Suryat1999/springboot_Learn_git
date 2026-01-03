package com.example.learnGit.ServiceImpl;

import com.example.learnGit.Service.OrderService;
import com.example.learnGit.model.ProductDetailsPOJO;

public class OrderServiceImpl implements OrderService {

	@Override
	public ProductDetailsPOJO getOrderDetailsbyId(String prodDtl) {
		// TODO Auto-generated method stub

		ProductDetailsPOJO productDetailsPOJO = new ProductDetailsPOJO();
		
		productDetailsPOJO.setProdId(prodDtl);
		productDetailsPOJO.setProdName("Dove 3 in 1");
		productDetailsPOJO.setProdCatagery("Soap");
		productDetailsPOJO.setProdDescription("for Smooth Skin");

//cherry pick 2 		
		productDetailsPOJO.setOrderbyNo(2);
		
		return productDetailsPOJO;
	}

}
