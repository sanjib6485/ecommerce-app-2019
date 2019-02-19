package com.sanjib.service;

import com.sanjib.dto.CategoryDTO;

public interface CategoryIfc {

	CategoryDTO getCategoryDTO(Long categoryID) throws Exception;

}
