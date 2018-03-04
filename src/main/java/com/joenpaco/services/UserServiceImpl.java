package com.joenpaco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joenpaco.daos.UserDao;
import com.joenpaco.models.Login;
import com.joenpaco.models.User;


@Component
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserDao userDao;
	
	public UserServiceImpl() {
	}

	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
