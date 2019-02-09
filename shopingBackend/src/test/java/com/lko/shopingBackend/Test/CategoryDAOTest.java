package com.lko.shopingBackend.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.CategoryDAO;
import com.lko.shopingBackend.model.Category;

public class CategoryDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Ignore
	@Test
	public void testSaveCategory() {
		Category category = new Category();
		category.setCategoryName("Kids");
		category.setDescription("This is Kids category");
		
		assertTrue("Problem in saving category",categoryDAO.saveCategory(category));
	}

	@Ignore
	@Test
	public void testUpdateCategory() {
		Category category = categoryDAO.getCategory(1052);
		category.setCategoryName("Mobile Phone");
		
		assertTrue("Can not update category", categoryDAO.updateCategory(category));
	}

	@Ignore
	@Test
	public void testDeleteCategory() {
		Category category = categoryDAO.getCategory(1152);
		
		assertTrue("Can not delete category", categoryDAO.deleteCategory(category));
	}

	@Ignore
	@Test
	public void testGetCategory() {
		System.out.println("Mobile Phones");
		
		assertNotNull("Can not get Category", categoryDAO.getCategory(1102));
	}

	@Ignore
	@Test
	public void testListCategories() {
		List<Category> listCategories = categoryDAO.listCategories();
		assertTrue("Problem in listing categories", listCategories.size()>0);
		
		for(Category category : listCategories)
		{
			System.out.print(category.getCategoryId() + ":::");
			System.out.print(category.getCategoryName() + ":::");
			System.out.println(category.getDescription() + ":::");
		}
	}

}
