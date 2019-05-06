package com.lko.EveryNeed.in.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lko.shopingBackend.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/product")
	public String showProducts(Model mv)
	{
		Product product = new Product();
		mv.addAttribute(product);
		return "ManageProduct";
	}

}
