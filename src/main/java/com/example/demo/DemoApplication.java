package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Coach theCoach = context.getBean("myCoach", Coach.class);

            CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

            System.out.println(theCoach.getDailyWorkout());

            System.out.println(theCoach.getDailyFortune());

            System.out.println(myCricketCoach.getDailyWorkout());

            System.out.println(myCricketCoach.getDailyFortune());

            myCricketCoach.getTeam();
            myCricketCoach.getEmailAddress();

            System.out.println(myCricketCoach.getDailyFortune());

            context.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
