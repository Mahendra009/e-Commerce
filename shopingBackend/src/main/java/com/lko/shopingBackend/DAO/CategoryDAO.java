package com.lko.shopingBackend.DAO;

import java.util.List;

import com.lko.shopingBackend.model.Category;


public interface CategoryDAO {
	
	public boolean saveCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public Category getCategory(int categoryId);
	public List<Category> listCategories();

}
