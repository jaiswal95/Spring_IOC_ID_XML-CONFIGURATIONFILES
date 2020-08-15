package com.pankaj.SpringDemo;

public class TrackCoach implements Coach {

	// Define a Private field for Dependency
	private FortuneService fortuneService;

	// Define a Constructor for Dependency Injection
	public TrackCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a 5 miles Hard";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
