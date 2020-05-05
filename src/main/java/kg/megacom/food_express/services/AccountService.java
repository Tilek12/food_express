package kg.megacom.food_express.services;

import kg.megacom.food_express.models.dto.AccountDto;
import kg.megacom.food_express.models.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto saveAccount (AccountDto accountDto);

    List<AccountDto> findAllAccounts();
}
