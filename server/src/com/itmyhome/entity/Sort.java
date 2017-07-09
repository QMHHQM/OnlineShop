package com.itmyhome.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table(name = "sort")
//分类信息表
public class Sort {
	
	
	//basic fields
	private int sorId;//产品分类编号
	private String sorName;//分类名
	
	//@Column(name = "sorId")
	//@Id
	public int getSorId() {
		return sorId;
	}
	public void setSorId(int sorId) {
		this.sorId = sorId;
	}
	
	//@Column(name = "sorName", length = 40, nullable = false)
	public String getSorName() {
		return sorName;
	}
	public void setSorName(String sorName) {
		this.sorName = sorName;
	}
	
	//foerign
	
	//一个分类下边有多个商品  知道分类可以知道他下边有哪些商品 知道某一件商品又能确定他属于哪一个分类
	//故为双向的onetomany manttoone
	
	private Set<Product> products = new HashSet<Product>();
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "sort")
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
