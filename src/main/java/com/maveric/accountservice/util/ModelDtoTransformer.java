package com.maveric.accountservice.util;

import com.maveric.accountservice.dto.AccountDto;
import com.maveric.accountservice.model.Account;

public class ModelDtoTransformer
{
    public static Account toEntity (AccountDto dto)
    {

        return new Account( dto.getCustomerId(),dto.getType());
    }
    public static AccountDto toDto(Account model)
{
    return new AccountDto( model.getCustomerId(),model.getType());
}

}
