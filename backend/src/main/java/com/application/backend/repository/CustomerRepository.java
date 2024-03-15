package com.application.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.backend.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
