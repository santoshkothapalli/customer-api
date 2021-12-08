package com.acc.springboot.customerapi.repository;
import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryBackup{

    private static final Map<String, Customer> customerDB = new HashMap<>();

    static {
        initalizeDB();
    }

    private static void initalizeDB() {

        Customer c1 = new Customer();
        c1.setCustomerId("12345");
        c1.setCustomerName("Santosh");
        c1.setCustomerAddress("100 N Tryon St");
        customerDB.put("12345", c1);
    }

    public Customer createCustomer(Customer cust){
        return customerDB.put(cust.getCustomerId(), cust);
    }

    public Customer findByCustomerId(String id){
        return customerDB.get(id);
    }



}