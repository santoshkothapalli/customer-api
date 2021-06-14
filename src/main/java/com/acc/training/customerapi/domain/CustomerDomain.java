package com.acc.training.customerapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers-training-sruthi")
public class CustomerDomain {

    @Id
    private String id;

    private String customerId = null;
    private String customerName = null;
    private String customerAddr = null;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddr() {
        return customerAddr;
    }
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }
    
    
}
