package ktsoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ktsoa.dubbo.service._UserService;


@RequestMapping("/userc")
@Controller
public class UserClientController {

	@Autowired
	private _UserService _userService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		return _userService.getUserDetail();
	}
}
