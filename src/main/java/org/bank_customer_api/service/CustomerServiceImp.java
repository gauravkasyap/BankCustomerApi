package org.bank_customer_api.service;

import org.bank_customer_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerServiceImp extends JpaRepository<Customer,Long> {
}
