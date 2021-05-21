package com.example.dependencyinj.controllers;

import com.example.dependencyinj.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
