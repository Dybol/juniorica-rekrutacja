package com.example.springbootcredit.valueobject;

import com.example.springbootcredit.credit.Credit;

/*
Polaczenie wszystkich encji w jedna - tak, zeby mozna bylo wyswietlic oczekiwany rezultat
 */
public class ResponseTemplate {

	private Credit credit;
	private Customer customer;
	private Product product;

	public ResponseTemplate() {
	}

	public ResponseTemplate(Credit credit, Customer customer, Product product) {
		this.credit = credit;
		this.customer = customer;
		this.product = product;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
