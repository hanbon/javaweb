package com.hello.frank.action;

import com.hello.frank.model.User;
import com.hello.frank.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		User user = userService.findUserByEmail("huanghx@travelsky.com");
		System.out.println(user.getName());
		return SUCCESS;
	}
	
}
