package com.lko.EveryNeed.in.AdminController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;
	boolean flag = false;
	
	@RequestMapping(value = "/category")
	public String showCategory(Model mv)
	{
		flag = false;
		
		List<Category> listCategories = categoryDAO.listCategories();
		mv.addAttribute("categoryList", listCategories);
		mv.addAttribute("flag", flag);
		return "Category";
	}
	
	@PostMapping(value = "/saveCategory")
	public String saveCategory(@RequestParam("categoryName")String categoryName,@RequestParam("description") String description,Model mv)
	{
		flag = false;
		
		Category category = new Category();
		category.setCategoryName(categoryName);
		category.setDescription(description);
		categoryDAO.saveCategory(category);
		
		List<Category> listCategories = categoryDAO.listCategories();
		mv.addAttribute("categoryList", listCategories);
		mv.addAttribute("flag", flag);
		return "Category";
	}
	
	@GetMapping(value = "/deleteCategory/{categoryId}")// The form method is POST and the action URL is /deleteCategory, so I would have thought it will work. 
	public String deleteCategory(@PathVariable("categoryId") int categoryId,Model mv)
	{
		flag = false;
		
		Category category = categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);
		
		List<Category> listCategories = categoryDAO.listCategories();
		mv.addAttribute("categoryList", listCategories);
		mv.addAttribute("flag", flag);
		return "Category";
	}
	
	@GetMapping(value = "/editCategory/{categoryId}")
	public String editCategory(@PathVariable("categoryId") int categoryId,Model mv)
	{
		flag = true;
		
		Category category = categoryDAO.getCategory(categoryId);
		mv.addAttribute("categoryData", category);
		mv.addAttribute("flag", flag);
		return "Category";
	}
	
	@PostMapping(value = "/updateCategory") // put mapping will not support so using post mapping.
	public String updateCategory(@RequestParam("categoryId") int categoryId,@RequestParam("categoryName")String categoryName
			,@RequestParam("description")String description,Model mv)
	{
		Category category = categoryDAO.getCategory(categoryId);
		category.setCategoryName(categoryName);
		category.setDescription(description);
		categoryDAO.updateCategory(category);
		
		List<Category> listCategories = categoryDAO.listCategories(); //again using these 2 lines bcz I hv to retrieve data that I hv inserted in database.
		mv.addAttribute("categoryList", listCategories);
		mv.addAttribute("flag", flag);
		return "redirect:/category";
	}
	
}
