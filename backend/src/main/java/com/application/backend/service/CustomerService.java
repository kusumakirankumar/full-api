package com.application.backend.service;

import org.springframework.stereotype.Service;

import com.application.backend.entity.Customer;

@Service
public interface CustomerService {

    Customer createCustomer(Customer customer);
}
