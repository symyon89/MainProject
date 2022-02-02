package com.contaapp.repository;

import com.contaapp.model.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, UUID> {
}