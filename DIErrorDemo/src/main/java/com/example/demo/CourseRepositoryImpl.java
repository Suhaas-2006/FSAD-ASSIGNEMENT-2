package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @Override
    public void getCourse() {
        System.out.println("Course fetched successfully");
    }
}