package com.example.learnGit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.learnGit.Dao.ProductDao;
import com.example.learnGit.Service.ProductService;
import com.example.learnGit.model.ProductDetailsPOJO;

public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDao productDao;
	
	@Override
	public List<ProductDetailsPOJO> getProductDetails() {
		// TODO Auto-generated method stub
		return productDao.getProductDetails();
	}

}
