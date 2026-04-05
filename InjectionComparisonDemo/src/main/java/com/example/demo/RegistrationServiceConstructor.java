package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceConstructor {

    private CourseRepository courseRepository;

    // Constructor Injection
    public RegistrationServiceConstructor(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void register() {
        courseRepository.getCourse();
        System.out.println("Constructor Injection Executed");
    }
}