package com.sanjib.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanjib.entity.Category;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryTest {

	@Autowired
	private CategoryRepository categoryRepository;

	// @Test
	public void createCategory() {
		Category category = new Category();
		category.setName("SmartPhone");
		category.setDescription("Latest smart phone in the marker");
		categoryRepository.save(category);
	}

	// @Test
	public void createCategory1() {
		Category category1 = new Category();
		category1.setName("Television");
		category1.setDescription("New 4K HD TV with smart feathers");
		categoryRepository.save(category1);
	}

	// @Test
	public void createCategory2() {
		Category category2 = new Category();
		category2.setName("Laptop ");
		category2.setDescription("Laptop with new SSD and Graphic introduced");
		categoryRepository.save(category2);
	}

}
