package com.sena.hexagonal.adapters.out.client.mapper;

import com.sena.hexagonal.adapters.out.client.response.AddressResponse;
import com.sena.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
