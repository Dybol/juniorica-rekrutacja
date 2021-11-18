package com.example.springbootproduct.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/*
	Przypisujemy produktowi podane ID i zapisujemy go w bazie danych
	 */
	public Product save(Product product, Integer id) {
		product.setCreditID(id);
		return productRepository.save(product);
	}

	/*
	Znajdujemy wszystkie produkty z bazy danych
	 */
	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
