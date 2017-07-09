package com.itmyhome.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//@Entity
//@Table(name="_order")
public class Order {
	
	//basic fields
	private int orderId;//订单编号
	private String orderNo;//生成订单的编号
	private String sendName;//收货姓名
	private String sendAddress;//收货地址
	private String sendZip;//收货邮编
	private String sendTel;//收货人电话
	private String payment;//付款方式
	private String meno;//备注说明
	private Date time;//订单生成时间
	private int tag;//订单处理标记
	
	//@Id
	//@Column(name = "orderId")
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
	//@Column(name = "orderNo", length = 50, nullable = false)
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	//@Column(name = "sendName", length = 40, nullable = false)
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	
	//@Column(name = "sendAddress", length = 200, nullable = false)
	public String getSendAddress() {
		return sendAddress;
	}
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}
	
	//@Column(name = "sendZip", length = 4, nullable = false)
	public String getSendZip() {
		return sendZip;
	}
	public void setSendZip(String sendZip) {
		this.sendZip = sendZip;
	}
	
	//@Column(name = "sendTel", length = 40, nullable = false)
	public String getSendTel() {
		return sendTel;
	}
	public void setSendTel(String sendTel) {
		this.sendTel = sendTel;
	}
	
	//@Column(name = "payment", length = 20, nullable = false)
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
	//@Column(name = "meno", length = 200, nullable = false)
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	
	//@Column(name = "time", nullable = false)
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	//@Column(name = "tag", nullable = false)
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	
	//foreign
	
	//多个订单对应一个用户 这里是manytoone
	private User user;
	//@ManyToOne(cascade = {CascadeType.ALL})
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	//
	private Entry entry;
	//@ManyToOne(cascade = {CascadeType.ALL})
	public Entry getEntry() {
		return entry;
	}
	public void setEntry(Entry entry) {
		this.entry = entry;
	}
	
	
}
