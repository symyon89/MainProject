package com.contaapp.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CustomerCompanyDetails {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @ManyToOne
    private Customer customer;

    @Column(length = 13)
    private String vat;

    @Column(length = 13)
    private String series;

    @Column(length = 13)
    private String description;

}
