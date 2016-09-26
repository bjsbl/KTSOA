package ktsoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ktsoa.dubbo.service._UserService;
import ktsoa.model.User;
import ktsoa.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private _UserService _userService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public User test() {
		System.out.println(_userService.getUserDetail());
		User user = new User();
		user.setOid("1");
		user.setUid("2");
		user.setHeadimgurl("http://mp.wx.qq.com");
		userService.save(user);
		return user;
	}
}
