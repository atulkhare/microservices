package com.microservices.demo.service;

import java.math.BigDecimal;

import com.microservices.demo.models.CurrencyConversionBean;

public interface CurrencyConverterService {

	public CurrencyConversionBean convertCurrency(String from, String to, BigDecimal quantity);
}
