package com.contaapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FinancialAccountDto {

    private UUID id;
    private double balance;
}
