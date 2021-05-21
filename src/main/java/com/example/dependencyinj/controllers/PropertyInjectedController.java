package com.example.dependencyinj.controllers;

import com.example.dependencyinj.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
