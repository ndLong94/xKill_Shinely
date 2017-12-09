package com.market.demo.controller.User;

import com.market.demo.config.Controller.ControllerUtils;
import com.market.demo.domain.User;
import com.market.demo.dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping("/{userId}")
    @ResponseBody
    public ResponseEntity<Object> findById(@PathVariable("id") Long userId) {
        if (null == userId)
            throw new IllegalArgumentException("User Id is not exist");
	    User user = userService.findById(userId);
        return ControllerUtils.createSuccessResponseEntity(user, HttpStatus.OK);
    }
    
    @PutMapping("/add")
	public String addUser(@RequestBody @Valid UserDTO user) {
    	userService.save(new User(user));
		return "redirect:/user";
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody @Valid UserDTO user) {
		userService.save(new User(user));
		return "redirect:/product";
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Object> deleteUser(@PathVariable("userId") Long userId) {
		if (null == userId)
			throw new IllegalArgumentException("User Id is not exist");
		userService.delete(userId);
			return ControllerUtils.createSuccessResponseEntity("Delete successfully", HttpStatus.OK);
	}



}
