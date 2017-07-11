package com.itmyhome.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.itmyhome.entity.Entry;
import com.itmyhome.entity.Member;
import com.itmyhome.entity.Order;
import com.itmyhome.entity.Product;
import com.itmyhome.entity.User;
import com.itmyhome.service.EntryService;
import com.itmyhome.service.MemberService;
import com.itmyhome.service.OrderService;
import com.itmyhome.service.ProductService;
import com.itmyhome.service.UserService;

import edu.xjsoft.base.orm.support.Page;



@Controller
@RequestMapping("/entry/*")
public class EntryAction {
	@Resource
	private EntryService entryService;
	@Resource
	private UserService userService;
    @RequestMapping(value="save.do",method=RequestMethod.POST)
	public void save(@RequestParam("username") String name,@RequestParam("entryname") String entryName,@RequestParam("entryId")Integer entryId,@RequestParam("price") String price,HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("UTF-8");
    	User user=userService.getUser(URLDecoder.decode(name, "utf-8"));
	    Entry entry=entryService.getEntityByName(URLDecoder.decode(entryName, "utf-8"),price);
	    if(entry!=null){
	    	entry.setCount(entry.getCount()+1);
	    	entry.setEntryId(entry.getEntryId());
	    }
	    else {
	     	entry=new Entry();
			entry.setCount(1);
	    }
    	
		entry.setPrice(price);
	

		entryService.saveOrUpdate(entry);
		entry=entryService.getEntryById(entryId);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("entryid", entry.getEntryId());
	
		jsonObject.put("price", entry.getPrice().toString();
		
		jsonObject.put("count", String.valueOf(entry.getCount()));
		response.getWriter().println(jsonObject.toString());
	}
    @RequestMapping(value="{deleteentry.do}" ,method=RequestMethod.POST)
    public void delete(HttpServletResponse response,HttpServletRequest request) throws IOException{
    	int entryid=Integer.parseInt(request.getParameter("entryid"));
    	entryService.remove(entryid);
    	response.getWriter().println("success");
    }
    @RequestMapping(value="IsQuery.do",method=RequestMethod.POST)
    public void IsQuery(HttpServletResponse response) throws IOException{
    	List<Entry> entrys=entryService.loadAll();
    	if(entrys.size()>0){
        	response.getWriter().println("{\"result\":\"yes\"}");
    	}
    	else{
    		response.getWriter().println("{\"result\":\"no\"}");
    	}
    }
    @RequestMapping(value="list.do")
    public String entrylist(@RequestParam(defaultValue="1") Integer pageNo,Model model,HttpServletResponse response){
    	response.setCharacterEncoding("UTF-8");
    	Page<Entry> page=new Page<Entry>(5);
		page.setPageNo(pageNo);
		entryService.loadAll(page);
		model.addAttribute("page", page);
    	return "entry";
    }
    @RequestMapping(value="updatecounter.do")
    public String updatecount(@RequestParam("entryid") Integer entryId ,@RequestParam("entryName") String entryName ,@RequestParam("count") int count,@RequestParam("price") String price) throws UnsupportedEncodingException{
    	Entry entry=entryService.getEntityByName(URLDecoder.decode(entryName, "UTF-8"),price);
    	entry.setCount(count);
    	entry.setEntryId(entryId);
    	entryService.saveOrUpdate(entry);
    	return "entry";
    }
	
	
}
