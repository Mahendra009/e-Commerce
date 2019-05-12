package com.lko.EveryNeed.in.AdminController;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		Supplier supplier1 = new Supplier(); //supplier1 is used to avoid same product details on jsp page. All the fields should be blank.
		mv.addAttribute(supplier1);
		mv.addAttribute("supplierList",supplierDAO.listSuppliers());
		return "ManageSupplier";
	}
	
	@GetMapping(value = "/deleteSupplier/{supplierId}")
	public String deleteSuppliers(@PathVariable("supplierId") int supplierId, Model mv)
	{
		Supplier supplier = supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		Supplier supplier1 = new Supplier();
		mv.addAttribute(supplier1);
		
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList",supplierDAO.listSuppliers());
		return "redirect:/supplier";
	}
	
	@GetMapping(value="/editSupplier/{supplierId}")
	public String editSupplier(@PathVariable("supplierId") int supplierId,Model mv)
	{
		Supplier supplier = supplierDAO.getSupplier(supplierId);
		mv.addAttribute(supplier);
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList", supplierDAO.listSuppliers());
		return "UpdateSupplier";
	}
	
	@PostMapping(value="/updateSupplier")
	public String updateSupplier(@ModelAttribute("supplier")Supplier supplier,Model mv)
	{
		supplierDAO.updateSupplier(supplier);
		Supplier supplier1= new Supplier();
		mv.addAttribute(supplier1);
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList", supplierDAO.listSuppliers());
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
