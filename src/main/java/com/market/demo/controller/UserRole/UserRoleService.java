package com.market.demo.controller.UserRole;

import javax.persistence.EntityNotFoundException;

import com.market.demo.domain.User;
import com.market.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.UserRole;
import com.market.demo.repository.UserRoleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private UserRepository userRepository;
	
	public UserRole findById(Long userRoleId) {
		UserRole userRole = userRoleRepository.findOne(userRoleId);
	    if (null == userRole)
            throw new EntityNotFoundException("userRoleId Not Found");
        return userRole;
    }
	
	public List<Long> findByUserId(Long userId) {
		List<UserRole> userRoles = userRoleRepository.findByUserId(userId);
	    if (userRoles.isEmpty())
            throw new EntityNotFoundException("User haven't had roles yet");
	    List<Long> roles = userRoles.stream().map(role -> role.getRoleId()).collect(Collectors.toList());
        return roles;
    }

	public List<String> findByUserName(String userName) {
		User user = userRepository.findByUserName(userName);
		if (null == user)
			throw new EntityNotFoundException("User is not exist!");

		List<UserRole> userRoles = userRoleRepository.findByUserId(user.getUserId());
		if (userRoles.isEmpty())
			throw new EntityNotFoundException("User haven't had roles yet");
		List<String> roles = userRoles.stream().map(role -> role.getRoleStr()).collect(Collectors.toList());
		return roles;
	}
	
	public List<UserRole> findByRoleId(Long provinceId) {
		List<UserRole> userRoles = userRoleRepository.findByRoleId(provinceId);
	    if (null == userRoles)
            throw new EntityNotFoundException("provinceId Not Found");
        return userRoles;
    }
}
