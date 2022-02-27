package com.example.beansannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatinScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach theCoach1 = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == theCoach1);
         System.out.println(theCoach);
         System.out.println(theCoach1);
         System.out.println(result);


         context.close();
         
    }
}
