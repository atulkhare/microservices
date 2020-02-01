package com.microservices.demo.serviceimpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.demo.dao.CurrencyConverterDao;
import com.microservices.demo.models.CurrencyConversionBean;
import com.microservices.demo.service.CurrencyConverterService;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {

	@Autowired
	private CurrencyConverterDao dao;
	
	@Override
	public CurrencyConversionBean convertCurrency(String from, String to, BigDecimal quantity) {
		return dao.convertCurrency(from, to, quantity);
	}
}
