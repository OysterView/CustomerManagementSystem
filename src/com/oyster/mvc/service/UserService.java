package com.oyster.mvc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oyster.mvc.dao.UserDao;
import com.oyster.mvc.model.User;

@Service
public class UserService {
	@Resource
	private UserDao userDao;

	public void add(User user) {
		userDao.add(user);
	}

	public boolean exist(User user) {
		return userDao.findUser(user);
	}

	public boolean login(User user) {
		return userDao.userLogin(user);
	}
}
