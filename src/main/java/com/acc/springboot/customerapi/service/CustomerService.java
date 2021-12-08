package com.acc.springboot.customerapi.service;

import javax.validation.Valid;

import com.acc.springboot.customerapi.domain.CustomerDomain;
import com.acc.springboot.customerapi.repository.CustomerRepository;
import com.acc.training.customerapi.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer createCustomer(@Valid Customer body) {
        CustomerDomain domain = new CustomerDomain();
        domain.setCustomerId(body.getCustomerId());
        domain.setCustomerName(body.getCustomerName());
        domain.setCustomerAddress(body.getCustomerAddress());
        domain.setOfficeCode(body.getOfficeCode());
        return mapDomain(repository.save(domain));
    }

    public Customer getCustomer(String id) {
        System.out.println("Find By ID :: "+ id);
        return  mapDomain(repository.findByCustomerId(id));
    }


    public Customer mapDomain(CustomerDomain domain){
        Customer  cust = new Customer();
        System.out.println(domain.getCustomerName());
        cust.customerId(domain.getCustomerId());
        cust.customerName(domain.getCustomerName());
        cust.customerAddress(domain.getCustomerAddress());
        cust.officeCode(domain.getOfficeCode());
        return cust;

    }
    

}
