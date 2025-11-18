package com.learning.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @NotEmpty(message = "Account number can not be a null or empty")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be a null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be a null or empty")
    private String branchAddress;

}
