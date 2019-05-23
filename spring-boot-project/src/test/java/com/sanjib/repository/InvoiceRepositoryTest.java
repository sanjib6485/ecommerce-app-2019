package com.sanjib.repository;

import java.math.BigDecimal;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Address;
import com.sanjib.entity.Invoice;
import com.sanjib.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTest {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	public void createInvoice() {
		Address address = addressRepository.findByCity("Irving");
		User user = userRepository.findByFirstName("Jhon");
		if (address != null) {
			Invoice invoice = new Invoice();
			invoice.setUser(user);
			invoice.setShippingAddress(address);
			invoice.setTax(BigDecimal.valueOf(40.0));
			invoice.setTotal(BigDecimal.valueOf(1000.00));
		}
	}
}
