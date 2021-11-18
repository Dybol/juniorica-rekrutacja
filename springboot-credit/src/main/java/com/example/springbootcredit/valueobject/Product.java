package com.example.springbootcredit.valueobject;

/*
Zwykłe POJO dla produktu
 */
public class Product {

	private Integer creditID;
	private String productName;
	private Integer value;

	public Product() {
	}

	public Product(Integer creditID, String productName, Integer value) {
		this.creditID = creditID;
		this.productName = productName;
		this.value = value;
	}

	public Integer getCreditID() {
		return creditID;
	}

	public void setCreditID(Integer creditID) {
		this.creditID = creditID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
