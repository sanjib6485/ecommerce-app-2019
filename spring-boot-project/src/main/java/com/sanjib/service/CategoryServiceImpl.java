package com.sanjib.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjib.dto.CategoryDTO;
import com.sanjib.entity.Category;
import com.sanjib.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryIfc {

	private final CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		// TODO Auto-generated constructor stub
		this.categoryRepository = categoryRepository;
	}

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

	@Override
	public List<Category> getAllCategory() throws Exception {
		List<Category> categoryList = (List<Category>) categoryRepository.findAll();
		return categoryList;
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

}
