package com.codeclan.CourseBooking.components;

import com.codeclan.CourseBooking.models.Booking;
import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.models.Customer;
import com.codeclan.CourseBooking.repositories.bookingRepository.BookingRepository;
import com.codeclan.CourseBooking.repositories.courseRepository.CourseRepository;
import com.codeclan.CourseBooking.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Python", "Glasgow", 5);
        courseRepository.save(course1);
        Course course2 = new Course("React", "Edinburgh", 3);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Clive", "Glasgow", 24);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Jane", "Edinburgh", 32);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("29-01-19", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("25/09/19", course2, customer2);
        bookingRepository.save(booking2);

    }
}
