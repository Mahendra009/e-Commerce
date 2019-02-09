package com.lko.shopingBackend.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.ProductDAO;
import com.lko.shopingBackend.model.Product;

public class ProductDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	@Ignore
	@Test
	public void testSaveProduct() {
		Product product = new Product();
		product.setBrand("Samsung");
		product.setCategoryId(1);
		product.setDescription("This is samsung note 9");
		product.setProductName("Samsung Note 9");
		product.setQuantity(5);
		product.setRating(4);
		product.setSupplierId(1);
		product.setUnitPrice(700000.00);
		
		assertTrue("Can't save product information at this time", productDAO.saveProduct(product));
	}

	@Ignore
	@Test
	public void testUpdateProduct() {
		Product product = productDAO.getProduct(1);
		product.setDescription("This is samsung note 9 PRO");
		
		assertTrue("Can't update product detail now", productDAO.updateProduct(product));
	}

	@Ignore
	@Test
	public void testDeleteProduct() {
		Product product = productDAO.getProduct(1);
		
		assertTrue("Can't delete product now", productDAO.deleteProduct(product));
	}

	@Ignore
	@Test
	public void testGetProduct() {
		System.out.println("Samsung");
		
		assertNotNull("Unable to get products", productDAO.getProduct(1));
	}

	
	@Test
	public void testListProducts() {
		List<Product> listProducts = productDAO.listProducts();
		
		assertTrue("Unable to get products list", listProducts.size()>0);
		
		for (Product product : listProducts) 
		{
			System.out.print(product.getBrand()+ ":::");
			System.out.print(product.getCategoryId()+ ":::");
			System.out.print(product.getDescription()+ ":::");
			System.out.print(product.getProductCode()+ ":::");
			System.out.print(product.getProductId()+ ":::");
			System.out.print(product.getProductName()+ ":::");
			System.out.print(product.getQuantity()+ ":::");
			System.out.print(product.getQuantity()+ ":::");
			System.out.print(product.getSupplierId()+ ":::");
			System.out.print(product.getUnitPrice()+ ":::");
		}
	}

	@Ignore
	@Test
	public void testListProductByCategory() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testListProductBySupplier() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testListProductBySearch() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testListProductByFilter() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetListByBrand() {
		fail("Not yet implemented");
	}

}
