package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if the beans are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("Is the same object: " + result);
		System.out.println("Memory location for the theCoach: " + theCoach);
		System.out.println("Memory location for the alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();

	}
}
