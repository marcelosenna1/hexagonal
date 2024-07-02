package com.sena.hexagonal.application.ports.out;

import com.sena.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert (Customer customer);
}
