package com.cr.training.service;

import com.cr.training.model.Login;
import com.cr.training.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		//add jdbc code
	}

	@Override
	public User validateUser(Login login) {
		User user = new User();
		user.setFirstname("test");
		user.setLastname("user");
		return user;
	}

	@Override
	public void delete(String emailid) {
		// TODO Auto-generated method stub
		
	}

}
