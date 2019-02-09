package com.lko.EveryNeed.in.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/products")
	public String showProducts()
	{
		return "Product";
	}

}
