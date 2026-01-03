package com.example.learnGit.Service;

import com.example.learnGit.model.ProductDetailsPOJO;

public interface OrderService {
	
	public ProductDetailsPOJO getOrderDetailsbyId(String prodDtl);
	
}
