package com.example.demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String emailAddress;

    public CricketCoach() {
        System.out.println("Cricket Coach is created!");
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket 5 mins";
    }

    @Override
    public String getDailyFortune() {
        return "Cricket Do it! " + fortuneService.getFortune();
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach setter method!");
        this.fortuneService = fortuneService;
    }

    public void getTeam() {
        System.out.println("get Team: " + this.team);
    }

    public void getEmailAddress() {
        System.out.println("Get email address: " + emailAddress);
    }

    public void setTeam(String team) {
        System.out.println(team);
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println(emailAddress);
        this.emailAddress = emailAddress;
    }
}
