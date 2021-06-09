package service;

import javax.validation.Valid;

import com.acc.repository.CustomerRepository;
import com.acc.training.customerapi.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
 private CustomerRepository repository;
 
 public Customer createCustomer(@Valid Customer body) {
 return repository.saveCustomerDetails(body);
 }
 
 public Customer getCustomer(String id) {
 return repository.getCustomerDetails(id);
 }
    
}
