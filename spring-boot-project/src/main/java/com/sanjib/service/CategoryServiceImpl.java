package com.sanjib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjib.dto.CategoryDTO;
import com.sanjib.entity.Category;
import com.sanjib.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryIfc {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public CategoryDTO getCategoryDTO(Long categoryID) throws Exception {
		Category category = categoryRepository.findOne(categoryID);
		if (category != null) {
			CategoryDTO categoryDTO = new CategoryDTO();
			categoryDTO.setId(categoryID);
			categoryDTO.setName(category.getName());
			categoryDTO.setDescription(category.getDescription());
			return categoryDTO;
		} else {
			throw new Exception("Category does not exist.");
		}
	}

}
