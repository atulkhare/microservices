package com.microservices.demo.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.demo.dao.ExchangeValueRepository;
import com.microservices.demo.models.ExchangeValue;
import com.microservices.demo.service.ExchangeValueService;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

	@Autowired
	private ExchangeValueRepository repository;
	
	@Override
	public ExchangeValue findByFromAndTo(String from, String to) {
		return repository.findByFromAndTo(from, to);
	}
}
