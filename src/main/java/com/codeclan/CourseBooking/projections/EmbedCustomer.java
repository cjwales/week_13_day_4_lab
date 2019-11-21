package com.codeclan.CourseBooking.projections;

import com.codeclan.CourseBooking.models.Booking;
import com.codeclan.CourseBooking.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCustomer", types = Customer.class)
public interface EmbedCustomer {
    String getName();
    String getTown();
    String getAge();
    List<Booking> getBookings();
}
