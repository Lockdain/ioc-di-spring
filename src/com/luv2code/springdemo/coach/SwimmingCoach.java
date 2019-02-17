package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.Coach;

public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Now swimming for 20 minutes and come back";
	}

}
