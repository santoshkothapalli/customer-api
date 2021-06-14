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
    private CustomerRepository repo;

    public Customer createCustomer(@Valid Customer body) {
        CustomerDomain custDomain = mapModelToDomain(body);
        return mapDomainToModel(repo.save(custDomain));
    }
    
    public Customer getCustomer(String id) {
        return mapDomainToModel(repo.findByCustomerId(id));
    }

    private Customer mapDomainToModel(CustomerDomain body) {
        Customer cust = new Customer();

        cust.setCustomerId(body.getCustomerId());
        cust.setCustomerName(body.getCustomerName());
        cust.setCustomerAddr(body.getCustomerAddr());

        return cust;
    }

    private CustomerDomain mapModelToDomain(@Valid Customer body) {
        CustomerDomain custDomain = new CustomerDomain();

        custDomain.setCustomerId(body.getCustomerId());
        custDomain.setCustomerName(body.getCustomerName());
        custDomain.setCustomerAddr(body.getCustomerAddr());

        return custDomain;
    }   
}
