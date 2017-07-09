package com.itmyhome.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
//系统管理员信息
public class Admin {
	
	
	//basic fields
	
	private int adminId;//管理员编号 主键
	private String adminName;//分类名
	private String password;//密码
	private int permissions;//权限
	
	/*
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	*/
	
	@Id
	@Column(name = "adminId")
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	@Column(name = "adminName", length = 40, nullable = false)
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	@Column(name = "password", length = 30, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "permissions", nullable = false)
	public int getPermissions() {
		return permissions;
	}
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}
	
	
	//foreign
	private Set<User> users = new HashSet<User>();
	private Set<Product> products = new HashSet<Product>();
	private Set<Entry> entries = new HashSet<Entry>();
	
	@OneToMany
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	@OneToMany
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	@OneToMany
	public Set<Entry> getEntries() {
		return entries;
	}
	public void setEntries(Set<Entry> entries) {
		this.entries = entries;
	}
	
}
