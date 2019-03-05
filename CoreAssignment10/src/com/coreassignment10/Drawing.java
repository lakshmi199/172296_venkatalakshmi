package com.coreassignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ass10.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();
		 }
		
	}


