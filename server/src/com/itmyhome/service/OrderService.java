package com.itmyhome.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmyhome.entity.Order;



import edu.xjsoft.base.service.DefaultEntityManager;

@Service
@Transactional
public class OrderService extends DefaultEntityManager<Order>{
	
	public List loadByTag(int tag){
		
		
		String hql="from Order order where order.tag=? ";
		List<Order> list=getEntityDao().findUnique(hql, tag);
		return list;
	}
 
public List loadByPrice(String payMent){
		
		
		String hql="from Order order where order.payment>? ";
		List<Order> list=getEntityDao().findUnique(hql, payMent);
		return list;
	}
}
