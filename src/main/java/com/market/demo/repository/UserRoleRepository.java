package com.market.demo.repository;

import com.market.demo.domain.Category;
import com.market.demo.domain.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}
