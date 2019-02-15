package com.sanjib.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping({"", "/index"})
	public String getIndexPage() {
		return "index";
	}
	

}
