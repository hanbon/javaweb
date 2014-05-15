package com.hello.frank.service.impl;

import com.hello.frank.dao.UserDao;
import com.hello.frank.model.User;
import com.hello.frank.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		User user = userDao.findUserByEmail(email);
		return user;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
