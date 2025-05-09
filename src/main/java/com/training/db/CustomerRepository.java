package com.training.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	List<Customer> findByLocation_Name(String location);

	List<Customer> findByCity_Name(String city);
}
