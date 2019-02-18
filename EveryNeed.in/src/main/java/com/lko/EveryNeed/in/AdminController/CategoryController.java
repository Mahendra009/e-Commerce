package com.lko.EveryNeed.in.AdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = "/category")
	public String showCategory(Model mv)
	{
		List<Category> listCategories = categoryDAO.listCategories();
		mv.addAttribute("categoryList", listCategories);
		return "Category";
	}
	
}
