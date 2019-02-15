package com.sanjib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Address;
import com.sanjib.entity.Category;
import com.sanjib.entity.Product;
import com.sanjib.entity.User;
import com.sanjib.repository.AddressRepository;
import com.sanjib.repository.CategoryRepository;
import com.sanjib.repository.ProductRepository;
import com.sanjib.repository.UserRepository;

import javassist.bytecode.Descriptor.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootProjectApplicationTests {
	
	
	@Autowired AddressRepository addressRepository;
	
	@Autowired UserRepository userRepository;
	
	@Test
	public void saveUserandAddress() {
		User user = new User();
		user.setFirstName("Jane");
		user.setLastName("Doe");
		userRepository.save(user);
		
		Address address = new Address();
		address.setAddressLine1("dkfjdfdjfkdlfjda");
		address.setCity("Dallas");
		address.setState("TX");
		address.setZipcode("75345");
		address.setUser(user);
		addressRepository.save(address);
		
		Iterable<User> iteratorList = userRepository.findAll();
		if(iteratorList.iterator().hasNext()) {
			System.out.println(iteratorList);
		}
		
	}
	
	
	
	
	
	
	
	
	

}

