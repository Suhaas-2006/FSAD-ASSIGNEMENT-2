package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    @Qualifier("courseRepositoryImpl2") // choose which bean
    private CourseRepository courseRepository;

    public void register() {
        courseRepository.getCourse();
        System.out.println("Student registered successfully");
    }
}