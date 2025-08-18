package com.lms.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Accounts extends BaseEntity {

    @Column(name = "customer_id") // no need to write column name but jsut for reference
    private Long customerId;

    @Id
    private Long accountNumber; // no use of generated value because it will be some 10 digit number

    private String accountType;

    private String branchAddress;
}
