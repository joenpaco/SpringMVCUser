package com.joenpaco.daos;

import org.springframework.stereotype.Component;

import com.joenpaco.models.Login;
import com.joenpaco.models.User;

@Component
public interface UserDao {
	public abstract void register(User user);

	public abstract User validateUser(Login login);
}
