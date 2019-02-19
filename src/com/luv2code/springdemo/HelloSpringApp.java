package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCustomCoach = context.getBean("myCustomCoach", Coach.class);
		
		// Call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// Implicitly call methods on injected FortuneService
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Random: " + theCustomCoach.getDailyFortune());
		
		// Close the context
		context.close();

	}
}
