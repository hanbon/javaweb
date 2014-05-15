package com.hello.frank.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hello.frank.dao.UserDao;
import com.hello.frank.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		List users = getHibernateTemplate().find("from User where email=?", email);
		return (User) users.get(0);
	}

}
