/**
 * 
 */
package com.microservices.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.demo.Configurations;
import com.microservices.demo.models.LimitConfiguration;

/**
 * @author 781245
 *
 */
@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configurations configurations;
	
	/**
	 * 
	 */
	public LimitsConfigurationController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configurations.getMaximum(), configurations.getMinimum());
	}

}
