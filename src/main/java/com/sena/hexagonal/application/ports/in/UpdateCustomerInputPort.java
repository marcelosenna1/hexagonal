package com.sena.hexagonal.application.ports.in;

import com.sena.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update (Customer customer, String zipCode);
}
