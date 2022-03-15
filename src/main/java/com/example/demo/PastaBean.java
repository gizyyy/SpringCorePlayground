package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class PastaBean implements InitializingBean, DisposableBean {

	@Value("${myProperty}")
	private String param;

	@Autowired
	private DoughBean doughBean;

	PastaBean() {
		System.out.println("PastaBean Constructor - Today is pasta day" + param);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("PastaBean Post Construct " + param);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("PastaBean afterPropertiesSet " + param);

	}

	public void initExample() {
		System.out.println("PastaBean init Example "+param);
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("PastaBean PreDestroy");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("PastaBean afterPropertiesSet");

	}

	public void destroyExample() {
		System.out.println("PastaBean Destroy");
	}

}
