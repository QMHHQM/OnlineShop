package com.itmyhome.security;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.itmyhome.entity.Role;
import com.itmyhome.entity.User;
import com.itmyhome.service.UserService;


public class RoleAuthority extends AuthorizingRealm{

	@Autowired
	private UserService userService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) { 
        String currentUsername = (String)super.getAvailablePrincipal(principals);
        
      List<String> roleList = new ArrayList<String>();  
      List<String> permissionList = new ArrayList<String>();  
      //从数据库中获取当前登录用户的详细信息  
      User user =new User();
	try {
		user = userService.findByUserId(currentUsername);
		System.out.println(user+"===="+user.getUserId());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      if(null != user){  
          //实体类User中包含有用户角色的实体类信息  
          if(null!=user.getRoles() && user.getRoles().size()>0){  
              //获取当前登录用户的角色  
              for(Role role : user.getRoles()){  
            	  System.out.println(user.getRoles().size());
                  roleList.add(role.getName());  
                  if(role.getName().equals("admin")){
                	  permissionList.add("manauser");
                	  System.out.println("manauser"+"----------");
                  }
              }  
          }  
      }else{  
          throw new AuthorizationException();  
      }  
      //为当前用户设置角色和权限  
      SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
      simpleAuthorInfo.addRoles(roleList);  
      simpleAuthorInfo.addStringPermissions(permissionList);   
      return simpleAuthorInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		 //获取基于用户名和密码的令牌  
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的  
        //两个token的引用都是一样的
        UsernamePasswordToken token = (UsernamePasswordToken)authcToken;  
        System.out.println("验证当前Subject时获取到token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));  
        User user;
		try {
			user=userService.findByUserId(token.getUsername());
		    if(null != user){  
		          AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(),user.getUsername());  
		          this.setSession("userId", user);  
		          return authcInfo;  
		      }else{  
		          return null;  
		      }  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}  
   
        //此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息  
        //说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)  
        //这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证  
       /* if("mike".equals(token.getUsername())){  
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("mike", "mike", this.getName());  
            this.setSession("currentUser", "mike");  
            return authcInfo;  
        }*/
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常  
        /*return null;  */
	}

	private void setSession(Object key, Object value) {
		// TODO Auto-generated method stub
		Subject currentUser = SecurityUtils.getSubject();  
        if(null != currentUser){  
            Session session = currentUser.getSession();  
            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");  
            if(null != session){  
                session.setAttribute(key, value);  
            }  
        }  
	}
  
}
