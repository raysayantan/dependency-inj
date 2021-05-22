package com.example.dependencyinj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"dog", "default"})
@Service
public class DogService implements PetService{
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
