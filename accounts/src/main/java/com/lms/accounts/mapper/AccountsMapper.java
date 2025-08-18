package com.lms.accounts.mapper;

import com.lms.accounts.dto.AccountsDto;
import com.lms.accounts.entity.Accounts;


// We don'nt need to write mapper classes as there are libraries like modelmapper and mapstruct
// but these libraries are not officially recommended by springboot as they might have some security isses
// these libraries also don't have certificates
// We have more flexibity in terms of code like if we want to have a masked mobile number.
public class AccountsMapper {
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}
