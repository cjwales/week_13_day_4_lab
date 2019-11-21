package com.codeclan.CourseBooking.repositories.customerRepository;

import com.codeclan.CourseBooking.models.Customer;
import com.codeclan.CourseBooking.projections.EmbedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
