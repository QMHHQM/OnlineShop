package com.itmyhome.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name="product")
//商品信息
public class Product {
	
	//basic fields
	private int proId;//产品编号
	private String proName;//产品名称
	private int saleCount;//销售数量
	private String image;//图片路径
	private String price;//成本价格
	private String salePrice;//销售价格
	private String descript;//产品介绍
	private Date saleDate;//销售时间
	private int sortId;//商品类别

	//@Column(name = "proName", length = 20, nullable = false)
	public int getSortId() {
		return sortId;
	}
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	//@Id
	//@Column(name = "proId")
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	
	//@Column(name = "proName", length = 60, nullable = false)
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	//@Column(name = "saleCount", nullable = false)
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	
	//@Column(name = "image", length = 100)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	//@Column(name = "price", length = 40, nullable = false)
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	//@Column(name = "salePrice", length = 40, nullable = false)
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	
	//@Column(name = "descript")
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	
	//@Column(name = "saleDate")
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	
	//foreign
	
	//多个商品对应一种分类
	private Sort sort;
	//@ManyToOne(cascade = {CascadeType.ALL})
	public Sort getSort() {
		return sort;
	}
	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	//一个商品可以出现在多个订单条目描述表里
	private Set<Entry> entries = new HashSet<Entry>();
	//@ManyToMany(mappedBy = "products")
	public Set<Entry> getEntries() {
		return entries;
	}
	public void setEntries(Set<Entry> entries) {
		this.entries = entries;
	}

	
}
