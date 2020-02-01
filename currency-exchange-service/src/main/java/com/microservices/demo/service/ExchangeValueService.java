package com.microservices.demo.service;

import com.microservices.demo.models.ExchangeValue;

public interface ExchangeValueService {

	public ExchangeValue findByFromAndTo(String from, String to);
}
