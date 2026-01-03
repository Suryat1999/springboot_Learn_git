package com.example.learnGit.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.learnGit.Dao.OrdersDao;
import com.example.learnGit.Service.OrderService;
import com.example.learnGit.model.ProductDetailsPOJO;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrdersDao ordersDao;
	
	@Override
	public ProductDetailsPOJO getOrderDetailsbyId(String prodDtl) {
		// TODO Auto-generated method stub

		ProductDetailsPOJO productDetailsPOJO = ordersDao.getOrderDetailsbyId(prodDtl);
		
		return productDetailsPOJO;
	}

}
