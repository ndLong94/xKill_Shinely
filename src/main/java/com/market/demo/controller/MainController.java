package com.market.demo.controller;

import com.market.demo.controller.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	@GetMapping("/")
	public String index(Model model) {
//		model.addAttribute("user", userService.findById(Long.valueOf("1")));
		return "hellotest";
	}



}
