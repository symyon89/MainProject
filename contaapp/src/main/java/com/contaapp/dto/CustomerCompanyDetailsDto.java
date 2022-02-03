package com.contaapp.dto;

import com.contaapp.model.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CustomerCompanyDetailsDto {

    private UUID id;
    private Customer customer;
    private String vat;
    private String series;
    private String description;

}
