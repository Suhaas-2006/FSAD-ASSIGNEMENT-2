package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryImpl1 implements CourseRepository {

    @Override
    public void getCourse() {
        System.out.println("Course from Repository 1");
    }
}