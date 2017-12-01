package com.market.demo.controller.User;

import com.market.demo.domain.User;
import com.market.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;

	public void login() {

	}

	public void logout() {

	}

    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User findById(Long userId) {
	    User user = userRepository.findOne(userId);
	    if (null == user)
            throw new EntityNotFoundException("Id Not Found");
        return user;
    }

    public User findByPhoneNo(String phoneNo) {
        User user = userRepository.findByPhoneNumber(phoneNo);
        if (null == user)
            throw new EntityNotFoundException("Id Not Found");
        return user;
    }

    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (null == user)
            throw new EntityNotFoundException("Id Not Found");
        return user;
    }

    public List<User> filterByNameAndCoin(String name, String coin) {
        return null;
    }

	public void save(User user) {
		userRepository.save(user);
	}

	public void delete(Long userId) {
		userRepository.delete(userId);
		
	}


}
