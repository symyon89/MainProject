package com.contaapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PaymentMethodDto {

    private UUID id;
    private String name;
    private String code;
}
