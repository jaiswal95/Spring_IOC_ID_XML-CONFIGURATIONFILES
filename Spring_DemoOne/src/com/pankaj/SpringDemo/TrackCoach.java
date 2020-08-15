package com.pankaj.SpringDemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

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

	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method -> doMyStartupStuff ");
	}

	// Add a destroy method for singleton Scope
	public void doMyCLeanupStuff() {
		System.out.println("TrackCoach: Inside method -> doMyCleanupStuff ");
	}

	// Add a destroy method for prototype Scope
	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside method doMyCleanupStuff(prototype)");
	}

}
