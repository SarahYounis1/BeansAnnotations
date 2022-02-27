package com.example.beansannotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Random Fortune : Try your Best to keep positive";
    }
}
