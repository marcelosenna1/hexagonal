package com.sena.hexagonal.config;

import com.sena.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.sena.hexagonal.adapters.out.InsertCustomerAdapter;
import com.sena.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.sena.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
