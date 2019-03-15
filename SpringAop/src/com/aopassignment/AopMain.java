package com.aopassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService shapeservice=(ShapeService) context.getBean("shapeservice");
		shapeservice.getCircle();
	
		
		
	}

}
