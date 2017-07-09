package com.itmyhome.entity;

public class Permission {
    private Integer perId;

    private String name;

    private String descriptions;
    
    private Role role;
    

    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}
    
    
}