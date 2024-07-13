package com.sena.hexagonal.adapters.in.controller;

import com.sena.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.sena.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.sena.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.sena.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.sena.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request){
        var customer = customerMapper.toCustomer(request);
        insertCustomerInputPort.insert(customer, request.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById (@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
}
