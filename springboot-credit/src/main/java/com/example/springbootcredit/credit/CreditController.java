package com.example.springbootcredit.credit;

import com.example.springbootcredit.valueobject.ResponseTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class CreditController {

	private final CreditService creditService;

	public CreditController(CreditService creditService) {
		this.creditService = creditService;
	}

	/*
	Pobieramy wszystkie kredyty i wyswietlamy je
	 */
	@GetMapping("/credits")
	public List<ResponseTemplate> getCredits() {
		return creditService.getAll();
	}

	/*
	Dodajemy kredyt i zwracamy jego ID
	 */
	@PostMapping("/credit")
	public Integer createCredit(@RequestBody ResponseTemplate template) {
		return creditService.create(template);
	}
}
