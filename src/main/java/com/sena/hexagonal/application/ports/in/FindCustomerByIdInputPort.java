package com.sena.hexagonal.application.ports.in;

import com.sena.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
