package com.sena.hexagonal.application.ports.out;

import com.sena.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find (String id);
}
