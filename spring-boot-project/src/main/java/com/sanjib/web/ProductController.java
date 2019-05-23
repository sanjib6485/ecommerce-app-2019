package com.sanjib.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanjib.dto.ProductDTO;
import com.sanjib.entity.Category;
import com.sanjib.entity.Product;
import com.sanjib.repository.CategoryRepository;
import com.sanjib.repository.ProductRepository;
import com.sanjib.service.ProductIfc;

@Controller
public class ProductController {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	ProductIfc productIfc;

	@GetMapping("/createproduct")
	public String getProductCreateForm(Model model) {
		List<Category> cateogryList = (List<Category>) categoryRepository.findAll();
		if (cateogryList == null) {
			cateogryList = new ArrayList<>();
		}
		model.addAttribute("categories", cateogryList);
		model.addAttribute("product", new ProductDTO());
		return "product";
	}

	@PostMapping("/createproduct")
	public String createProduct(@ModelAttribute("product") ProductDTO product) throws Exception {
//		productRepository.save(product);
		productIfc.createProduct(product);
		System.out.println(product.getName());
		return "redirect:/product-list";
	}

	@GetMapping("/product-list")
	public String getProductList(Model model) {
		List<Product> productList = (List<Product>) productRepository.findAll();
		model.addAttribute("productlist", productList);
		return "product-list";
	}

	@GetMapping("/products/{productID}/edit")
	public String editProduct(@PathVariable Long productID, Model model) {
		Product productObj = productRepository.findOne(productID);
		model.addAttribute("product", productObj);
		return "product";
	}

	@PostMapping("/products/{productID}/edit")
	public String editProduct(@PathVariable Long productID, @ModelAttribute Product product) {
		Product productObj = productRepository.findOne(productID);
		productObj.setName(product.getName());
		productObj.setDescription(product.getDescription());
		productRepository.save(productObj);

		return "redirect:/product-list";
	}

	@GetMapping("/products/{productID}/delete")
	public String deleteProduct(@PathVariable Long productID) {
		productRepository.delete(productID);
		return "redirect:/product-list";
	}
}
