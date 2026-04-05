package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private CourseRepository courseRepository;

    public void register() {
        courseRepository.getCourse();
        System.out.println("Student registered");
    }
}