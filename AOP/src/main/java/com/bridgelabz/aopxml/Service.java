package com.bridgelabz.aopxml;

public class Service {
	 
	 public void beforeAdvice(){
	      System.out.println("Before Advice Method.");
	 }
	
	 public void afterAdvice(){
	      System.out.println("After Advice Method");
	 }
	 
	 public void aroundAdvice() {
		 System.out.println("Around Advice");
	 }
}
