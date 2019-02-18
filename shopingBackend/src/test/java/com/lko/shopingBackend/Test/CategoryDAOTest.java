package com.lko.shopingBackend.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.model.Category;

class CategoryDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	
	@Test
	void testSaveCategory() {
		Category category = new Category();
		category.setCategoryName("Electronics");
		category.setDescription("This is Electronics category");
		
		assertNotNull(categoryDAO.saveCategory(category), "Unable to save Category");
	}

	@Disabled
	@Test
	void testUpdateCategory() {
		Category category = categoryDAO.getCategory(5);
		category.setCategoryName("Electronics");
		
		assertNotNull(categoryDAO.updateCategory(category), "Unable to update Category");
	}

	@Disabled
	@Test
	void testDeleteCategory() {
		Category category = categoryDAO.getCategory(4);
		assertNotNull(categoryDAO.deleteCategory(category), "Unable to delete Category");
	}

	@Disabled
	@Test
	void testGetCategory() {
	System.out.println("Mobile Phones");
		
	assertNotNull(categoryDAO.getCategory(1), "Unable to get Category");
	}

	@Disabled
	@Test
	void testListCategories() {
		List<Category> listCategories = categoryDAO.listCategories();
		assertTrue(categoryDAO.listCategories().size()>0,"Problem in listing categorie");
		
		for(Category category : listCategories)
		{
			System.out.print(category.getCategoryId() + ":::");
			System.out.print(category.getCategoryName() + ":::");
			System.out.println(category.getDescription() + ":::");
		}
	}

}
