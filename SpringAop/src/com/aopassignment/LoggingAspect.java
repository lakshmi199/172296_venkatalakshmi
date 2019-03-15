package com.aopassignment;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allcirclemethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
	
	}

	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void stringArgumentMethods(String name,Object returnString) {
		System.out.println("a method that takes string arguments has called. The value is :" + name+"the output value is:"+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void exceptionAdvice(String name,Exception ex) {
		System.out.println("an exception has been throw" + ex);
	}
	
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue=null;
		try {
			
			System.out.println("before Advice");
			proceedingJoinPoint.proceed();
			System.out.println("after Returning");
		}catch(Throwable e) {
			System.out.println("after Throwing");
		}
		System.out.println("after finally");
		return returnValue;
		
		}
		
	
	@Pointcut("execution( * get*())")
	public void allGetters() {}
	
	
	
	@Pointcut("within(com.aopassignment.Circle)")
	public void allcirclemethods() {}
}
