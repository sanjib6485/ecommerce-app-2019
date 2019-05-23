package com.sanjib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjib.dto.ProductDTO;
import com.sanjib.entity.Category;
import com.sanjib.entity.Product;
import com.sanjib.repository.CategoryRepository;
import com.sanjib.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductIfc {

	@Autowired
	private CategoryRepository categoryRespository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(ProductDTO productDTO) throws Exception {

		Long categoryID = productDTO.getCategoryID();

		if (categoryID == null) {
			throw new Exception("Category cannot be empty");
		}

		Category category = categoryRespository.findOne(categoryID);

		Product product = new Product();
		product.setName(productDTO.getName());
		product.setPrice(productDTO.getPrice());
		product.setProductImagePath("/ecommerce/iamges/abc.png");
		product.setCategory(category);

		productRepository.save(product);

	}

}
