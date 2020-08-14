package com.pankaj.SpringDemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "Today is your Bad Day!", " Good Day for you!",
			"The Journey is the going to be get better!" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}
}
