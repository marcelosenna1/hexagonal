package com.sena.hexagonal.config;

import com.sena.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.sena.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.sena.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.sena.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.sena.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase
            (
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);

    }
}
