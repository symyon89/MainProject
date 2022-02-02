package com.contaapp.repository;

import com.contaapp.model.DeliveryMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, UUID> {
}