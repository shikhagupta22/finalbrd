package com.nucleus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.entity.Role;
import com.nucleus.entity.User;
import com.nucleus.passwordencryption.PasswordEncoder;
@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
    SessionFactory sessionFactory;
	@Autowired
	Role role;
	@Autowired
	PasswordEncoder encode;
	@Override
	public void insert(User user) 
	{
		role.setrId("100");
		role.setrName("ROLE_USER");
		user.setRole(role);
		String password=user.getPassword();
		String hashedPassword=encode.generatePassword(password);
		user.setPassword(hashedPassword);
		sessionFactory.getCurrentSession().save(user);
	}

}
