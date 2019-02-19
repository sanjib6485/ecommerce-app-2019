package com.sanjib.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserIfc userIfc;

	@Test
	public void createUser() throws Exception {
		User user = new User();
		user.setFirstName("Jhon");
		user.setMiddleName("Jr.");
		user.setLastName("Hernandez");
		user.setEmail("christopher1@test.com");
		userIfc.createUser(user);
	}

}
