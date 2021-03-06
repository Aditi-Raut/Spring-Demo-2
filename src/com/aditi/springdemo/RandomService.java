package com.aditi.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	
	//create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick a random number
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
