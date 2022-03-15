package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ @PropertySource(value = { "application.properties" }) })
public class StoreConfiguration {

	@Bean(initMethod = "initExample", destroyMethod = "destroyExample")
	@Profile(value = "pasta")
	public PastaBean pastaBean() {
		return new PastaBean();
	}
	
	@Bean(initMethod = "initExample", destroyMethod = "destroyExample")
	@Profile(value = "pizza")
	public PizzaBean pizzaBean() {
		return new PizzaBean();
	}
	
}
