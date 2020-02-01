package com.microservices.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.demo.models.CurrencyConversionBean;
import com.microservices.demo.service.CurrencyConverterService;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyConverterService service;
	
	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		return service.convertCurrency(from, to, quantity);
	}
}
