package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springcore.xml");
		context.registerShutdownHook();
		Customer cust=(Customer)context.getBean("customer");
		cust.getCustomer();
	}
	

}
