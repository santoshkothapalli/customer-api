package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    private static final Map<String, Customer> tempCustomerDB = new HashMap<>(); 

    static{
        initCustomerDB();
    }

    private static void initCustomerDB() {
        Customer c1 = new Customer(); 
        c1.setCustomerAddress("City, St");
        c1.setCustomerId("123");
        c1.customerName("Graham Guthrie"); 
        c1.setOfficeCode(123);
        tempCustomerDB.put(c1.getCustomerId(), c1); 
    }

    public Customer saveCustomer(@Valid Customer body) {
        tempCustomerDB.put(body.getCustomerId(), body);
        return tempCustomerDB.get(body.getCustomerId()); 
    }


    public Customer getCustomer(String id) {
        return tempCustomerDB.get(id);
    }
    
}
