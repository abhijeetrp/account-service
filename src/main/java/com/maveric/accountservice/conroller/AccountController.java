package com.maveric.accountservice.conroller;


import com.maveric.accountservice.dto.AccountDto;
import com.maveric.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController
{
    @Autowired
    AccountService accountService;

    @GetMapping("/customers/{customerId}/accounts")
    public ResponseEntity<List<AccountDto>> getAccounts(@PathVariable String customerId, @RequestParam(defaultValue = "0")
                                                        Integer page, @RequestParam (defaultValue = "10")Integer pageSize)
    {
        List<AccountDto> accountDtoResponse = accountService.getAccounts();
        return new ResponseEntity<List<AccountDto>>(accountDtoResponse, HttpStatus.OK);

    }
    @PostMapping("/customers/{customerId}/accounts")
    public  ResponseEntity<AccountDto> createAccount(@PathVariable String customerId,
                                                           @RequestBody AccountDto accountdto)
    {
        AccountDto accountDtoResponse= accountService.createAccount(accountdto);
        return new ResponseEntity<AccountDto>(accountDtoResponse,HttpStatus.OK);


    }



}
