package com.acc.trainings.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.model.Customer;
import com.acc.trainings.customerapi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerId(String id) {
        return customerRepository.getCustomerInfo(id);
    }

    public Customer creatCustomer(@Valid Customer customerBody){
     return customerRepository.saveCustomerInfo(customerBody);
    }
}