package com.codeclan.CourseBooking.repositories.courseRepository;

import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.projections.EmbedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCourseByRating(int rating);

    List<Course> findCoursesByBookingsCustomerId(Long customerId);
}
