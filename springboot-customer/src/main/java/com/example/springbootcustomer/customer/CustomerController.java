package com.example.springbootcustomer.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	/*
	Dodajemy klienta, oraz przypisujemy mu ID
	 */
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer, @RequestParam(name = "creditID") Integer id) {
		return customerService.save(customer, id);
	}

	/*
	Pobieramy wszystkichj klientow
	 */
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.findAll();
	}
}
