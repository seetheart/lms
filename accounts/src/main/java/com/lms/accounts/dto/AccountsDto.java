package com.lms.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

@Data
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
