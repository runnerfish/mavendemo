package com.fish.ssh2.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fish.ssh2.dao.IUserDao;
import com.fish.ssh2.entity.User;

public class UserDaoImpl implements IUserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void AddUser(User user) {
		getSession().save(user);
	}

}
