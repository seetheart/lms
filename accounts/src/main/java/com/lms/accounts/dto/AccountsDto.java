package com.lms.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

//@Data will generate al the getters and setters
@Data
@Schema(
        name = "Account of a customer",
        description = "schema to hold acount of the customer"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be a null or empty")
    @Pattern(regexp = "(^$[0-9]{10})", message = "Account must be 10 digits")
    @Schema(
            description = "account number of eazy bank account"
    )
    private Long accountNumber;

    @Schema(
            description = "account type", example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(
            description = "branch address eazy bank"
    )
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}
