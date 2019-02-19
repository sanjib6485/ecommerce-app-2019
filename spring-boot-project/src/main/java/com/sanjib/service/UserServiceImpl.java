package com.sanjib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjib.entity.User;
import com.sanjib.exception.EmailNotFoundException;
import com.sanjib.repository.UserRepository;

@Service
public class UserServiceImpl implements UserIfc {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void validateEmail(String email) throws EmailNotFoundException {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			throw new EmailNotFoundException("Email Not Found");
		}
	}

	public void checkForRedundantUser(String email) throws Exception {
		User user = userRepository.findByEmail(email);
		if (user != null) {
			throw new Exception("User already exist");
		}
	}

	@Override
	public void createUser(User user) throws Exception {
		checkForRedundantUser(user.getEmail());
		userRepository.save(user);
	}

}
