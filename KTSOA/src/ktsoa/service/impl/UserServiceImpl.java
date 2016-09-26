package ktsoa.service.impl;

import org.springframework.stereotype.Service;

import ktsoa.model.User;
import ktsoa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private User user;

	@Override
	public String save(User user) {
		// TODO Auto-generated method stub
		this.user = user;
		System.out.println(user.toString());
		return "success";
	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return user;
	}

}
