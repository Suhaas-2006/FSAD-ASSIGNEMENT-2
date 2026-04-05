package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiredDemoApplication implements CommandLineRunner {

    @Autowired
    private RegistrationService service;

    public static void main(String[] args) {
        SpringApplication.run(AutowiredDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        service.register();
    }
}