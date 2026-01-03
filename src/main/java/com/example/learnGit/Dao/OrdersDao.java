package com.example.learnGit.Dao;

import com.example.learnGit.model.ProductDetailsPOJO;

public interface OrdersDao {

	public ProductDetailsPOJO getOrderDetailsbyId(String prodDtl);
	
}
