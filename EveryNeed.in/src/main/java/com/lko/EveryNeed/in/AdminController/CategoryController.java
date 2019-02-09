package com.lko.EveryNeed.in.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@RequestMapping(value = "/category")
	public String showCategory()
	{
		return "Category";
	}
	
}
