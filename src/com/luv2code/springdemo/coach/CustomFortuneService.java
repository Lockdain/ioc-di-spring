package com.luv2code.springdemo.coach;

import java.util.Random;

import com.luv2code.springdemo.interfaces.FortuneService;

public class CustomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Yo maan", "Hey there", "Cmon, do it!"};

	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(3)];
	}

}
