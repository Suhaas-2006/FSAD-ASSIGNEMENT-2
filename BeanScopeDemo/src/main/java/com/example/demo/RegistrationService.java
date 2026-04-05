package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class RegistrationService {

    public RegistrationService() {
        System.out.println("RegistrationService object created");
    }

    public void register() {
        System.out.println("Register method called");
    }
}