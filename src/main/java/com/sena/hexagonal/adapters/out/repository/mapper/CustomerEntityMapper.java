package com.sena.hexagonal.adapters.out.repository.mapper;

import com.sena.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.sena.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity (Customer customer);
}
