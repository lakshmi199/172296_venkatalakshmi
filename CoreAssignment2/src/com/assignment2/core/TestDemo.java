package com.assignment2.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ass2.xml");
		 ListDemo c=(ListDemo)context.getBean("demo");
			c.show();
		}
	}


