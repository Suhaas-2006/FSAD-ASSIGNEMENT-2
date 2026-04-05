package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectionComparisonDemoApplication implements CommandLineRunner {

	@Autowired
	private RegistrationServiceSetter service;

    public static void main(String[] args) {
        SpringApplication.run(InjectionComparisonDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        service.register();
    }
}