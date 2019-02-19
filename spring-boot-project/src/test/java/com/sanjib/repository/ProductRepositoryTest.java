package com.sanjib.repository;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Category;
import com.sanjib.entity.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	// @Test
	public void createProduct() {

		Category category = categoryRepository.findByName("SmartPhone");
		if (category != null) {
			Product product = new Product();
			product.setName("Nokia");
			product.setPrice(BigDecimal.valueOf(200.00));
			product.setProductImagePath("/ecommerce/image/nokia.png");
			product.setCategory(category);
			productRepository.save(product);
		}
	}

	@Test
	public void createProduct1() {

		Category category1 = categoryRepository.findByName("Television");
		if (category1 != null) {
			Product product1 = new Product();
			product1.setName("Samsung 65");
			product1.setPrice(BigDecimal.valueOf(200.00));
			product1.setProductImagePath("/ecommerce/image/samsung.png");
			product1.setCategory(category1);
			productRepository.save(product1);
		}
	}
	
	@Test
	public void createProduct2() {

		Category category2 = categoryRepository.findByName("Television");
		if (category2 != null) {
			Product product2 = new Product();
			product2.setName("LG 75");
			product2.setPrice(BigDecimal.valueOf(900.00));
			product2.setProductImagePath("/ecommerce/image/lg.png");
			product2.setCategory(category2);
			productRepository.save(product2);
		}
	}
}
