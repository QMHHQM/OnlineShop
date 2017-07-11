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

import com.itmyhome.entity.Product;
import com.itmyhome.service.ProductService;

@Controller
@RequestMapping(value="/product/*")
public class ProductAction {
	
	@Resource
	private ProductService productService;
	 
	@RequestMapping(value="save.do")
	public void saveProduct(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("product"));
		Product product=new Product();
		productService.saveOrUpdate(product);
	
		
	}
	 
	@RequestMapping(value="remove.do")
      public void removeProduct(HttpServletRequest request,HttpServletResponse response){
    	  JSONObject jsonObject=JSONObject.fromObject(request.getParameter("product"));
    	  Product product= new Product();
    	  productService.remove(product.getProId());
    	  
    	  
      }
	
	@RequestMapping(value="queryById.do")
	 public void  queryProductById(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("product"));
		 Product product=new Product();
		 productService.load(product.getProId());
		 
		
	}

	@RequestMapping(value="queryByPrice.do")
	 public void  queryProductByPrice(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("product"));
		 Product product=new Product();
		 productService.loadByPrice(product.getPrice());
		 
		
	}
	
	@RequestMapping(value="queryBySortId.do")
	 public void  queryProductBySortId(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("product"));
		 Product product=new Product();
		 productService.loadBySortId(product.getSortId());
		 
		
	}
}
