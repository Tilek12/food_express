package kg.megacom.food_express.services.impl;

import kg.megacom.food_express.database.AccountRepository;
import kg.megacom.food_express.mappers.AccountMapper;
import kg.megacom.food_express.models.dto.AccountDto;
import kg.megacom.food_express.models.entity.Account;
import kg.megacom.food_express.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {

        Account account = AccountMapper.INSTANCE.accountDtoToAccount(accountDto);
        account = accountRepository.save(account);
        accountDto = AccountMapper.INSTANCE.accountToAccountDto(account);

        return accountDto;
    }

    @Override
    public List<AccountDto> findAllAccounts() {

        return accountRepository.findAll()
                .stream()
                .map(AccountMapper.INSTANCE::accountToAccountDto)
                .collect(Collectors.toList());
    }
}
