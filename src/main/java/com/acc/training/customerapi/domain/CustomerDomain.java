package com.acc.training.customerapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers-training-aritra")
public class CustomerDomain {

    @Id
    private String id;

    private String customerId = null;

    private String customerName = null;

    private String customerAddress = null;
    
    private Integer officeCode = null;
    

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(Integer officeCode) {
        this.officeCode = officeCode;
    }

}
