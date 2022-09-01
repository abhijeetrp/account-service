package com.maveric.accountservice.service;

import com.maveric.accountservice.dto.AccountDto;
import com.maveric.accountservice.model.Account;
import com.maveric.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.maveric.accountservice.util.ModelDtoTransformer.toDto;
import static com.maveric.accountservice.util.ModelDtoTransformer.toEntity;

@Service
public class AccountServiceImpl implements AccountService
{
@Autowired
private AccountRepository repository;

@Override
    public List<AccountDto> getAccounts()
{
List<Account> list=repository.findAll();
List<AccountDto> listDto=new ArrayList<AccountDto>(list.size());
for (Account account:list)
{
    listDto.add(toDto(account));
}
return listDto;


}

public AccountDto createAccount(AccountDto accountDto)
{
    accountDto.setCustomerId(accountDto.getCustomerId());
    accountDto.setType(accountDto.getType());

    Account account=toEntity(accountDto);
    Account accountResult=repository.save(account);
    return toDto(accountResult);

}

}
