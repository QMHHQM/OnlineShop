package com.itmyhome.service;


import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmyhome.entity.Member;
import com.itmyhome.entity.User;

import edu.xjsoft.base.service.DefaultEntityManager;

@Service
@Transactional
public class UserService extends DefaultEntityManager<User>{
    
	public User getUserById(String userId,String password){
		String hql="from User where userId=? and password=?";
		return getEntityDao().findUnique(hql, userId,password);
	}

	public User findByUserId(String userId) {
		// TODO Auto-generated method stub
		String hql="from User where userId=?";
		return getEntityDao().findUnique(hql, userId);
	}

	public Collection<String> queryPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(readOnly=true)
	public User getUser(String loginName){
    		String hql="from User user where user.userName='"+loginName+"'";
	        return getEntityDao().findUnique(hql);
	}
}
