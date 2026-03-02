package com.lms.accounts.repository;

import com.lms.accounts.entity.Accounts;
import com.lms.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long Id);

    @Transactional
    @Modifying // whenever data is modified then we have to mention this
    void deleteByCustomerId(Long customerId);
}
