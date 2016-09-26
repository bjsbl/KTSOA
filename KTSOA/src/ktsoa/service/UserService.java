package ktsoa.service;

import ktsoa.model.User;

public interface UserService {

	public String save(User user);

	public User get(String id);

}
