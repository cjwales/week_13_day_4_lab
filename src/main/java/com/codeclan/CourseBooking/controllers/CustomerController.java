package com.codeclan.CourseBooking.controllers;

import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.models.Customer;
import com.codeclan.CourseBooking.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/attending/{courseId}")
    public List<Customer> findCustomersByBookingsCourseId(@PathVariable Long courseId) {
        return customerRepository.findCustomersByBookingsCourseId(courseId);
    }
}
