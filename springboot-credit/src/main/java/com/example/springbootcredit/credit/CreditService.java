package com.example.springbootcredit.credit;

import ch.qos.logback.core.net.server.Client;
import com.example.springbootcredit.valueobject.Customer;
import com.example.springbootcredit.valueobject.Product;
import com.example.springbootcredit.valueobject.ResponseTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/*
Serwis, w ktorym wykonywana jest praktycznie cala logika aplikacji
 */
@Service
public class CreditService {

	private final CreditRepository creditRepository;
	private final RestTemplate restTemplate;

	public CreditService(CreditRepository creditRepository, RestTemplate restTemplate) {
		this.creditRepository = creditRepository;
		this.restTemplate = restTemplate;
	}

	/*
	Tworzymy kredyt, produkt i klienta
	 */
	public Integer create(ResponseTemplate template) {
		Credit credit = creditRepository.save(template.getCredit());

		HttpEntity<Customer> customerEntity = new HttpEntity<>(template.getCustomer());
		HttpEntity<Product> productEntity = new HttpEntity<>(template.getProduct());

		restTemplate.postForObject("http://localhost:9001/customer?creditID=" + credit.getID(), customerEntity, Customer.class);
		restTemplate.postForObject("http://localhost:9002/product?creditID=" + credit.getID(), productEntity, Product.class);

		return credit.getID();
	}

	/*
	Zwracamy wszystkie kredyty
	 */
	public List<ResponseTemplate> getAll() {
		List<ResponseTemplate> responseTemplates = new ArrayList<>();
		List<Credit> credits = creditRepository.findAll();
		for(Credit credit: credits) {
			ResponseTemplate responseTemplate = new ResponseTemplate();
			responseTemplate.setCredit(credit);

			Customer[] customers = restTemplate.getForObject("http://localhost:9001/customers/" , Customer[].class);
			Product[] products = restTemplate.getForObject("http://localhost:9002/products/", Product[].class);

			if(customers == null || products == null)
				return new ArrayList<>();

			for(Customer customer: customers)
				if(customer.getCreditID().equals(credit.getID()))
					responseTemplate.setCustomer(customer);

			for(Product product: products)
				if(product.getCreditID().equals(credit.getID()))
					responseTemplate.setProduct(product);
			responseTemplates.add(responseTemplate);
		}

		return responseTemplates;
	}
}
