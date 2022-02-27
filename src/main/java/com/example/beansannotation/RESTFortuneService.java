package com.example.beansannotation;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "REST Fortune : Whatever";
    }
}
