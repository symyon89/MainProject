package com.contaapp.repository;

import com.contaapp.model.CustomerGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerGroupRepository extends JpaRepository<CustomerGroup, UUID> {
}