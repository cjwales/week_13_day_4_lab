package com.codeclan.CourseBooking.controllers;

import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping(value = "/rated/{rating}")
    public List<Course> findCourseByRating(@PathVariable int rating) {
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/attendedby/{customerId}")
    public List<Course> findCoursesByBookingsCustomerId(@PathVariable Long customerId) {
        return courseRepository.findCoursesByBookingsCustomerId(customerId);
    }
}
