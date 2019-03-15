package com.springjdbc.assignment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class AspectDemo {

	@Before("execution(public String com.springjdbc.assignment.EmployeeServices.getMaxSal())")
	public void getEmp1(){
		System.out.println("Advice is printing");
	}
	

	@After("execution(public String com.springjdbc.assignment.EmployeeServices.getMaxSal())")
	public void getEmp(){
		System.out.println("Advice is printing");
	}
	
	
	
	
	
	
	
	
	
	
	}

