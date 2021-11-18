package com.example.springbootproduct.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	/*
	Dodajemy produkt i przypisujemy mu ID
	 */
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product, @RequestParam(name = "creditID") Integer id) {
		return productService.save(product, id);
	}

	/*
	Zwracamy wszystkie produkty
	 */
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.findAll();
	}
}
