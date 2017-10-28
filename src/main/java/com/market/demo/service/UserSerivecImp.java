package com.market.demo.service;

import com.market.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.repository.UserRepository;

@Service
public class UserSerivecImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void login() {

	}

	@Override
	public void logout() {

	}
}
