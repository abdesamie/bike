package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitialize","handler"})
public class Bike {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="MM-dd-yyyy" )
	private Date purchaseDate;
	private boolean contact;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getSerialNumber() {
		return serialNumber;
	}
	void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	Date getPurchaseDate() {
		return purchaseDate;
	}
	void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	boolean isContact() {
		return contact;
	}
	void setContact(boolean contact) {
		this.contact = contact;
	}
	

	Long getId() {
		return id;
	}
	void setId(Long id) {
		this.id = id;
	}

}
