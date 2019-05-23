package com.sanjib.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Address;
import com.sanjib.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepositoryTest {

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private UserRepository userRepository;

	// @Test
	public void createAddress() {
		User user = userRepository.findByFirstName("Jhon");
		if (user != null) {
			Address address = new Address();
			address.setAddressLine1("1200 Dallas Drive");
			address.setAddressLine2("2020");
			address.setCity("Irving");
			address.setPhone("78676995456");
			address.setState("TX");
			address.setZipcode("75038");
			address.setUser(user);
			addressRepository.save(address);
		}
	}

	// @Test
	public void createAddress2() {
		User user1 = userRepository.findByLastName("Obama");
		if (user1 != null) {
			Address address1 = new Address();
			address1.setAddressLine1("3001 W Walnut Hill Ln");
			address1.setAddressLine2("413");
			address1.setCity("Denton");
			address1.setPhone("6023014795");
			address1.setState("TX");
			address1.setZipcode("75201");
			address1.setUser(user1);
			addressRepository.save(address1);
		}
	}

	//@Test
	public void createAddress3() {
		User user3 = userRepository.findByMiddleName("Sr.");
		if (user3 != null) {
			Address address3 = new Address();
			address3.setAddressLine1("2001 Brady Avenue");
			address3.setAddressLine2("216");
			address3.setCity("Brownwood");
			address3.setPhone("6023018346");
			address3.setState("TX");
			address3.setZipcode("75278");
			address3.setUser(user3);
			addressRepository.save(address3);
		}
	}

	//@Test
	public void createAddress4() {
		User user4 = userRepository.findByLastName("Obama");
		if (user4 != null) {
			Address address4 = new Address();
			address4.setAddressLine1("3905 Shiver Road");
			address4.setAddressLine2("03");
			address4.setCity("Fort Worth");
			address4.setPhone("6028274795");
			address4.setState("TX");
			address4.setZipcode("75004");
			address4.setUser(user4);
			addressRepository.save(address4);
		}
	}

}
