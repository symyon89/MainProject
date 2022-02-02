package com.contaapp.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddressDto {

    private UUID id;
    private String street;
    private String number;
    private String building;
    private String appartement;
    private String city;
    private String county;
    private String country;


}
