package com.lko.shopingBackend.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "Products")
@SequenceGenerator(name="productIdSeq", sequenceName= "product_id_seq",allocationSize=1)
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator ="productIdSeq")
	@Column(name="Product_ID")
	private int productId;
	
	@Column(name="Category_ID")
	private int categoryId;
	
	@Column(name="Supplier_ID")
	private int supplierId;
	
	@Column(name="Product_Code")
	private String productCode;
	
	@Column(name="Product_Name")
	private String productName;
	
	@Column(name="Brand")
	private String brand;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="Price")
	private double unitPrice;
	
	@Column(name="Ratings")
	private int rating;
	
	@Transient
	@Column(name="Image")
	private MultipartFile file;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	public Product()
	{
		this.productCode = "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	

}
