package com.example.springbootcustomer.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/*
	Przypisujemy klientowi ID i zapisujemy go w bazie danych
	 */
	public Customer save(Customer customer, Integer id) {
		customer.setCreditID(id);
		return customerRepository.save(customer);
	}

	/*
	Znajdujemy wszystkich klientow i zwracamy ich
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
