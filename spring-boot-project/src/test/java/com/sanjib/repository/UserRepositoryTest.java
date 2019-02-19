package com.sanjib.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void createUser() {
		User user = new User();
		user.setFirstName("Jhon");
		user.setMiddleName("Jr.");
		user.setLastName("Hernandez");
		user.setEmail("christopher@test.com");
		userRepository.save(user);
	}

	// @Test
	public void saveUser1() {
		User user1 = new User();
		user1.setFirstName("Harry");
		user1.setMiddleName("Sr.");
		user1.setLastName("Potter");
		userRepository.save(user1);
	}

	// @Test
	public void saveUser2() {
		User user2 = new User();
		user2.setFirstName("Barrack");
		user2.setLastName("Obama");
		user2.setMiddleName("Bahadur");
		userRepository.save(user2);

	}

	// @Test
	public void saveUser3() {
		User user3 = new User();
		user3.setFirstName("Kalyan");
		user3.setLastName("Krishna");
		user3.setMiddleName("Kumar");
		userRepository.save(user3);

	}

	// @Test
	public void saveUser4() {
		User user4 = new User();
		user4.setFirstName("Bishnu");
		user4.setLastName("Kumari");
		user4.setMiddleName("Majhi");
		userRepository.save(user4);

	}

}
