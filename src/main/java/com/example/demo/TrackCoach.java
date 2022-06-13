package com.example.demo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Tack 5 mins";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! "+fortuneService.getFortune();
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //init method
    public void doMyStartStuff(){
        System.out.println("start");
    }

    public void doCleanupStuff(){
        System.out.println("destroy");
    }

    //destroy method

}
