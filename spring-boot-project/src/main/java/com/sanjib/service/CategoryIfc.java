package com.sanjib.service;

import java.util.List;

import com.sanjib.dto.CategoryDTO;
import com.sanjib.entity.Category;

public interface CategoryIfc {

	CategoryDTO getCategoryDTO(Long categoryID) throws Exception;

	List<Category> getAllCategory() throws Exception;

	Category save(Category category);

}
