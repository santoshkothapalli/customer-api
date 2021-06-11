package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.domain.CustomerDomain;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository; 

    public Customer createCustomer(@Valid Customer body) {
        CustomerDomain customerDomain = mapModelToDomain(body); 
        return mapDomainToModel(repository.save(customerDomain));
    }


    public Customer getCustomer(String id) {
        return mapDomainToModel(repository.findByCustomerId(id));
    }

    private CustomerDomain mapModelToDomain(@Valid Customer body) {
        CustomerDomain customer = new CustomerDomain(); 
        customer.setCustomerId(body.getCustomerId());
        customer.setCustomerAddress(body.getCustomerAddress());
        customer.setCustomerName(body.getCustomerName());
        customer.setOfficeCode(body.getOfficeCode());
        return customer;
    }

    private Customer mapDomainToModel(@Valid CustomerDomain customerDomain) {
        Customer customer = new Customer(); 
        customer.setCustomerId(customerDomain.getCustomerId());
        customer.setCustomerAddress(customerDomain.getCustomerAddress());
        customer.setCustomerName(customerDomain.getCustomerName());
        customer.setOfficeCode(customerDomain.getOfficeCode());
        return customer;
    }

    
    
    
}
