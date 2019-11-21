package com.codeclan.CourseBooking.repositories.courseRepository;

import com.codeclan.CourseBooking.models.Course;
import com.codeclan.CourseBooking.projections.EmbedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long> {
}
