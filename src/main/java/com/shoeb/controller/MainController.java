package com.shoeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	public static int pageViews = 0;
	
	@GetMapping("/page-views")
	public String getPageViews() {
		return String.format("Total views for this page: %d", ++pageViews);
	}
	
}
