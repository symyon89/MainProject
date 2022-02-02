package com.contaapp.repository;

import com.contaapp.model.CustomerCompanyDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerCompanyDetailsRepository extends JpaRepository<CustomerCompanyDetails, UUID> {
}