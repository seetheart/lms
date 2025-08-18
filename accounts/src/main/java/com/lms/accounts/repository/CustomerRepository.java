package com.lms.accounts.repository;


import com.lms.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // optional is used because for a number there can be a customer or not
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
