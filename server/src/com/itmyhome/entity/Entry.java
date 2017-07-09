package com.itmyhome.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table(name = "entry")
//订单条目描述表
public class Entry {
	
	//basic fields
	private int entryId;//主键 描述编号
	private String entryName;
	private String price;//对应价格
	private int count;//订购数量
	

	public String getEntryName(){
		return entryName;
	}
	public void setEntryName(String entryName){
		this.entryName = entryName;
	}
	//@Id
	//@Column(name = "entryId")
	public int getEntryId() {
		return entryId;
	}
	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}
	
	//@Column(name = "price", length = 20, nullable = false)
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	//@Column(name = "count", nullable = false)
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	//foreign
	
	//购物车-订单
	private Set<Order> orders = new HashSet<Order>();
	//@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "entry")
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	//购物车-商品
	private Set<Product> products = new HashSet<Product>();
	//@ManyToMany
	//@JoinTable(name = "entry_product",
	//		joinColumns = {@JoinColumn(name = "entryId")},
	//		inverseJoinColumns = {@JoinColumn(name = "proid")}
	//		)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
