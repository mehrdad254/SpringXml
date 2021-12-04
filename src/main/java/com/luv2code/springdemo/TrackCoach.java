package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5K";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just doIt: " + fortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("initMethod for TrackCoach");
	}
	
	public void destroyMethod() {
		System.out.println("destroyMethod for TrackCoach");
	}

}
