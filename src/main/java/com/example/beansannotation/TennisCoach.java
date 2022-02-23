package com.example.beansannotation;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach  {

    @Override //this is annotations
    public String getDailyWorkout() {
        return "Practice your push Ups";
    }
}
