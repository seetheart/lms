package com.lms.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "schema to hold cusotmer and account info"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer", example = "Eazy butes"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max =30, message= "The length of name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Mobile of the customer", example = "8976445567"
    )
    @Email(message = "Email should be a valid value")
    @NotEmpty(message = "Email cannot be null or empty")
    private String email;

    @Pattern(regexp = "(^$[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
