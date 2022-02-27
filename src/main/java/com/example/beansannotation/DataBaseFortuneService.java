package com.example.beansannotation;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "DataBase Fortune = don't be that optimistic";
    }
}
