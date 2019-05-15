package com.lko.EveryNeed.in.AdminController;

import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.DAO.ProductDAO;
import com.lko.shopingBackend.DAO.SupplierDAO;
import com.lko.shopingBackend.model.Category;
import com.lko.shopingBackend.model.Product;
import com.lko.shopingBackend.model.Supplier;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping(value = "/product")
	public String showProducts(Model mv)
	{
		Product product = new Product();
		mv.addAttribute(product);
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList", this.getSuppliers());
		mv.addAttribute("productList",productDAO.listProducts());
		return "ManageProduct";
	}
	
	@PostMapping(value = "/saveProducts")
	public String saveProducts(@ModelAttribute("product")Product product,Model mv)
	{
		productDAO.saveProduct(product);
		mv.addAttribute("categoryList", this.getCategories());
		
		Product product1 = new Product();// product1 is used to avoid same product details on jsp page. All the fields should be blank.
		mv.addAttribute(product1);
		mv.addAttribute("supplierList", this.getSuppliers());
		mv.addAttribute("productList",productDAO.listProducts());
		return "ManageProduct";
	}
	
	@GetMapping(value = "/deleteProduct/{productId}")
	public String deleteProducts(@PathVariable("productId") int productId,Model mv)
	{
		Product product = productDAO.getProduct(productId);
		productDAO.deleteProduct(product);
		Product product1 = new Product();
		mv.addAttribute(product1);
		
		mv.addAttribute("categoryList",this.getCategories());
		mv.addAttribute("supplierList", this.getSuppliers());
		mv.addAttribute("productList",productDAO.listProducts());
		return "redirect:/product";
	}
	
	@GetMapping(value="/editProduct/{productId}")
	public String editProduct(@PathVariable("productId") int productId,Model mv)
	{
		Product product = productDAO.getProduct(productId);
		mv.addAttribute(product);
		mv.addAttribute("categoryList",this.getCategories());
		mv.addAttribute("supplierList", this.getSuppliers());
		mv.addAttribute("productList",productDAO.listProducts());
		return "UpdateProduct";
	}
	
	@PostMapping(value = "/updateProducts")
	public String updateProducts(@ModelAttribute("product")Product product,Model mv)
	{
		
		productDAO.updateProduct(product);
		Product product1 = new Product();
		mv.addAttribute(product1);
		
		mv.addAttribute("categoryList", this.getCategories());
		mv.addAttribute("supplierList", this.getSuppliers());
		mv.addAttribute("productList",productDAO.listProducts());
		return "ManageProduct";
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
	
	public LinkedHashMap<Integer, String> getSuppliers()
	{
		List<Supplier> listSuppliers = supplierDAO.listSuppliers();
		LinkedHashMap<Integer, String> supplierData = new LinkedHashMap<Integer, String>();
		for (Supplier supplier:listSuppliers)
		{
			supplierData.put(supplier.getSupplierId(), supplier.getFirmName());
		}
			 return supplierData;
	}

}
