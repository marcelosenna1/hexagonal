package com.sena.hexagonal.application.core.usecase;

import com.sena.hexagonal.application.core.domain.Customer;
import com.sena.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.sena.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCOdeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort){
        this.findAddressByZipCOdeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCOdeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
