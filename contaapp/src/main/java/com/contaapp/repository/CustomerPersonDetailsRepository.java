package com.contaapp.repository;

import com.contaapp.model.CustomerPersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerPersonDetailsRepository extends JpaRepository<CustomerPersonDetails, UUID> {
}