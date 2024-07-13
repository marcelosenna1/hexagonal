package com.sena.hexagonal.adapters.out;

import com.sena.hexagonal.adapters.out.repository.CustomerRepository;
import com.sena.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.sena.hexagonal.application.core.domain.Customer;
import com.sena.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
