package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Get on to the track and run for 20 minutes now";
	}

}
