package com.sanjib.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjib.entity.Category;
import com.sanjib.service.CategoryIfc;

@RestController
@RequestMapping("/api")
public class ApiController {

	// @ResponseBody

	@Autowired
	private CategoryIfc categoryService;

	@GetMapping("/categories")
	public ResponseEntity<?> getAllCategory() {
		try {
			List<Category> cateogryList = categoryService.getAllCategory();
			return new ResponseEntity<List<Category>>(cateogryList, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(new ArrayList(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
