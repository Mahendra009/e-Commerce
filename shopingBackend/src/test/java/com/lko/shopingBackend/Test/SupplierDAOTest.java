package com.lko.shopingBackend.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lko.shopingBackend.DAO.SupplierDAO;
import com.lko.shopingBackend.model.Supplier;

public class SupplierDAOTest {
	
	private static AnnotationConfigApplicationContext context;
	private static SupplierDAO supplierDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.lko");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}

	@Ignore
	@Test
	public void testSaveSupplier() {
		Supplier supplier = new Supplier();
		supplier.setAdharCard("ADHAR1234");
		supplier.setCategoryId(1102);
		supplier.setEmailId("neeraj123@gmail.com");
		supplier.setFirmName("Sharma Traders");
		supplier.setGSTIN("GSTN12345678");
		supplier.setPanCard("PAN12345678");
		supplier.setPhoneNumber("3333333333");
		supplier.setRatings(4);
		supplier.setSupplierName("Neeraj Sharma");
		
		assertTrue("Problem in saving Supplier", supplierDAO.saveSupplier(supplier));
	}

	@Ignore
	@Test
	public void testUpdateSupplier() {
		Supplier supplier = supplierDAO.getSupplier(102);
		supplier.setRatings(5);
		
		assertTrue("Can not update supplier details", supplierDAO.updateSupplier(supplier));
	}

	@Ignore
	@Test
	public void testDeleteSupplier() {
		Supplier supplier = supplierDAO.getSupplier(102);
		assertTrue("Can't delete supplier ", supplierDAO.deleteSupplier(supplier));
	}

	@Ignore
	@Test
	public void testGetSupplier() {
		System.out.println("Neeraj Sharma");
		assertNotNull("Can not get supplier details", supplierDAO.getSupplier(152));
	}

	
	@Test
	public void testListSuppliers() {
		List<Supplier> listSuppliers = supplierDAO.listSuppliers();
		assertTrue("Can not get suppliers list", listSuppliers.size()>0);
		
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
