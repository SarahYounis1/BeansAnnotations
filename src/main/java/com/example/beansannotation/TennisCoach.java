package com.example.beansannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach  {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService theFortuneService;

     @PostConstruct
     public void MyInitMethod(){
         System.out.println("Init method");
     }

    @PreDestroy
    public void MyDestroyMethod(){
        System.out.println("Destroy method");
    }

    /*
    public TennisCoach(FortuneService fortuneService){
        theFortuneService = fortuneService;
    } */

   /* @Autowired
    public void setTheFortuneService(FortuneService fortuneService){
         this.theFortuneService= fortuneService;
    } */

    @Override //this is annotations
    public String getDailyWorkout() {
        return "Practice your push Ups";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();

    }
}
