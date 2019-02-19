package com.lko.shopingBackend.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.SupplierDAO;
import com.lko.shopingBackend.model.Supplier;

class SupplierDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static SupplierDAO supplierDAO;

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}

	@Disabled
	@Test
	void testSaveSupplier() {
		Supplier supplier = new Supplier();
		supplier.setAdharCard("ADHAR12345");
		supplier.setCategoryId(2);
		supplier.setEmailId("amar123@gmail.com");
		supplier.setFirmName("Harpal Traders");
		supplier.setGSTIN("GSTN123456789");
		supplier.setPanCard("PAN123456789");
		supplier.setPhoneNumber("2222222222");
		supplier.setRatings(4);
		supplier.setSupplierName("Amarjeet Singh Saini");
		
		assertNotNull(supplierDAO.saveSupplier(supplier), "Can not save supplier details");
	}

	@Disabled
	@Test
	void testUpdateSupplier() {
		Supplier supplier = supplierDAO.getSupplier(2);
		supplier.setRatings(5);
		
		assertNotNull(supplierDAO.updateSupplier(supplier),"Can not update supplier");
	}

	@Disabled
	@Test
	void testDeleteSupplier() {
		Supplier supplier = supplierDAO.getSupplier(3);
		
		assertNotNull(supplierDAO.deleteSupplier(supplier), "Can not delete supplier details");
	}

	@Disabled
	@Test
	void testGetSupplier() {
		System.out.println("Amarjeet Singh Saini");
		
		assertNotNull(supplierDAO.getSupplier(2), "Can not delete supplier details");
	}

	@Disabled
	@Test
	void testListSuppliers() {
		List<Supplier> listSuppliers = supplierDAO.listSuppliers();
		assertTrue(supplierDAO.listSuppliers().size()>0, "Can not get suppliers list");
		
		for(Supplier supplier : listSuppliers)
		{
			System.out.print(supplier.getAdharCard() + ":::");
			System.out.print(supplier.getCategoryId() + ":::");
			System.out.print(supplier.getEmailId() + ":::");
			System.out.print(supplier.getFirmName() + ":::");
			System.out.print(supplier.getGSTIN() + ":::");
			System.out.print(supplier.getPanCard() + ":::");
			System.out.print(supplier.getPhoneNumber() + ":::");
			System.out.print(supplier.getRatings() + ":::");
			System.out.print(supplier.getSupplierCode() + ":::");
			System.out.print(supplier.getSupplierId() + ":::");
			System.out.println(supplier.getSupplierName() + ":::");
		}
	}

}
