package com.lko.EveryNeed.in.AdminController;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.DAO.SupplierDAO;
import com.lko.shopingBackend.model.Category;
import com.lko.shopingBackend.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = "/supplier")
	public String showSupplier(Model mv)
	{
		Supplier supplier = new Supplier();
		mv.addAttribute(supplier);
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList",supplierDAO.listSuppliers());
		return "ManageSupplier";
	}
	
	@PostMapping(value = "/saveSupplier")
	public String saveSupplier(@ModelAttribute("supplier")Supplier supplier,Model mv)
	{
		supplierDAO.saveSupplier(supplier);
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList",supplierDAO.listSuppliers());
		return "ManageSupplier";
	}
	
	public LinkedHashMap<Integer, String> getCategories()
	{
		List<Category> listCategories = categoryDAO.listCategories();
		LinkedHashMap<Integer, String> categoryData = new LinkedHashMap<Integer, String>();
		for(Category category:listCategories)
		{
			categoryData.put(category.getCategoryId(),category.getCategoryName());
		}
		
		return categoryData;
	}
	

}
