package com.recharge.yogesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recharge.yogesh.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,String>{

}
