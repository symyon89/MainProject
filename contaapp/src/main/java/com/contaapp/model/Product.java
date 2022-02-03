package com.contaapp.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(length = 40)
    private String name;

    @ManyToOne
    private Vat vat;

    @Column(columnDefinition = "boolean default true")
    private boolean isActive;

    private final LocalDateTime date = LocalDateTime.now();

    private double weight;
    private double price;
    private String description;
    private double purchasePrice;
    @Column(length =5)
    private String unitOfMeasure;
    private String purchaseDescription;
    private int stock;


    @ManyToOne
    private Customer supplier;

}
