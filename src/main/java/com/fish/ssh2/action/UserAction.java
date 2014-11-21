package com.fish.ssh2.action;

import javax.annotation.Resource;

import com.fish.ssh2.entity.User;
import com.fish.ssh2.service.IUserManage;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private User user;

	@Resource  
	private IUserManage userManage;
	

	public void setUserManage(IUserManage userManage) {
		this.userManage = userManage;
	}
	
	public IUserManage getUserManage() {
		return userManage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String addUser()
	{
		userManage.addUser(user);
		return "success";
	}
	
}
