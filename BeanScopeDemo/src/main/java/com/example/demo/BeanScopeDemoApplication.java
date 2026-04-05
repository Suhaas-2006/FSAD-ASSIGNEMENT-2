package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScopeDemoApplication implements CommandLineRunner {

    private final ApplicationContext context;

    public BeanScopeDemoApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanScopeDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // Get bean multiple times
        RegistrationService s1 = context.getBean(RegistrationService.class);
        RegistrationService s2 = context.getBean(RegistrationService.class);

        s1.register();
        s2.register();

        // Compare objects
        System.out.println("Are both objects same? " + (s1 == s2));
    }
}