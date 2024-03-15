package com.application.backend.service.impl;

import org.springframework.stereotype.Service;

import com.application.backend.entity.Customer;
import com.application.backend.repository.CustomerRepository;
import com.application.backend.service.CustomerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    public final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

}
