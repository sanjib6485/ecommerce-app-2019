package com.sanjib.service;

import com.sanjib.entity.User;
import com.sanjib.exception.EmailNotFoundException;

public interface UserIfc {

	void validateEmail(String email) throws EmailNotFoundException;

	void createUser(User user) throws Exception;

}
