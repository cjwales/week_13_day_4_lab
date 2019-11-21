package com.codeclan.CourseBooking.repositories.bookingRepository;

import com.codeclan.CourseBooking.models.Booking;
import com.codeclan.CourseBooking.projections.EmbedBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBooking.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);
}
