package com.sanjib.repository;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Product;
import com.sanjib.entity.UserCart;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserCartRepositoryTest {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserCartRepository userCartRepository;

	@Test
	public void createUserCart() {

		Product product = productRepository.findByName("Nokia");
		if (product != null) {

			UserCart userCart = new UserCart();
			userCart.setPrice(BigDecimal.valueOf(200.00));
			userCart.setCartReference("First");
			userCart.setQuantity(BigDecimal.valueOf(5.00));
			userCart.setProduct(product);
			userCartRepository.save(userCart);
		}
	}
}
