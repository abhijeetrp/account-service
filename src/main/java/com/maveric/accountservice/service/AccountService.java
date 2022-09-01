package com.maveric.accountservice.service;

import com.maveric.accountservice.dto.AccountDto;

import java.util.List;

public interface AccountService
{

    public List<AccountDto> getAccounts();
  public AccountDto createAccount(AccountDto transaction);
//    public AccountDto getAccountDetails(String accountId);
//    public AccountDto updateAccount(String customerId,AccountDto balanceDto);
//    public String deleteAccount(String transactionId);
}
