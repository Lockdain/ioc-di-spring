package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.Coach;

public class BaseballCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
