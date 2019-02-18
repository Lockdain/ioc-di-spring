package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
