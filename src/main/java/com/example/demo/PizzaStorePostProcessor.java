package com.example.demo;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class PizzaStorePostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("PizzaStorePostProcessor - Store is opening");

		Random rd = new Random();
		boolean isABusyDay = rd.nextBoolean();
		if (isABusyDay) {
			// we need the helper guy
			beanFactory.getBeanDefinition("helperGuyBean").setLazyInit(false);
		}
	}

}
