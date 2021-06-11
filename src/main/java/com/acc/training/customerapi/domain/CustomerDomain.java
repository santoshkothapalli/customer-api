package com.acc.training.customerapi.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer-taining-osse")
public class CustomerDomain {

    @Id
    private String id;
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
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public Integer getOfficeCode() {
        return officeCode;
    }
    public void setOfficeCode(Integer officeCode) {
        this.officeCode = officeCode;
    }
    private String customerId = null;
    private String customerName = null;
    private String customerAddress = null;
    private Integer officeCode = null;
        
    
}
    