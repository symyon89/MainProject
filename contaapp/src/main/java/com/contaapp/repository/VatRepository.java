package com.contaapp.repository;

import com.contaapp.model.Vat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VatRepository extends JpaRepository<Vat, UUID> {
}