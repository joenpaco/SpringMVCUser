package com.joenpaco.daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.joenpaco.mappers.UserMapper;
import com.joenpaco.models.Login;
import com.joenpaco.models.User;


@Component
public class UserDaoImpl implements UserDao {
	
	@SuppressWarnings("unused")
	private static Logger logger = LogManager.getLogger();
	
    @SuppressWarnings("unused")
	@Autowired
    private Environment environment;

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl() {
	}

	@Autowired
	private UserMapper userMaper;

	@Override
	public void register(User user) {
		String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
		
	}

	@Override
	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, userMaper);
		return users.size() > 0 ? users.get(0) : null;
	}

}
