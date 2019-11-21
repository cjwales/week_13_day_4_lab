package com.codeclan.CourseBooking.projections;

import com.codeclan.CourseBooking.models.Booking;
import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedBooking", types = Booking.class)
public interface EmbedBooking {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
