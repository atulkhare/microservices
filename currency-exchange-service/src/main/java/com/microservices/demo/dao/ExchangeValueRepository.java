package com.microservices.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.demo.models.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	public ExchangeValue findByFromAndTo(String from, String to);
}
