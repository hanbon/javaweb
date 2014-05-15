package com.hello.frank.dao;

import com.hello.frank.model.User;

public interface UserDao {
	User findUserByEmail(String email);
}
