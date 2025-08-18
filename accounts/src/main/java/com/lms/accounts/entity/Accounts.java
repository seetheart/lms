package com.lms.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name = "customer_id") // no need to write column name but jsut for reference
    private Long customerId;

    @Id
    private Long accountNumber; // no use of generated value because it will be some 10 digit number

    private String accountType;

    private String branchAddress;
}
