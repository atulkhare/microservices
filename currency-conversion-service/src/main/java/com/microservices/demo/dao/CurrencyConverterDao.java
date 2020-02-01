package com.microservices.demo.dao;

import java.math.BigDecimal;

import com.microservices.demo.models.CurrencyConversionBean;

public interface CurrencyConverterDao {

	public CurrencyConversionBean convertCurrency(String from, String to, BigDecimal quantity);
}
