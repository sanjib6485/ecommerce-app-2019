package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	//List<Product> findByLastName(String lastName);
}
