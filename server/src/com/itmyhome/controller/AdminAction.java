package com.itmyhome.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itmyhome.entity.Admin;
import com.itmyhome.entity.Order;
import com.itmyhome.entity.User;
import com.itmyhome.service.AdminService;
import com.itmyhome.service.UserService;

@Controller
@RequestMapping(value="/admin/*")
public class AdminAction {
	
	@Resource
    private AdminService adminService;

	@Resource
    private UserService userService;
	
	
	@RequestMapping("regist.do")
	@ResponseBody
	public void regist(HttpServletRequest request,HttpServletResponse response){	 
		 JSONObject  jsonObject=JSONObject.fromObject(request.getParameter("admin"));
	      Admin admin=(Admin) jsonObject.toBean(jsonObject, Admin.class);
	      adminService.saveOrUpdate(admin);
	      response.setStatus(200);
	}
	
	@RequestMapping(value="login.do")
	private void loign(HttpSession session,@RequestParam("adminId") String adminId,@RequestParam("password") String password,HttpServletResponse response) {
		// TODO Auto-generated method stub
		SecurityUtils.getSubject().login(new AdminnamePasswordToken(adminId,password));
        Admin admin=adminService.getAdminById(adminId, password);
        try {
        	  if(admin==null){
        			response.getWriter().println("{\"status\":\"error\"}");
        	  }else {
        		  session.setAttribute("userId", adminId);
        		  response.getWriter().println("{\"status\":\"ok\"}");
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			response.setStatus(200);
		}
      
	}
	
	@RequestMapping(value="logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:index";
	}
	
	
	@RequestMapping(value="saveUser.do")
	public void saveUser(HttpServletRequest request,HttpServletResponse response){
		JSONObject.fromObject(request.getParameter("user"));
		User user=new User();
		userService.saveOrUpdate(user);;
		
	
		}
	@RequestMapping(value="removeUser.do")
	public void removeOrder(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		User user=new User();
		userService.remove(user.getUserId());
		
	
		}
	
	@RequestMapping(value="queryByUserId.do")
	public void queryOrderByOrderId(HttpServletRequest request,HttpServletResponse response){
		JSONObject jsonObject=JSONObject.fromObject(request.getParameter("order"));
		User user=new User();
		userService.load(user.getUserId());
		
	
		}
	
}
;