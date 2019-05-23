package com.sanjib.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sanjib.dto.CategoryDTO;
import com.sanjib.entity.Category;
import com.sanjib.repository.CategoryRepository;
import com.sanjib.service.CategoryIfc;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryIfc categoryIfc;

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
	public String editCategory(@PathVariable Long categoryID, Model model, RedirectAttributes redirectAttributes) {
		try {
			CategoryDTO categoryDTO = categoryIfc.getCategoryDTO(categoryID);
			model.addAttribute("category", categoryDTO);
			return "category";
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("errorMsg", e.getMessage());
			return "redirect:/category-list";
		}
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
