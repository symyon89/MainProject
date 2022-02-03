package com.contaapp.dto;

import lombok.Getter;
import lombok.Setter;


import java.util.UUID;

@Getter
@Setter
public class ContactDto {

    private UUID id;
    private boolean isPrimary;
    private String name;
    private String title;
    private String phone;
    private String email;
}
