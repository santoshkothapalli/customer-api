/*package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    private static final Map<String, Customer> tempCustomerDB = new HashMap<>();

    static {
        initCustomerDB();
    }

    private static void initCustomerDB() {
        Customer c1 = new Customer();
        c1.setCustomerId("12345");
        c1.setCustomerName("Karthik");
        c1.setCustomerAddress("Atlanta, GA");
        c1.setOfficeCode(500);

        tempCustomerDB.put(c1.getCustomerId(), c1);
    }

    public Customer getCustomerDetails(String id){
        return tempCustomerDB.get(id);
    }

    public Customer saveCustomerDetails(Customer customer){
        tempCustomerDB.put(customer.getCustomerId(),customer);
        return tempCustomerDB.get(customer.getCustomerId());
    }
    
}*/
