package com.sanjib.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanjib.entity.Category;
import com.sanjib.entity.Product;
import com.sanjib.repository.CategoryRepository;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/selectcategory")
	public String getCategoryCreateForm(Model model) {
		model.addAttribute("category", new Category());
		return "category";
	}
	
	@PostMapping("/selectcategory")
	public String createCategory(@ModelAttribute("category") Category category) {
		categoryRepository.save(category);
		System.out.println(category.getName());
		return "redirect:/category-list";
	}
	
	@GetMapping("/category-list")
	public String getCatogoryList(Model model) {
		List<Category> categoryList = (List<Category>) categoryRepository.findAll();
		model.addAttribute("categorylist", categoryList);
		return "category-list";
	}
	
	@GetMapping("/categories/{categoryID}/edit")
	public String editCategory(@PathVariable Long categoryID, Model model) {
		Category categoryObj = categoryRepository.findOne(categoryID);
		model.addAttribute("category", categoryObj);
		return "category";
	}
	
	@PostMapping("/categories/{categoryID}/edit")
	public String editCategory(@PathVariable Long categoryID, @ModelAttribute Category category) {
		Category categoryObj = categoryRepository.findOne(categoryID);
		categoryObj.setName(category.getName());
		categoryObj.setDescription(category.getDescription());
		categoryRepository.save(categoryObj);
		
		
		return "redirect:/category-list";
	}
	
	@GetMapping("/categories/{categoryID}/delete")
	public String deleteCategory(@PathVariable Long categoryID) {
		categoryRepository.delete(categoryID);
		return "redirect:/category-list";
	}
	
	

}
