package com.sena.hexagonal.application.ports.in;

import com.sena.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
