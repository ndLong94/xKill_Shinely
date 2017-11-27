package com.market.demo.controller.UserRole;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.demo.domain.UserRole;
import com.market.demo.repository.UserRoleRepository;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	public UserRole findById(Long userRoleId) {
		UserRole userRole = userRoleRepository.findOne(userRoleId);
	    if (null == userRole)
            throw new EntityNotFoundException("userRoleId Not Found");
        return userRole;
    }
	
	public UserRole findByUserId(Long userId) {
		UserRole userRole = userRoleRepository.findByUserId(userId);
	    if (null == userRole)
            throw new EntityNotFoundException("userId Not Found");
        return userRole;
    }
	
	public UserRole findByRoleId(Long provinceId) {
		UserRole userRole = userRoleRepository.findByRoleId(provinceId);
	    if (null == userRole)
            throw new EntityNotFoundException("provinceId Not Found");
        return userRole;
    }
}
