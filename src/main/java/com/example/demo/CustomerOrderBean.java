package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CustomerOrderBean implements InitializingBean, DisposableBean {

	CustomerOrderBean(){
		System.out.println("Constructor CustomerOrderBean");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct CustomerOrderBean");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet CustomerOrderBean");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy CustomerOrderBean");

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("afterPropertiesSet CustomerOrderBean");

	}

}
