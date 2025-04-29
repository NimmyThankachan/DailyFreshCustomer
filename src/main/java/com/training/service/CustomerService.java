package com.training.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerRepository;
import com.training.exception.CustomerNotFoundException;
import com.training.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;

	public Customer addNewCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer searchCustomer(int id) throws CustomerNotFoundException {
		return repo.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found with id: " + id));
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();

	}

	public boolean deleteCustomer(Customer customer) {
		repo.delete(customer);
		return true;
	}

	public List<Customer> getAllCustomersByLocation(String location) {
		return repo.findByLocation_Name(location).stream().filter(c -> location.equalsIgnoreCase(location)).collect(Collectors.toList());
	}

	public List<Customer> getAllCustomersByCity(String city) {
		return repo.findByCity_Name(city).stream().filter(c -> city.equalsIgnoreCase(city)).collect(Collectors.toList());
	}

}
