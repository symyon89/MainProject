package com.contaapp.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Customer {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(length = 128)
    private String name;

    @Column(columnDefinition = "boolean default true", nullable = false)
    private boolean isActive;

    private LocalDateTime date = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private CustomerType customerType;

    @ManyToOne
    private CustomerGroup customerGroup;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_address",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private final List<Address> addressList = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customer_contact",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "contact_id")
    )
    private final List<Contact> contactList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Currency currency;

    @ManyToOne(cascade = CascadeType.ALL)
    private SalesPerson salesPerson;

    @ManyToOne(cascade = CascadeType.ALL)
    private DeliveryMethod deliveryMethod;

    @ManyToOne(cascade = CascadeType.ALL)
    private PaymentMethod paymentMethod;

    @ManyToOne(cascade = CascadeType.ALL)
    private FinancialAccount financialAccount;

}
