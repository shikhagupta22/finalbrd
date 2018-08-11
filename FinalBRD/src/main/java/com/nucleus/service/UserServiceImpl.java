package com.nucleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.dao.UserDao;
import com.nucleus.entity.User;
@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
    UserDao userDao;
	@Override
	public void insert(User user) 
	{
		userDao.insert(user);
		
	}

}
