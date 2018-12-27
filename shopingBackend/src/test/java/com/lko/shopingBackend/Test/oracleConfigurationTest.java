package com.lko.shopingBackend.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class oracleConfigurationTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		
		/*CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = new Category();
		category.setCategoryName("Men");
		category.setDescription("This is men category");
		
		categoryDAO.saveCategory(category);
		System.out.println("Category Added");*/
		

	}
}
