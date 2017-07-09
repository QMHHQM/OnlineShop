package com.itmyhome.service;


import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmyhome.entity.Admin;

import com.itmyhome.entity.User;

import edu.xjsoft.base.service.DefaultEntityManager;

@Service
@Transactional
public class AdminService extends DefaultEntityManager<Admin>{
    
	public User getAdminById(String adminId,String password){
		String hql="from Admin where adminId=? and password=?";
		return getEntityDao().findUnique(hql, adminId,password);
	}

	public User findByAdminId(String adminId) {
		// TODO Auto-generated method stub
		String hql="from User where adminId=?";
		return getEntityDao().findUnique(hql, adminId);
	}

	public Collection<String> queryPermissions(String adminname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(readOnly=true)
	public User getAdmin(String loginName){
    		String hql="from Admin admin where admin.adminName='"+loginName+"'";
	        return getEntityDao().findUnique(hql);
	}
}
