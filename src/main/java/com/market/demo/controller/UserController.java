package com.market.demo.controller;

import com.market.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@Autowired
    UserService userService;
	@GetMapping("/")
	public String index(Model model) {
		userService.login();
		return "hellotest";
	}


}
