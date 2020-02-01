package com.microservices.demo;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.microservices.demo")
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConversionServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

	@Bean(name = "restTemplate")
	@Primary
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		RestTemplate template = restTemplateBuilder
				.interceptors(Collections.singletonList((request, body, execution) -> {
		            LOGGER.debug("Intercepting...");
		            return execution.execute(request, body);
		        }))
				.messageConverters(new MappingJackson2HttpMessageConverter()).build();
		return template;

	}
}
