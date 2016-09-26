package ktsoa.dubbo.service.impl;

import java.util.UUID;

import com.alibaba.dubbo.config.annotation.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ktsoa.dubbo.service._UserService;
import ktsoa.model.User;

@Service(version = "1.0")
public class _UserServiceImpl implements _UserService {

	// @Autowired
	// private UserService userService;

	@Override
	public String getUserDetail() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUid(Math.random() + "");
		user.setOid(UUID.randomUUID().toString());
		// userService.save(user);
		// String id = "1";
		// return userService.get(id).toString();
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "error";
		}
	}

}
