package com.market.demo.controller.User;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
    UserService userService;
	@GetMapping("")
	public String index(Model model) {
		userService.login();
		return "hellotest";
	}

	@PostMapping("")
    @ResponseBody
	public ResponseEntity<Object> getAllUser() {
        List<User> users = userService.findAllUsers();
        return ControllerUtils.createSuccessResponseEntity(users, HttpStatus.OK);
	}

    @PostMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Object> findById(@PathVariable("id") Long userId) {
        if (null == userId)
            throw new IllegalArgumentException("Id is not exist");
	    User user = userService.findById(userId);
        return ControllerUtils.createSuccessResponseEntity(user, HttpStatus.OK);
    }




}
