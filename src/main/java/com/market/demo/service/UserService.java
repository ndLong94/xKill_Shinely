package com.market.demo.service;

import com.market.demo.domain.User;

public interface UserService {

	public void save(User user);

	public void delete(Long id);

	public Iterable<User> findAll();

	public User findById(Long id);

	public long count();

}
