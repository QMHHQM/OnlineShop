package com.itmyhome.entity;

import java.util.HashSet;
import java.util.Set;

/**
@Entity
@Table(name="user")
//用户基本信息表
*/

public class User {
	
	//basic fields
	private int userId;//会员编号
	private String username;//会员名
	private String password;//密码
	private String realName;//真实姓名
	private String tel;//电话
	private String address;//地址
	private String zip;//邮政编码
	private String email;//电子邮件
	
	//一个用户所拥有的角色
	private Set<Role> roles=new HashSet<Role>();
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	//@Column(name = "userId")
	//@Id
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	//@Column(name = "username", length = 20, nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//@Column(name = "password", length = 30, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//@Column(name = "realName", length = 20, nullable = false)
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	//@Column(name = "tel", length = 40)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//@Column(name = "address", length = 200)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//@Column(name = "zip", length = 8)
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	//@Column(name = "email", length = 50)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//foreign
	
	//多个用户可以买多个商品 单向多对多 只在User这里写manytomany 不在Product处写manytomany 
	private Set<Product> products = new HashSet<Product>();
	//@ManyToMany
	//@JoinTable(name = "user_product",
	//		joinColumns = {@JoinColumn(name = "user_id")},
	//		inverseJoinColumns = {@JoinColumn(name = "product_id")}
	//		)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
	//一个用户可以产生多个订单 双向多对一 这里是一对多
	private Set<Order> orders = new HashSet<Order>();
	//@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "user")
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
