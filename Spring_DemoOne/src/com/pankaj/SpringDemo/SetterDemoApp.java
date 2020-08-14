package com.pankaj.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load the configuration file(Create a spring Container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from Spring Container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// Call our new methodsto get the literal values
		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeam());

		// Close the context file
		context.close();

	}

}
