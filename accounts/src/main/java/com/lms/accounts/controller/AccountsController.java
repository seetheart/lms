package com.lms.accounts.controller;

import com.lms.accounts.constants.AccountsConstants;
import com.lms.accounts.dto.AccountsDto;
import com.lms.accounts.dto.CustomerDto;
import com.lms.accounts.dto.ResponseDto;
import com.lms.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE}) // this ensures response type is json
@AllArgsConstructor
public class AccountsController {
    // we have not used autowired but allargsconstructor because wehenver we have only one constructor it is recommended to use this.
    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));

    }
}
