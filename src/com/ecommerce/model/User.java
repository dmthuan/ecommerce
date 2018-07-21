package com.ecommerce.model;

public class User {

	private String name;
	
	private String email;

	private GroupList group;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GroupList getGroup() {
		return group;
	}

	public void setGroup(GroupList group) {
		this.group = group;
	}
}
