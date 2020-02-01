package com.microservices.demo.dao;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservices.demo.fiegnproxy.CurrencyExchangeServiceProxy;
import com.microservices.demo.models.CurrencyConversionBean;

@Repository
public class CurrencyConverterDaoImpl implements CurrencyConverterDao {
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@Override
	public CurrencyConversionBean convertCurrency(String from, String to, BigDecimal quantity) {
		CurrencyConversionBean entity = proxy.retrieveExchangeValue(from, to);

		return new CurrencyConversionBean(entity.getId(), from, to, entity.getConversionMultiple(), quantity,
				quantity.multiply(entity.getConversionMultiple()), entity.getPort());
	}

}
