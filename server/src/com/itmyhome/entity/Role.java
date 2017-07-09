package com.itmyhome.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Role {
    private Integer roleId;

    private String name;

    private String descriptions;
    
    private User user;
    
    private Set<Permission> permissions=new HashSet<>();

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
    
    
}