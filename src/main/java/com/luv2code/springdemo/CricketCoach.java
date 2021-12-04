package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach setter setEmailAddress ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach setter setTeam ");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach no-args constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach setter setFortuneService ");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
