package com.codeclan.CourseBooking.projections;

import com.codeclan.CourseBooking.models.Booking;
import com.codeclan.CourseBooking.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCourse", types = Course.class)
public interface EmbedCourse {
    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
