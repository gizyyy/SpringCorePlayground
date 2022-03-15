package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HelperGuyBean implements InitializingBean, DisposableBean {

	HelperGuyBean(){
		System.out.println("HelperGuyBean Constructor : I'm working today");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct HelperGuyBean");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet HelperGuyBean");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy HelperGuyBean");

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("afterPropertiesSet HelperGuyBean");

	}

}
