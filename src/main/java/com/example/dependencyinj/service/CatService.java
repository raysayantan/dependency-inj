package com.example.dependencyinj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"cat"})
@Service
public class CatService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
