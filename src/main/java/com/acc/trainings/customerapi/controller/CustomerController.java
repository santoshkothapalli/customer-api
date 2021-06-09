package com.acc.trainings.customerapi.controller;

import com.acc.training.customerapi.api.CustomerApi;
import com.acc.training.customerapi.model.Customer;
import com.acc.trainings.customerapi.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    private CustomerService customerService;

    @Override
    public ResponseEntity<Customer> getCustomerId(String id) {
        Customer customerResponse = customerService.getCustomerId(id);
        ResponseEntity responseEntity = null;

        if(customerResponse == null){
            responseEntity = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else {
            responseEntity = ResponseEntity.status(HttpStatus.OK).body(customerResponse);
        }
        return responseEntity;
    }
    
}