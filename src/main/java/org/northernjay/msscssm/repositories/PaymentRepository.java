package org.northernjay.msscssm.repositories;

import org.northernjay.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
