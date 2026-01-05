package com.example.learnGit.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.learnGit.Dao.OrdersDao;
import com.example.learnGit.Dao.ProductDao;
import com.example.learnGit.model.ProductDetailsPOJO;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<ProductDetailsPOJO> getProductDetails() {
		// TODO Auto-generated method stub
		List<ProductDetailsPOJO> productDetailsLst = new ArrayList<ProductDetailsPOJO>();
		
		ProductDetailsPOJO productDetailsPOJO = new ProductDetailsPOJO();
		
		productDetailsPOJO.setProdId("0001");
		productDetailsPOJO.setProdName("Dove 3 in 1");
		productDetailsPOJO.setProdCatagery("Soap");
		productDetailsPOJO.setProdDescription("for Smooth Skin");
		productDetailsPOJO.setOrderbyNo(0);
		
		productDetailsLst.add(productDetailsPOJO);		
		return productDetailsLst;
	}

}
