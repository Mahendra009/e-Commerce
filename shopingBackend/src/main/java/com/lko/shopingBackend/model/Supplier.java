package com.lko.shopingBackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Supplier")
@SequenceGenerator(name="supplierIdSeq", sequenceName= "supplier_id_seq",allocationSize=1)
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator ="supplierIdSeq")
	private int supplierId;
	private int categoryId;
	private String supplierCode;
	@NotBlank(message = "Please Enter The Supplier Name!")
	private String supplierName;
	
	@NotBlank(message = "Please Enter The Firm Name!")
	private String firmName;
	
	@NotBlank(message = "Please Enter Your GSTN Number!")
	private String GSTIN;
	
	@NotBlank(message = "Please Enter Your Pan Card Number!")
	private String panCard;
	
	@NotBlank(message = "Please Enter Adhar Card Number!")
	private String adharCard;
	
	@NotBlank(message = "Please Enter Your Phone Number!")
	private String phoneNumber;
	
	@NotBlank(message = "Please Enter Your Email ID!")
	private String emailId;
	
	@Min(value = 1, message = "Price can not be less than 1!")
	private int ratings;
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getGSTIN() {
		return GSTIN;
	}
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	public Supplier()
	{
		this.supplierCode = "SUP" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	
	
	

}
