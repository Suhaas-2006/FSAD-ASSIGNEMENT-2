package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceSetter {

    private CourseRepository courseRepository;

    // Setter Injection
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void register() {
        courseRepository.getCourse();
        System.out.println("Setter Injection Executed");
    }
}