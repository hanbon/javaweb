package com.hello.frank.service;

import com.hello.frank.model.User;

public interface UserService {
	User findUserByEmail(String email);
}
