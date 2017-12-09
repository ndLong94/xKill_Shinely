package com.market.demo.repository;

import com.market.demo.domain.UserRole;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
	@Query(value = "select * from userrole where userid = ?1", nativeQuery = true)
	List<UserRole> findByUserId(Long userId);

	List<UserRole> findByRoleId(Long roleId);
	

}
