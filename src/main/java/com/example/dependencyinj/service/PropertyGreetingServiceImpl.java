package com.example.dependencyinj.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello World!! - Property";
    }
}
