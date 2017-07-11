package com.itmyhome.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmyhome.entity.Product;

import edu.xjsoft.base.service.DefaultEntityManager;

@Service
@Transactional
public class ProductService extends DefaultEntityManager<Product>{
	
	//根据种类价格查询
	public List loadByPrice(String price){
		
		String hql=" from Product product where product.price=? group by product.sortId";
		List<Product> list= getEntityDao().findUnique(hql, price);
		return list;
	}
     
	//根据商品类型来查询
	public List loadBySortId(int sortId){
		
		String hql=" from Product product where product.price=? group by product.sortId";
		List<Product> list= getEntityDao().findUnique(hql, sortId);
		return list;
	}
}
