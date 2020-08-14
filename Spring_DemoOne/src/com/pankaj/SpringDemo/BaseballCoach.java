package com.pankaj.SpringDemo;

public class BaseballCoach implements Coach {

	// Define a Private field for Dependency
	private FortuneService fortuneService;

	// Define a Constructor for Dependency Injection
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
