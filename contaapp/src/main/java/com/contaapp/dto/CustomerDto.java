package com.contaapp.dto;

import com.contaapp.model.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CustomerDto {

    private UUID id;
    private String name;
    private boolean isActive;
    private CustomerType customerType;
    private CustomerGroup customerGroup;
    private final List<Address> addressList = new ArrayList<>();
    private final List<Contact> contactList = new ArrayList<>();
    private Currency currency;
    private SalesPerson salesPerson;
    private DeliveryMethod deliveryMethod;
    private PaymentMethod paymentMethod;
    private FinancialAccount financialAccount;

}
