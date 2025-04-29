package com.training.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.training.model.Customer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerShowAllResponse {
    @JsonProperty("statusCode")
    private int statusCode;

    @JsonProperty("description")
    private String description;

    @JsonProperty("customers")
    private List<Customer> customers;

    // Getters and Setters

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}

