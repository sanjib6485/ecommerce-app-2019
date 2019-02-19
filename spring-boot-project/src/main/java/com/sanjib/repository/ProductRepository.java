package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findByName(String name);
}
