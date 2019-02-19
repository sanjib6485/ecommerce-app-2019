package com.sanjib;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sanjib.entity.Category;
import com.sanjib.entity.Product;
import com.sanjib.repository.CategoryRepository;
import com.sanjib.repository.ProductRepository;;

@SpringBootApplication
public class SpringBootProjectApplication {

	//private static final Logger log = LoggerFactory.getLogger(SpringBootProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ProductRepository repository) {
//		return (args) -> {
//			repository.save(new Product(1L, "Samsung",600.0,11L,"Galaxy"));
//			repository.save(new Product(2L, "Apple",800.0,12L, "iphone"));
//			repository.save(new Product(3L, "Huwaie",500.0,13L, "H9"));
//
//		};
//		} 
//	@Bean
//	public CommandLineRunner demos(CategoryRepository repository) {
//		return (args) -> {
//			repository.save(new Category(1L, "Phone","Samsung,iPhone"));
//			repository.save(new Category(2L, "Laptop","MacBook,HP"));
//			repository.save(new Category(3L, "Tablet","iPad,Tablet"));
//
//		};
//		} 
	
	
	
	
	}	

	

