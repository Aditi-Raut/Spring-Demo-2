package com.aditi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Field Injection
	/*
	@Autowired
	private FortuneService fortuneService;
	*/
	
	/*
	 * Constructor Injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	*/
	
	
	
	public TennisCoach()
	{
		System.out.println(">> Tennis Coach: Inside default constructor");
	}
	
	//Setter Injection
	//define setter method
	
	@Autowired
	@Qualifier("randomService")
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> Tennis Coach: Inside setFortuneService");
		fortuneService = theFortuneService;
	}
	
	
	//Method Injection
	/*
	@Autowired
	public void doSomething(FortuneService theFortuneService)
	{
		System.out.println(">> Tennis Coach: Inside doSomething");
		fortuneService = theFortuneService;
	}
	*/


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
