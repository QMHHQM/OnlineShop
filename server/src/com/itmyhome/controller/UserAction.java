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

import com.itmyhome.entity.User;
import com.itmyhome.service.UserService;

@Controller
@RequestMapping(value="/user/*")
public class UserAction {
	
	@Resource
    private UserService userService;
	
	@RequestMapping("regist.do")
	@ResponseBody
	public void regist(HttpServletRequest request,HttpServletResponse response){	 
		 JSONObject  jsonObject=JSONObject.fromObject(request.getParameter("user"));
	      User user=(User) jsonObject.toBean(jsonObject, User.class);
	      userService.saveOrUpdate(user);
	      response.setStatus(200);
	}
	
	@RequestMapping(value="login.do")
	private void loign(HttpSession session,@RequestParam("userId") String userId,@RequestParam("password") String password,HttpServletResponse response) {
		// TODO Auto-generated method stub
		SecurityUtils.getSubject().login(new UsernamePasswordToken(userId,password));
        User user=userService.getUserById(userId, password);
        try {
        	  if(user==null){
        			response.getWriter().println("{\"status\":\"error\"}");
        	  }else {
        		  session.setAttribute("userId", userId);
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
}
;