package com.luv2code.springdemo;

import com.luv2code.springdemo.coach.TrackCoach;
import com.luv2code.springdemo.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new TrackCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
