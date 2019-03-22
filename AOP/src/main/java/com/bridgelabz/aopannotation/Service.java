package com.bridgelabz.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Service {
	 
	 @Before("execution(* com.bridgelabz.aopannotation.Employee.printDetails(..))")
	 public void beforeAdvice(){
	      System.out.println("Before Advice Method.");
	 }
	 @Around("execution(* com.bridgelabz.aopannotation.Employee.printDetails(..))")
	 public void aroundService(ProceedingJoinPoint joinPoint) throws Throwable {
		 System.out.println("Around Advice Method");
	 }
	 @After("execution(* com.bridgelabz.aopannotation.Employee.printDetails(..))")
	 public void afterAdvice(){
	      System.out.println("After Advice Method");
	 }
	
}
