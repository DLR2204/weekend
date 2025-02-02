package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com")
@Configuration
public class Test {

	public static void main(String[] args) {

		BeanFactory obj = new AnnotationConfigApplicationContext(Test.class);

		System.out.println(obj.getBean("emp"));
		
		

	}

}
