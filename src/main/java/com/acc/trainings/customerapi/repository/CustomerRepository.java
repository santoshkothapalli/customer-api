package com.acc.trainings.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.acc.training.customerapi.model.Customer;

@Repository
public class CustomerRepository {
    
    public static final Map<String, Customer> customerMapDB = new HashMap<>() ;

    static{
        initCustomerDB();
    }
    
    private static void initCustomerDB(){
        Customer customer = new Customer();
        customer.setCustomerId("Cust1");
        customer.setCustomerName("Cust1-Name");

        customerMapDB.put(customer.getCustomerId(), customer);
    }

    public Customer getCustomerInfo(String customerId){
        return customerMapDB.get(customerId);
    }

    public Customer saveCustomerInfo(Customer customerInfo){
        customerMapDB.put(customerInfo.getCustomerId(), customerInfo);
        return customerMapDB.get(customerInfo.getCustomerId());
    }
}
