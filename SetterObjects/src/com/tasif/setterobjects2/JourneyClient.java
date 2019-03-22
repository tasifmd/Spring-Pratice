package com.tasif.setterobjects2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JourneyClient {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");  
        Journey journey =  (Journey)context.getBean("travel");
        journey.startJourney();
	}
}