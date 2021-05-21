package com.example.dependencyinj.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello World!! - Setter";
    }
}
