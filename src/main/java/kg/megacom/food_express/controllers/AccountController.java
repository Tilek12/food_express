package kg.megacom.food_express.controllers;

import kg.megacom.food_express.models.dto.AccountDto;
import kg.megacom.food_express.models.entity.Account;
import kg.megacom.food_express.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/save")
    public AccountDto saveAccount(@RequestBody AccountDto accountDto){

        return accountService.saveAccount(accountDto);
    }

    @GetMapping(value = "/list")
    public List<AccountDto> getAllAccounts(){

        return accountService.findAllAccounts();
    }
}
