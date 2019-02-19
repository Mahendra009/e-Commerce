package com.lko.shopingBackend.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.ProductDAO;
import com.lko.shopingBackend.model.Product;

class ProductDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;


	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko.shopingBackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	@Disabled
	@Test
	void testSaveProduct() {
		Product product = new Product();
		product.setBrand("Apple");
		product.setCategoryId(6);
		product.setDescription("This is apple smart phone");
		product.setProductName("iPhone9");
		product.setQuantity(5);
		product.setRating(4);
		product.setSupplierId(2);
		product.setUnitPrice(1200000.00);
		
		assertNotNull(productDAO.saveProduct(product), "Can not save product details now");
	}

	@Disabled
	@Test
	void testUpdateProduct() {
		Product product = productDAO.getProduct(1);
		product.setBrand("Samsung");
		
		assertNotNull(productDAO.updateProduct(product),"Can not update product details");
	}

	@Disabled
	@Test
	void testDeleteProduct() {
		Product product = productDAO.getProduct(2);
		
		assertNotNull(productDAO.deleteProduct(product), "Can not delete product now");
	}

	@Disabled
	@Test
	void testGetProduct() {
		System.out.println("Samsung");
		
		assertNotNull(productDAO.getProduct(1),"Can not get product now");
	}

	@Disabled
	@Test
	void testListProducts() {
		List<Product> listProducts = productDAO.listProducts();
		
		assertTrue(productDAO.listProducts().size()>0, "Unable to get list of products");
		
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
			System.out.println(product.getUnitPrice()+ ":::");
		}
	}

	@Disabled
	@Test
	void testListProductByCategory() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testListProductBySupplier() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testListProductBySearch() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testListProductByFilter() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetListByBrand() {
		fail("Not yet implemented");
	}

}
