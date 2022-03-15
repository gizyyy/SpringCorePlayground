package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class PizzaBean implements InitializingBean, DisposableBean {

	@Value("${myProperty}")
	private String param;

	@Autowired
	private DoughBean doughBean;

	PizzaBean() {
		System.out.println("PizzaBean Constructor - Today is pizza day" + param);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("PizzaBean Post Construct " + param);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("PizzaBean afterPropertiesSet " + param);

	}

	public void initExample() {
		System.out.println("PizzaBean init " + param);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("PizzaBean PreDestroy");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("PizzaBean afterPropertiesSet");

	}

	public void destroyExample() {
		System.out.println("PizzaBean Destroy");
	}


}
