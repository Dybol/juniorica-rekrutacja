package com.example.springbootcredit.valueobject;

/*
Zwykłe POJO dla klienta
 */
public class Customer {

	private Integer creditID;
	private String firstName;
	private String pesel;
	private String surname;

	public Customer() {
	}

	public Customer(Integer creditID, String firstName, String pesel, String surname) {
		this.creditID = creditID;
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
