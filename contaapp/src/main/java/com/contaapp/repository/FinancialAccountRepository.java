package com.contaapp.repository;

import com.contaapp.model.FinancialAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FinancialAccountRepository extends JpaRepository<FinancialAccount, UUID> {
}