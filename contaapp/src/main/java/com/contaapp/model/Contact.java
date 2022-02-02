package com.contaapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Contact {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private boolean isPrimary;

    @Column(length = 64)
    private String name;

    @Column(length = 64)
    private String title;

    @Column(length = 15)
    private String phone;

    @Column(length = 64)
    private String email;
}
