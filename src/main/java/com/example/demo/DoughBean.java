package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DoughBean implements InitializingBean, DisposableBean {

	DoughBean(){
		System.out.println("Constructor DoughBean");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct DoughBean");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet DoughBean");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy DoughBean");

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("afterPropertiesSet ExampleDependendBean");

	}

}
