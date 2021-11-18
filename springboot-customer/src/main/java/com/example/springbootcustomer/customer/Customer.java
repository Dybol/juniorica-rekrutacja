package com.example.springbootcustomer.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Encja odpowiadajaca za klienta
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer creditID;
	private String firstName;
	private String pesel;
	private String surname;

	public Customer() {
	}

	public Customer(String firstName, String pesel, String surname) {
		this.firstName = firstName;
		this.pesel = pesel;
		this.surname = surname;
	}

	public Integer getCreditID() {
		return creditID;
	}

	public void setCreditID(Integer creditID) {
		this.creditID = creditID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
