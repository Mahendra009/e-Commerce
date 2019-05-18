package com.lko.EveryNeed.in.AdminController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		Category category = new Category();
		mv.addAttribute(category);
		mv.addAttribute("categoryList", categoryDAO.listCategories());
		return "ManageCategory";
	}
	
	@PostMapping(value = "/saveCategory")
	public String saveCategory(@Valid @ModelAttribute("category")Category category,BindingResult results, Model mv)
	{
		//to check if there is any errors
		if(results.hasErrors())
		{
			mv.addAttribute("categoryList", categoryDAO.listCategories());
			return "ManageCategory";
		}
		
		categoryDAO.saveCategory(category);
		Category category1 = new Category();
		mv.addAttribute(category1);
		mv.addAttribute("categoryList", categoryDAO.listCategories());
		return "ManageCategory";
	}
	
	@GetMapping(value = "/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId")int categoryId,Model mv)
	{
		Category category = categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);
		Category category1 = new Category();
		mv.addAttribute(category1);
		mv.addAttribute("categoryList", categoryDAO.listCategories());
		return "redirect:/category";
	}
	
	@GetMapping(value = "/editCategory/{categoryId}")
	public String editCategory(@PathVariable("categoryId") int categoryId,Model mv)
	{
		Category category = categoryDAO.getCategory(categoryId);
		mv.addAttribute(category);
		mv.addAttribute("categoryList", categoryDAO.listCategories());
		return "UpdateCategory";
	}
	
	@PostMapping(value = "/updateCategory")
	public String updateCategory(@ModelAttribute("category") Category category,Model mv)
	{
		categoryDAO.updateCategory(category);
		Category category1 = new Category();
		mv.addAttribute(category1);
		mv.addAttribute("categoryList", categoryDAO.listCategories());
		return "ManageCategory";
	}
	
	
}
