package com.fish.ssh2.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fish.ssh2.dao.IUserDao;
import com.fish.ssh2.entity.User;
import com.fish.ssh2.service.IUserManage;

public class UserManageImpl implements IUserManage {
	
	private static final Log logger = LogFactory.getLog(UserManageImpl.class);
	
	@Resource  
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		logger.info("新增用户--->user.name:" +user.getName() + ";user.id:" + user.getId());
		userDao.AddUser(user);
	}
}
