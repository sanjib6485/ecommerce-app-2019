package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
