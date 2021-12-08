package com.acc.springboot.customerapi.controller;

import javax.validation.Valid;

import com.acc.springboot.customerapi.service.CustomerService;
import com.acc.training.customerapi.api.CustomerApi;
import com.acc.training.customerapi.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi{

    @Autowired
    private CustomerService customerService;

    @Override
    public ResponseEntity<Customer> createCustomer(@Valid Customer body) {

        Customer customer = customerService.createCustomer(body);
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    @Override
    public ResponseEntity<Customer> getCustomer(String id) {

        Customer customer = customerService.getCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    

}