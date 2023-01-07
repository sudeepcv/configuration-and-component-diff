package com.sudeep.annotationdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationdemoApplication {
	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(AnnotationdemoApplication.class, args);
	}

	@PostConstruct
	private void postConstruct() {
		System.out.println("---------------------=postConstruct=------------------------");
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			if(beanName.contains("person") || beanName.contains("customPerson") || beanName.contains("customRestTemplate"))
			System.out.println(beanName);
		}

	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}

}
