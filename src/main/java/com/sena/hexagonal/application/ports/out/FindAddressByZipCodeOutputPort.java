package com.sena.hexagonal.application.ports.out;

import com.sena.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
        Address find(String zipCode);
}
