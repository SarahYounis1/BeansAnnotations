package com.example.beansannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "It's Your Lucky Day";
    }
}
