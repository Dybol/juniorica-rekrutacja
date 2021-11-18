package com.example.springbootcredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCreditApplication.class, args);
	}

	/*
	Musimy dodać ziarno związane z RestTemplatem, żeby można było go wstrzyknąć do serwisu
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
