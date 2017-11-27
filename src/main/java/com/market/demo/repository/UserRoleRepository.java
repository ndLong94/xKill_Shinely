package com.market.demo.repository;

import com.market.demo.domain.UserRole;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
	
	@Query(value = "select * from userRole  where userId=?1" , nativeQuery = true)
	UserRole findByUserId(Long userId);
	
	@Query(value = "select * from userRole  where provinceId=?1" , nativeQuery = true)
	UserRole findByRoleId(Long provinceId);
	
}
