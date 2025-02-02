package com.acc.springboot.customerapi.repository;

import com.acc.springboot.customerapi.domain.CustomerDomain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository  extends MongoRepository<CustomerDomain, String>{
    CustomerDomain findByCustomerId(String custId);

}