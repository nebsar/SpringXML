package com.example.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes = {"fortune 1","fortune 2", "fortune 3"};
    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        return fortunes[myRandom.nextInt(fortunes.length)];
    }
}
