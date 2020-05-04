package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.mappers.AccountMapper;
import kg.megacom.food_express.models.dto.AccountDto;
import kg.megacom.food_express.models.entity.Account;
import kg.megacom.food_express.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public AccountDto saveAccount(AccountDto accountDto) {

        Account account = AccountMapper.INSTANCE.accountDtoToAccount(accountDto);

        accountDto = AccountMapper.INSTANCE.accountToAccountDto(account);

        return accountDto;
    }
}
