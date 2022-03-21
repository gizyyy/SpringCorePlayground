package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ @PropertySource(value = { "application.properties" }) })
public class StoreConfiguration {

	@Autowired
	private DoughBean doughBean;
	
	@Bean(initMethod = "initExample", destroyMethod = "destroyExample")
	@Profile(value = "pasta")
	public PastaBean pastaBean() {
		return new PastaBean();
	}
	
	@Bean(initMethod = "initExample", destroyMethod = "destroyExample")
	@Profile(value = "pizza")
	public PizzaBean pizzaBean() {
		return new PizzaBean(doughBean);
	}
	
}
