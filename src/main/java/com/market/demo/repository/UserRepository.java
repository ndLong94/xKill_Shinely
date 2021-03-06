package com.market.demo.repository;

import com.market.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByPhoneNumber(String phoneNumber);
    User findByEmail(String email);
    User findByUserName(String userName);
}
