package com.sena.hexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void send (String cpf);
}
