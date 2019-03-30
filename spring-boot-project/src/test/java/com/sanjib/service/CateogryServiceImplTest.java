package com.sanjib.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.sanjib.dto.CategoryDTO;
import com.sanjib.entity.Category;
import com.sanjib.repository.CategoryRepository;

public class CateogryServiceImplTest {

	private CategoryServiceImpl categoryServiceImpl;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private Category category;

	@Before
	public void instantiate() {
		MockitoAnnotations.initMocks(this);
		this.categoryServiceImpl = new CategoryServiceImpl(categoryRepository);
	}

	@Test
	public void findAll() throws Exception {

		List<Category> categoryList = new ArrayList<>();
		categoryList.add(category);

		Category category1 = new Category();
		category1.setId(1L);
		category1.setName("Powder");
		categoryList.add(category1);

		Iterable<Category> categorIterable = categoryList;

		when(categoryRepository.findAll()).thenReturn(categorIterable);

		List<Category> categories = categoryServiceImpl.getAllCategory();
		verify(categoryRepository, times(1)).findAll();

		assertEquals(categoryList, categories);

	}

	@Test
	public void createCategoy() throws Exception {
		when(categoryRepository.save(category)).thenReturn(category);
		Category category1 = categoryServiceImpl.save(category);
		verify(categoryRepository, times(1)).save(category);
		assertThat(category1, is(equalTo(category)));
	}

	@Test
	public void getCategory() throws Exception {
		Category category = new Category();
		category.setId(5L);
		category.setName("Hello");

		when(categoryRepository.findOne(5l)).thenReturn(category);
		CategoryDTO categoryDTO = categoryServiceImpl.getCategoryDTO(5L);
		Long categoryID = categoryDTO.getId();

		verify(categoryRepository, times(1)).findOne(5L);

//		assertEquals(new Long(5L), new Long(categoryID));
		assertEquals("Hello", categoryDTO.getName());

	}

	@org.junit.After
	public void complete() {
		System.out.println("Test Completed.");
	}

}
