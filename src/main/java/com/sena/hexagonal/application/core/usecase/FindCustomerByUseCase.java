package com.sena.hexagonal.application.core.usecase;

import com.sena.hexagonal.application.core.domain.Customer;
import com.sena.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByUseCase {

    private final FindCustomerByIdOutputPort FindCustomerByIdOutputPort;

    public FindCustomerByUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.FindCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id){
        return FindCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
