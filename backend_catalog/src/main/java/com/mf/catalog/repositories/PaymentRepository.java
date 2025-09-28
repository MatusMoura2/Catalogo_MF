package com.mf.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mf.catalog.entities.Payment;
import com.mf.catalog.entities.pk.PaymentPk;

public interface PaymentRepository extends JpaRepository<Payment, PaymentPk>{

}
