package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();

	}
}
