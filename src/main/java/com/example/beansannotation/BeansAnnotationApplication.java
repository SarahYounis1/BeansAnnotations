package com.example.beansannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class BeansAnnotationApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach" , Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }

}
