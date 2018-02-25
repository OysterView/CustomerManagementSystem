package com.oyster.mvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.oyster.mvc.model.User;

@Repository
public class UserDao {
	@Resource
	private HibernateTemplate hibernateTemplate;

	public void add(User u) {
		hibernateTemplate.save(u);
	}

	public boolean findUser(User u) {
		List<?> list = hibernateTemplate.find("from User u where u.name=?",
				u.getName());
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean userLogin(User u) {
		List<?> list = hibernateTemplate.find(
				"from User u where u.name=? and u.password=?", u.getName(),
				u.getPassword());
		if (list.size() > 0) {
			return true;
		}
		return false;
	}
}
