package com.itmyhome.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmyhome.entity.Order;
import com.itmyhome.service.OrderService;



@Controller
@RequestMapping(value="/order/*")
public class OrderAction {
	
	@Resource
	private OrderService orderService;
	 
	@RequestMapping(value="saveOrder.do")
	public void saveOrder(HttpServletRequest request,HttpServletResponse response){
		JSONObject.fromObject(request.getParameter("order"));
		Order order=new Order();
		orderService.saveOrUpdate(order);;
		
	
		}
	@RequestMapping(value="removeOrder.do")
	public void removeOrder(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		Order order=new Order();
		orderService.remove(order.getOrderId());
		
	
		}
	
	@RequestMapping(value="queryByOrderId.do")
	public void queryOrderByOrderId(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		Order order=new Order();
		orderService.load(order.getOrderId());
		
	
		}
	
	@RequestMapping(value="queryByOrderTag.do")
	public void queryOrderByTag(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		Order order=new Order();
		orderService.loadByTag(order.getTag());
		
	
		}
	
	@RequestMapping(value="queryByTime.do")
	public void queryOrderByTime(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		Order order=new Order();
		orderService.loadByPrice(order.getPayment());
		
	
		}
}
